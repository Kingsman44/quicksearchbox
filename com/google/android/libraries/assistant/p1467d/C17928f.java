package com.google.android.libraries.assistant.p1467d;

import android.content.Context;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.search.assistant.platform.appintegration.p8990b.C119515a;
import com.google.android.libraries.assistant.p1467d.p1468a.p1469a.p1470a.C17813b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.libraries.assistant.d.f */
/* compiled from: PG */
public final class C17928f {

    /* renamed from: a */
    public static final C59071e f51358a = C59071e.m91332i("com.google.android.libraries.assistant.d.f");

    /* renamed from: b */
    public final SettableFuture f51359b = new SettableFuture();

    public C17928f(Context context, C17813b bVar, boolean z, C58881cr crVar) {
        C89849ae aeVar = C89849ae.UNKNOWN_EVENT;
        C60856cj.m92911t(C60856cj.m92904m(C47810es.m84978r(new C17811a(context)), C60895di.m92995a(Executors.newSingleThreadExecutor())), new C17926d(this, z, context, crVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final boolean mo23487a() {
        if (!this.f51359b.isDone()) {
            return false;
        }
        try {
            return ((C119515a) this.f51359b.get()).mo23493b();
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }
}
