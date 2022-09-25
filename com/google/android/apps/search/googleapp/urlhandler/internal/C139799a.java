package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.content.Intent;
import com.google.common.p4552o.C60492rx;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.a */
/* compiled from: PG */
final class C139799a extends C139821v {

    /* renamed from: a */
    public ProtoParsers.ParcelableProto f379960a;

    /* renamed from: b */
    public String f379961b;

    /* renamed from: c */
    public Intent f379962c;

    /* renamed from: d */
    public Integer f379963d;

    /* renamed from: e */
    public int f379964e;

    /* renamed from: f */
    private boolean f379965f;

    /* renamed from: g */
    private boolean f379966g;

    /* renamed from: h */
    private boolean f379967h;

    /* renamed from: i */
    private boolean f379968i;

    /* renamed from: j */
    private boolean f379969j;

    /* renamed from: k */
    private C60492rx f379970k;

    /* renamed from: l */
    private boolean f379971l;

    /* renamed from: m */
    private byte f379972m;

    /* renamed from: a */
    public final UrlIntentResult mo115270a() {
        ProtoParsers.ParcelableProto parcelableProto;
        int i;
        String str;
        Intent intent;
        C60492rx rxVar;
        Integer num;
        if (this.f379972m == 63 && (parcelableProto = this.f379960a) != null && (i = this.f379964e) != 0 && (str = this.f379961b) != null && (intent = this.f379962c) != null && (rxVar = this.f379970k) != null && (num = this.f379963d) != null) {
            return new AutoValue_UrlIntentResult(parcelableProto, this.f379965f, this.f379966g, i, str, this.f379967h, this.f379968i, intent, this.f379969j, rxVar, this.f379971l, num);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f379960a == null) {
            sb.append(" internalParams");
        }
        if ((this.f379972m & 1) == 0) {
            sb.append(" wasSonicEligible");
        }
        if ((this.f379972m & 2) == 0) {
            sb.append(" wasSonicUsed");
        }
        if (this.f379964e == 0) {
            sb.append(" linkHandler");
        }
        if (this.f379961b == null) {
            sb.append(" agsaClassicCollectionsUrlPathSuffix");
        }
        if ((this.f379972m & 4) == 0) {
            sb.append(" areExternalHandlersEnabledForFirstNavigation");
        }
        if ((this.f379972m & 8) == 0) {
            sb.append(" internalHasIntentToLaunch");
        }
        if (this.f379962c == null) {
            sb.append(" internalIntentToLaunch");
        }
        if ((this.f379972m & 16) == 0) {
            sb.append(" internalHasLaunchResolution");
        }
        if (this.f379970k == null) {
            sb.append(" internalLaunchResolution");
        }
        if ((this.f379972m & 32) == 0) {
            sb.append(" internalHasCustomTabsSessionId");
        }
        if (this.f379963d == null) {
            sb.append(" internalCustomTabsSessionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo115271b(boolean z) {
        this.f379967h = z;
        this.f379972m = (byte) (this.f379972m | 4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo115272c(boolean z) {
        this.f379971l = z;
        this.f379972m = (byte) (this.f379972m | 32);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo115273d(boolean z) {
        this.f379968i = z;
        this.f379972m = (byte) (this.f379972m | 8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo115274e(boolean z) {
        this.f379969j = z;
        this.f379972m = (byte) (this.f379972m | 16);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo115275f(Intent intent) {
        this.f379962c = intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo115276g(C60492rx rxVar) {
        if (rxVar != null) {
            this.f379970k = rxVar;
            return;
        }
        throw new NullPointerException("Null internalLaunchResolution");
    }

    /* renamed from: h */
    public final void mo115277h(boolean z) {
        this.f379965f = z;
        this.f379972m = (byte) (this.f379972m | 1);
    }

    /* renamed from: i */
    public final void mo115278i(boolean z) {
        this.f379966g = z;
        this.f379972m = (byte) (this.f379972m | 2);
    }
}
