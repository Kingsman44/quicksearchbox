package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9643a;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127760aj;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127789f;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127804u;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127747h;
import com.google.android.apps.search.assistant.verticals.p9880a.p9884c.C130348b;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.a.e */
/* compiled from: PG */
public final /* synthetic */ class C127769e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C127773i f351693a;

    /* renamed from: b */
    public final /* synthetic */ C130348b f351694b;

    /* renamed from: c */
    public final /* synthetic */ Locale f351695c;

    /* renamed from: d */
    public final /* synthetic */ Optional f351696d;

    public /* synthetic */ C127769e(C127773i iVar, C130348b bVar, Locale locale, Optional optional) {
        this.f351693a = iVar;
        this.f351694b = bVar;
        this.f351695c = locale;
        this.f351696d = optional;
    }

    public final Object apply(Object obj) {
        Optional optional;
        C127773i iVar = this.f351693a;
        C130348b bVar = this.f351694b;
        Locale locale = this.f351695c;
        Optional optional2 = this.f351696d;
        C58485gu guVar = (C58485gu) Collection.EL.stream(C127760aj.m208806c(C127773i.m208813a(bVar), locale, iVar.f351700a, C127747h.IN_APP)).filter(new C127765a((Map) obj)).collect(C58370cn.f155946a);
        if (guVar.isEmpty()) {
            optional = Optional.empty();
        } else {
            optional = Collection.EL.stream(guVar).filter(new C127766b(bVar)).findFirst();
        }
        String str = (String) optional2.get();
        if (optional.isPresent()) {
            C127804u uVar = iVar.f351701b;
            uVar.f351768a.mo40256t(new C127789f(str, ((C127743d) optional.get()).f351636a), uVar.f351769b);
        }
        return optional;
    }
}
