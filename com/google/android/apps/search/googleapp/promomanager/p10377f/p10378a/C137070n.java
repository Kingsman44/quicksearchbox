package com.google.android.apps.search.googleapp.promomanager.p10377f.p10378a;

import android.support.p031v4.app.Fragment;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134712j;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.a.n */
/* compiled from: PG */
final class C137070n implements C137057a {

    /* renamed from: a */
    private static final C59071e f373007a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.a.n");

    /* renamed from: b */
    private final Fragment f373008b;

    public C137070n(Fragment fragment) {
        this.f373008b = fragment;
    }

    /* renamed from: a */
    public final boolean mo113483a(C63944h hVar) {
        C59052c cVar = (C59052c) ((C59052c) f373007a.mo56224b()).mo56372aa(40925);
        C63943g a = C63943g.m96323a(hVar.f172935a);
        if (a == null) {
            a = C63943g.TYPE_UNSPECIFIED;
        }
        cVar.mo56389s("#executeAction(%s)", a.name());
        if (this.f373008b.getView() == null) {
            return false;
        }
        C47393f.m84237h(C134712j.f366831a, this.f373008b.requireView());
        return true;
    }
}
