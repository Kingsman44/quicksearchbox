package com.google.android.apps.gsa.shared.notificationlistening.collection;

import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a */
/* compiled from: PG */
public final class C90360a extends C90410q {

    /* renamed from: a */
    public C58485gu f252368a;

    /* renamed from: b */
    public C58485gu f252369b;

    /* renamed from: c */
    public C58485gu f252370c;

    /* renamed from: d */
    public C58485gu f252371d;

    /* renamed from: e */
    private boolean f252372e;

    /* renamed from: f */
    private boolean f252373f;

    /* renamed from: g */
    private boolean f252374g;

    /* renamed from: h */
    private boolean f252375h;

    /* renamed from: i */
    private boolean f252376i;

    /* renamed from: j */
    private boolean f252377j;

    /* renamed from: k */
    private boolean f252378k;

    /* renamed from: l */
    private int f252379l;

    /* renamed from: m */
    private byte f252380m;

    /* renamed from: a */
    public final NotificationParseConfigs mo84064a() {
        if (this.f252380m == -1 && this.f252368a != null && this.f252369b != null && this.f252370c != null && this.f252371d != null) {
            return new AutoValue_NotificationParseConfigs(this.f252368a, this.f252369b, this.f252370c, this.f252371d, this.f252372e, this.f252373f, this.f252374g, this.f252375h, this.f252376i, this.f252377j, this.f252378k, this.f252379l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f252368a == null) {
            sb.append(" messagingWhitelistedPackages");
        }
        if (this.f252369b == null) {
            sb.append(" messagingReplyPackageWhitelist");
        }
        if (this.f252370c == null) {
            sb.append(" messagingPackagesReplyBlacklist");
        }
        if (this.f252371d == null) {
            sb.append(" readMessageNotificationPackageDenylist");
        }
        if ((this.f252380m & 1) == 0) {
            sb.append(" migrationToBlacklistEnabled");
        }
        if ((this.f252380m & 2) == 0) {
            sb.append(" messageStyleParserForWhatsappEnabled");
        }
        if ((this.f252380m & 4) == 0) {
            sb.append(" messageStyleForMessagesAndHangouts");
        }
        if ((this.f252380m & 8) == 0) {
            sb.append(" messageStyleForFacebookMessengerEnabled");
        }
        if ((this.f252380m & 16) == 0) {
            sb.append(" markAsReadActionEnabled");
        }
        if ((this.f252380m & 32) == 0) {
            sb.append(" readAllGroupMessagesEnabled");
        }
        if ((this.f252380m & 64) == 0) {
            sb.append(" readImageCaptionEnabled");
        }
        if ((this.f252380m & 128) == 0) {
            sb.append(" xmsExpirationPeriodSeconds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo84065b(boolean z) {
        this.f252376i = z;
        this.f252380m = (byte) (this.f252380m | 16);
    }

    /* renamed from: c */
    public final void mo84066c(boolean z) {
        this.f252375h = z;
        this.f252380m = (byte) (this.f252380m | 8);
    }

    /* renamed from: d */
    public final void mo84067d(boolean z) {
        this.f252374g = z;
        this.f252380m = (byte) (this.f252380m | 4);
    }

    /* renamed from: e */
    public final void mo84068e(boolean z) {
        this.f252373f = z;
        this.f252380m = (byte) (this.f252380m | 2);
    }

    /* renamed from: f */
    public final void mo84069f(boolean z) {
        this.f252372e = z;
        this.f252380m = (byte) (this.f252380m | 1);
    }

    /* renamed from: g */
    public final void mo84070g(boolean z) {
        this.f252377j = z;
        this.f252380m = (byte) (this.f252380m | 32);
    }

    /* renamed from: h */
    public final void mo84071h(boolean z) {
        this.f252378k = z;
        this.f252380m = (byte) (this.f252380m | 64);
    }

    /* renamed from: i */
    public final void mo84072i(int i) {
        this.f252379l = i;
        this.f252380m = (byte) (this.f252380m | 128);
    }
}
