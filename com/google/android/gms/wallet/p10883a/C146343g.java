package com.google.android.gms.wallet.p10883a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.C142914n;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143849u;
import com.google.android.gms.common.api.C143850v;
import com.google.android.gms.common.internal.C143887ac;
import com.google.android.gms.common.internal.C143944s;
import com.google.android.gms.wallet.C146345c;

/* renamed from: com.google.android.gms.wallet.a.g */
/* compiled from: PG */
public final class C146343g extends C143887ac {

    /* renamed from: a */
    private final Context f395349a;

    /* renamed from: b */
    private final int f395350b;

    /* renamed from: c */
    private final String f395351c;

    /* renamed from: d */
    private final int f395352d;

    /* renamed from: e */
    private final boolean f395353e;

    public C146343g(Context context, Looper looper, C143944s sVar, C143849u uVar, C143850v vVar, int i) {
        super(context, looper, 4, sVar, uVar, vVar);
        this.f395349a = context;
        this.f395350b = i;
        Account account = sVar.f390169a;
        this.f395351c = account != null ? account.name : null;
        this.f395352d = 1;
        this.f395353e = true;
    }

    /* renamed from: T */
    public final boolean mo119462T() {
        return true;
    }

    /* renamed from: a */
    public final int mo57744a() {
        return 12600000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ IInterface mo57745b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof C146336a ? (C146336a) queryLocalInterface : new C146336a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo57746c() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final String mo57747d() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    /* renamed from: h */
    public final Feature[] mo117774h() {
        return C146345c.f395362i;
    }

    /* renamed from: ku */
    public final boolean mo57748ku() {
        return true;
    }

    /* renamed from: m */
    public final Bundle mo122928m() {
        int i = this.f395350b;
        String packageName = this.f395349a.getPackageName();
        String str = this.f395351c;
        int i2 = this.f395352d;
        boolean z = this.f395353e;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", i);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", z);
        bundle.putString(C142914n.f387819c, packageName);
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", i2);
        return bundle;
    }
}
