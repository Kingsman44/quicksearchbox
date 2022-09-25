package com.google.p395al.p417d.p418a.p421b;

/* renamed from: com.google.al.d.a.b.o */
/* compiled from: PG */
public enum C8562o {
    DICTIONARY_ANSWER,
    FINANCE_ANSWER,
    GENERIC_ANSWER,
    SPORTS_ANSWER,
    SUNRISE_SUNSET_ANSWER,
    TRANSLATION_ANSWER,
    WEATHER_ANSWER,
    WHEN_IS_ANSWER,
    CURRENCY_ANSWER,
    LOCAL_TIME_ANSWER,
    FLIGHT_STATUS_ANSWER,
    ANSWERDATA_NOT_SET;

    /* renamed from: a */
    public static C8562o m23275a(int i) {
        if (i == 0) {
            return ANSWERDATA_NOT_SET;
        }
        switch (i) {
            case 2:
                return DICTIONARY_ANSWER;
            case 3:
                return FINANCE_ANSWER;
            case 4:
                return GENERIC_ANSWER;
            case 5:
                return SPORTS_ANSWER;
            case 6:
                return SUNRISE_SUNSET_ANSWER;
            case 7:
                return TRANSLATION_ANSWER;
            case 8:
                return WEATHER_ANSWER;
            case 9:
                return WHEN_IS_ANSWER;
            case 10:
                return CURRENCY_ANSWER;
            case 11:
                return LOCAL_TIME_ANSWER;
            case 12:
                return FLIGHT_STATUS_ANSWER;
            default:
                return null;
        }
    }
}
