package com.google.android.apps.gsa.staticplugins.recently.monet.p8686a;

import android.util.LongSparseArray;
import com.google.android.apps.gsa.search.core.p6519al.p6646cg.C85089a;
import com.google.android.apps.gsa.search.core.p6881w.C87252a;
import com.google.android.apps.gsa.search.core.p6881w.C87253b;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.a.b */
/* compiled from: PG */
public class C116103b extends C87253b {

    /* renamed from: a */
    final C85089a f321973a;

    /* renamed from: b */
    final String f321974b;

    /* renamed from: c */
    final C22871g f321975c;

    /* renamed from: d */
    LongSparseArray f321976d;

    /* renamed from: e */
    private final C116099a f321977e;

    public C116103b(C85089a aVar, String str, C22871g gVar, C116099a aVar2) {
        this.f321973a = aVar;
        this.f321974b = str;
        this.f321975c = gVar;
        this.f321977e = aVar2;
    }

    /* renamed from: b */
    public final void mo80855b(Collection collection) {
        this.f321976d = new LongSparseArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C87252a aVar = (C87252a) it.next();
            this.f321976d.put(aVar.mo80853a(), aVar);
        }
    }

    /* renamed from: d */
    public final void mo80857d(C87252a aVar) {
        this.f321976d.put(aVar.mo80853a(), aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo102502e(boolean z) {
        if (z) {
            this.f321977e.mo102488a();
        }
    }
}
