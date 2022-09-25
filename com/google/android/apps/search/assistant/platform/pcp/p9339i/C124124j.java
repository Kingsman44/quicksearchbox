package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import android.content.Context;
import android.os.Build;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123611ad;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abu;
import com.google.assistant.p3994s.p3995a.C53132co;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.j */
/* compiled from: PG */
public final class C124124j {
    /* renamed from: a */
    public static String m203547a(aas aas) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(abu.f134764l);
        aas.mo58887l(r0);
        if (!aas.f169962ag.mo58857o(r0.f169971d)) {
            return BuildConfig.FLAVOR;
        }
        C62940bt r02 = C62942bv.checkIsLite(abu.f134764l);
        aas.mo58887l(r02);
        Object l = aas.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        return ((abu) obj).f134768c;
    }

    /* renamed from: b */
    public static void m203548b(C53306j jVar, String str, int i, C48952az azVar, boolean z, long j, C42847bf bfVar) {
        bfVar.mo45931c("ClientProactiveData", C123611ad.m202942a(jVar, i, str, z, (C53132co) null, azVar, j), 5);
    }

    /* renamed from: c */
    public static boolean m203549c(Context context) {
        return (context.getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_EXPERIENCE") || context.getPackageManager().hasSystemFeature("com.google.android.feature.GOOGLE_EXPERIENCE")) && Build.VERSION.SDK_INT >= 31;
    }
}
