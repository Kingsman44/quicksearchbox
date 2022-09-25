package com.google.android.apps.gsa.search.core.carassistant;

import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager;
import com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.$AutoValue_CarAssistantSessionManager_Config  reason: invalid class name */
/* compiled from: PG */
public abstract class C$AutoValue_CarAssistantSessionManager_Config extends CarAssistantSessionManager.Config {

    /* renamed from: a */
    public final amo f231669a;

    /* renamed from: b */
    public final long f231670b;

    /* renamed from: c */
    public final String f231671c;

    /* renamed from: d */
    public final String f231672d;

    /* renamed from: e */
    public final String f231673e;

    /* renamed from: f */
    public final String f231674f;

    /* renamed from: g */
    public final boolean f231675g;

    /* renamed from: h */
    public final boolean f231676h;

    /* renamed from: i */
    public final boolean f231677i;

    /* renamed from: j */
    public final StatusBarNotification f231678j;

    /* renamed from: k */
    public final String f231679k;

    /* renamed from: l */
    public final String f231680l;

    /* renamed from: m */
    public final boolean f231681m;

    /* renamed from: n */
    public final String f231682n;

    /* renamed from: o */
    public final String f231683o;

    /* renamed from: p */
    public final String f231684p;

    /* renamed from: q */
    public final int f231685q;

    /* renamed from: r */
    public final long f231686r;

    /* renamed from: s */
    public final HotwordDetectedEventData f231687s;

    /* renamed from: t */
    public final long f231688t;

    public C$AutoValue_CarAssistantSessionManager_Config(amo amo, long j, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, StatusBarNotification statusBarNotification, String str5, String str6, boolean z4, String str7, String str8, String str9, int i, long j2, HotwordDetectedEventData hotwordDetectedEventData, long j3) {
        amo amo2 = amo;
        String str10 = str;
        if (amo2 != null) {
            this.f231669a = amo2;
            this.f231670b = j;
            if (str10 != null) {
                this.f231671c = str10;
                this.f231672d = str2;
                this.f231673e = str3;
                this.f231674f = str4;
                this.f231675g = z;
                this.f231676h = z2;
                this.f231677i = z3;
                this.f231678j = statusBarNotification;
                this.f231679k = str5;
                this.f231680l = str6;
                this.f231681m = z4;
                this.f231682n = str7;
                this.f231683o = str8;
                this.f231684p = str9;
                this.f231685q = i;
                this.f231686r = j2;
                this.f231687s = hotwordDetectedEventData;
                this.f231688t = j3;
                return;
            }
            throw new NullPointerException("Null source");
        }
        throw new NullPointerException("Null searchClientId");
    }

    /* renamed from: a */
    public final int mo79272a() {
        return this.f231685q;
    }

    /* renamed from: b */
    public final long mo79273b() {
        return this.f231688t;
    }

    /* renamed from: c */
    public final long mo79274c() {
        return this.f231686r;
    }

    /* renamed from: d */
    public final long mo79275d() {
        return this.f231670b;
    }

