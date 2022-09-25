package com.google.android.apps.gsa.staticplugins.p7686co.p7695i;

import android.location.Location;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4460h.p4461a.C58009ae;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.i.bc */
/* compiled from: PG */
public final class C98382bc extends C68247h {

    /* renamed from: a */
    private final C68283d f274651a;

    /* renamed from: c */
    private final C68283d f274652c;

    public C98382bc(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C98382bc.class), aVar);
        this.f274651a = C68236af.m98549d(dVar);
        this.f274652c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Location location;
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C58009ae aeVar = (C58009ae) list.get(1);
        try {
            location = (Location) cVar.mo60292a();
        } catch (ExecutionException e) {
            C59104x c = C98380ba.f274607a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "RequestManagerImpl");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30648)).mo56386p("Producing location failed");
            location = null;
        }
        return C60856cj.m92900i(location);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f274651a.mo60297gq()), this.f274652c.mo60297gq());
    }
}
