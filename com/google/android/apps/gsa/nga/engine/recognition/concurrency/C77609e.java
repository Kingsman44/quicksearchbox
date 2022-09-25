package com.google.android.apps.gsa.nga.engine.recognition.concurrency;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5913am.p5915b.C74869a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75157e;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a.C80534e;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a.C80536g;
import com.google.android.apps.gsa.nga.shared.p6296ab.p6297a.p6298a.C80538i;
import com.google.android.apps.gsa.nga.shared.p6361q.C81449a;
import com.google.android.apps.gsa.nga.shared.p6363s.C81459h;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.C90731ao;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.concurrency.e */
/* compiled from: PG */
public final class C77609e implements C75157e {

    /* renamed from: e */
    private static final C58974d f213815e = C58974d.m91136j();

    /* renamed from: a */
    public final C75050a f213816a;

    /* renamed from: b */
    public final AtomicBoolean f213817b = new AtomicBoolean(false);

    /* renamed from: c */
    final AtomicBoolean f213818c = new AtomicBoolean(false);

    /* renamed from: d */
    final AtomicReference f213819d = new AtomicReference((Object) null);

    /* renamed from: f */
    private final Context f213820f;

    /* renamed from: g */
    private final C81449a f213821g;

    /* renamed from: h */
    private final C74869a f213822h;

    /* renamed from: i */
    private final AudioManager f213823i;

    /* renamed from: j */
    private final C91142g f213824j;

    /* renamed from: k */
    private final C81459h f213825k;

    public C77609e(Context context, C81449a aVar, C74869a aVar2, C75050a aVar3, C22871g gVar, C81465n nVar, AudioManager audioManager, C91142g gVar2) {
        this.f213820f = context;
        this.f213821g = aVar;
        this.f213822h = aVar2;
        this.f213816a = aVar3;
        this.f213823i = audioManager;
        this.f213824j = gVar2;
        this.f213825k = nVar.mo75095b(gVar, C77608d.f213814a);
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        if (boVar2.mo71473s() && boVar.mo71458b().a()) {
            if (C90731ao.m148193c(this.f213823i)) {
                C81459h hVar = this.f213825k;
                C80534e eVar = (C80534e) C80536g.f221076c.createBuilder();
                C80538i iVar = C80538i.f221080a;
                eVar.copyOnWrite();
                C80536g gVar = (C80536g) eVar.instance;
                iVar.getClass();
                gVar.f221079b = iVar;
                gVar.f221078a = 3;
                hVar.mo75090a((C80536g) eVar.build());
            } else if (this.f213824j.mo85405j(C90126fx.f251326gh) && !this.f213818c.get() && this.f213822h.mo71259g()) {
                this.f213817b.set(true);
                ((C58970a) ((C58970a) f213815e.mo56224b()).mo56372aa(4302)).mo56386p("Starting MicConcurrencyActivity");
                this.f213821g.mo74742c(new Intent(this.f213820f, MicConcurrencyActivity.class));
            }
        }
        if (boVar.mo71473s()) {
            mo72742c();
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }

    /* renamed from: c */
    public final void mo72742c() {
        this.f213817b.set(false);
        Runnable runnable = (Runnable) this.f213819d.getAndSet((Object) null);
        if (runnable != null) {
            runnable.run();
        }
    }
}
