package com.google.android.libraries.notifications.p2268e.p2287j.p2288a;

import android.content.Intent;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29827r;
import com.google.android.libraries.notifications.p2292g.C30004l;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.p4160bf.p4161a.p4163b.C55460ax;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55564bq;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.libraries.notifications.e.j.a.b */
/* compiled from: PG */
public final class C29939b {
    /* renamed from: a */
    public static C55564bq m55464a(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE");
        if (byteArrayExtra != null) {
            try {
                return (C55564bq) C62942bv.parseFrom((C62942bv) C55564bq.f146602f, byteArrayExtra, C62921ba.m95368a());
            } catch (C62974ct e) {
                C30058b.m55792d("IntentExtrasHelper", e, "Unable to parse ThreadStateUpdate message", new Object[0]);
            }
        }
        return C55564bq.f146602f;
    }

    /* renamed from: b */
    public static void m55465b(Intent intent, C29820k kVar) {
        String h;
        if (kVar != null && (h = kVar.mo35009h()) != null) {
            intent.putExtra("com.google.android.libraries.notifications.ACCOUNT_NAME", h);
        }
    }

    /* renamed from: c */
    public static void m55466c(Intent intent, C29827r rVar) {
        String i;
        if (rVar != null && (i = rVar.mo35062i()) != null) {
            intent.putExtra("com.google.android.libraries.notifications.GROUP_ID", i);
        }
    }

    /* renamed from: d */
    public static void m55467d(Intent intent, C30004l lVar) {
        if (lVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_LOCAL_THREAD_STATE", lVar.toByteArray());
        }
    }

    /* renamed from: e */
    public static void m55468e(Intent intent, C29827r rVar) {
        String j;
        if (rVar != null && (j = rVar.mo35063j()) != null) {
            intent.putExtra("com.google.android.libraries.notifications.THREAD_ID", j);
        }
    }

    /* renamed from: f */
    public static void m55469f(Intent intent, C55564bq bqVar) {
        if (bqVar != null) {
            intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE", bqVar.toByteArray());
        }
    }

    /* renamed from: g */
    public static int m55470g(Intent intent) {
        return intent.getIntExtra("com.google.android.libraries.notifications.EVENT_TYPE", 0);
    }

    /* renamed from: h */
    public static int m55471h(Intent intent) {
        return C55460ax.m87695a(intent.getIntExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", 0));
    }

    /* renamed from: i */
    public static void m55472i(Intent intent, int i) {
        intent.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", i - 1);
    }
}
