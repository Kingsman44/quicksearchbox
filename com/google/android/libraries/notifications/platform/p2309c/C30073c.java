package com.google.android.libraries.notifications.platform.p2309c;

import android.net.Uri;

/* renamed from: com.google.android.libraries.notifications.platform.c.c */
/* compiled from: PG */
public final class C30073c extends C30076f {

    /* renamed from: a */
    public final String f81376a;

    /* renamed from: b */
    public final String f81377b;

    /* renamed from: c */
    public final String f81378c;

    /* renamed from: d */
    public final int f81379d;

    /* renamed from: e */
    private final Integer f81380e;

    /* renamed from: f */
    private final Integer f81381f;

    /* renamed from: g */
    private final Integer f81382g;

    /* renamed from: h */
    private final boolean f81383h;

    /* renamed from: i */
    private final boolean f81384i;

    /* renamed from: j */
    private final boolean f81385j;

    /* renamed from: k */
    private final boolean f81386k;

    /* renamed from: l */
    private final int f81387l;

    public C30073c(Integer num, Integer num2, Integer num3, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, int i, int i2) {
        this.f81380e = num;
        this.f81381f = num2;
        this.f81382g = num3;
        this.f81383h = z;
        this.f81384i = z2;
        this.f81385j = z3;
        this.f81386k = z4;
        this.f81376a = str;
        this.f81377b = str2;
        this.f81378c = str3;
        this.f81379d = i;
        this.f81387l = i2;
    }

    /* renamed from: a */
    public final int mo35440a() {
        return this.f81387l;
    }

    /* renamed from: b */
    public final Uri mo35441b() {
        return null;
    }

    /* renamed from: c */
    public final Integer mo35442c() {
        return this.f81381f;
    }

    /* renamed from: d */
    public final Integer mo35443d() {
        return this.f81382g;
    }

