package com.google.assistant.p3886c;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.c.cr */
/* compiled from: PG */
public enum C50794cr implements C62957cd {
    UNDEFINED(0),
    WEATHER(1),
    CALENDAR(2),
    COMMUTE_TIME(3),
    FLIGHT(4),
    BIRTHDAY(5),
    AMBIENT_MUSIC(6),
    TIPS(7),
    REMINDER(8),
    ASSISTANT(9),
    ALARM(10),
    HAMMERSPACE_DEBUG(11),
    OOBE(12),
    SPORTS(13),
    WEATHER_ALERT(14),
    LOCATION_OOBE(15),
    STOCK_PRICE_CHANGE(16),
    SHOPPING_LIST(17),
    LOYALTY_CARD(18),
    MEDIA(19),
    STOCK_EARNINGS_CALL(20),
    HEADPHONE_CONTEXT(29),
    GAS_STATION_PAYMENT(30),
    TRANSIT_STATION_INFO(31),
    TIME_TO_LEAVE(32),
    ORDER_COFFEE(33),
    SHOPPING_LIST_ONBOARDING(34),
    LOYALTY_CARD_ONBOARDING(35),
    RESTAURANT(36),
    AT_STORE_COMBINED_CARD(37),
    HOLIDAY_ALARMS(38),
    MEDIA_HEADS_UP(39),
    BLAZE_BUILD_PROGRESS(40),
    GROCERY_DELIVERY(41),
    GROCERY_PICKUP(42),
    AIR_QUALITY(43),
    FLIGHT_LANDING(44),
    HOTEL_CHECK_IN(45),
    HOTEL_CHECK_OUT(46),
    CALENDAR_NOTIFICATION(47),
    CROSS_DEVICE_TIMER(48),
    SHOPPING_MALL(49),
    PAIRED_DEVICE_STATUS(100),
    DRIVING_MODE(101),
    SLEEP_SUMMARY(102);
    

    /* renamed from: T */
    public final int f132222T;

    private C50794cr(int i) {
        this.f132222T = i;
    }

    /* renamed from: a */
    public static C50794cr m85938a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return WEATHER;
            case 2:
                return CALENDAR;
            case 3:
                return COMMUTE_TIME;
            case 4:
                return FLIGHT;
            case 5:
                return BIRTHDAY;
            case 6:
                return AMBIENT_MUSIC;
            case 7:
                return TIPS;
            case 8:
                return REMINDER;
            case 9:
                return ASSISTANT;
            case 10:
                return ALARM;
            case 11:
                return HAMMERSPACE_DEBUG;
            case 12:
                return OOBE;
            case 13:
                return SPORTS;
            case 14:
                return WEATHER_ALERT;
            case 15:
                return LOCATION_OOBE;
            case 16:
                return STOCK_PRICE_CHANGE;
            case 17:
                return SHOPPING_LIST;
            case 18:
                return LOYALTY_CARD;
            case 19:
                return MEDIA;
            case 20:
                return STOCK_EARNINGS_CALL;
            default:
                switch (i) {
                    case 29:
                        return HEADPHONE_CONTEXT;
                    case 30:
                        return GAS_STATION_PAYMENT;
                    case 31:
                        return TRANSIT_STATION_INFO;
                    case 32:
                        return TIME_TO_LEAVE;
                    case 33:
                        return ORDER_COFFEE;
                    case 34:
                        return SHOPPING_LIST_ONBOARDING;
                    case 35:
                        return LOYALTY_CARD_ONBOARDING;
                    case 36:
                        return RESTAURANT;
                    case 37:
                        return AT_STORE_COMBINED_CARD;
                    case 38:
                        return HOLIDAY_ALARMS;
                    case 39:
                        return MEDIA_HEADS_UP;
                    case 40:
                        return BLAZE_BUILD_PROGRESS;
                    case 41:
                        return GROCERY_DELIVERY;
                    case 42:
                        return GROCERY_PICKUP;
                    case 43:
                        return AIR_QUALITY;
                    case 44:
                        return FLIGHT_LANDING;
                    case 45:
                        return HOTEL_CHECK_IN;
                    case 46:
                        return HOTEL_CHECK_OUT;
                    case 47:
                        return CALENDAR_NOTIFICATION;
                    case 48:
                        return CROSS_DEVICE_TIMER;
                    case 49:
                        return SHOPPING_MALL;
                    default:
                        switch (i) {
                            case 100:
                                return PAIRED_DEVICE_STATUS;
                            case 101:
                                return DRIVING_MODE;
                            case 102:
                                return SLEEP_SUMMARY;
                            default:
                                return null;
                        }
                }
        }
    }

    /* renamed from: b */
    public static C62959cf m85939b() {
        return C50793cq.f132175a;
    }

    public final int getNumber() {
        return this.f132222T;
    }

    public final String toString() {
        return Integer.toString(this.f132222T);
    }
}
