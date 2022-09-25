package com.google.android.libraries.lens.view.infopanel.p2140b;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.lens.p4702h.p4703a.p4704a.C62365b;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import p5488io.p5490b.C69794a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69874i;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: com.google.android.libraries.lens.view.infopanel.b.p */
/* compiled from: PG */
public final class C27028p implements C21312s {

    /* renamed from: a */
    private static final C58974d f73674a = C58974d.m91135i("ElementsHandler");

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C62365b.f168359e;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        C62365b bVar = (C62365b) obj;
        int i = bVar.f168361a;
        int i2 = i & 1;
        if (i2 != 0) {
            String str = bVar.f168362b;
        }
        if (i2 != 0 || (i & 2) != 0) {
            return C69794a.m101255g(new C27027o(bVar, rVar));
        }
        ((C58970a) ((C58970a) f73674a.mo56226d()).mo56372aa(49569)).mo56386p("onCommand(): command is empty.");
        C69794a aVar = C69874i.f186267a;
        C69822d dVar = C70101a.f186847o;
        return aVar;
    }
}