    /* renamed from: e */
    public final Integer mo35444e() {
        return this.f81380e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r1 = r4.f81376a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0079, code lost:
        r1 = r4.f81377b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008e, code lost:
        r1 = r4.f81378c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r4.f81382g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.libraries.notifications.platform.p2309c.C30076f
            r2 = 0
            if (r1 == 0) goto L_0x00bb
            com.google.android.libraries.notifications.platform.c.f r5 = (com.google.android.libraries.notifications.platform.p2309c.C30076f) r5
            java.lang.Integer r1 = r4.f81380e
            java.lang.Integer r3 = r5.mo35444e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bb
            java.lang.Integer r1 = r4.f81381f
            java.lang.Integer r3 = r5.mo35442c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bb
            java.lang.Integer r1 = r4.f81382g
            if (r1 != 0) goto L_0x002e
            java.lang.Integer r1 = r5.mo35443d()
            if (r1 != 0) goto L_0x00bb
            goto L_0x0038
        L_0x002e:
            java.lang.Integer r3 = r5.mo35443d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bb
        L_0x0038:
            boolean r1 = r4.f81383h
            boolean r3 = r5.mo35454m()
            if (r1 != r3) goto L_0x00bb
            android.net.Uri r1 = r5.mo35441b()
            if (r1 != 0) goto L_0x00bb
            boolean r1 = r4.f81384i
            boolean r3 = r5.mo35455n()
            if (r1 != r3) goto L_0x00bb
            boolean r1 = r4.f81385j
            boolean r3 = r5.mo35452k()
            if (r1 != r3) goto L_0x00bb
            java.lang.Integer r1 = r5.mo35446f()
            if (r1 != 0) goto L_0x00bb
            boolean r1 = r4.f81386k
            boolean r3 = r5.mo35451j()
            if (r1 != r3) goto L_0x00bb
            java.lang.String r1 = r4.f81376a
            if (r1 != 0) goto L_0x006f
            java.lang.String r1 = r5.mo35448h()
            if (r1 != 0) goto L_0x00bb
            goto L_0x0079
        L_0x006f:
            java.lang.String r3 = r5.mo35448h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bb
        L_0x0079:
            java.lang.String r1 = r4.f81377b
            if (r1 != 0) goto L_0x0084
            java.lang.String r1 = r5.mo35450i()
            if (r1 != 0) goto L_0x00bb
            goto L_0x008e
        L_0x0084:
            java.lang.String r3 = r5.mo35450i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00bb
        L_0x008e:
            java.lang.String r1 = r4.f81378c
            if (r1 != 0) goto L_0x0099
            java.lang.String r1 = r5.mo35447g()
            if (r1 != 0) goto L_0x00bb
            goto L_0x00a4
        L_0x0099:
            java.lang.String r3 = r5.mo35447g()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00a4
            goto L_0x00bb
        L_0x00a4:
            int r1 = r4.f81379d
            int r3 = r5.mo35456o()
            if (r1 != r3) goto L_0x00bb
            int r1 = r4.f81387l
            int r3 = r5.mo35440a()
            if (r1 != r3) goto L_0x00bb
            boolean r5 = r5.mo35453l()
            if (r5 != 0) goto L_0x00bb
            return r0
        L_0x00bb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.platform.p2309c.C30073c.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Integer mo35446f() {
        return null;
    }

    /* renamed from: g */
    public final String mo35447g() {
        return this.f81378c;
    }

    /* renamed from: h */
    public final String mo35448h() {
        return this.f81376a;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((this.f81380e.hashCode() ^ 1000003) * 1000003) ^ this.f81381f.hashCode()) * 1000003;
        Integer num = this.f81382g;
        int i4 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i5 = 1231;
        int i6 = (((((((hashCode ^ i) * 1000003) ^ (true != this.f81383h ? 1237 : 1231)) * -721379959) ^ (true != this.f81384i ? 1237 : 1231)) * 1000003) ^ (true != this.f81385j ? 1237 : 1231)) * -721379959;
        if (true != this.f81386k) {
            i5 = 1237;
        }
        int i7 = (i6 ^ i5) * 1000003;
        String str = this.f81376a;
        if (str == null) {
            i2 = 0;
        } else {
            i2 = str.hashCode();
        }
        int i8 = (i7 ^ i2) * 1000003;
        String str2 = this.f81377b;
        if (str2 == null) {
            i3 = 0;
        } else {
            i3 = str2.hashCode();
        }
        int i9 = (i8 ^ i3) * 1000003;
        String str3 = this.f81378c;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((((i9 ^ i4) * 1000003) ^ this.f81379d) * 1000003) ^ this.f81387l) * 1000003) ^ 1237;
    }

    /* renamed from: i */
    public final String mo35450i() {
        return this.f81377b;
    }

    /* renamed from: j */
    public final boolean mo35451j() {
        return this.f81386k;
    }

    /* renamed from: k */
    public final boolean mo35452k() {
        return this.f81385j;
    }

    /* renamed from: l */
    public final boolean mo35453l() {
        return false;
    }

    /* renamed from: m */
    public final boolean mo35454m() {
        return this.f81383h;
    }

    /* renamed from: n */
    public final boolean mo35455n() {
        return this.f81384i;
    }

    /* renamed from: o */
    public final int mo35456o() {
        return this.f81379d;
    }

    public final String toString() {
        Integer num = this.f81380e;
        Integer num2 = this.f81381f;
        Integer num3 = this.f81382g;
        boolean z = this.f81383h;
        boolean z2 = this.f81384i;
        boolean z3 = this.f81385j;
        boolean z4 = this.f81386k;
        String str = this.f81376a;
        String str2 = this.f81377b;
        String str3 = this.f81378c;
        String str4 = this.f81379d != 1 ? "RESHOW_FROM_LOCAL_STORAGE" : "CLEAR_SYSTEM_TRAY";
        int i = this.f81387l;
        return "SystemTrayNotificationConfig{iconResourceId=" + num + ", appNameResourceId=" + num2 + ", colorResourceId=" + num3 + ", soundEnabled=" + z + ", ringtone=null, vibrationEnabled=" + z2 + ", lightsEnabled=" + z3 + ", ledColor=null, displayRecipientAccountName=" + z4 + ", notificationClickedActivity=" + str + ", notificationRemovedReceiver=" + str2 + ", defaultChannelId=" + str3 + ", restartBehavior=" + str4 + ", defaultGroupThreshold=" + i + ", shouldFilterOldThreads=false}";
    }
}
