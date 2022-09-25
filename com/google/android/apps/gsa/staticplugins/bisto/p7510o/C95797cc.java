package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import android.bluetooth.BluetoothAdapter;
import android.content.IntentFilter;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.cc */
/* compiled from: PG */
public final /* synthetic */ class C95797cc implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95801cg f268240a;

    /* renamed from: b */
    public final /* synthetic */ String f268241b;

    public /* synthetic */ C95797cc(C95801cg cgVar, String str) {
        this.f268240a = cgVar;
        this.f268241b = str;
    }

    public final void run() {
        C95801cg cgVar = this.f268240a;
        String str = this.f268241b;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            if (defaultAdapter.getProfileConnectionState(2) == 2) {
                cgVar.mo89778b();
                return;
            }
            cgVar.f268247d = str;
            cgVar.f268248e = new C95798cd(cgVar);
            cgVar.f268244a.registerReceiver(cgVar.f268248e, new IntentFilter("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"));
        }
    }
}
