package com.google.android.apps.gsa.staticplugins.nga.vis;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.search.core.p6513aj.C84522ag;
import com.google.android.apps.gsa.search.core.p6805i.C86117m;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nga.p8068k.C103384h;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.vis.at */
/* compiled from: PG */
public final class C104201at implements C103384h, C84522ag {

    /* renamed from: a */
    private final Object f289865a = new Object();

    /* renamed from: b */
    private final Context f289866b;

    /* renamed from: c */
    private final C91142g f289867c;

    /* renamed from: d */
    private final C104200as f289868d;

    /* renamed from: e */
    private final C22871g f289869e;

    /* renamed from: f */
    private boolean f289870f;

    public C104201at(Context context, C91142g gVar, C22871g gVar2) {
        this.f289866b = context;
        this.f289867c = gVar;
        this.f289868d = new C104200as(gVar);
        this.f289869e = gVar2;
    }

    /* renamed from: a */
    public final void mo78234a(C86117m mVar) {
        if (mVar.mo79735a(C90126fx.f251245fF.f248757a)) {
            mo94006b();
        }
    }

    /* renamed from: b */
    public final void mo94006b() {
        boolean j = this.f289867c.mo85405j(C90126fx.f251245fF);
        synchronized (this.f289865a) {
            if (j) {
                if (!this.f289870f) {
                    this.f289866b.registerReceiver(this.f289868d, new IntentFilter("com.google.android.apps.gsa.ACTION_KILL_SEARCH"));
                    this.f289870f = true;
                }
            } else if (this.f289870f) {
                this.f289866b.unregisterReceiver(this.f289868d);
                this.f289870f = false;
            }
        }
    }

    /* renamed from: i */
    public final void mo93533i() {
        this.f289869e.mo28212l("[NGA] SearchKillCommandReceiverRegister.onSearchProcessStart", new C104199ar(this));
    }
}
