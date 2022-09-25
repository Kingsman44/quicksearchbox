package com.google.android.libraries.social.populous.p3289c.p3290a;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.auth.C142903e;
import com.google.android.gms.auth.C142914n;
import com.google.android.libraries.social.populous.core.C42351l;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.common.base.C58838bb;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.social.populous.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C42209a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C42210b f110531a;

    /* renamed from: b */
    public final /* synthetic */ String f110532b;

    /* renamed from: c */
    public final /* synthetic */ String f110533c;

    public /* synthetic */ C42209a(C42210b bVar, String str, String str2) {
        this.f110531a = bVar;
        this.f110532b = str;
        this.f110533c = str2;
    }

    public final Object call() {
        String str;
        C42210b bVar = this.f110531a;
        String str2 = this.f110532b;
        String str3 = this.f110533c;
        C58838bb.m90884s(Looper.getMainLooper().getThread() != Thread.currentThread(), "This method should not be called on a UI thread.");
        C42352m mVar = (C42352m) bVar.f110535b.get(str2);
        if (mVar != null) {
            return mVar;
        }
        try {
            str = C142914n.m231858f(bVar.f110534a, str2);
        } catch (C142903e | IOException e) {
            Log.e("Authenticator", "Account GAIA ID cannot be loaded", e);
            str = null;
        }
        if (str == null) {
            return new C42352m(str2, str3, C42351l.FAILED_NOT_LOGGED_IN, (String) null);
        }
        C42352m mVar2 = new C42352m(str2, str3, C42351l.SUCCESS_LOGGED_IN, str);
        bVar.mo44908a(mVar2);
        return mVar2;
    }
}
