package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import com.google.android.libraries.assistant.auto.ondevice.p714f.C11912f;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.C13547a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.g */
/* compiled from: PG */
public final /* synthetic */ class C90373g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C90374h f252402a;

    /* renamed from: b */
    public final /* synthetic */ boolean f252403b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f252404c;

    public /* synthetic */ C90373g(C90374h hVar, boolean z, C60870cx cxVar) {
        this.f252402a = hVar;
        this.f252403b = z;
        this.f252404c = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C90374h hVar = this.f252402a;
        boolean z = this.f252403b;
        C60870cx cxVar = this.f252404c;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60866ct.f164955a;
        }
        if (z) {
            return ((C13547a) axVar.mo56107c()).mo21166d(C60922j.m93044g(cxVar, C47810es.m84963c(new C11912f(hVar.f252410f)), C60826bg.f164896a));
        }
        return ((C13547a) axVar.mo56107c()).mo21163a();
    }
}
