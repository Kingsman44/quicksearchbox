package com.google.p395al.p417d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.al.d.b */
/* compiled from: PG */
public enum C8600b implements C62957cd {
    NO_MODES(-1),
    APPLICATIONS(21),
    BLOGS(1),
    BOOKS(2),
    CHANNELS(55),
    DISCUSSION(3),
    COMMUNITY(56),
    EVENTS(16),
    FINANCE(22),
    FLIGHTS(20),
    FORUMS(4),
    IMAGES(6),
    IMAGES_ANIMATED(25),
    IMAGES_BLACK(39),
    IMAGES_BLUE(30),
    IMAGES_BROWN(40),
    IMAGES_CLIP_ART(26),
    IMAGES_GRAY(38),
    IMAGES_GREEN(33),
    IMAGES_ORANGE(31),
    IMAGES_PHOTO(27),
    IMAGES_PINK(36),
    IMAGES_PURPLE(35),
    IMAGES_RECENT(28),
    IMAGES_RED(29),
    IMAGES_TEAL(34),
    IMAGES_WHITE(37),
    IMAGES_YELLOW(32),
    IN_APPS(24),
    KNOWLEDGE(7),
    MAPS(8),
    MICROBLOGS(9),
    MOBILE(23),
    MODLET(57),
    NEARBY(42),
    NEWS(10),
    PATENTS(14),
    PEOPLE(18),
    PERSONAL(41),
    PLACES(19),
    PRICES(15),
    QUIMBY(54),
    RECIPES(17),
    SHOPPING(12),
    TOPAZ_3P(43),
    TOPAZ_ALL(44),
    TOPAZ_ALL_3P(45),
    TOPAZ_ATARI(46),
    TOPAZ_CALENDAR(47),
    TOPAZ_DRIVE(48),
    TOPAZ_GROUPS(49),
    TOPAZ_INTERNAL(50),
    TOPAZ_KEEP(51),
    TOPAZ_MAIL(52),
    TOPAZ_SITES(53),
    VIDEOS(13),
    WEB(0);
    

    /* renamed from: af */
    public final int f29816af;

    private C8600b(int i) {
        this.f29816af = i;
    }

    /* renamed from: a */
    public static C8600b m23279a(int i) {
        switch (i) {
            case -1:
                return NO_MODES;
            case 0:
                return WEB;
            case 1:
                return BLOGS;
            case 2:
                return BOOKS;
            case 3:
                return DISCUSSION;
            case 4:
                return FORUMS;
            case 6:
                return IMAGES;
            case 7:
                return KNOWLEDGE;
            case 8:
                return MAPS;
            case 9:
                return MICROBLOGS;
            case 10:
                return NEWS;
            case 12:
                return SHOPPING;
            case 13:
                return VIDEOS;
            case 14:
                return PATENTS;
            case 15:
                return PRICES;
            case 16:
                return EVENTS;
            case 17:
                return RECIPES;
            case 18:
                return PEOPLE;
            case 19:
                return PLACES;
            case 20:
                return FLIGHTS;
            case 21:
                return APPLICATIONS;
            case 22:
                return FINANCE;
            case 23:
                return MOBILE;
            case 24:
                return IN_APPS;
            case 25:
                return IMAGES_ANIMATED;
            case 26:
                return IMAGES_CLIP_ART;
            case 27:
                return IMAGES_PHOTO;
            case 28:
                return IMAGES_RECENT;
            case 29:
                return IMAGES_RED;
            case 30:
                return IMAGES_BLUE;
            case 31:
                return IMAGES_ORANGE;
            case 32:
                return IMAGES_YELLOW;
            case 33:
                return IMAGES_GREEN;
            case 34:
                return IMAGES_TEAL;
            case 35:
                return IMAGES_PURPLE;
            case 36:
                return IMAGES_PINK;
            case 37:
                return IMAGES_WHITE;
            case 38:
                return IMAGES_GRAY;
            case 39:
                return IMAGES_BLACK;
            case 40:
                return IMAGES_BROWN;
            case 41:
                return PERSONAL;
            case 42:
                return NEARBY;
            case 43:
                return TOPAZ_3P;
            case 44:
                return TOPAZ_ALL;
            case 45:
                return TOPAZ_ALL_3P;
            case 46:
                return TOPAZ_ATARI;
            case 47:
                return TOPAZ_CALENDAR;
            case 48:
                return TOPAZ_DRIVE;
            case 49:
                return TOPAZ_GROUPS;
            case 50:
                return TOPAZ_INTERNAL;
            case 51:
                return TOPAZ_KEEP;
            case 52:
                return TOPAZ_MAIL;
            case 53:
                return TOPAZ_SITES;
            case 54:
                return QUIMBY;
            case 55:
                return CHANNELS;
            case 56:
                return COMMUNITY;
            case 57:
                return MODLET;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m23280b() {
        return C8517a.f29550a;
    }

    public final int getNumber() {
        return this.f29816af;
    }

    public final String toString() {
        return Integer.toString(this.f29816af);
    }
}
