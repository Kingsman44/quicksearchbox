package com.google.android.libraries.assistant.p1363c.p1364a.p1365a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.p1367b.C16939a;
import com.google.protobuf.C62910ar;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.c.a.a.h */
/* compiled from: PG */
final class C16945h extends C16940c {

    /* renamed from: a */
    private final Context f49509a;

    /* renamed from: b */
    private final int f49510b;

    /* renamed from: c */
    private final String f49511c;

    /* renamed from: d */
    private final String f49512d;

    /* renamed from: e */
    private final Bundle f49513e;

    /* renamed from: f */
    private final C16939a f49514f;

    /* renamed from: g */
    private final Optional f49515g;

    /* renamed from: h */
    private final boolean f49516h;

    /* renamed from: i */
    private final boolean f49517i;

    /* renamed from: j */
    private final boolean f49518j;

    /* renamed from: k */
    private final boolean f49519k;

    /* renamed from: l */
    private final C62910ar f49520l;

    /* renamed from: m */
    private final Optional f49521m;

    /* renamed from: n */
    private final C16932a f49522n;

    /* renamed from: o */
    private final int f49523o;

    public C16945h(Context context, int i, int i2, String str, String str2, Bundle bundle, C16939a aVar, Optional optional, C16932a aVar2, boolean z, boolean z2, boolean z3, boolean z4, C62910ar arVar, Optional optional2) {
        this.f49509a = context;
        this.f49523o = i;
        this.f49510b = i2;
        this.f49511c = str;
        this.f49512d = str2;
        this.f49513e = bundle;
        this.f49514f = aVar;
        this.f49515g = optional;
        this.f49522n = aVar2;
        this.f49516h = z;
        this.f49517i = z2;
        this.f49518j = z3;
        this.f49519k = z4;
        this.f49520l = arVar;
        this.f49521m = optional2;
    }

    /* renamed from: a */
    public final int mo23115a() {
        return this.f49510b;
    }

    /* renamed from: b */
    public final Context mo23116b() {
        return this.f49509a;
    }

    /* renamed from: c */
    public final Bundle mo23117c() {
        return this.f49513e;
    }

    /* renamed from: d */
    public final C16939a mo23118d() {
        return this.f49514f;
    }

