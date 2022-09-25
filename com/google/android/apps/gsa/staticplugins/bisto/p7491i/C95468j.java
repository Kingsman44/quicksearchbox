package com.google.android.apps.gsa.staticplugins.bisto.p7491i;

import com.google.common.base.C58881cr;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.i.j */
/* compiled from: PG */
final class C95468j implements C58881cr {

    /* renamed from: a */
    int f267143a = 1;

    /* renamed from: b */
    final /* synthetic */ String f267144b;

    /* renamed from: c */
    final /* synthetic */ String f267145c;

    /* renamed from: d */
    final /* synthetic */ byte[] f267146d;

    /* renamed from: e */
    final /* synthetic */ C95469k f267147e;

    public C95468j(C95469k kVar, String str, String str2, byte[] bArr) {
        this.f267147e = kVar;
        this.f267144b = str;
        this.f267145c = str2;
        this.f267146d = bArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6453a() {
        Duration ofMillis = Duration.ofMillis(C95469k.f267150c.mo56909a(this.f267143a));
        C95469k kVar = this.f267147e;
        kVar.f267153e.set(kVar.f267152d.mo57444a());
        this.f267143a++;
        return this.f267147e.f267154f.mo106450a(this.f267144b, this.f267145c, this.f267146d, ofMillis);
    }
}
