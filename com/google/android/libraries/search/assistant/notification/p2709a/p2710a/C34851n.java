package com.google.android.libraries.search.assistant.notification.p2709a.p2710a;

import android.content.Context;
import com.google.android.libraries.search.assistant.notification.p2709a.C34852b;
import com.google.android.libraries.search.assistant.notification.p2711b.C34861i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.notification.a.a.n */
/* compiled from: PG */
public final class C34851n implements C34852b {

    /* renamed from: a */
    public static final C59071e f92423a = C59071e.m91332i("com.google.android.libraries.search.assistant.notification.a.a.n");

    /* renamed from: b */
    public final Context f92424b;

    /* renamed from: c */
    public final C34861i f92425c;

    /* renamed from: d */
    public final Executor f92426d;

    public C34851n(Context context, C34861i iVar, Executor executor) {
        this.f92424b = context;
        this.f92425c = iVar;
        this.f92426d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo39529a(List list, String str) {
        return C47633f.m84733g(C60856cj.m92896e((Iterable) Collection.EL.stream(list).filter(new C34843f(this)).map(new C34844g(this, str)).collect(C58370cn.f155946a))).mo51515h(C34845h.f92417a, this.f92426d);
    }
}
