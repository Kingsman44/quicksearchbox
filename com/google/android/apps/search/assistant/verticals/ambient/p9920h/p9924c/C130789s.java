package com.google.android.apps.search.assistant.verticals.ambient.p9920h.p9924c;

import com.google.assistant.p3860as.C49794h;
import com.google.assistant.p4016z.C53691ap;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.p381aj.p382a.p383a.p384a.C8242v;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.h.c.s */
/* compiled from: PG */
public final /* synthetic */ class C130789s implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130739ac f358013a;

    /* renamed from: b */
    public final /* synthetic */ C49794h f358014b;

    /* renamed from: c */
    public final /* synthetic */ C8242v f358015c;

    /* renamed from: d */
    public final /* synthetic */ Optional f358016d;

    /* renamed from: e */
    public final /* synthetic */ C53691ap f358017e;

    public /* synthetic */ C130789s(C130739ac acVar, C49794h hVar, C8242v vVar, Optional optional, C53691ap apVar) {
        this.f358013a = acVar;
        this.f358014b = hVar;
        this.f358015c = vVar;
        this.f358016d = optional;
        this.f358017e = apVar;
    }

    public final Object apply(Object obj) {
        return (C58485gu) ((Optional) obj).map(new C130790t(this.f358013a, this.f358014b, this.f358015c, this.f358016d)).orElseGet(new C130791u(this.f358017e));
    }
}
