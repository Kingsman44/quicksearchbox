package com.google.android.apps.gsa.nga.engine.understanding.p6236c;

import com.google.android.apps.gsa.nga.shared.p6274a.C80080z;
import com.google.assistant.p3897e.p3917i.p3918a.C51518kr;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.c.a */
/* compiled from: PG */
abstract class C79009a implements Function {
    /* renamed from: a */
    public final C51518kr apply(C80080z zVar) {
        C80080z zVar2 = C80080z.UNKNOWN;
        switch (zVar.ordinal()) {
            case 0:
                return C51518kr.UNKNOWN;
            case 1:
                return C51518kr.DATE_TIME;
            case 2:
                return C51518kr.ADDRESS;
            case 3:
                return C51518kr.EMAIL;
            case 4:
                return C51518kr.FLIGHT_NUMBER;
            case 5:
                return C51518kr.PHONE;
            case 6:
                return C51518kr.URL;
            case 7:
                return C51518kr.LANGUAGE;
            case 8:
                return C51518kr.CONTACT;
            case 9:
                return C51518kr.WEBREF;
            case 10:
                return C51518kr.POS_TAG;
            case 11:
                return C51518kr.APP;
            case 12:
                return C51518kr.NUMBER;
            case 13:
                return C51518kr.DURATION;
            case 14:
                return C51518kr.GRAMMAR;
            case 15:
                return C51518kr.SPAN;
            case 16:
                return C51518kr.MONEY;
            case 17:
                return C51518kr.APP_ACTIONS;
            case 18:
                return C51518kr.PERCENTAGE;
            case 19:
                return C51518kr.PERSON_NAME;
            case 20:
                return C51518kr.UNINTENDED_QUERY;
            case 21:
                return mo73778b();
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(zVar))));
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* renamed from: b */
    public abstract C51518kr mo73778b();

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
