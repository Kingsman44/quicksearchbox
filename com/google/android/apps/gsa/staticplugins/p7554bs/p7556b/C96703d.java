package com.google.android.apps.gsa.staticplugins.p7554bs.p7556b;

import android.content.SharedPreferences;
import com.google.android.libraries.lens.view.p2049a.C24948b;
import com.google.android.libraries.lens.view.p2067ak.C25284w;
import com.google.android.libraries.storage.protostore.C43019v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.bs.b.d */
/* compiled from: PG */
public final class C96703d implements C43019v {

    /* renamed from: a */
    public final SharedPreferences f270527a;

    /* renamed from: b */
    private final C60887da f270528b;

    /* renamed from: c */
    private final C24948b f270529c;

    public C96703d(SharedPreferences sharedPreferences, C24948b bVar, C60887da daVar) {
        this.f270527a = sharedPreferences;
        this.f270529c = bVar;
        this.f270528b = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo18054a() {
        C60870cx a = this.f270529c.mo30189a();
        C96701b bVar = new C96701b(this);
        return C60922j.m93044g(a, C47810es.m84963c(bVar), this.f270528b);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo18055b(MessageLite messageLite) {
        C25284w wVar = (C25284w) messageLite;
        if (wVar.f68780a) {
            return C60856cj.m92900i(wVar);
        }
        C60870cx a = this.f270529c.mo30189a();
        C96702c cVar = new C96702c(this, wVar);
        return C60922j.m93044g(a, C47810es.m84963c(cVar), this.f270528b);
    }

    /* renamed from: c */
    public final C60870cx mo18056c() {
        return C60856cj.m92900i(true);
    }
}
