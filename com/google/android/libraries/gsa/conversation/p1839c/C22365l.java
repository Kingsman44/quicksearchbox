package com.google.android.libraries.gsa.conversation.p1839c;

import com.google.android.libraries.gsa.conversation.C22728m;
import com.google.android.libraries.gsa.conversation.p1852f.C22579f;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import dagger.p5294a.C68225k;

/* renamed from: com.google.android.libraries.gsa.conversation.c.l */
/* compiled from: PG */
public final class C22365l {

    /* renamed from: a */
    public final C22728m f61850a;

    /* renamed from: b */
    private final C22361h f61851b;

    /* renamed from: c */
    private final C22362i f61852c;

    public C22365l(C22361h hVar, C22362i iVar, C22728m mVar) {
        this.f61851b = hVar;
        this.f61852c = iVar;
        this.f61850a = mVar;
    }

    /* renamed from: a */
    public final C22363j mo27585a() {
        return new C22363j(this.f61851b, this.f61852c);
    }

    /* renamed from: b */
    public final C22585l mo27586b() {
        C22585l lVar;
        C58833ax axVar = this.f61850a.f62550a;
        if (axVar.mo56113h()) {
            lVar = ((C22579f) axVar.mo56107c()).mo27689d();
        } else {
            C58836b bVar = C58836b.f156633a;
            lVar = new C22585l(bVar, C58836b.f156633a, C60856cj.m92900i(bVar));
        }
        C68225k.m98532d(lVar);
        return lVar;
    }
}
