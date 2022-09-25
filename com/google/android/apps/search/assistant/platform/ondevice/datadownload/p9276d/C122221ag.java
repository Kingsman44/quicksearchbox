package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.mdi.download.C28787cb;
import p3186j$.util.OptionalInt;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.ag */
/* compiled from: PG */
public final class C122221ag {

    /* renamed from: a */
    public final int f338943a;

    /* renamed from: b */
    public final int f338944b;

    /* renamed from: c */
    public final int f338945c;

    /* renamed from: d */
    public final float f338946d;

    /* renamed from: e */
    public final int f338947e;

    /* renamed from: f */
    public final int f338948f;

    /* renamed from: g */
    public final int f338949g;

    /* renamed from: h */
    public final float f338950h;

    public C122221ag(C28787cb cbVar) {
        int b = cbVar.mo34422b();
        this.f338943a = b;
        int d = cbVar.mo34424d();
        this.f338944b = d;
        int c = cbVar.mo34423c();
        this.f338945c = c;
        float a = cbVar.mo34421a();
        this.f338946d = a;
        this.f338950h = a + a;
        this.f338947e = m201761a(b, OptionalInt.empty());
        this.f338948f = m201761a(d, OptionalInt.m71640of(b));
        this.f338949g = m201761a(c, OptionalInt.m71640of(d));
    }

    /* renamed from: a */
    private static int m201761a(int i, OptionalInt optionalInt) {
        return optionalInt.isPresent() ? Math.min((Math.abs(optionalInt.getAsInt() - i) / 2) + i, i + i) : i + i;
    }
}
