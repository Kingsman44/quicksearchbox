package com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10267c;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.clearcut.C143658k;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.e.c.c */
/* compiled from: PG */
public final /* synthetic */ class C135579c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Context f369314a;

    public /* synthetic */ C135579c(Context context) {
        this.f369314a = context;
    }

    public final Object apply(Object obj) {
        Context context = this.f369314a;
        String str = (String) obj;
        ((C59052c) ((C59052c) C135581e.f369316a.mo56224b()).mo56372aa(40655)).mo56389s("AccountPresent: %s.", Boolean.valueOf(!TextUtils.isEmpty(str)));
        if (TextUtils.isEmpty(str)) {
            return Optional.empty();
        }
        return Optional.m71637of(new C143658k(context, "GOOGLE_APP_BROWSER_HISTORY", str));
    }
}
