package com.google.android.apps.gsa.staticplugins.opa.p8183ag;

import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.libraries.lens.view.p2051ab.C24970c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.lens.p4707j.C62433bj;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ag.a */
/* compiled from: PG */
public final /* synthetic */ class C106151a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C106158g f296258a;

    /* renamed from: b */
    public final /* synthetic */ long f296259b;

    /* renamed from: c */
    public final /* synthetic */ boolean f296260c;

    public /* synthetic */ C106151a(C106158g gVar, long j, boolean z) {
        this.f296258a = gVar;
        this.f296259b = j;
        this.f296260c = z;
    }

    public final void run() {
        C106158g gVar = this.f296258a;
        long j = this.f296259b;
        boolean z = this.f296260c;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        int i = 2;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1150;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        C24970c cVar = new C24970c();
        cVar.f68118z = Long.valueOf(j);
        cVar.f68102j = "com.google.android.apps.gsa.staticplugins.opa";
        if (!((Boolean) gVar.f296271f.mo27525b()).booleanValue() || !C90962a.m148577a(gVar.f296267b)) {
            i = 0;
        }
        cVar.f68109q = i;
        if (z) {
            cVar.f68105m = C62433bj.HARDWARE_BUTTON.f168594ao;
        }
        gVar.f296270e.mo115338b(cVar.mo30192a());
    }
}