    /* renamed from: e */
    public final C62910ar mo23119e() {
        return this.f49520l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        r1 = r4.f49514f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16940c
            r2 = 0
            if (r1 == 0) goto L_0x00b2
            com.google.android.libraries.assistant.c.a.a.c r5 = (com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16940c) r5
            android.content.Context r1 = r4.f49509a
            android.content.Context r3 = r5.mo23116b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
            int r1 = r4.f49523o
            int r3 = r5.mo23129p()
            if (r1 != r3) goto L_0x00b2
            int r1 = r4.f49510b
            int r3 = r5.mo23115a()
            if (r1 != r3) goto L_0x00b2
            java.lang.String r1 = r4.f49511c
            java.lang.String r3 = r5.mo23122h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
            java.lang.String r1 = r4.f49512d
            java.lang.String r3 = r5.mo23123i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
            android.os.Bundle r1 = r4.f49513e
            android.os.Bundle r3 = r5.mo23117c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
            com.google.android.libraries.assistant.c.a.a.b.a r1 = r4.f49514f
            if (r1 != 0) goto L_0x0056
            com.google.android.libraries.assistant.c.a.a.b.a r1 = r5.mo23118d()
            if (r1 != 0) goto L_0x00b2
            goto L_0x0061
        L_0x0056:
            com.google.android.libraries.assistant.c.a.a.b.a r3 = r5.mo23118d()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0061
            goto L_0x00b2
        L_0x0061:
            j$.util.Optional r1 = r4.f49515g
            j$.util.Optional r3 = r5.mo23121g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
            com.google.android.libraries.assistant.c.a.a.a r1 = r4.f49522n
            com.google.android.libraries.assistant.c.a.a.a r3 = r5.mo23128n()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
            boolean r1 = r4.f49516h
            boolean r3 = r5.mo23126l()
            if (r1 != r3) goto L_0x00b2
            boolean r1 = r4.f49517i
            boolean r3 = r5.mo23125k()
            if (r1 != r3) goto L_0x00b2
            boolean r1 = r4.f49518j
            boolean r3 = r5.mo23127m()
            if (r1 != r3) goto L_0x00b2
            boolean r1 = r4.f49519k
            boolean r3 = r5.mo23124j()
            if (r1 != r3) goto L_0x00b2
            com.google.protobuf.ar r1 = r4.f49520l
            com.google.protobuf.ar r3 = r5.mo23119e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00b2
            j$.util.Optional r1 = r4.f49521m
            j$.util.Optional r5 = r5.mo23120f()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00b2
            return r0
        L_0x00b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16945h.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Optional mo23120f() {
        return this.f49521m;
    }

    /* renamed from: g */
    public final Optional mo23121g() {
        return this.f49515g;
    }

    /* renamed from: h */
    public final String mo23122h() {
        return this.f49511c;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((((((((this.f49509a.hashCode() ^ 1000003) * 1000003) ^ this.f49523o) * 1000003) ^ this.f49510b) * 1000003) ^ this.f49511c.hashCode()) * 1000003) ^ this.f49512d.hashCode()) * 1000003) ^ this.f49513e.hashCode()) * 1000003;
        C16939a aVar = this.f49514f;
        if (aVar == null) {
            i = 0;
        } else {
            i = aVar.hashCode();
        }
        int i2 = 1237;
        int hashCode2 = (((((((((((hashCode ^ i) * 1000003) ^ this.f49515g.hashCode()) * 1000003) ^ this.f49522n.hashCode()) * 1000003) ^ (true != this.f49516h ? 1237 : 1231)) * 1000003) ^ (true != this.f49517i ? 1237 : 1231)) * 1000003) ^ (true != this.f49518j ? 1237 : 1231)) * 1000003;
        if (true == this.f49519k) {
            i2 = 1231;
        }
        return ((((hashCode2 ^ i2) * 1000003) ^ this.f49520l.hashCode()) * 1000003) ^ this.f49521m.hashCode();
    }

    /* renamed from: i */
    public final String mo23123i() {
        return this.f49512d;
    }

    /* renamed from: j */
    public final boolean mo23124j() {
        return this.f49519k;
    }

    /* renamed from: k */
    public final boolean mo23125k() {
        return this.f49517i;
    }

    /* renamed from: l */
    public final boolean mo23126l() {
        return this.f49516h;
    }

    /* renamed from: m */
    public final boolean mo23127m() {
        return this.f49518j;
    }

    /* renamed from: n */
    public final C16932a mo23128n() {
        return this.f49522n;
    }

    /* renamed from: p */
    public final int mo23129p() {
        return this.f49523o;
    }

    public final String toString() {
        String obj = this.f49509a.toString();
        int i = this.f49523o;
        if (i != 1) {
            String num = Integer.toString(i - 2);
            int i2 = this.f49510b;
            String str = this.f49511c;
            String str2 = this.f49512d;
            String obj2 = this.f49513e.toString();
            String valueOf = String.valueOf(this.f49514f);
            String valueOf2 = String.valueOf(this.f49515g);
            String obj3 = this.f49522n.toString();
            boolean z = this.f49516h;
            boolean z2 = this.f49517i;
            boolean z3 = this.f49518j;
            boolean z4 = this.f49519k;
            String obj4 = this.f49520l.toString();
            return "AmpConfiguration{context=" + obj + ", loggingSource=" + num + ", foregroundNotificationId=" + i2 + ", foregroundNotificationChannel=" + str + ", sessionIdentifier=" + str2 + ", sessionMetadata=" + obj2 + ", customMediaSessionHandler=" + valueOf + ", notificationIntent=" + valueOf2 + ", customMediaHandler=" + obj3 + ", hideNotification=" + z + ", enableMediaSession=" + z2 + ", pauseAtEndOfMediaItems=" + z3 + ", delayPreparingMedia=" + z4 + ", progressMonitorInterval=" + obj4 + ", notificationIcon=" + String.valueOf(this.f49521m) + "}";
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
