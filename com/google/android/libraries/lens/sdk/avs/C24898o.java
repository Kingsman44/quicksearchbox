package com.google.android.libraries.lens.sdk.avs;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.android.libraries.lens.sdk.avs.data.C24881p;
import com.google.android.libraries.lens.sdk.avs.data.C24883r;
import com.google.android.libraries.lens.sdk.p2038a.C24827b;
import com.google.android.libraries.lens.sdk.p2038a.C24828c;
import com.google.android.libraries.lens.sdk.p2038a.C24833h;
import com.google.android.libraries.lens.sdk.p2038a.C24834i;
import com.google.android.libraries.lens.sdk.p2038a.C24836k;
import com.google.android.libraries.lens.sdk.p2038a.C24837l;
import com.google.android.libraries.lens.sdk.p2038a.C24838m;
import com.google.android.libraries.lens.sdk.p2038a.C24840o;
import com.google.android.libraries.lens.sdk.p2038a.C24841p;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.sdk.avs.o */
/* compiled from: PG */
public final class C24898o extends C24827b {

    /* renamed from: e */
    private C24897n f68001e;

    /* renamed from: f */
    private final Context f68002f;

    /* renamed from: g */
    private final PackageManager f68003g;

    /* renamed from: h */
    private final C143701ac f68004h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24898o(android.content.Context r4) {
        /*
            r3 = this;
            com.google.android.libraries.lens.sdk.a.o r0 = new com.google.android.libraries.lens.sdk.a.o
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            com.google.android.libraries.lens.sdk.a.l r2 = new com.google.android.libraries.lens.sdk.a.l
            r2.<init>(r1)
            com.google.android.libraries.lens.sdk.a.m r1 = new com.google.android.libraries.lens.sdk.a.m
            r1.<init>(r4, r2)
            r0.<init>(r1)
            android.content.pm.PackageManager r1 = r4.getPackageManager()
            com.google.android.gms.common.ac r2 = com.google.android.gms.common.C143701ac.m233450a(r4)
            r3.<init>(r0)
            r3.f68002f = r4
            r3.f68004h = r2
            r3.f68003g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.sdk.avs.C24898o.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo30125a() {
        C24841p.m45970a("disconnect", new Object[0]);
        C24828c cVar = this.f67858d;
        C24841p.m45970a("disconnect", new Object[0]);
        C24838m mVar = ((C24840o) cVar).f67882b;
        Executor executor = mVar.f67879f;
        ((C24837l) executor).f67873a.post(new C24834i(mVar));
        C24828c cVar2 = this.f67858d;
        cVar2.f67859a.remove(this.f67857c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo30025b(android.os.Bundle r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f68002f
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r7.setClassLoader(r0)
            java.lang.String r0 = "SessionType"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "SessionTypeAvs"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0018
            return
        L_0x0018:
            com.google.android.libraries.lens.sdk.avs.n r0 = r6.f68001e
            r1 = 0
            if (r0 != 0) goto L_0x0025
            java.lang.String r7 = "onEvent with no callback set"
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.google.android.libraries.lens.sdk.p2038a.C24841p.m45971b(r7, r0)
            return
        L_0x0025:
            java.lang.String r0 = "EventType"
            java.lang.String r0 = r7.getString(r0)
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r3[r1] = r4
            java.lang.String r4 = "onEvent: %s"
            com.google.android.libraries.lens.sdk.p2038a.C24841p.m45970a(r4, r3)
            java.lang.String r3 = "Payload"
            android.os.Bundle r7 = r7.getBundle(r3)
            if (r0 == 0) goto L_0x00b6
            if (r7 != 0) goto L_0x0045
            goto L_0x00b6
        L_0x0045:
            int r3 = r0.hashCode()
            r4 = 3
            r5 = 2
            switch(r3) {
                case -1926884332: goto L_0x006d;
                case 67232232: goto L_0x0063;
                case 364363493: goto L_0x0059;
                case 2014861300: goto L_0x004f;
                default: goto L_0x004e;
            }
        L_0x004e:
            goto L_0x0077
        L_0x004f:
            java.lang.String r3 = "StartSession"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0077
            r3 = 1
            goto L_0x0078
        L_0x0059:
            java.lang.String r3 = "QueryResult"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0077
            r3 = 2
            goto L_0x0078
        L_0x0063:
            java.lang.String r3 = "Error"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0077
            r3 = 0
            goto L_0x0078
        L_0x006d:
            java.lang.String r3 = "StopSession"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0077
            r3 = 3
            goto L_0x0078
        L_0x0077:
            r3 = -1
        L_0x0078:
            if (r3 == 0) goto L_0x00ab
            if (r3 == r2) goto L_0x00a0
            if (r3 == r5) goto L_0x0095
            if (r3 == r4) goto L_0x008a
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r1] = r0
            java.lang.String r0 = "unrecognized event type: %s"
            com.google.android.libraries.lens.sdk.p2038a.C24841p.m45971b(r0, r7)
            return
        L_0x008a:
            com.google.android.libraries.lens.sdk.avs.n r0 = r6.f68001e
            com.google.android.libraries.lens.sdk.avs.data.s r1 = new com.google.android.libraries.lens.sdk.avs.data.s
            r1.<init>(r7)
            r0.mo30124d(r1)
            return
        L_0x0095:
            com.google.android.libraries.lens.sdk.avs.n r0 = r6.f68001e
            com.google.android.libraries.lens.sdk.avs.data.l r1 = new com.google.android.libraries.lens.sdk.avs.data.l
            r1.<init>(r7)
            r0.mo30122b(r1)
            return
        L_0x00a0:
            com.google.android.libraries.lens.sdk.avs.n r0 = r6.f68001e
            com.google.android.libraries.lens.sdk.avs.data.q r1 = new com.google.android.libraries.lens.sdk.avs.data.q
            r1.<init>(r7)
            r0.mo30123c(r1)
            return
        L_0x00ab:
            com.google.android.libraries.lens.sdk.avs.n r0 = r6.f68001e
            com.google.android.libraries.lens.sdk.avs.data.e r1 = new com.google.android.libraries.lens.sdk.avs.data.e
            r1.<init>(r7)
            r0.mo30121a(r1)
            return
        L_0x00b6:
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7[r1] = r0
            java.lang.String r0 = "Missing data for event: %s"
            com.google.android.libraries.lens.sdk.p2038a.C24841p.m45971b(r0, r7)
            r6.mo30026h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.sdk.avs.C24898o.mo30025b(android.os.Bundle):void");
    }

    /* renamed from: c */
    public final void mo30126c(C24876k kVar) {
        C24841p.m45970a("query", new Object[0]);
        mo30028j("Query", kVar.f67959a);
    }

    /* renamed from: d */
    public final void mo30127d(C24897n nVar) {
        C24841p.m45970a("setCallback", new Object[0]);
        this.f68001e = nVar;
    }

    /* renamed from: e */
    public final void mo30128e(C24881p pVar) {
        C24841p.m45970a("start", new Object[0]);
        mo30028j("StartSession", pVar.f67962a);
    }

    /* renamed from: f */
    public final void mo30129f(C24883r rVar) {
        C24841p.m45970a("stop", new Object[0]);
        mo30028j("StopSession", rVar.f67964a);
    }

    /* renamed from: g */
    public final boolean mo30130g() {
        boolean z;
        boolean c;
        C24841p.m45970a("connect", new Object[0]);
        try {
            PackageInfo packageInfo = this.f68003g.getPackageInfo("com.google.android.googlequicksearchbox", 0);
            if (packageInfo != null && packageInfo.versionCode >= 301165494) {
                z = true;
                c = this.f68004h.mo119084c("com.google.android.googlequicksearchbox");
                if (z || !c) {
                    C24841p.m45971b("AGSA up to date: %s, Google-signed %s; device up to date: %s", Boolean.valueOf(z), Boolean.valueOf(c), true);
                    return false;
                }
                C24828c cVar = this.f67858d;
                cVar.f67859a.add(this.f67857c);
                C24828c cVar2 = this.f67858d;
                C24841p.m45970a("connect", new Object[0]);
                C24840o oVar = (C24840o) cVar2;
                C24838m mVar = oVar.f67882b;
                C24839n nVar = oVar.f67883c;
                Executor executor = mVar.f67879f;
                ((C24837l) executor).f67873a.post(new C24833h(mVar, nVar));
                C24838m mVar2 = oVar.f67882b;
                Executor executor2 = mVar2.f67879f;
                ((C24837l) executor2).f67873a.post(new C24836k(mVar2));
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("LensPreconditions", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        z = false;
        c = this.f68004h.mo119084c("com.google.android.googlequicksearchbox");
        if (z) {
        }
        C24841p.m45971b("AGSA up to date: %s, Google-signed %s; device up to date: %s", Boolean.valueOf(z), Boolean.valueOf(c), true);
        return false;
    }
}
