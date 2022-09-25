package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.phenotype.client.C31655ak;
import com.google.common.base.C58835az;
import java.util.Map;

/* renamed from: com.google.android.libraries.phenotype.client.stable.bf */
/* compiled from: PG */
public final class C31714bf extends BroadcastReceiver {

    /* renamed from: a */
    public static final Object f85269a = new Object();

    /* renamed from: b */
    public static volatile boolean f85270b;

    /* renamed from: c */
    static final C31655ak f85271c = C31655ak.m58992c();

    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                Log.w("PhUpdateBroadcastRecv", "Got an invalid config package for P/H that includes '..': " + stringExtra + ". Exiting.");
                return;
            }
            for (Map.Entry entry : f85271c.entrySet()) {
                if (((String) ((C58835az) entry.getKey()).f156631a).equals(stringExtra)) {
                    ((C31756w) entry.getValue()).f85352a.mo37322c();
                }
            }
        }
    }
}
