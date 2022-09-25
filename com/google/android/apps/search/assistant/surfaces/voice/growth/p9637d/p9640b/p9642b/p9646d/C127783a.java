package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9646d;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a.C127690f;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127760aj;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127787d;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127793j;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127804u;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127747h;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.d.a */
/* compiled from: PG */
public final /* synthetic */ class C127783a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C127785c f351733a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f351734b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f351735c;

    /* renamed from: d */
    public final /* synthetic */ Locale f351736d;

    public /* synthetic */ C127783a(C127785c cVar, C60870cx cxVar, C60870cx cxVar2, Locale locale) {
        this.f351733a = cVar;
        this.f351734b = cxVar;
        this.f351735c = cxVar2;
        this.f351736d = locale;
    }

    public final Object call() {
        Optional optional;
        C127785c cVar = this.f351733a;
        C60870cx cxVar = this.f351734b;
        C60870cx cxVar2 = this.f351735c;
        Locale locale = this.f351736d;
        C58485gu a = ((C127690f) C60856cj.m92909r(cxVar)).mo108170a();
        Locale b = ((C127690f) C60856cj.m92909r(cxVar)).mo108171b();
        List list = (List) C60856cj.m92909r(cxVar2);
        if (a.isEmpty()) {
            return Optional.empty();
        }
        C58485gu c = C127760aj.m208806c(C127760aj.m208804a(a, b), locale, cVar.f351738a, C127747h.ANY);
        C58485gu b2 = C127760aj.m208805b(c, list);
        b2.size();
        c.size();
        if (b2.isEmpty()) {
            C127804u uVar = cVar.f351740c;
            uVar.f351768a.mo40256t(C127793j.f351756a, uVar.f351769b);
            optional = Collection.EL.stream(c).findFirst();
        } else {
            optional = Collection.EL.stream(b2).findFirst();
        }
        if (!optional.isPresent()) {
            return optional;
        }
        C127804u uVar2 = cVar.f351740c;
        uVar2.f351768a.mo40256t(new C127787d(((C127743d) optional.get()).f351636a), uVar2.f351769b);
        return optional;
    }
}
