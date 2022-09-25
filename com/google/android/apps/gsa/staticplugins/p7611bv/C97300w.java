package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.search.core.p6881w.C87252a;
import com.google.android.apps.gsa.search.core.p6881w.C87253b;
import com.google.android.libraries.p10923ac.p10924a.C146760c;
import com.google.android.libraries.p10923ac.p10924a.C146766i;
import com.google.android.libraries.p10923ac.p10947c.C147206h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.w */
/* compiled from: PG */
public final class C97300w {

    /* renamed from: a */
    final /* synthetic */ int f271730a;

    /* renamed from: b */
    public final /* synthetic */ C87253b f271731b;

    public C97300w(int i, C87253b bVar) {
        this.f271730a = i;
        this.f271731b = bVar;
    }

    /* renamed from: a */
    public final void mo90624a(C146766i iVar) {
        this.f271731b.mo80856c(((C146760c) iVar).f396290a);
    }

    /* renamed from: b */
    public final void mo90625b(C147206h hVar) {
        this.f271731b.mo80857d(m161000d(hVar, this.f271730a));
    }

    /* renamed from: c */
    public final void mo90626c(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m161000d((C147206h) it.next(), this.f271730a));
        }
        this.f271731b.mo80855b(arrayList);
    }

    /* renamed from: d */
    private static final C87252a m161000d(C147206h hVar, int i) {
        if (i == 1) {
            return new C97278ah(hVar);
        }
        if (i == 12 || i == 194) {
            return new C97280c(hVar);
        }
        throw new IllegalStateException("All supported corpora should be handled here, corpus " + i + " unknown");
    }
}
