package com.google.android.apps.search.googleapp.search.srp.p10435e;

import android.net.Uri;
import java.util.Map;
import p3186j$.util.Collection;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.e.aw */
/* compiled from: PG */
public final class C137772aw {
    /* renamed from: a */
    public static final void m223955a(Uri.Builder builder, Map map) {
        C69664n.m101061g(builder, "builder");
        Collection.EL.stream(map.entrySet()).forEach(new C137771av(builder.build().getQueryParameterNames(), builder));
    }
}
