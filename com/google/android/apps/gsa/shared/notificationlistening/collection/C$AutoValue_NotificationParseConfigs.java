package com.google.android.apps.gsa.shared.notificationlistening.collection;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.$AutoValue_NotificationParseConfigs  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_NotificationParseConfigs extends NotificationParseConfigs {

    /* renamed from: a */
    public final C58485gu f252355a;

    /* renamed from: b */
    public final C58485gu f252356b;

    /* renamed from: c */
    public final C58485gu f252357c;

    /* renamed from: d */
    public final C58485gu f252358d;

    /* renamed from: e */
    public final boolean f252359e;

    /* renamed from: f */
    public final boolean f252360f;

    /* renamed from: g */
    public final boolean f252361g;

    /* renamed from: h */
    public final boolean f252362h;

    /* renamed from: i */
    public final boolean f252363i;

    /* renamed from: j */
    public final boolean f252364j;

    /* renamed from: k */
    public final boolean f252365k;

    /* renamed from: l */
    public final int f252366l;

    public C$AutoValue_NotificationParseConfigs(C58485gu guVar, C58485gu guVar2, C58485gu guVar3, C58485gu guVar4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        if (guVar != null) {
            this.f252355a = guVar;
            if (guVar2 != null) {
                this.f252356b = guVar2;
                if (guVar3 != null) {
                    this.f252357c = guVar3;
                    if (guVar4 != null) {
                        this.f252358d = guVar4;
                        this.f252359e = z;
                        this.f252360f = z2;
                        this.f252361g = z3;
                        this.f252362h = z4;
                        this.f252363i = z5;
                        this.f252364j = z6;
                        this.f252365k = z7;
                        this.f252366l = i;
                        return;
                    }
                    throw new NullPointerException("Null readMessageNotificationPackageDenylist");
                }
                throw new NullPointerException("Null messagingPackagesReplyBlacklist");
            }
            throw new NullPointerException("Null messagingReplyPackageWhitelist");
        }
        throw new NullPointerException("Null messagingWhitelistedPackages");
    }

    /* renamed from: a */
    public final int mo84047a() {
        return this.f252366l;
    }

    /* renamed from: b */
    public final C58485gu mo84048b() {
        return this.f252357c;
    }

    /* renamed from: c */
    public final C58485gu mo84049c() {
        return this.f252356b;
    }

    /* renamed from: d */
    public final C58485gu mo84050d() {
        return this.f252355a;
    }

    /* renamed from: e */
    public final C58485gu mo84051e() {
        return this.f252358d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NotificationParseConfigs) {
            NotificationParseConfigs notificationParseConfigs = (NotificationParseConfigs) obj;
            return C58597ky.m90218i(this.f252355a, notificationParseConfigs.mo84050d()) && C58597ky.m90218i(this.f252356b, notificationParseConfigs.mo84049c()) && C58597ky.m90218i(this.f252357c, notificationParseConfigs.mo84048b()) && C58597ky.m90218i(this.f252358d, notificationParseConfigs.mo84051e()) && this.f252359e == notificationParseConfigs.mo84058j() && this.f252360f == notificationParseConfigs.mo84057i() && this.f252361g == notificationParseConfigs.mo84055h() && this.f252362h == notificationParseConfigs.mo84054g() && this.f252363i == notificationParseConfigs.mo84053f() && this.f252364j == notificationParseConfigs.mo84059k() && this.f252365k == notificationParseConfigs.mo84060l() && this.f252366l == notificationParseConfigs.mo84047a();
        }
    }

    /* renamed from: f */
    public final boolean mo84053f() {
        return this.f252363i;
    }

    /* renamed from: g */
    public final boolean mo84054g() {
        return this.f252362h;
    }

    /* renamed from: h */
    public final boolean mo84055h() {
        return this.f252361g;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((this.f252355a.hashCode() ^ 1000003) * 1000003) ^ this.f252356b.hashCode()) * 1000003) ^ this.f252357c.hashCode()) * 1000003) ^ this.f252358d.hashCode()) * 1000003) ^ (true != this.f252359e ? 1237 : 1231)) * 1000003) ^ (true != this.f252360f ? 1237 : 1231)) * 1000003) ^ (true != this.f252361g ? 1237 : 1231)) * 1000003) ^ (true != this.f252362h ? 1237 : 1231)) * 1000003) ^ (true != this.f252363i ? 1237 : 1231)) * 1000003) ^ (true != this.f252364j ? 1237 : 1231)) * 1000003;
        if (true == this.f252365k) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f252366l;
    }

    /* renamed from: i */
    public final boolean mo84057i() {
        return this.f252360f;
    }

    /* renamed from: j */
    public final boolean mo84058j() {
        return this.f252359e;
    }

    /* renamed from: k */
    public final boolean mo84059k() {
        return this.f252364j;
    }

    /* renamed from: l */
    public final boolean mo84060l() {
        return this.f252365k;
    }

    public final String toString() {
        String obj = this.f252355a.toString();
        String obj2 = this.f252356b.toString();
        String obj3 = this.f252357c.toString();
        String obj4 = this.f252358d.toString();
        boolean z = this.f252359e;
        boolean z2 = this.f252360f;
        boolean z3 = this.f252361g;
        boolean z4 = this.f252362h;
        boolean z5 = this.f252363i;
        boolean z6 = this.f252364j;
        boolean z7 = this.f252365k;
        int i = this.f252366l;
        return "NotificationParseConfigs{messagingWhitelistedPackages=" + obj + ", messagingReplyPackageWhitelist=" + obj2 + ", messagingPackagesReplyBlacklist=" + obj3 + ", readMessageNotificationPackageDenylist=" + obj4 + ", migrationToBlacklistEnabled=" + z + ", messageStyleParserForWhatsappEnabled=" + z2 + ", messageStyleForMessagesAndHangouts=" + z3 + ", messageStyleForFacebookMessengerEnabled=" + z4 + ", markAsReadActionEnabled=" + z5 + ", readAllGroupMessagesEnabled=" + z6 + ", readImageCaptionEnabled=" + z7 + ", xmsExpirationPeriodSeconds=" + i + "}";
    }
}
