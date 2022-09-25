package com.google.apps.tiktok.tracing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.MessageQueue;
import android.view.animation.Animation;
import com.google.common.base.C58817ah;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60800ah;
import com.google.common.util.concurrent.C60801ai;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60804al;
import com.google.common.util.concurrent.C60808ap;
import com.google.common.util.concurrent.C60809aq;
import com.google.common.util.concurrent.C60816ax;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60930r;
import com.google.common.util.concurrent.C60931s;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;

/* renamed from: com.google.apps.tiktok.tracing.es */
/* compiled from: PG */
public final class C47810es {

    /* renamed from: a */
    static final Map f123821a = new HashMap();

    /* renamed from: b */
    public static final /* synthetic */ int f123822b = 0;

    /* renamed from: c */
    private static long f123823c = (Math.abs((long) new Random().nextInt()) << 30);

    /* renamed from: a */
    public static MessageQueue.IdleHandler m84961a(MessageQueue.IdleHandler idleHandler) {
        return new C47792ea(C47831fm.m85011f(), idleHandler);
    }

    /* renamed from: b */
    public static Animation.AnimationListener m84962b(Animation.AnimationListener animationListener) {
        return new C47804em(C47831fm.m85011f(), animationListener);
    }

    /* renamed from: c */
    public static C58817ah m84963c(C58817ah ahVar) {
        return new C47806eo(C47831fm.m85011f(), ahVar);
    }

    /* renamed from: d */
    public static C58881cr m84964d(C58881cr crVar) {
        return new C47796ee(C47831fm.m85011f(), crVar);
    }

    /* renamed from: f */
    public static C60931s m84966f(C60931s sVar) {
        return new C47807ep(C47831fm.m85011f(), sVar);
    }

    /* renamed from: g */
    public static C60800ah m84967g(C60800ah ahVar) {
        return new C47798eg(C47831fm.m85011f(), ahVar);
    }

    /* renamed from: h */
    public static C60801ai m84968h(C60801ai aiVar) {
        return new C47793eb(C47831fm.m85011f(), aiVar);
    }

    /* renamed from: i */
    public static C60803ak m84969i(C60803ak akVar) {
        return new C47797ef(C47831fm.m85011f(), akVar);
    }

    /* renamed from: j */
    public static C60804al m84970j(C60804al alVar) {
        return new C47795ed(C47831fm.m85011f(), alVar);
    }

    /* renamed from: k */
    public static C60808ap m84971k(C60808ap apVar) {
        return new C47794ec(C47831fm.m85011f(), apVar);
    }

    /* renamed from: l */
    public static C60809aq m84972l(C60809aq aqVar) {
        return new C47790dz(C47831fm.m85011f(), aqVar);
    }

    /* renamed from: m */
    public static C60816ax m84973m(C60816ax axVar) {
        return new C47800ei(C47831fm.m85011f(), axVar);
    }

    /* renamed from: n */
    public static C60845bz m84974n(C60845bz bzVar) {
        return new C47802ek(C47831fm.m85011f(), bzVar);
    }

    /* renamed from: o */
    public static Closeable m84975o(Closeable closeable) {
        return new C47799eh(C47831fm.m85011f(), closeable);
    }

    /* renamed from: p */
    public static Runnable m84976p(C47572bw bwVar, Runnable runnable) {
        return new C47801ej(bwVar, runnable);
    }

    /* renamed from: q */
    public static Runnable m84977q(Runnable runnable) {
        return new C47801ej(C47831fm.m85011f(), runnable);
    }

    /* renamed from: r */
    public static Callable m84978r(Callable callable) {
        return new C47803el(C47831fm.m85011f(), callable);
    }

    /* renamed from: s */
    public static void m84979s(Context context, Intent intent) {
        Intent intent2 = new Intent(intent);
        C47809er y = m84985y(intent2);
        try {
            context.startActivity(intent2);
            y.close();
            return;
        } catch (Throwable th) {
            C47789dy.m84949a(th, th);
        }
        throw th;
    }

    /* renamed from: t */
    public static void m84980t(Context context, Intent intent, Bundle bundle) {
        Intent intent2 = new Intent(intent);
        C47809er y = m84985y(intent2);
        try {
            context.startActivity(intent2, (Bundle) null);
            y.close();
            return;
        } catch (Throwable th) {
            C47789dy.m84949a(th, th);
        }
        throw th;
    }

    /* renamed from: u */
    public static void m84981u(Activity activity, Intent intent, int i) {
        Intent intent2 = new Intent(intent);
        C47809er y = m84985y(intent2);
        try {
            activity.startActivityForResult(intent2, i);
            y.close();
            return;
        } catch (Throwable th) {
            C47789dy.m84949a(th, th);
        }
        throw th;
    }

    /* renamed from: v */
    public static void m84982v(Activity activity, Intent intent, int i, Bundle bundle) {
        Intent intent2 = new Intent(intent);
        C47809er y = m84985y(intent2);
        try {
            activity.startActivityForResult(intent2, 0, (Bundle) null);
            y.close();
            return;
        } catch (Throwable th) {
            C47789dy.m84949a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0028  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m84983w(android.content.Context r3, android.content.Intent r4, android.content.ServiceConnection r5) {
        /*
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4)
            r4 = 0
            com.google.apps.tiktok.tracing.er r1 = m84985y(r0)     // Catch:{ all -> 0x0024 }
            r2 = 1
            boolean r4 = r3.bindService(r0, r5, r2)     // Catch:{ all -> 0x001a }
            r1.close()     // Catch:{ all -> 0x0018 }
            if (r4 != 0) goto L_0x0017
            r1.mo51641a()
        L_0x0017:
            return r4
        L_0x0018:
            r3 = move-exception
            goto L_0x0026
        L_0x001a:
            r3 = move-exception
            r1.close()     // Catch:{ all -> 0x001f }
            goto L_0x0023
        L_0x001f:
            r5 = move-exception
            com.google.apps.tiktok.tracing.C47789dy.m84949a(r3, r5)     // Catch:{ all -> 0x0018 }
        L_0x0023:
            throw r3     // Catch:{ all -> 0x0018 }
        L_0x0024:
            r3 = move-exception
            r1 = 0
        L_0x0026:
            if (r4 != 0) goto L_0x002b
            r1.mo51641a()
        L_0x002b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.tracing.C47810es.m84983w(android.content.Context, android.content.Intent, android.content.ServiceConnection):boolean");
    }

    /* renamed from: x */
    public static C47572bw m84984x(Intent intent) {
        C47572bw bwVar;
        try {
            if (!intent.hasExtra("tracing_intent_id")) {
                return null;
            }
            long longExtra = intent.getLongExtra("tracing_intent_id", -1);
            Map map = f123821a;
            synchronized (map) {
                bwVar = (C47572bw) map.remove(Long.valueOf(longExtra));
            }
            return bwVar;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    /* renamed from: y */
    public static C47809er m84985y(Intent intent) {
        long j;
        C47572bw f = C47831fm.m85011f();
        Map map = f123821a;
        synchronized (map) {
            j = f123823c;
            f123823c = 1 + j;
            map.put(Long.valueOf(j), f);
        }
        intent.putExtra("tracing_intent_id", j);
        return new C47809er(j);
    }

    /* renamed from: e */
    public static C60930r m84965e(C60930r rVar) {
        rVar.getClass();
        return new C47805en(C47831fm.m85011f(), rVar);
    }
}
