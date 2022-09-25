package com.google.android.gms.learning.dynamite;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.libs.p10835c.C144854b;
import com.google.android.gms.phenotype.C145738p;
import com.google.android.gms.phenotype.C145748z;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.libraries.micore.learning.base.C29712d;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.phenotype.client.C31654aj;

/* renamed from: com.google.android.gms.learning.dynamite.aa */
/* compiled from: PG */
final class C144615aa {

    /* renamed from: a */
    public static final C29719k f391312a = C29712d.m54801a("DynamitePhenoInit");

    /* renamed from: b */
    private static final BroadcastReceiver f391313b = new C144736z();

    /* renamed from: c */
    private static boolean f391314c = false;

    /* renamed from: a */
    public static String m235121a(Context context) {
        return "com.google.android.gms.learning#".concat(String.valueOf(context.getPackageName()));
    }

    /* renamed from: b */
    static synchronized void m235122b(Context context) {
        synchronized (C144615aa.class) {
            if (!f391314c) {
                String a = m235121a(context);
                C31654aj.m58985d(context);
                C144854b.m235443a(context, f391313b, new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                C145748z b = C145738p.m237003b(context);
                C146006ab e = b.mo121905e(a, 69000, new String[]{"BRELLA", "BRELLA_COUNTERS"}, new byte[0]);
                C146014aj ajVar = (C146014aj) e;
                ajVar.mo122494m(C146013ai.f394700a, new C144732v(a));
                C146014aj ajVar2 = (C146014aj) e;
                ajVar2.mo122495n(C146013ai.f394700a, new C144733w(a, b));
                f391314c = true;
            }
        }
    }
}
