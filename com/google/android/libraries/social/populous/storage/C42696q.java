package com.google.android.libraries.social.populous.storage;

import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import p5304e.p5305a.p5306a.p5442w.p5443a.C69302j;

/* renamed from: com.google.android.libraries.social.populous.storage.q */
/* compiled from: PG */
public final /* synthetic */ class C42696q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C42701v f111914a;

    /* renamed from: b */
    public final /* synthetic */ long f111915b;

    /* renamed from: c */
    public final /* synthetic */ C42591z f111916c;

    public /* synthetic */ C42696q(C42701v vVar, long j, C42591z zVar) {
        this.f111914a = vVar;
        this.f111915b = j;
        this.f111916c = zVar;
    }

    public final void run() {
        boolean z;
        C58485gu a;
        C42701v vVar = this.f111914a;
        long j = this.f111915b;
        C42591z zVar = this.f111916c;
        int b = vVar.mo45701m().mo45762b(j);
        C58833ax a2 = vVar.mo45694a().mo45716a();
        boolean z2 = true;
        if (!a2.mo56113h() || ((C42680d) a2.mo56107c()).f111893b > j) {
            z = false;
        } else {
            vVar.mo45694a().mo45717b();
            vVar.mo45702n().mo45766a();
            vVar.mo45695d().mo45744j();
            z = true;
        }
        if (!C69302j.f185437a.mo6453a().mo60980f() || (a = vVar.mo45698g().mo45754a(j)) == null || a.isEmpty()) {
            z2 = false;
        } else {
            vVar.mo45697f().mo45752c(a);
            vVar.mo45696e().mo45745a(a);
            vVar.mo45699k().mo45757a(a);
            vVar.mo45698g().mo45756c(a);
        }
        if (z || z2 || b > 0) {
            zVar.mo45635e(58, C42576k.f111734a);
        }
    }
}
