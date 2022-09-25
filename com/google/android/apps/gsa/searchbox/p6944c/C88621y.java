package com.google.android.apps.gsa.searchbox.p6944c;

import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.root.p3199a.C41631e;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collection;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.searchbox.c.y */
/* compiled from: PG */
public final class C88621y implements C89200e, C89196a {

    /* renamed from: a */
    public static final C59071e f239570a = C59071e.m91332i("com.google.android.apps.gsa.searchbox.c.y");

    /* renamed from: b */
    public volatile boolean f239571b = false;

    /* renamed from: c */
    public final C22871g f239572c;

    /* renamed from: d */
    public final C22871g f239573d;

    /* renamed from: e */
    public final C22871g f239574e;

    /* renamed from: f */
    public C88607k f239575f;

    /* renamed from: g */
    public Collection f239576g;

    /* renamed from: h */
    public Collection f239577h;

    /* renamed from: i */
    public Map f239578i;

    /* renamed from: j */
    public Map f239579j;

    /* renamed from: k */
    public Map f239580k;

    /* renamed from: l */
    public C88543c f239581l;

    /* renamed from: m */
    public final C85664bo f239582m;

    public C88621y(C22871g gVar, C22871g gVar2, C22871g gVar3, C85664bo boVar) {
        this.f239572c = gVar;
        this.f239573d = gVar2;
        this.f239574e = gVar3;
        this.f239582m = boVar;
    }

    /* renamed from: a */
    public final void mo82289a(C41642a aVar, C41631e eVar) {
        if (!this.f239571b) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            this.f239574e.mo28212l("GetSuggestions", new C88617u(this, aVar, eVar));
        }
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88614r rVar = (C88614r) obj;
        this.f239575f = rVar.f239533d;
        this.f239576g = rVar.f239539j;
        this.f239578i = rVar.f239540k;
        this.f239579j = rVar.f239541l;
        this.f239580k = rVar.f239546q;
        this.f239581l = rVar.f239530a;
        this.f239577h = rVar.f239547r;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
        this.f239571b = true;
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
        this.f239571b = false;
    }
}
