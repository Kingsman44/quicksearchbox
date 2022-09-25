package com.google.android.libraries.p10923ac.p10925b.p10934e;

import android.accounts.Account;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147172f;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4895aw.p4902b.C63978ao;
import com.google.protos.p4895aw.p4902b.C63979ap;
import com.google.protos.p4895aw.p4902b.C64098p;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.ac.b.e.cm */
/* compiled from: PG */
public final class C146937cm extends C68247h {

    /* renamed from: a */
    private final C68283d f396656a;

    /* renamed from: c */
    private final C68283d f396657c;

    /* renamed from: d */
    private final C68283d f396658d;

    /* renamed from: e */
    private final C68283d f396659e;

    public C146937cm(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C146937cm.class), aVar);
        this.f396656a = C68236af.m98549d(dVar);
        this.f396657c = C68236af.m98549d(dVar2);
        this.f396658d = C68236af.m98549d(dVar3);
        this.f396659e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C63979ap apVar;
        List list = (List) obj;
        boolean z = false;
        Account account = (Account) list.get(0);
        C64098p pVar = (C64098p) list.get(1);
        C146855ay ayVar = (C146855ay) list.get(2);
        C147172f fVar = (C147172f) list.get(3);
        if (pVar.f173294a == 2) {
            apVar = (C63979ap) pVar.f173295b;
        } else {
            apVar = C63979ap.f173026e;
        }
        C63978ao a = C63978ao.m96329a(apVar.f173031d);
        if (a == null) {
            a = C63978ao.UNKNOWN;
        }
        if (a == C63978ao.SYNC_LATEST_PER_SECONDARY_ID) {
            z = true;
        }
        C58838bb.m90873h(z, "Latest Only sync producer called for wrong %s sync variant.", a);
        C146856az a2 = ayVar.mo123776a(account, apVar.f173029b, apVar.f173030c);
        fVar.mo123995b(a2);
        return C60856cj.m92900i(a2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f396656a.mo60297gq(), this.f396657c.mo60297gq(), this.f396658d.mo60297gq(), this.f396659e.mo60297gq());
    }
}
