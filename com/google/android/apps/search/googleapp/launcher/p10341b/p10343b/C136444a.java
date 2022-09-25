package com.google.android.apps.search.googleapp.launcher.p10341b.p10343b;

import com.google.android.apps.search.googleapp.launcher.p10341b.C136443b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10345d.C136457a;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10345d.C136460b;
import com.google.android.apps.search.googleapp.launcher.p10341b.p10345d.p10346a.C136459b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.b.a */
/* compiled from: PG */
public final /* synthetic */ class C136444a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C136445b f371475a;

    /* renamed from: b */
    public final /* synthetic */ int f371476b;

    /* renamed from: c */
    public final /* synthetic */ int f371477c;

    /* renamed from: d */
    public final /* synthetic */ C136443b f371478d;

    public /* synthetic */ C136444a(C136445b bVar, int i, int i2, C136443b bVar2) {
        this.f371475a = bVar;
        this.f371476b = i;
        this.f371477c = i2;
        this.f371478d = bVar2;
    }

    public final Object apply(Object obj) {
        C136445b bVar = this.f371475a;
        int i = this.f371476b;
        int i2 = this.f371477c;
        C136443b bVar2 = this.f371478d;
        C136459b bVar3 = (C136459b) obj;
        Instant instant = Instant.EPOCH;
        if (bVar3 != null) {
            instant = Instant.ofEpochMilli(bVar3.f371518b);
        }
        if (Duration.between(instant, Instant.ofEpochMilli(bVar.f371482d.mo26870b())).compareTo(bVar.f371483e) >= 0) {
            if (!bVar.f371480b) {
                bVar.mo113050b(i, i2, bVar2);
            }
            C136460b bVar4 = bVar.f371481c;
            C46459k.m82829b(bVar4.f371526a.mo46039a(new C136457a(bVar4, i2, i, bVar2), C60826bg.f164896a), "Failed to set acetone data for Acetone event logger.", new Object[0]);
        }
        return bVar3;
    }
}
