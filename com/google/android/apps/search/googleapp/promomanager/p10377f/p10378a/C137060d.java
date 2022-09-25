package com.google.android.apps.search.googleapp.promomanager.p10377f.p10378a;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.evernote.android.state.BuildConfig;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63961y;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4900a.C63860b;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.a.d */
/* compiled from: PG */
final class C137060d implements C137057a {

    /* renamed from: a */
    private static final C59071e f372994a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.a.d");

    /* renamed from: b */
    private final Fragment f372995b;

    public C137060d(Fragment fragment) {
        this.f372995b = fragment;
    }

    /* renamed from: a */
    public final boolean mo113483a(C63944h hVar) {
        Object obj;
        C59052c cVar = (C59052c) ((C59052c) f372994a.mo56224b()).mo56372aa(40919);
        C63943g a = C63943g.m96323a(hVar.f172935a);
        if (a == null) {
            a = C63943g.TYPE_UNSPECIFIED;
        }
        cVar.mo56389s("#executeAction(%s)", a.name());
        C62940bt r0 = C62942bv.checkIsLite(C63860b.f172681d);
        hVar.mo58887l(r0);
        Object l = hVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C63860b bVar = (C63860b) obj;
        C63961y yVar = bVar.f172683a;
        if (yVar == null) {
            yVar = C63961y.f172986c;
        }
        String str = yVar.f172988a == 2 ? (String) yVar.f172989b : BuildConfig.FLAVOR;
        if (str.isEmpty()) {
            return false;
        }
        String concat = !bVar.f172684b.isEmpty() ? "and.gsa.promomanager.".concat(String.valueOf(bVar.f172684b)) : "and.gsa.promomanager";
        Intent intent = new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH");
        intent.putExtra("query", str);
        intent.putExtra("source", concat);
        C47709i.m84861a(this.f372995b, intent);
        return true;
    }
}
