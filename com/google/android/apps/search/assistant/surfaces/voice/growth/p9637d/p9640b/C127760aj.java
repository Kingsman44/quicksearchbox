package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import android.content.Context;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127747h;
import com.google.assistant.p4008y.p4009a.C53560at;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.aj */
/* compiled from: PG */
public final class C127760aj {

    /* renamed from: a */
    public static final C58495hd f351677a;

    static {
        C53560at atVar = C53560at.HOME_SCREEN;
        C127747h hVar = C127747h.HOME_SCREEN;
        C53560at atVar2 = C53560at.TIMEOUT_HOMESCREEN;
        C127747h hVar2 = C127747h.HOME_SCREEN;
        C53560at atVar3 = C53560at.IN_APP;
        C127747h hVar3 = C127747h.IN_APP;
        f351677a = C58495hd.m89903q(atVar, hVar, atVar2, hVar2, atVar3, hVar3, C53560at.TIMEOUT_IN_APP, hVar3);
    }

    /* renamed from: a */
    public static C58485gu m208804a(C58485gu guVar, Locale locale) {
        return (C58485gu) Collection.EL.stream(guVar).filter(C127758ah.f351675a).flatMap(new C127759ai(locale)).collect(C58370cn.f155946a);
    }

    /* renamed from: b */
    public static C58485gu m208805b(C58485gu guVar, List list) {
        return (C58485gu) Collection.EL.stream(guVar).filter(new C127751aa(list)).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public static C58485gu m208806c(C58485gu guVar, Locale locale, Context context, C127747h hVar) {
        return (C58485gu) Collection.EL.stream(guVar).filter(new C127756af(locale)).filter(new C127757ag(context, hVar)).collect(C58370cn.f155946a);
    }
}
