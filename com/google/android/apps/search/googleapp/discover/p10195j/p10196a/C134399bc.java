package com.google.android.apps.search.googleapp.discover.p10195j.p10196a;

import com.google.android.apps.search.googleapp.discover.p10166a.C133939b;
import com.google.android.apps.search.googleapp.discover.p10166a.C134002p;
import com.google.android.apps.search.googleapp.discover.p10244v.C135155b;
import com.google.android.apps.search.googleapp.discover.p10244v.C135182c;
import com.google.android.apps.search.googleapp.discover.p10248y.C135255f;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a.C64209bd;
import com.google.protos.youtube.elements.C66059au;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.a.bc */
/* compiled from: PG */
public final class C134399bc implements C21312s {

    /* renamed from: a */
    private final C133939b f366109a;

    public C134399bc(C133939b bVar) {
        C69664n.m101061g(bVar, "actionApi");
        this.f366109a = bVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        C62940bt btVar = C64209bd.f173614b;
        C69664n.m101060f(btVar, "undoDismissCommand");
        return btVar;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C69664n.m101061g((C64209bd) obj, "command");
        C69664n.m101061g(rVar, "eventData");
        C134002p pVar = this.f366109a.f364799h;
        C135182c a = pVar.f365014b.mo111511a();
        if (a != null) {
            C135155b bVar = pVar.f365017e.f368287a;
            synchronized (bVar.f368128b) {
                bVar.f368130d.remove(a);
            }
            pVar.f365016d.mo50787a(C60856cj.m92900i(a), C135255f.f368471a);
        }
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}
