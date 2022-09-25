package com.google.frameworks.client.data.android;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58838bb;
import java.util.concurrent.Executor;

/* renamed from: com.google.frameworks.client.data.android.g */
/* compiled from: PG */
public abstract class C61425g {
    /* renamed from: a */
    public abstract C61466h mo57951a();

    /* renamed from: b */
    public abstract void mo57952b(C21370a aVar);

    /* renamed from: c */
    public abstract void mo57953c(Context context);

    /* renamed from: d */
    public abstract void mo57954d(Executor executor);

    /* renamed from: e */
    public abstract void mo57955e(Executor executor);

    /* renamed from: f */
    public abstract void mo57956f(Executor executor);

    /* renamed from: g */
    public final C61466h mo58043g() {
        C61466h a = mo57951a();
        boolean z = true;
        if (a.mo57991l() != null && a.mo57995p() == null) {
            z = false;
        }
        C58838bb.m90884s(z, "If authContextManager is set, networkExecutor must be set.");
        return a;
    }
}
