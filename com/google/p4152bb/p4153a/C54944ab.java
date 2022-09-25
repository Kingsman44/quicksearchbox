package com.google.p4152bb.p4153a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62958ce;

/* renamed from: com.google.bb.a.ab */
/* compiled from: PG */
public enum C54944ab implements C62957cd {
    UNKNOWN(0),
    CONFIRMATION(1),
    FIELD_TO_CHANGE(37),
    RECIPIENT(2),
    SUBJECT(3),
    GENERIC_LIST(23),
    GENERIC_LIST_CATEGORY(38),
    MESSAGE(4),
    AUDIO_MESSAGE(39),
    REMINDER_TRIGGER(5),
    REMINDER_TRIGGER_DATE(19),
    REMINDER_TRIGGER_TIME(20),
    REMINDER_TRIGGER_RECURRENCE(21),
    REMINDER_TRIGGER_LOCATION(22),
    RELATIONSHIP_CONFIRMATION(6),
    UNKNOWN_CONTACT_NAME(7),
    TIME_OF_DAY(8),
    LOCATION(9),
    START_DATE(10),
    TIME_DURATION(11),
    START_TIME(12),
    END_TIME(17),
    DATE_TIME(18),
    RECURRENCE(13),
    PROVIDER(14),
    REMINDER_ACTIVITY_TRIGGER(15),
    REMINDER_LOCATION_CHANGE_TRIGGER(16),
    RECIPIENT_GET_NAME(24),
    RECIPIENT_DISAMBIGUATE_NAME(25),
    RECIPIENT_DISAMBIGUATE_ENDPOINT_TYPE(26),
    RECIPIENT_DISAMBIGUATE_ENDPOINT_INSTANCE(27),
    RECIPIENT_DISAMBIGUATE_PROVIDER(40),
    RELATIONSHIP_GET_NAME(41),
    PODCAST_TITLE(28),
    MEDIA_CONTROL_COMMAND(29),
    SONG(30),
    ARTIST(31),
    ALBUM(32),
    MUSIC_GENRE(33),
    PLAYLIST(34),
    MUSIC_ENTITY(35),
    MESSAGE_APPEND(36);
    

    /* renamed from: Q */
    public static final C62958ce f144502Q = null;

    /* renamed from: R */
    public final int f144530R;

    static {
        f144502Q = new C54943aa();
    }

    private C54944ab(int i) {
        this.f144530R = i;
    }

    /* renamed from: a */
    public static C54944ab m87544a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CONFIRMATION;
            case 2:
                return RECIPIENT;
            case 3:
                return SUBJECT;
            case 4:
                return MESSAGE;
            case 5:
                return REMINDER_TRIGGER;
            case 6:
                return RELATIONSHIP_CONFIRMATION;
            case 7:
                return UNKNOWN_CONTACT_NAME;
            case 8:
                return TIME_OF_DAY;
            case 9:
                return LOCATION;
            case 10:
                return START_DATE;
            case 11:
                return TIME_DURATION;
            case 12:
                return START_TIME;
            case 13:
                return RECURRENCE;
            case 14:
                return PROVIDER;
            case 15:
                return REMINDER_ACTIVITY_TRIGGER;
            case 16:
                return REMINDER_LOCATION_CHANGE_TRIGGER;
            case 17:
                return END_TIME;
            case 18:
                return DATE_TIME;
            case 19:
                return REMINDER_TRIGGER_DATE;
            case 20:
                return REMINDER_TRIGGER_TIME;
            case 21:
                return REMINDER_TRIGGER_RECURRENCE;
            case 22:
                return REMINDER_TRIGGER_LOCATION;
            case 23:
                return GENERIC_LIST;
            case 24:
                return RECIPIENT_GET_NAME;
            case 25:
                return RECIPIENT_DISAMBIGUATE_NAME;
            case 26:
                return RECIPIENT_DISAMBIGUATE_ENDPOINT_TYPE;
            case 27:
                return RECIPIENT_DISAMBIGUATE_ENDPOINT_INSTANCE;
            case 28:
                return PODCAST_TITLE;
            case 29:
                return MEDIA_CONTROL_COMMAND;
            case 30:
                return SONG;
            case 31:
                return ARTIST;
            case 32:
                return ALBUM;
            case 33:
                return MUSIC_GENRE;
            case 34:
                return PLAYLIST;
            case 35:
                return MUSIC_ENTITY;
            case 36:
                return MESSAGE_APPEND;
            case 37:
                return FIELD_TO_CHANGE;
            case 38:
                return GENERIC_LIST_CATEGORY;
            case 39:
                return AUDIO_MESSAGE;
            case 40:
                return RECIPIENT_DISAMBIGUATE_PROVIDER;
            case 41:
                return RELATIONSHIP_GET_NAME;
            default:
                return null;
        }
    }

    public final int getNumber() {
        return this.f144530R;
    }

    public final String toString() {
        return Integer.toString(this.f144530R);
    }
}
