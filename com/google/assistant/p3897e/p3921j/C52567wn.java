package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.wn */
/* compiled from: PG */
public enum C52567wn implements C62957cd {
    UNKNOWN(0),
    TRACK(1),
    ALBUM(2),
    ARTIST(3),
    PLAYLIST(4),
    EPISODE(5),
    MOVIE(6),
    PHOTO(7),
    TV_SHOW_EPISODE(8),
    PODCAST_EPISODE(9),
    MUSIC_GENRE(10),
    AUDIO_BOOK(11),
    CHAPTER(12),
    RADIO_STATION(13),
    MUSIC_MIX(14),
    SPORTS_EVENT(15),
    TV_CHANNEL(16),
    VIDEO(17),
    YOUTUBE_CHANNEL(18),
    YOUTUBE_VIDEO_PLAYLIST(19),
    TV_SHOW(20),
    NEWS(21),
    NARRATED_WEB(22),
    AUDIO_STORY(23);
    

    /* renamed from: y */
    public final int f137991y;

    private C52567wn(int i) {
        this.f137991y = i;
    }

    /* renamed from: a */
    public static C52567wn m86648a(String str) {
        return (C52567wn) Enum.valueOf(C52567wn.class, str);
    }

    /* renamed from: b */
    public static C52567wn m86649b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return TRACK;
            case 2:
                return ALBUM;
            case 3:
                return ARTIST;
            case 4:
                return PLAYLIST;
            case 5:
                return EPISODE;
            case 6:
                return MOVIE;
            case 7:
                return PHOTO;
            case 8:
                return TV_SHOW_EPISODE;
            case 9:
                return PODCAST_EPISODE;
            case 10:
                return MUSIC_GENRE;
            case 11:
                return AUDIO_BOOK;
            case 12:
                return CHAPTER;
            case 13:
                return RADIO_STATION;
            case 14:
                return MUSIC_MIX;
            case 15:
                return SPORTS_EVENT;
            case 16:
                return TV_CHANNEL;
            case 17:
                return VIDEO;
            case 18:
                return YOUTUBE_CHANNEL;
            case 19:
                return YOUTUBE_VIDEO_PLAYLIST;
            case 20:
                return TV_SHOW;
            case 21:
                return NEWS;
            case 22:
                return NARRATED_WEB;
            case 23:
                return AUDIO_STORY;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C62959cf m86650c() {
        return C52566wm.f137965a;
    }

    public final int getNumber() {
        return this.f137991y;
    }

    public final String toString() {
        return Integer.toString(this.f137991y);
    }
}
