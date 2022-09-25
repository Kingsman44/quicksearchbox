package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75157e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78253d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78263m;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78242a;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78243b;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78244c;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78246e;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78247f;
import com.google.android.apps.gsa.nga.shared.p6312ai.p6313a.C80642f;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83016y;
import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83357g;
import com.google.android.apps.gsa.nga.shared.p6417x.C83358h;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.w */
/* compiled from: PG */
public final class C78717w implements C78246e, C75157e {

    /* renamed from: a */
    public static final /* synthetic */ int f216678a = 0;

    /* renamed from: b */
    private static final C59071e f216679b = C59071e.m91332i("com.google.android.apps.gsa.nga.engine.ui.e.l.w");

    /* renamed from: c */
    private final C83357g f216680c;

    /* renamed from: d */
    private final C83357g f216681d;

    /* renamed from: e */
    private final C83358h f216682e;

    /* renamed from: f */
    private final C22871g f216683f;

    static {
        C78244c c = C78245d.m125621c();
        C78242a b = C78243b.m125610b();
        C78247f fVar = (C78247f) b;
        fVar.f215387e = 3;
        fVar.f215385c = 1;
        b.mo73168c(e.a);
        fVar.f215386d = 1;
        c.mo73177b(b.mo73166a());
        C78242a b2 = C78243b.m125610b();
        C78247f fVar2 = (C78247f) b2;
        fVar2.f215387e = 3;
        fVar2.f215385c = 1;
        b2.mo73168c(e.a);
        fVar2.f215386d = 1;
        c.mo73178c(b2.mo73166a());
        c.mo73176a();
    }

    public C78717w(C80642f fVar, C78253d dVar, C22871g gVar) {
        C83361k kVar = new C83361k(C75077bo.m121354i(C89849ae.UNKNOWN_EVENT, C83016y.UNKNOWN).b(), C78263m.class);
        this.f216680c = kVar;
        C83361k kVar2 = new C83361k(C75077bo.m121354i(C89849ae.UNKNOWN_EVENT, C83016y.UNKNOWN).b(), C78263m.class);
        this.f216681d = kVar2;
        this.f216683f = gVar;
        this.f216682e = C83349aj.m132655j(kVar2, kVar, dVar.mo73207f(), new C78716v(fVar));
    }

    /* renamed from: d */
    public static C78243b m126466d(C75077bo boVar, int i) {
        C78242a b = C78243b.m125610b();
        C83016y d = boVar.mo71460d();
        C83016y yVar = C83016y.UNKNOWN;
        bl blVar = bl.a;
        int ordinal = d.ordinal();
        int i2 = 4;
        C78247f fVar = (C78247f) b;
        fVar.f215385c = ordinal != 32 ? ordinal != 33 ? ordinal != 50 ? ordinal != 54 ? ordinal != 59 ? ordinal != 71 ? ordinal != 79 ? ordinal != 90 ? ordinal != 73 ? ordinal != 74 ? 1 : 7 : 9 : 11 : 10 : 4 : 8 : 5 : 6 : 3 : 2;
        int ordinal2 = boVar.mo71458b().ordinal();
        if (ordinal2 == 0) {
            i2 = 1;
        } else if (ordinal2 == 1) {
            i2 = 2;
        } else if (ordinal2 == 2) {
            i2 = 3;
        } else if (ordinal2 != 3) {
            throw new IllegalStateException();
        }
        fVar.f215387e = i2;
        b.mo73167b(boVar.mo71461e().f226175n);
        Optional map = boVar.mo71464h().map(C78715u.f216676a);
        if (map != null) {
            fVar.f215384b = map;
            b.mo73168c((e) boVar.mo71467m().orElse(e.a));
            fVar.f215386d = i;
            if ((boVar.mo71461e().f226162a & 8) != 0) {
                fVar.f215383a = Optional.m71637of(Instant.ofEpochMilli(boVar.mo71461e().f226166e));
            }
            return b.mo73166a();
        }
        throw new NullPointerException("Null identifier");
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        ((C59052c) ((C59052c) f216679b.mo56224b()).mo56372aa(5251)).mo56354G("onActiveStateChangeEvent: %s => %s", boVar2.mo71458b(), boVar.mo71458b());
        C83349aj.m132647b(this.f216683f, this.f216680c, boVar, "newState");
        C83349aj.m132647b(this.f216683f, this.f216681d, boVar2, "previousState");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final C83358h mo73191c() {
        return this.f216682e;
    }
}
