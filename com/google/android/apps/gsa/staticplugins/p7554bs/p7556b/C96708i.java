package com.google.android.apps.gsa.staticplugins.p7554bs.p7556b;

import android.content.SharedPreferences;
import com.google.android.libraries.lens.view.p2067ak.C25199ae;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.b.i */
/* compiled from: PG */
public final class C96708i implements C43019v {

    /* renamed from: a */
    public final SharedPreferences f270535a;

    /* renamed from: b */
    private final C42876ab f270536b;

    /* renamed from: c */
    private final C60887da f270537c;

    public C96708i(SharedPreferences sharedPreferences, C42876ab abVar, C60887da daVar) {
        this.f270535a = sharedPreferences;
        this.f270536b = abVar;
        this.f270537c = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        C60887da daVar = this.f270537c;
        return C60856cj.m92897f(this.f270536b.mo46039a(C96705f.f270532a, C60826bg.f164896a), daVar.mo19400c(new C96706g(this), daVar));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        C25199ae aeVar = (C25199ae) messageLite;
        if (aeVar.f68628a) {
            return C60856cj.m92900i(aeVar);
        }
        C60870cx d = this.f270536b.mo46042d();
        C96704e eVar = new C96704e(this, aeVar);
        return C60922j.m93044g(d, C47810es.m84963c(eVar), this.f270537c);
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92900i(true);
    }
}
