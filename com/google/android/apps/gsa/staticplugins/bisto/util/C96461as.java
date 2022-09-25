package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.accounts.Account;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.bisto.C89651f;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.bisto.p7029b.C89636g;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124519a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.as */
/* compiled from: PG */
public final class C96461as {

    /* renamed from: a */
    public static final long f269857a = TimeUnit.SECONDS.toMillis(40);

    /* renamed from: b */
    public static final long f269858b = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: a */
    public static void m159824a(C88483e eVar) {
        C89651f.m145940a(eVar, new C88489j(C87739bu.BISTO_STARTUP_PREF_CHANGED).mo82013a());
    }

    /* renamed from: b */
    public static void m159825b(Context context, BluetoothDevice bluetoothDevice, String str, String str2, byte[] bArr, C58833ax axVar) {
        Intent intent = new Intent("action_perform_initial_gacs_connection");
        intent.putExtra("extra_device", bluetoothDevice);
        intent.putExtra("device_model_id", str);
        intent.putExtra("build_label", str2);
        intent.putExtra("gacs_device_encryption_key", bArr);
        if (axVar.mo56113h()) {
            intent.putExtra("account_name", ((Account) axVar.mo56107c()).name);
        }
        C89636g.m145897c(intent);
        C124519a.m203974a(context, intent);
    }

    /* renamed from: c */
    public static void m159826c(Context context, String str, C89492cd cdVar, BluetoothDevice bluetoothDevice, C124633az azVar) {
        cdVar.mo83394aj(str, (C124636bb) null, azVar);
        Intent intent = new Intent("ACTION_OOBE_STATUS_UPDATED");
        intent.putExtra("key_device_id", str);
        intent.putExtra("extra_device", bluetoothDevice);
        intent.putExtra("EXTRA_OOBE_STATE", azVar.f343841h);
        C124519a.m203974a(context, intent);
    }

    /* renamed from: d */
    public static boolean m159827d(C124548d dVar) {
        boolean z = C124636bb.OPA_ENABLED.equals(dVar.mo106521s()) || dVar.mo106501ao() == 2;
        boolean equals = C124633az.OOBE_FINISHED.equals(dVar.mo106520r());
        C58976aa aaVar = C58975e.f156826a;
        return z && equals;
    }

    /* renamed from: e */
    public static boolean m159828e(C91142g gVar, C21370a aVar) {
        return m159830g(gVar.mo85398c("key_oobe_timestamp_ms", 0), aVar, f269857a);
    }

    /* renamed from: f */
    public static boolean m159829f(C91142g gVar, C21370a aVar) {
        return m159830g(gVar.mo85398c("key_oobe_inactive_since_timestamp_ms", 0), aVar, f269858b);
    }

    /* renamed from: g */
    private static boolean m159830g(long j, C21370a aVar, long j2) {
        return aVar.mo26870b() - j < j2;
    }
}
