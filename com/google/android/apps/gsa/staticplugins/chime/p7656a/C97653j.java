package com.google.android.apps.gsa.staticplugins.chime.p7656a;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.sidekick.shared.p7242k.C91753a;
import com.google.android.apps.gsa.sidekick.shared.util.C91969at;
import com.google.android.apps.p489g.p494d.C9177bm;
import com.google.android.apps.p489g.p494d.C9178bn;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.p375ai.p378b.C7566bt;
import com.google.p4283bv.p4345d.p4350b.p4351a.C56975k;

/* renamed from: com.google.android.apps.gsa.staticplugins.chime.a.j */
/* compiled from: PG */
public final class C97653j implements C97645b {

    /* renamed from: a */
    private final Context f272738a;

    /* renamed from: b */
    private final C84474e f272739b;

    public C97653j(Context context, C84474e eVar) {
        this.f272738a = context;
        this.f272739b = eVar;
    }

    /* renamed from: a */
    public final void mo90782a(C29827r rVar, C56975k kVar, boolean z) {
        C7566bt btVar;
        if (!this.f272739b.mo78079X()) {
            if (Build.VERSION.SDK_INT < 31) {
                this.f272738a.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
            C9177bm bmVar = (C9177bm) C9178bn.f31697c.createBuilder();
            if (kVar.f152093b == 8) {
                btVar = (C7566bt) kVar.f152094c;
            } else {
                btVar = C7566bt.f26167a;
            }
            String a = C91969at.m150924a(btVar, this.f272738a);
            if (a != null) {
                bmVar.copyOnWrite();
                C9178bn bnVar = (C9178bn) bmVar.instance;
                bnVar.f31699a |= 1;
                bnVar.f31700b = a;
            }
            this.f272738a.startActivity(C91753a.m150311a((C9178bn) bmVar.build(), this.f272738a));
        }
    }
}
