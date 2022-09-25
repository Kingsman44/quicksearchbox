package com.google.android.libraries.appdoctor.p573a;

import android.content.Context;
import com.google.android.gms.p10747b.p10748a.C142954b;
import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.p4566l.C60223w;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.appdoctor.a.k */
/* compiled from: PG */
public final class C10454k {

    /* renamed from: a */
    public final C60223w f35202a;

    /* renamed from: b */
    public final Context f35203b;

    /* renamed from: c */
    public final C10444a f35204c;

    /* renamed from: d */
    public C58485gu f35205d;

    /* renamed from: e */
    public final C58485gu f35206e;

    /* renamed from: f */
    public final C58495hd f35207f;

    /* renamed from: g */
    public final C10452i f35208g;

    /* renamed from: a */
    public final C10449f mo18499a(C142954b bVar) {
        C10449f fVar = (C10449f) this.f35207f.get(bVar);
        return fVar == null ? new C10449f(bVar, 2) : fVar;
    }

    /* renamed from: b */
    public final C58485gu mo18500b() {
        C58485gu guVar = this.f35205d;
        if (guVar == null) {
            C10457n nVar = new C10457n(this.f35203b);
            try {
                guVar = C58485gu.m89842j((List) C60922j.m93044g(nVar.f35211a.mo46042d(), C10456m.f35210a, nVar.f35212b).get());
                this.f35205d = guVar;
                if (guVar == null) {
                    return C58485gu.m89845m();
                }
            } catch (InterruptedException | ExecutionException e) {
                throw new IllegalArgumentException("Retrieval of recent fix data failed", e);
            }
        }
        return guVar;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("entry_point", this.f35202a);
        b.mo56102b("context", this.f35203b);
        b.mo56102b("appDoctorLogger", this.f35204c);
        b.mo56102b("recentFixes", this.f35205d);
        b.mo56102b("fixesExecutedThisIteration", this.f35206e);
        b.mo56102b("fixStatusesExecutedThisIteration", this.f35207f);
        b.mo56102b("currentFixer", this.f35208g);
        return b.toString();
    }

    public C10454k(C10453j jVar) {
        this.f35202a = jVar.f35195a;
        Context context = jVar.f35196b;
        context.getClass();
        this.f35203b = context;
        C10444a aVar = jVar.f35197c;
        aVar.getClass();
        this.f35204c = aVar;
        this.f35205d = jVar.f35198d;
        this.f35206e = jVar.f35199e;
        this.f35207f = C58495hd.m89898l(jVar.f35200f);
        this.f35208g = jVar.f35201g;
    }
}
