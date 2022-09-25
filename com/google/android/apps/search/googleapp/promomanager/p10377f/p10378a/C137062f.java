package com.google.android.apps.search.googleapp.promomanager.p10377f.p10378a;

import android.content.Intent;
import android.support.p031v4.app.Fragment;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4017at.p4049f.p4050a.p4051a.p4052a.C53932a;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63943g;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.C63944h;
import com.google.protos.p4895aw.p4896a.p4897a.p4898a.p4899a.p4900a.C63862d;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.f.a.f */
/* compiled from: PG */
final class C137062f implements C137057a {

    /* renamed from: a */
    private static final C59071e f372996a = C59071e.m91332i("com.google.android.apps.search.googleapp.promomanager.f.a.f");

    /* renamed from: b */
    private final Fragment f372997b;

    public C137062f(Fragment fragment) {
        this.f372997b = fragment;
    }

    /* renamed from: a */
    public final boolean mo113483a(C63944h hVar) {
        Object obj;
        C59052c cVar = (C59052c) ((C59052c) f372996a.mo56224b()).mo56372aa(40920);
        C63943g a = C63943g.m96323a(hVar.f172935a);
        if (a == null) {
            a = C63943g.TYPE_UNSPECIFIED;
        }
        cVar.mo56389s("#executeAction(%s)", a.name());
        C62940bt r0 = C62942bv.checkIsLite(C63862d.f172687d);
        hVar.mo58887l(r0);
        Object l = hVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C63862d dVar = (C63862d) obj;
        int i = dVar.f172689a;
        if (i == 0 || C53932a.m87063a(i) == 0) {
            return false;
        }
        this.f372997b.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", i).putExtra("extra.screen.myactivityProduct", "search").putExtra("extra.screen.myactivityUtmSource", "agsa").putExtra("extra.screen.myactivityUtmCampaign", !dVar.f172690b.isEmpty() ? "xgapromomanager-".concat(String.valueOf(dVar.f172690b)) : "xgapromomanager"), 0);
        return true;
    }
}