    /* renamed from: e */
    public final StatusBarNotification mo79276e() {
        return this.f231678j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r1 = r7.f231672d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r1 = r7.f231673e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        r1 = r7.f231674f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0084, code lost:
        r1 = r7.f231678j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        r1 = r7.f231679k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        r1 = r7.f231680l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cb, code lost:
        r1 = r7.f231682n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e0, code lost:
        r1 = r7.f231683o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f5, code lost:
        r1 = r7.f231684p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x011c, code lost:
        r1 = r7.f231687s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.Config
            r2 = 0
            if (r1 == 0) goto L_0x013d
            com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager$Config r8 = (com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager.Config) r8
            com.google.common.o.amo r1 = r7.f231669a
            com.google.common.o.amo r3 = r8.mo79279g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
            long r3 = r7.f231670b
            long r5 = r8.mo79275d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x013d
            java.lang.String r1 = r7.f231671c
            java.lang.String r3 = r8.mo79285l()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
            java.lang.String r1 = r7.f231672d
            if (r1 != 0) goto L_0x0038
            java.lang.String r1 = r8.mo79288o()
            if (r1 != 0) goto L_0x013d
            goto L_0x0042
        L_0x0038:
            java.lang.String r3 = r8.mo79288o()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
        L_0x0042:
            java.lang.String r1 = r7.f231673e
            if (r1 != 0) goto L_0x004d
            java.lang.String r1 = r8.mo79280h()
            if (r1 != 0) goto L_0x013d
            goto L_0x0057
        L_0x004d:
            java.lang.String r3 = r8.mo79280h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
        L_0x0057:
            java.lang.String r1 = r7.f231674f
            if (r1 != 0) goto L_0x0062
            java.lang.String r1 = r8.mo79282i()
            if (r1 != 0) goto L_0x013d
            goto L_0x006c
        L_0x0062:
            java.lang.String r3 = r8.mo79282i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
        L_0x006c:
            boolean r1 = r7.f231675g
            boolean r3 = r8.mo79292s()
            if (r1 != r3) goto L_0x013d
            boolean r1 = r7.f231676h
            boolean r3 = r8.mo79293t()
            if (r1 != r3) goto L_0x013d
            boolean r1 = r7.f231677i
            boolean r3 = r8.mo79290q()
            if (r1 != r3) goto L_0x013d
            android.service.notification.StatusBarNotification r1 = r7.f231678j
            if (r1 != 0) goto L_0x008f
            android.service.notification.StatusBarNotification r1 = r8.mo79276e()
            if (r1 != 0) goto L_0x013d
            goto L_0x0099
        L_0x008f:
            android.service.notification.StatusBarNotification r3 = r8.mo79276e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
        L_0x0099:
            java.lang.String r1 = r7.f231679k
            if (r1 != 0) goto L_0x00a4
            java.lang.String r1 = r8.mo79289p()
            if (r1 != 0) goto L_0x013d
            goto L_0x00ae
        L_0x00a4:
            java.lang.String r3 = r8.mo79289p()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
        L_0x00ae:
            java.lang.String r1 = r7.f231680l
            if (r1 != 0) goto L_0x00b9
            java.lang.String r1 = r8.mo79287n()
            if (r1 != 0) goto L_0x013d
            goto L_0x00c3
        L_0x00b9:
            java.lang.String r3 = r8.mo79287n()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
        L_0x00c3:
            boolean r1 = r7.f231681m
            boolean r3 = r8.mo79291r()
            if (r1 != r3) goto L_0x013d
            java.lang.String r1 = r7.f231682n
            if (r1 != 0) goto L_0x00d6
            java.lang.String r1 = r8.mo79286m()
            if (r1 != 0) goto L_0x013d
            goto L_0x00e0
        L_0x00d6:
            java.lang.String r3 = r8.mo79286m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
        L_0x00e0:
            java.lang.String r1 = r7.f231683o
            if (r1 != 0) goto L_0x00eb
            java.lang.String r1 = r8.mo79284k()
            if (r1 != 0) goto L_0x013d
            goto L_0x00f5
        L_0x00eb:
            java.lang.String r3 = r8.mo79284k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
        L_0x00f5:
            java.lang.String r1 = r7.f231684p
            if (r1 != 0) goto L_0x0100
            java.lang.String r1 = r8.mo79283j()
            if (r1 != 0) goto L_0x013d
            goto L_0x010a
        L_0x0100:
            java.lang.String r3 = r8.mo79283j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x013d
        L_0x010a:
            int r1 = r7.f231685q
            int r3 = r8.mo79272a()
            if (r1 != r3) goto L_0x013d
            long r3 = r7.f231686r
            long r5 = r8.mo79274c()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x013d
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r1 = r7.f231687s
            if (r1 != 0) goto L_0x0127
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r1 = r8.mo79278f()
            if (r1 != 0) goto L_0x013d
            goto L_0x0132
        L_0x0127:
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r3 = r8.mo79278f()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0132
            goto L_0x013d
        L_0x0132:
            long r3 = r7.f231688t
            long r5 = r8.mo79273b()
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x013d
            return r0
        L_0x013d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.carassistant.C$AutoValue_CarAssistantSessionManager_Config.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final HotwordDetectedEventData mo79278f() {
        return this.f231687s;
    }

    /* renamed from: g */
    public final amo mo79279g() {
        return this.f231669a;
    }

    /* renamed from: h */
    public final String mo79280h() {
        return this.f231673e;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int hashCode = this.f231669a.hashCode();
        long j = this.f231670b;
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f231671c.hashCode()) * 1000003;
        String str = this.f231672d;
        int i10 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i11 = (hashCode2 ^ i) * 1000003;
        String str2 = this.f231673e;
        if (str2 == null) {
            i2 = 0;
        } else {
            i2 = str2.hashCode();
        }
        int i12 = (i11 ^ i2) * 1000003;
        String str3 = this.f231674f;
        if (str3 == null) {
            i3 = 0;
        } else {
            i3 = str3.hashCode();
        }
        int i13 = 1237;
        int i14 = (((((((i12 ^ i3) * 1000003) ^ (true != this.f231675g ? 1237 : 1231)) * 1000003) ^ (true != this.f231676h ? 1237 : 1231)) * 1000003) ^ (true != this.f231677i ? 1237 : 1231)) * 1000003;
        StatusBarNotification statusBarNotification = this.f231678j;
        if (statusBarNotification == null) {
            i4 = 0;
        } else {
            i4 = statusBarNotification.hashCode();
        }
        int i15 = (i14 ^ i4) * 1000003;
        String str4 = this.f231679k;
        if (str4 == null) {
            i5 = 0;
        } else {
            i5 = str4.hashCode();
        }
        int i16 = (i15 ^ i5) * 1000003;
        String str5 = this.f231680l;
        if (str5 == null) {
            i6 = 0;
        } else {
            i6 = str5.hashCode();
        }
        int i17 = (i16 ^ i6) * 1000003;
        if (true == this.f231681m) {
            i13 = 1231;
        }
        int i18 = (i17 ^ i13) * 1000003;
        String str6 = this.f231682n;
        if (str6 == null) {
            i7 = 0;
        } else {
            i7 = str6.hashCode();
        }
        int i19 = (i18 ^ i7) * 1000003;
        String str7 = this.f231683o;
        if (str7 == null) {
            i8 = 0;
        } else {
            i8 = str7.hashCode();
        }
        int i20 = (i19 ^ i8) * 1000003;
        String str8 = this.f231684p;
        if (str8 == null) {
            i9 = 0;
        } else {
            i9 = str8.hashCode();
        }
        int i21 = this.f231685q;
        long j2 = this.f231686r;
        int i22 = (((((i20 ^ i9) * 1000003) ^ i21) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        HotwordDetectedEventData hotwordDetectedEventData = this.f231687s;
        if (hotwordDetectedEventData != null) {
            i10 = hotwordDetectedEventData.hashCode();
        }
        long j3 = this.f231688t;
        return ((i22 ^ i10) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3));
    }

    /* renamed from: i */
    public final String mo79282i() {
        return this.f231674f;
    }

    /* renamed from: j */
    public final String mo79283j() {
        return this.f231684p;
    }

    /* renamed from: k */
    public final String mo79284k() {
        return this.f231683o;
    }

    /* renamed from: l */
    public final String mo79285l() {
        return this.f231671c;
    }

    /* renamed from: m */
    public final String mo79286m() {
        return this.f231682n;
    }

    /* renamed from: n */
    public final String mo79287n() {
        return this.f231680l;
    }

    /* renamed from: o */
    public final String mo79288o() {
        return this.f231672d;
    }

    /* renamed from: p */
    public final String mo79289p() {
        return this.f231679k;
    }

    /* renamed from: q */
    public final boolean mo79290q() {
        return this.f231677i;
    }

    /* renamed from: r */
    public final boolean mo79291r() {
        return this.f231681m;
    }

    /* renamed from: s */
    public final boolean mo79292s() {
        return this.f231675g;
    }

    /* renamed from: t */
    public final boolean mo79293t() {
        return this.f231676h;
    }

    public final String toString() {
        String num = Integer.toString(this.f231669a.f159234au);
        long j = this.f231670b;
        String str = this.f231671c;
        String str2 = this.f231672d;
        String str3 = this.f231673e;
        String str4 = this.f231674f;
        boolean z = this.f231675g;
        boolean z2 = this.f231676h;
        boolean z3 = this.f231677i;
        String valueOf = String.valueOf(this.f231678j);
        String str5 = this.f231679k;
        String str6 = this.f231680l;
        boolean z4 = this.f231681m;
        String str7 = this.f231682n;
        String str8 = this.f231683o;
        String str9 = this.f231684p;
        long j2 = this.f231686r;
        String valueOf2 = String.valueOf(this.f231687s);
        return "Config{searchClientId=" + num + ", sessionHandoverId=" + j + ", source=" + str + ", userAgentSuffix=" + str2 + ", carManufacturer=" + str3 + ", carModel=" + str4 + ", isEmbedded=" + z + ", notificationAccessMissing=" + z2 + ", fallbackAssistantEnabled=" + z3 + ", statusBarNotification=" + valueOf + ", voiceInteractionAction=" + str5 + ", textQuery=" + str6 + ", instrumentTestQuery=" + z4 + ", suggestionId=" + str7 + ", recipientName=" + str8 + ", phoneNumber=" + str9 + ", audioSessionId=" + this.f231685q + ", queryRequestId=" + j2 + ", hotwordDetectedEventData=" + valueOf2 + ", interactionSessionStartTime=" + this.f231688t + "}";
    }
}
