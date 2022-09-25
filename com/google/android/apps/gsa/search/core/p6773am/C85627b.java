package com.google.android.apps.gsa.search.core.p6773am;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4152bb.p4153a.C55421x;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.am.b */
/* compiled from: PG */
public final class C85627b extends BroadcastReceiver {

    /* renamed from: b */
    private static final C59071e f231441b = C59071e.m91332i("com.google.android.apps.gsa.search.core.am.b");

    /* renamed from: c */
    private static final C58495hd f231442c = C58495hd.m89903q("d", 1, C33259r.f88929b, 2, "w", 3, "b", 4);

    /* renamed from: a */
    public final C68214a f231443a;

    /* renamed from: d */
    private final C22871g f231444d;

    public C85627b(C68214a aVar, C22871g gVar) {
        this.f231443a = aVar;
        this.f231444d = gVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER");
        if (stringExtra == null) {
            stringExtra = "com.google.android.apps.maps";
        }
        String stringExtra2 = intent.getStringExtra("mode");
        C58495hd hdVar = f231442c;
        if (hdVar.containsKey(stringExtra2)) {
            ((Integer) hdVar.get(stringExtra2)).intValue();
        }
        int intExtra = intent.getIntExtra("prompted_action_type", 0);
        C55421x a = C55421x.m87686a(intExtra);
        if (a == null) {
            C59104x d = f231441b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GmmBroadcastReceiver");
            ((C59052c) ((C59052c) d).mo56372aa(9527)).mo56387q("no majel.ActionType for: %d", intExtra);
            int i = C90755l.f253831a;
            a = C55421x.UNKNOWN_ACTION_TYPE;
        }
        this.f231444d.mo28212l("onGmmNavStateChange", new C85626a(this, stringExtra, intent, a));
    }
}
