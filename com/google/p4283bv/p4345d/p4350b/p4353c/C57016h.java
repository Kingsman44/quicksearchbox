package com.google.p4283bv.p4345d.p4350b.p4353c;

/* renamed from: com.google.bv.d.b.c.h */
/* compiled from: PG */
public enum C57016h {
    FLIGHT_STATUS(1),
    RENDERABLE_FLIGHT_STATUS(19),
    WEATHER_CONDITION(2),
    SPORTS_GAME(3),
    STOCK(10),
    EARNINGS_CALL(15),
    UPDATE_NOTIFICATION(18),
    CREATE_LOCAL_CHANNEL_NOTIFICATION(20),
    DATA_NOT_SET(0);
    

    /* renamed from: j */
    public final int f152203j;

    private C57016h(int i) {
        this.f152203j = i;
    }

    /* renamed from: a */
    public static C57016h m88253a(int i) {
        if (i == 0) {
            return DATA_NOT_SET;
        }
        if (i == 1) {
            return FLIGHT_STATUS;
        }
        if (i == 2) {
            return WEATHER_CONDITION;
        }
        if (i == 3) {
            return SPORTS_GAME;
        }
        if (i == 10) {
            return STOCK;
        }
        if (i == 15) {
            return EARNINGS_CALL;
        }
        switch (i) {
            case 18:
                return UPDATE_NOTIFICATION;
            case 19:
                return RENDERABLE_FLIGHT_STATUS;
            case 20:
                return CREATE_LOCAL_CHANNEL_NOTIFICATION;
            default:
                return null;
        }
    }
}
