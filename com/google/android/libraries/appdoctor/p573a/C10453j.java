package com.google.android.libraries.appdoctor.p573a;

import android.content.Context;
import android.util.Log;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.p4566l.C60223w;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.appdoctor.a.j */
/* compiled from: PG */
public final class C10453j {

    /* renamed from: a */
    public C60223w f35195a;

    /* renamed from: b */
    public Context f35196b;

    /* renamed from: c */
    public C10444a f35197c;

    /* renamed from: d */
    public C58485gu f35198d;

    /* renamed from: e */
    public C58485gu f35199e;

    /* renamed from: f */
    public final Map f35200f;

    /* renamed from: g */
    public C10452i f35201g;

    public C10453j() {
        this.f35195a = C60223w.UNKNOWN;
        this.f35199e = C58485gu.m89845m();
        this.f35200f = new HashMap();
        this.f35198d = null;
    }

    /* renamed from: a */
    public final C10454k mo18496a() {
        C58838bb.m90884s(this.f35195a != C60223w.UNKNOWN, "Entry Point must be set.");
        if (this.f35197c == null) {
            Log.w("AppDoctorFixerContext", "No AppDoctorLogger set.");
            this.f35197c = new C10461r();
        }
        return new C10454k(this);
    }

    /* renamed from: b */
    public final void mo18497b(C10449f fVar) {
        this.f35200f.put(fVar.f35178a, fVar);
    }

    /* renamed from: c */
    public final void mo18498c(C10448e eVar, int i) {
        if (this.f35200f.containsKey(eVar.f35176a)) {
            int i2 = i - 1;
            mo18497b(new C10449f(eVar.f35176a, i2 != 2 ? i2 != 4 ? 3 : 6 : 5));
            return;
        }
        throw new IllegalArgumentException("Status of '" + eVar.mo18487a() + "' cannot be updated since no original status was set.");
    }

    public C10453j(C10454k kVar) {
        this.f35195a = C60223w.UNKNOWN;
        this.f35199e = C58485gu.m89845m();
        this.f35200f = new HashMap();
        this.f35195a = kVar.f35202a;
        this.f35196b = kVar.f35203b;
        this.f35197c = kVar.f35204c;
        this.f35198d = kVar.f35205d;
        this.f35199e = kVar.f35206e;
        C58485gu u = kVar.f35207f.values().mo55229u();
        for (int i = 0; i < u.size(); i++) {
            C10449f fVar = (C10449f) u.get(i);
            this.f35200f.put(fVar.f35178a, fVar);
        }
        this.f35201g = kVar.f35208g;
    }
}
