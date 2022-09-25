package com.google.android.libraries.web.weblayer.contrib.contactpicker.internal;

import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.contactpicker.internal.e */
/* compiled from: PG */
public final /* synthetic */ class C44177e implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C46128f f114932a;

    /* renamed from: b */
    public final /* synthetic */ AccountId f114933b;

    public /* synthetic */ C44177e(C46128f fVar, AccountId accountId) {
        this.f114932a = fVar;
        this.f114933b = accountId;
    }

    public final C60870cx apply(Object obj) {
        C46128f fVar = this.f114932a;
        AccountId accountId = this.f114933b;
        if (((Boolean) obj).booleanValue()) {
            return fVar.mo50215b(accountId);
        }
        return C60856cj.m92900i(BuildConfig.FLAVOR);
    }
}
