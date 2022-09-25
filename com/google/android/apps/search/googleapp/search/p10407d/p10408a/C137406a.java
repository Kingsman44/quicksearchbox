package com.google.android.apps.search.googleapp.search.p10407d.p10408a;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.libraries.search.logging.p3043f.C39193b;
import com.google.android.libraries.search.p2998g.C38334a;
import com.google.android.libraries.search.p2998g.C38387c;
import com.google.android.libraries.search.p2998g.C38389e;
import com.google.android.libraries.search.p2998g.C38392h;
import com.google.android.libraries.search.p2998g.C38393i;
import com.google.android.libraries.search.p2998g.C38395k;
import com.google.android.libraries.search.p2998g.p2999a.C38365f;
import com.google.android.libraries.search.p2998g.p2999a.C38367h;
import com.google.android.libraries.search.p2998g.p2999a.C38370k;
import com.google.android.libraries.search.p2998g.p2999a.C38380u;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38360k;
import com.google.android.libraries.search.p2998g.p2999a.p3001b.C38361l;
import com.google.android.libraries.search.p3003h.p3004a.C38400d;
import com.google.android.libraries.search.p3003h.p3004a.C38402f;
import com.google.android.libraries.search.p3003h.p3004a.C38404h;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.search.googleapp.search.d.a.a */
/* compiled from: PG */
public final class C137406a implements C38393i {

    /* renamed from: a */
    private final C38400d f373743a;

    /* renamed from: b */
    private final boolean f373744b;

    public C137406a(C38400d dVar, boolean z) {
        this.f373743a = dVar;
        this.f373744b = z;
    }

    /* renamed from: a */
    public final C38392h mo41409a(C38395k kVar) {
        C38380u uVar;
        Object obj;
        String str;
        if (!this.f373744b) {
            return C38334a.f101514a;
        }
        C38370k kVar2 = kVar.f101640b;
        if (kVar2 == null) {
            kVar2 = C38370k.f101593f;
        }
        C38365f fVar = kVar2.f101598d;
        if (fVar == null) {
            fVar = C38365f.f101578c;
        }
        if (fVar.f101580a == 2) {
            uVar = (C38380u) fVar.f101581b;
        } else {
            uVar = C38380u.f101620d;
        }
        C88431bb bbVar = uVar.f101624c;
        if (bbVar == null) {
            bbVar = C88431bb.f239082a;
        }
        C62940bt r1 = C62942bv.checkIsLite(C38361l.f101569a);
        bbVar.mo58887l(r1);
        if (!bbVar.f169962ag.mo58857o(r1.f169971d)) {
            return new C38387c("The search session deeplink contains an invalid proto");
        }
        C62940bt r12 = C62942bv.checkIsLite(C38361l.f101569a);
        bbVar.mo58887l(r12);
        Object l = bbVar.f169962ag.mo58854l(r12.f169971d);
        if (l == null) {
            obj = r12.f169969b;
        } else {
            obj = r12.mo58889c(l);
        }
        String str2 = ((C38360k) obj).f101568b;
        if (str2.isEmpty()) {
            return new C38387c("Search session deeplinks must contain a URL");
        }
        C38402f fVar2 = (C38402f) C38404h.f101652g.createBuilder();
        String queryParameter = Uri.parse(str2).getQueryParameter("q");
        if (queryParameter != null) {
            fVar2.copyOnWrite();
            C38404h hVar = (C38404h) fVar2.instance;
            hVar.f101654a |= 1;
            hVar.f101655b = queryParameter;
            fVar2.copyOnWrite();
            C38404h hVar2 = (C38404h) fVar2.instance;
            str2.getClass();
            hVar2.f101654a |= 8;
            hVar2.f101659f = str2;
        }
        Intent a = this.f373743a.mo41411a(new Intent("com.google.android.googlequicksearchbox.GOOGLE_SEARCH"), (C38404h) fVar2.build());
        if (a == null) {
            a = null;
        }
        if (a == null) {
            return C38334a.f101514a;
        }
        C38370k kVar3 = kVar.f101640b;
        if (kVar3 == null) {
            kVar3 = C38370k.f101593f;
        }
        C38367h hVar3 = kVar3.f101597c;
        if (hVar3 == null) {
            hVar3 = C38367h.f101583d;
        }
        String str3 = hVar3.f101587c;
        if (TextUtils.isEmpty(str3)) {
            str = "and.gsa.deeplink";
        } else {
            str = C39193b.m68625b(str3);
        }
        a.putExtra("source", str);
        return C38389e.m67663a(C58485gu.m89846n(a));
    }
}
