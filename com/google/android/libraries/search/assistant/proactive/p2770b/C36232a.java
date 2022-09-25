package com.google.android.libraries.search.assistant.proactive.p2770b;

import android.content.Context;
import android.content.Intent;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4985f.p5036r.C65330p;

/* renamed from: com.google.android.libraries.search.assistant.proactive.b.a */
/* compiled from: PG */
public final class C36232a {
    /* renamed from: a */
    public static aas m64674a(Intent intent) {
        byte[] byteArrayExtra;
        if (!(intent == null || !intent.hasExtra("notification_args") || (byteArrayExtra = intent.getByteArrayExtra("notification_args")) == null || byteArrayExtra.length == 0)) {
            try {
                return (aas) C62942bv.parseFrom((C62942bv) aas.f134661u, byteArrayExtra, C62921ba.m95368a());
            } catch (C62974ct unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m64675b(Context context, String str) {
        context.sendBroadcast(new Intent("com.google.android.googlequicksearchbox.OPA_DISMISS_CLIENT_NOTIFICATION").setClassName(context, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver").setPackage("com.google.android.googlequicksearchbox").putExtra("grouping_key", str));
    }

    /* renamed from: c */
    public static void m64676c(Context context, aas aas, int i) {
        context.sendBroadcast(new Intent().setAction("com.google.android.googlequicksearchbox.OPA_TRIGGER_CLIENT_NOTIFICATION").setClassName(context, "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver").setPackage("com.google.android.googlequicksearchbox").putExtra("notification_args", aas.toByteArray()).putExtra("content_source", i));
    }

    /* renamed from: d */
    public static int m64677d(Intent intent) {
        aas a = m64674a(intent);
        if (a == null) {
            return 1;
        }
        aap aap = a.f134676n;
        if (aap == null) {
            aap = aap.f134650h;
        }
        int b = C65330p.m96670b(aap.f134653b);
        if (b == 0) {
            return 1;
        }
        return b;
    }
}
