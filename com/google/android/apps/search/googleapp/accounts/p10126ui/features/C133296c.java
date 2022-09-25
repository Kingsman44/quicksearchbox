package com.google.android.apps.search.googleapp.accounts.p10126ui.features;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.compliance.C133657x;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.common.C30917d;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.googleapp.accounts.ui.features.c */
/* compiled from: PG */
public final /* synthetic */ class C133296c implements C30917d {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f363225a;

    /* renamed from: b */
    public final /* synthetic */ C30306o f363226b;

    /* renamed from: c */
    public final /* synthetic */ C47770dh f363227c;

    /* renamed from: d */
    public final /* synthetic */ Fragment f363228d;

    public /* synthetic */ C133296c(AtomicBoolean atomicBoolean, C30306o oVar, C47770dh dhVar, Fragment fragment) {
        this.f363225a = atomicBoolean;
        this.f363226b = oVar;
        this.f363227c = dhVar;
        this.f363228d = fragment;
    }

    /* renamed from: a */
    public final C60870cx mo36602a() {
        AtomicBoolean atomicBoolean = this.f363225a;
        C30306o oVar = this.f363226b;
        C47770dh dhVar = this.f363227c;
        Fragment fragment = this.f363228d;
        if (!atomicBoolean.get()) {
            return C60856cj.m92900i(true);
        }
        C46108a aVar = (C46108a) C30281j.m56319c(oVar.f81934a.f81883d);
        aVar.getClass();
        AccountId a = aVar.mo50209a();
        C133657x xVar = new C133657x();
        C68324h.m98669f(xVar);
        C47247a.m84047b(xVar, a);
        C47538ax c = dhVar.mo51613c("cookie_consent");
        try {
            xVar.showNow(fragment.getParentFragmentManager(), "COOKIE_CONSENT_TAG");
            if (c != null) {
                c.close();
            }
            return xVar.mo17754z().f363920c.mo111246b();
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
