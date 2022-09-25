package com.google.apps.tiktok.inject.baseclasses;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.support.p028c.C0125a;
import com.google.android.libraries.p11012aj.C147608g;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47815ex;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.inject.baseclasses.c */
/* compiled from: PG */
public abstract class C47206c extends C47204a implements C47211g {

    /* renamed from: e */
    public C47770dh f122867e;

    /* renamed from: f */
    public C69464a f122868f;

    static {
        SystemClock.elapsedRealtime();
    }

    /* renamed from: h */
    public static long m83963h() {
        return Process.getStartElapsedRealtime();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
        if (r0.startsWith(":privileged_process") == false) goto L_0x0033;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m83964i() {
        /*
            java.lang.Boolean r0 = com.google.android.libraries.p11012aj.C147610i.f398424b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x007c
            boolean r0 = android.os.Process.isIsolated()
            if (r0 == 0) goto L_0x000f
        L_0x000c:
            r0 = 1
            goto L_0x0076
        L_0x000f:
            java.lang.String r0 = com.google.android.libraries.p11012aj.C147610i.f398423a
            r3 = -1
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = com.google.android.libraries.p11012aj.C147596b.m240671b()
            if (r0 != 0) goto L_0x001c
            r0 = 0
            goto L_0x0031
        L_0x001c:
            r4 = 58
            int r4 = r0.indexOf(r4)
            if (r4 != r3) goto L_0x0029
            java.lang.String r0 = ""
            com.google.android.libraries.p11012aj.C147610i.f398423a = r0
            goto L_0x002f
        L_0x0029:
            java.lang.String r0 = r0.substring(r4)
            com.google.android.libraries.p11012aj.C147610i.f398423a = r0
        L_0x002f:
            java.lang.String r0 = com.google.android.libraries.p11012aj.C147610i.f398423a
        L_0x0031:
            if (r0 != 0) goto L_0x0035
        L_0x0033:
            r0 = 0
            goto L_0x0076
        L_0x0035:
            int r4 = r0.hashCode()
            r5 = -737791795(0xffffffffd40630cd, float:-2.30537744E12)
            r6 = 2
            if (r4 == r5) goto L_0x005e
            r5 = -733923188(0xffffffffd441388c, float:-3.31950955E12)
            if (r4 == r5) goto L_0x0054
            r5 = 1771111950(0x6991060e, float:2.1915355E25)
            if (r4 == r5) goto L_0x004a
            goto L_0x0067
        L_0x004a:
            java.lang.String r4 = ":train"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0067
            r3 = 1
            goto L_0x0067
        L_0x0054:
            java.lang.String r4 = ":learning_bg"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0067
            r3 = 0
            goto L_0x0067
        L_0x005e:
            java.lang.String r4 = ":primes_lifeboat"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0067
            r3 = 2
        L_0x0067:
            if (r3 == 0) goto L_0x000c
            if (r3 == r2) goto L_0x000c
            if (r3 == r6) goto L_0x000c
            java.lang.String r3 = ":privileged_process"
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L_0x0033
            goto L_0x000c
        L_0x0076:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.google.android.libraries.p11012aj.C147610i.f398424b = r0
        L_0x007c:
            java.lang.Boolean r0 = com.google.android.libraries.p11012aj.C147610i.f398424b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0085
            return r2
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.inject.baseclasses.C47206c.m83964i():boolean");
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        if (Process.isIsolated()) {
            super.attachBaseContext(context);
            return;
        }
        super.attachBaseContext(context);
        C0125a.m129b(this);
    }

    public void onCreate() {
        C47558bi a;
        C47558bi a2;
        if (!m83964i()) {
            super.onCreate();
            return;
        } else if (!C47831fm.m85027v()) {
            long b = C47207d.m83966b();
            long a3 = C47207d.m83965a(b);
            C47816ey c = C47816ey.m84989c();
            if (c.mo51645d()) {
                C47538ax d = this.f122867e.mo51614d(a3, b);
                try {
                    C47831fm.m85020o();
                    a2 = C47831fm.m85006a("Application.onCreate");
                    ((C147608g) this.f122868f.mo17428b()).mo124375a();
                    super.onCreate();
                    a2.close();
                    if (d != null) {
                        d.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (d != null) {
                        try {
                            d.close();
                        } catch (Throwable th2) {
                            C47205b.m83962a(th, th2);
                        }
                    }
                    throw th;
                }
            } else {
                C47573bx a4 = c.mo51644a();
                try {
                    C47558bi a5 = C47831fm.m85006a("Application creation");
                    try {
                        a = C47831fm.m85006a("Application.onCreate");
                        ((C147608g) this.f122868f.mo17428b()).mo124375a();
                        super.onCreate();
                        a.close();
                        a5.close();
                        C47831fm.m85013h(((C47815ex) a4).f123840a);
                        return;
                    } catch (Throwable th3) {
                        a5.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    try {
                        C47831fm.m85013h(((C47815ex) a4).f123840a);
                    } catch (Throwable th5) {
                        C47205b.m83962a(th4, th5);
                    }
                    throw th4;
                }
            }
        } else {
            ((C147608g) this.f122868f.mo17428b()).mo124375a();
            super.onCreate();
            return;
        }
        throw th;
        throw th;
    }
}
