package com.google.android.apps.search.googleapp.accounts.p10126ui.p10128b.p10129a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4184bj.p4193c.p4197c.C55937ak;
import com.google.p4184bj.p4193c.p4197c.C55938al;
import com.google.p4184bj.p4193c.p4197c.C55982r;
import com.google.p4184bj.p4193c.p4197c.C55984t;
import com.google.p4184bj.p4193c.p4197c.C55985u;
import com.google.p4184bj.p4193c.p4197c.C55986v;
import com.google.p4184bj.p4193c.p4197c.C55988x;
import java.util.concurrent.CancellationException;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.b.a.g */
/* compiled from: PG */
public final /* synthetic */ class C133197g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133202l f363061a;

    public /* synthetic */ C133197g(C133202l lVar) {
        this.f363061a = lVar;
    }

    public final C60870cx apply(Object obj) {
        C133202l lVar = this.f363061a;
        lVar.f363070e = null;
        if (((C133192b) obj).f363054c) {
            return C60856cj.m92899h(new CancellationException("Cancelling delete history request manually"));
        }
        C55937ak akVar = lVar.f363068c;
        C55985u uVar = (C55985u) C55986v.f149092c.createBuilder();
        C55982r rVar = (C55982r) C55984t.f149087d.createBuilder();
        rVar.copyOnWrite();
        C55984t tVar = (C55984t) rVar.instance;
        tVar.f149091c = 1;
        tVar.f149089a |= 2;
        rVar.copyOnWrite();
        C55984t tVar2 = (C55984t) rVar.instance;
        tVar2.f149090b = 1;
        tVar2.f149089a |= 1;
        uVar.copyOnWrite();
        C55986v vVar = (C55986v) uVar.instance;
        C55984t tVar3 = (C55984t) rVar.build();
        tVar3.getClass();
        vVar.f149095b = tVar3;
        vVar.f149094a |= 2;
        C55986v vVar2 = (C55986v) uVar.build();
        C70888j jVar = akVar.f189039a;
        C70338di diVar = C55938al.f148899a;
        if (diVar == null) {
            synchronized (C55938al.class) {
                diVar = C55938al.f148899a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("footprints.oneplatform.FootprintsService", "Delete");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C55986v.f149092c);
                    d.f187486b = C70850d.m103697c(C55988x.f149098a);
                    diVar = d.mo62040a();
                    C55938al.f148899a = diVar;
                }
            }
        }
        return C47633f.m84733g(C70876o.m103760a(jVar.mo39510a(diVar, akVar.f189040b), vVar2)).mo51516i(C133194d.f363058a, lVar.f363069d);
    }
}
