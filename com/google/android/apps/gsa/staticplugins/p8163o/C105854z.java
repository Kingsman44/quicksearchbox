package com.google.android.apps.gsa.staticplugins.p8163o;

import androidx.media3.exoplayer.C2875cd;
import androidx.media3.exoplayer.C2893cv;
import androidx.media3.exoplayer.p150j.C3197ad;
import androidx.media3.exoplayer.p151k.C3241g;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p7066m.C90073dy;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.z */
/* compiled from: PG */
public class C105854z implements C2875cd {

    /* renamed from: a */
    protected final C3241g f295363a = new C3241g();

    /* renamed from: b */
    private final C89037bh f295364b;

    /* renamed from: c */
    private final long f295365c;

    public C105854z(C89037bh bhVar, C86124t tVar) {
        this.f295364b = bhVar;
        this.f295365c = tVar.mo79743a(C90073dy.f249770e) * 1000000;
    }

    /* renamed from: a */
    public long mo6622a() {
        return 120000000;
    }

    /* renamed from: c */
    public final void mo6623c() {
    }

    /* renamed from: d */
    public final void mo6624d() {
        this.f295363a.mo7239f();
    }

    /* renamed from: e */
    public final void mo6625e() {
        this.f295363a.mo7239f();
    }

    /* renamed from: f */
    public final boolean mo6626f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo6627g(long j, float f, boolean z, long j2) {
        return j >= (true != z ? 3000000 : 6000000);
    }

    /* renamed from: h */
    public final C3241g mo6628h() {
        return this.f295363a;
    }

    /* renamed from: i */
    public final void mo6629i(C2893cv[] cvVarArr, C3197ad[] adVarArr) {
    }

    /* renamed from: j */
    public boolean mo6630j(long j, float f) {
        long j2;
        C89062r b = this.f295364b.mo27377b();
        if (b.f241370b != 1 || b.f241371c) {
            j2 = this.f295365c;
        } else {
            j2 = 1920000000;
        }
        if (j >= ((long) (Math.max(1.0f, f) * ((float) j2))) || this.f295363a.mo7234a() >= 83558400) {
            return false;
        }
        return true;
    }
}
