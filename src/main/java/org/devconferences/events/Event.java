package org.devconferences.events;

import java.util.ArrayList;
import java.util.List;
import org.elasticsearch.common.geo.GeoPoint;

public class Event {

    public String id;
    public String name;
    public String avatar;
    public String description;
    public String website;
    public String twitter;
    public String facebook;
    public String meetup;
    public String city;
    public List<String> tags = new ArrayList<>();
    public Type type;
    public GeoPoint location;


    public enum Type{
        COMMUNITY, CONFERENCE;
    }
}
