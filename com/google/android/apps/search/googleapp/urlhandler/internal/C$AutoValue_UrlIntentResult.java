package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.content.Intent;
import com.google.common.p4552o.C60492rx;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.$AutoValue_UrlIntentResult  reason: invalid class name */
/* compiled from: PG */
abstract class C$AutoValue_UrlIntentResult extends UrlIntentResult {

    /* renamed from: a */
    public final ProtoParsers.ParcelableProto f379948a;

    /* renamed from: b */
    public final boolean f379949b;

    /* renamed from: c */
    public final boolean f379950c;

    /* renamed from: d */
    public final String f379951d;

    /* renamed from: e */
    public final boolean f379952e;

    /* renamed from: f */
    public final boolean f379953f;

    /* renamed from: g */
    public final Intent f379954g;

    /* renamed from: h */
    public final boolean f379955h;

    /* renamed from: i */
    public final C60492rx f379956i;

    /* renamed from: j */
    public final boolean f379957j;

    /* renamed from: k */
    public final Integer f379958k;

    /* renamed from: l */
    public final int f379959l;

    public C$AutoValue_UrlIntentResult(ProtoParsers.ParcelableProto parcelableProto, boolean z, boolean z2, int i, String str, boolean z3, boolean z4, Intent intent, boolean z5, C60492rx rxVar, boolean z6, Integer num) {
        if (parcelableProto != null) {
            this.f379948a = parcelableProto;
            this.f379949b = z;
            this.f379950c = z2;
            this.f379959l = i;
            if (str != null) {
                this.f379951d = str;
                this.f379952e = z3;
                this.f379953f = z4;
                if (intent != null) {
                    this.f379954g = intent;
                    this.f379955h = z5;
                    if (rxVar != null) {
                        this.f379956i = rxVar;
                        this.f379957j = z6;
                        this.f379958k = num;
                        return;
                    }
                    throw new NullPointerException("Null internalLaunchResolution");
                }
                throw new NullPointerException("Null internalIntentToLaunch");
            }
            throw new NullPointerException("Null agsaClassicCollectionsUrlPathSuffix");
        }
        throw new NullPointerException("Null internalParams");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Intent mo115252a() {
        return this.f379954g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60492rx mo115253b() {
        return this.f379956i;
    }

    /* renamed from: c */
    public final ProtoParsers.ParcelableProto mo115254c() {
        return this.f379948a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Integer mo115255d() {
        return this.f379958k;
    }

    /* renamed from: e */
    public final String mo115256e() {
        return this.f379951d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UrlIntentResult) {
            UrlIntentResult urlIntentResult = (UrlIntentResult) obj;
            return this.f379948a.equals(urlIntentResult.mo115254c()) && this.f379949b == urlIntentResult.mo115263j() && this.f379950c == urlIntentResult.mo115264k() && this.f379959l == urlIntentResult.mo115265l() && this.f379951d.equals(urlIntentResult.mo115256e()) && this.f379952e == urlIntentResult.mo115258f() && this.f379953f == urlIntentResult.mo115260h() && this.f379954g.equals(urlIntentResult.mo115252a()) && this.f379955h == urlIntentResult.mo115262i() && this.f379956i.equals(urlIntentResult.mo115253b()) && this.f379957j == urlIntentResult.mo115259g() && this.f379958k.equals(urlIntentResult.mo115255d());
        }
    }

    /* renamed from: f */
    public final boolean mo115258f() {
        return this.f379952e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final boolean mo115259g() {
        return this.f379957j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo115260h() {
        return this.f379953f;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((((((((this.f379948a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f379949b ? 1237 : 1231)) * 1000003) ^ (true != this.f379950c ? 1237 : 1231)) * 1000003) ^ this.f379959l) * 1000003) ^ this.f379951d.hashCode()) * 1000003) ^ (true != this.f379952e ? 1237 : 1231)) * 1000003) ^ (true != this.f379953f ? 1237 : 1231)) * 1000003) ^ this.f379954g.hashCode()) * 1000003) ^ (true != this.f379955h ? 1237 : 1231)) * 1000003) ^ this.f379956i.hashCode()) * 1000003;
        if (true == this.f379957j) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f379958k.hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo115262i() {
        return this.f379955h;
    }

    /* renamed from: j */
    public final boolean mo115263j() {
        return this.f379949b;
    }

    /* renamed from: k */
    public final boolean mo115264k() {
        return this.f379950c;
    }

    /* renamed from: l */
    public final int mo115265l() {
        return this.f379959l;
    }

    public final String toString() {
        String obj = this.f379948a.toString();
        boolean z = this.f379949b;
        boolean z2 = this.f379950c;
        int i = this.f379959l;
        String str = this.f379951d;
        boolean z3 = this.f379952e;
        boolean z4 = this.f379953f;
        String obj2 = this.f379954g.toString();
        boolean z5 = this.f379955h;
        String num = Integer.toString(this.f379956i.f163738q);
        boolean z6 = this.f379957j;
        Integer num2 = this.f379958k;
        return "UrlIntentResult{internalParams=" + obj + ", wasSonicEligible=" + z + ", wasSonicUsed=" + z2 + ", linkHandler=" + C139822w.m227349a(i) + ", agsaClassicCollectionsUrlPathSuffix=" + str + ", areExternalHandlersEnabledForFirstNavigation=" + z3 + ", internalHasIntentToLaunch=" + z4 + ", internalIntentToLaunch=" + obj2 + ", internalHasLaunchResolution=" + z5 + ", internalLaunchResolution=" + num + ", internalHasCustomTabsSessionId=" + z6 + ", internalCustomTabsSessionId=" + num2 + "}";
    }
}
