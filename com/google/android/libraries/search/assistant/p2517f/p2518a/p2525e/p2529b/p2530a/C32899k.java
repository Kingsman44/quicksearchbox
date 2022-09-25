package com.google.android.libraries.search.assistant.p2517f.p2518a.p2525e.p2529b.p2530a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.e.b.a.k */
/* compiled from: PG */
public final class C32899k extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C32903o f88177a;

    public C32899k(C32903o oVar) {
        this.f88177a = oVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(intent, "intent");
        if (C69664n.m101066l("android.intent.action.LOCALE_CHANGED", intent.getAction())) {
            C58976aa aaVar = C58975e.f156826a;
            C32903o oVar = this.f88177a;
            C71803m.m105043d(oVar.f88191c, (C69585o) null, (C71424ay) null, new C32902n(oVar, (C69577g) null), 3);
        }
    }
}
