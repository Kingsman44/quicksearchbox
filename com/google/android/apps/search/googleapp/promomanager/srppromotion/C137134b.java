package com.google.android.apps.search.googleapp.promomanager.srppromotion;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C136969bx;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137008di;
import com.google.android.apps.search.googleapp.promomanager.p10372b.C137009dj;
import com.google.android.libraries.web.p3353c.C43369n;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.android.libraries.web.p3353c.p3354a.C43318b;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.promomanager.srppromotion.b */
/* compiled from: PG */
final class C137134b implements C43318b {

    /* renamed from: a */
    final /* synthetic */ C136969bx f373160a;

    public C137134b(C136969bx bxVar) {
        this.f373160a = bxVar;
    }

    /* renamed from: a */
    public final void mo46416a(C43376u uVar) {
        Optional optional;
        C43369n a = C43369n.m76519a(uVar.f113330c);
        if (a == null) {
            a = C43369n.UNSPECIFIED;
        }
        if (a == C43369n.SUCCESS) {
            Uri parse = Uri.parse(uVar.f113329b);
            String queryParameter = parse.getQueryParameter("stick");
            if (TextUtils.isEmpty(queryParameter)) {
                optional = Optional.empty();
            } else {
                try {
                    optional = Optional.m71637of(Integer.valueOf(Integer.parseInt(queryParameter)));
                } catch (NumberFormatException unused) {
                    optional = Optional.empty();
                }
            }
            String queryParameter2 = parse.getQueryParameter("sop");
            boolean z = false;
            if (!TextUtils.isEmpty(queryParameter2) && queryParameter2.equals("true")) {
                z = true;
            }
            if (optional.isPresent()) {
                int intValue = ((Integer) optional.get()).intValue();
                ((C59052c) ((C59052c) C137135c.f373161a.mo56224b()).mo56372aa(40893)).mo56387q("Showing reactive promo: %s.", intValue);
                this.f373160a.mo113464u(C139779t.SEARCH, intValue);
            } else if (z) {
                ((C59052c) ((C59052c) C137135c.f373161a.mo56224b()).mo56372aa(40892)).mo56386p("Organic promo not shown.");
            } else {
                boolean equals = "vs".equals(parse.getQueryParameter("inm"));
                C137008di diVar = (C137008di) C137009dj.f372879f.createBuilder();
                diVar.copyOnWrite();
                C137009dj djVar = (C137009dj) diVar.instance;
                djVar.f372881a |= 4;
                djVar.f372884d = !equals;
                diVar.copyOnWrite();
                C137009dj djVar2 = (C137009dj) diVar.instance;
                djVar2.f372881a |= 8;
                djVar2.f372885e = equals;
                this.f373160a.mo113462s((C137009dj) diVar.build());
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo46417b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo46418c() {
    }
}
