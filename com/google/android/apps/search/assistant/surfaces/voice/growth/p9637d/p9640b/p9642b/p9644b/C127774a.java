package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9644b;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127690f;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127760aj;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127795l;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127804u;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.b.a */
/* compiled from: PG */
public final /* synthetic */ class C127774a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C127776c f351705a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f351706b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f351707c;

    /* renamed from: d */
    public final /* synthetic */ Locale f351708d;

    public /* synthetic */ C127774a(C127776c cVar, C60870cx cxVar, C60870cx cxVar2, Locale locale) {
        this.f351705a = cVar;
        this.f351706b = cxVar;
        this.f351707c = cxVar2;
        this.f351708d = locale;
    }

    public final Object call() {
        C127776c cVar = this.f351705a;
        C60870cx cxVar = this.f351706b;
        C60870cx cxVar2 = this.f351707c;
        Locale locale = this.f351708d;
        C58485gu a = ((C127690f) C60856cj.m92909r(cxVar)).mo108170a();
        Locale b = ((C127690f) C60856cj.m92909r(cxVar)).mo108171b();
        List list = (List) C60856cj.m92909r(cxVar2);
        Optional empty = Optional.empty();
        if (!a.isEmpty()) {
            empty = cVar.mo108215a(C127760aj.m208804a(a, b), list, locale);
        }
        if (!empty.isPresent()) {
            empty = cVar.mo108215a(C127776c.f351710a, list, locale);
        }
        if (empty.isPresent()) {
            C127804u uVar = cVar.f351712c;
            uVar.f351768a.mo40256t(new C127795l(((C127743d) empty.get()).f351636a), uVar.f351769b);
        }
        return empty;
    }
}
