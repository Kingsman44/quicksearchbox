package com.google.android.filament.p10722a;

import android.view.Surface;
import com.google.p3723ar.imp.view.C48013w;
import com.google.p3723ar.imp.view.C48014x;
import com.google.p3723ar.imp.view.C48016z;

/* renamed from: com.google.android.filament.a.f */
/* compiled from: PG */
public final class C142635f {

    /* renamed from: a */
    public int f386967a;

    /* renamed from: b */
    public int f386968b;

    /* renamed from: c */
    public Object f386969c;

    /* renamed from: d */
    public boolean f386970d;

    /* renamed from: e */
    public C142632c f386971e;

    /* renamed from: f */
    public boolean f386972f;

    /* renamed from: g */
    public C48016z f386973g;

    public C142635f() {
        throw null;
    }

    public C142635f(byte[] bArr) {
        this.f386972f = true;
    }

    /* renamed from: a */
    public final void mo117334a(Surface surface) {
        C48016z zVar = this.f386973g;
        if (zVar.f124262d.f124185b.mo53086a() != 0) {
            zVar.f124259a.mo53097c(new C48014x(zVar, zVar.f124260b, surface));
        }
        this.f386970d = true;
    }

    /* renamed from: b */
    public final void mo117335b() {
        C142632c cVar = this.f386971e;
        if (cVar != null) {
            cVar.mo117331a();
        }
        C48016z zVar = this.f386973g;
        if (zVar.f124262d.f124185b.mo53086a() != 0) {
            zVar.f124259a.mo53097c(new C48013w(zVar.f124260b));
        }
        this.f386970d = false;
    }

    /* renamed from: c */
    public final boolean mo117336c(Object obj) {
        Object obj2 = this.f386969c;
        if (obj2 != null) {
            if (obj2 == obj) {
                return false;
            }
            mo117335b();
        }
        this.f386969c = obj;
        return true;
    }
}
