package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import com.google.assistant.p3886c.C50690ab;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52568wo;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.l */
/* compiled from: PG */
public final /* synthetic */ class C123975l {
    /* renamed from: a */
    public static Optional m203337a(C123976m mVar) {
        if (!mVar.mo106207b().f137952h.isEmpty()) {
            return Optional.m71637of(mVar.mo106207b().f137952h);
        }
        if (!mVar.mo106207b().f137948d.isEmpty()) {
            return Optional.m71637of(mVar.mo106207b().f137948d);
        }
        if (C50690ab.MEDIA_SESSION.equals(mVar.mo106206a())) {
            return Optional.m71637of(mVar.mo106214i());
        }
        return Optional.empty();
    }

    /* renamed from: b */
    public static String m203338b(C123976m mVar) {
        C52568wo woVar = mVar.mo106207b().f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        return woVar.f137999f;
    }

    /* renamed from: c */
    public static String m203339c(C123976m mVar) {
        C52568wo woVar = mVar.mo106207b().f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        return woVar.f138000g;
    }

    /* renamed from: d */
    public static String m203340d(C123976m mVar) {
        C52568wo woVar = mVar.mo106207b().f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        return woVar.f137998e;
    }

    /* renamed from: e */
    public static String m203341e(C123976m mVar) {
        C51058ev evVar;
        C51098gh ghVar = mVar.mo106207b().f137949e;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        return evVar.f132944b;
    }
}
