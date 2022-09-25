package com.google.android.libraries.search.rendering.xuikit.p3131d.p3142k;

import android.content.Context;
import android.graphics.Typeface;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.p1708c.C20746b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g.C40385aq;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g.C40386ar;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.p4624a.p4625a.C61284a;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.k.b */
/* compiled from: PG */
public final class C40458b implements C21296cl {

    /* renamed from: a */
    private static final C59071e f106185a = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.d.k.b");

    /* renamed from: b */
    private final C40463g f106186b;

    /* renamed from: c */
    private final C40364q f106187c;

    /* renamed from: d */
    private final C40385aq f106188d;

    public C40458b(C40364q qVar, C40385aq aqVar, C40463g gVar) {
        this.f106188d = aqVar;
        this.f106186b = gVar;
        this.f106187c = qVar;
    }

    /* renamed from: a */
    public final Typeface mo25819a(Context context, String str) {
        mo42456c(str);
        try {
            return (Typeface) ((C60870cx) Objects.requireNonNull(this.f106186b.mo42457a(str))).get();
        } catch (InterruptedException | ExecutionException e) {
            C59052c cVar = (C59052c) f106185a.mo56226d();
            cVar.mo56378ag(C40364q.f106014a, this.f106187c.mo42422a());
            ((C59052c) ((C59052c) cVar.mo56382g(e)).mo56372aa(53340)).mo56389s("Error loading typeface: %s", new C61301b(C61284a.NO_USER_DATA, str));
            return null;
        }
    }

    /* renamed from: b */
    public final Typeface mo25820b(Context context, String str, int i, boolean z) {
        return null;
    }

    /* renamed from: c */
    public final C60870cx mo42456c(String str) {
        C60870cx cxVar;
        C40463g gVar = this.f106186b;
        C40385aq aqVar = this.f106188d;
        synchronized (gVar.f106199b) {
            if (!gVar.f106198a.containsKey(str)) {
                Map map = gVar.f106198a;
                C20746b bVar = aqVar.f106038a;
                C60887da daVar = aqVar.f106039b;
                Context context = aqVar.f106040c;
                if (str.startsWith("google-sans")) {
                    cxVar = daVar.mo19399b(C47810es.m84978r(new C40386ar(bVar, context, str)));
                } else {
                    cxVar = C60866ct.f164955a;
                }
                map.put(str, cxVar);
            }
        }
        return C60856cj.m92901j(C60922j.m93044g((C60870cx) Objects.requireNonNull(this.f106186b.mo42457a(str)), C47810es.m84963c(C40457a.f106184a), C60826bg.f164896a));
    }
}
