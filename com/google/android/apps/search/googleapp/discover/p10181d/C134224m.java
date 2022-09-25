package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59596at;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60454qq;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.m */
/* compiled from: PG */
public final class C134224m {
    /* renamed from: a */
    public static final C89857g m217792a(C89849ae aeVar, C57259bn bnVar) {
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
        C69664n.m101060f(ajVar, "newBuilder()");
        C60454qq a = C69664n.m101061g(ajVar, "builder");
        a.mo57094b(m217793b(bnVar));
        fVar.f246203c = a.mo57093a();
        return fVar.mo83699a();
    }

    /* renamed from: b */
    public static final C59596at m217793b(C57259bn bnVar) {
        C57259bn bnVar2 = C57259bn.UNKNOWN_REQUEST_REASON;
        int ordinal = bnVar.ordinal();
        if (ordinal == 1) {
            return C59596at.FIRST_PAGE_INTERACTIVE;
        }
        if (ordinal == 2) {
            return C59596at.FIRST_PAGE_BACKGROUND;
        }
        if (ordinal != 9) {
            return C59596at.DISCOVER_REQUEST_TYPE_UNSPECIFIED;
        }
        return C59596at.PINNED_CONTENT;
    }
}
