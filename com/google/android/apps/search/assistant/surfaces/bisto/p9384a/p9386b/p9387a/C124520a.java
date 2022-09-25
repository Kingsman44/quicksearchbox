package com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.p9387a;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124719q;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.a.b.a.a */
/* compiled from: PG */
public final class C124520a {

    /* renamed from: a */
    public final Context f343589a;

    /* renamed from: b */
    public final BluetoothManager f343590b;

    public C124520a(Context context, BluetoothManager bluetoothManager) {
        this.f343589a = context;
        this.f343590b = bluetoothManager;
    }

    /* renamed from: a */
    public static Intent m203975a(String str, C124719q qVar, boolean z) {
        Intent intent = new Intent(qVar == C124719q.GACS_DEVICE ? "bisto_set_gacs_opa_enable_state" : "bisto_set_headphones_enable_state");
        intent.putExtra("extra_enable_state", z);
        intent.putExtra("key_device_id", str);
        if (qVar == C124719q.GACS_DEVICE) {
            m203976b(intent);
        }
        return intent;
    }

    /* renamed from: b */
    public static void m203976b(Intent intent) {
        intent.putExtra("extra_bisto_ble", true);
    }

    /* renamed from: c */
    public final void mo106447c(String str, C124719q qVar, String str2, String str3) {
        Intent a = m203975a(str, qVar, true);
        if (!(qVar != C124719q.GACS_DEVICE || str2 == null || str3 == null)) {
            a.putExtra("acct_sync_on", true);
            a.putExtra("account_name", str2);
            a.putExtra("host_device_id", str3);
        }
        C124519a.m203974a(this.f343589a, a);
    }
}
