package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.ag */
/* compiled from: PG */
public final class C75879ag extends C75891l {

    /* renamed from: a */
    public final C84516aa f210529a;

    /* renamed from: b */
    private final Context f210530b;

    /* renamed from: c */
    private final C91142g f210531c;

    /* renamed from: d */
    private BroadcastReceiver f210532d;

    public C75879ag(C75892m mVar, Context context, C84516aa aaVar, C91142g gVar) {
        super(mVar);
        this.f210530b = context;
        this.f210529a = aaVar;
        this.f210531c = gVar;
    }

    /* renamed from: e */
    public final void mo71938e() {
        BroadcastReceiver broadcastReceiver = this.f210532d;
        if (broadcastReceiver != null) {
            this.f210530b.unregisterReceiver(broadcastReceiver);
            this.f210532d = null;
        }
    }

    /* renamed from: f */
    public final int mo71939f() {
        if (!this.f210529a.mo78229c()) {
            return 3;
        }
        if (!this.f210531c.mo85405j(C90126fx.f251355hJ)) {
            return 2;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        C75878af afVar = new C75878af(this);
        this.f210532d = afVar;
        this.f210530b.registerReceiver(afVar, intentFilter);
        return 1;
    }
}
