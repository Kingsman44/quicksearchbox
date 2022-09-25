package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.search.core.p.f */
/* compiled from: PG */
public final class C86251f {

    /* renamed from: a */
    public static final C59071e f233142a = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.f");

    /* renamed from: b */
    public final SettableFuture f233143b = new SettableFuture();

    /* renamed from: c */
    public final SettableFuture f233144c = new SettableFuture();

    /* renamed from: d */
    public final SettableFuture f233145d = new SettableFuture();

    /* renamed from: e */
    public final SettableFuture f233146e = new SettableFuture();

    /* renamed from: f */
    public final SettableFuture f233147f = new SettableFuture();

    /* renamed from: g */
    public final SettableFuture f233148g = new SettableFuture();

    /* renamed from: h */
    public final SettableFuture f233149h = new SettableFuture();

    /* renamed from: i */
    public final SettableFuture f233150i = new SettableFuture();

    /* renamed from: j */
    public final SettableFuture f233151j = new SettableFuture();

    /* renamed from: k */
    public final SettableFuture f233152k = new SettableFuture();

    /* renamed from: l */
    private final SettableFuture f233153l = new SettableFuture();

    /* renamed from: e */
    private static void m138920e(SettableFuture settableFuture, C60870cx cxVar) {
        C60856cj.m92911t(cxVar, new C86250e(settableFuture), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C58833ax mo79945a() {
        return C90918bo.m148517d(this.f233153l) ? C58833ax.m90834k((C86232bo) C90918bo.m148515b(this.f233153l)) : C58836b.f156633a;
    }

    /* renamed from: b */
    public final void mo79946b() {
        if (!this.f233143b.isDone() && !this.f233143b.mo57356n(C58836b.f156633a)) {
            this.f233143b.cancel(true);
        }
        if (!this.f233151j.isDone() && !this.f233151j.mo57356n(C58836b.f156633a)) {
            this.f233151j.cancel(true);
        }
        if (!this.f233152k.isDone() && !this.f233152k.mo57356n(C58836b.f156633a)) {
            this.f233152k.cancel(true);
        }
        if (!this.f233153l.isDone() && !this.f233153l.mo57356n(C58836b.f156633a)) {
            this.f233153l.cancel(true);
        }
        if (!this.f233147f.isDone() && !this.f233147f.mo57356n(C58836b.f156633a)) {
            this.f233147f.cancel(true);
        }
        if (!this.f233148g.isDone() && !this.f233148g.mo57356n(C58836b.f156633a)) {
            this.f233148g.cancel(true);
        }
        if (!this.f233144c.isDone() && !this.f233144c.mo57356n(C58836b.f156633a)) {
            this.f233144c.cancel(true);
        }
    }

    /* renamed from: c */
    public final void mo79947c() {
        if (!this.f233145d.isDone() && !this.f233145d.mo57356n(C58836b.f156633a)) {
            this.f233145d.cancel(true);
        }
        if (!this.f233146e.isDone() && !this.f233146e.mo57356n(C118826c.f331422a)) {
            this.f233146e.cancel(true);
        }
        if (!this.f233149h.isDone() && !this.f233149h.mo57356n(C58836b.f156633a)) {
            this.f233149h.cancel(true);
        }
        if (!this.f233150i.isDone() && !this.f233150i.mo57356n(C58836b.f156633a)) {
            this.f233150i.cancel(true);
        }
    }

    /* renamed from: d */
    public final void mo79948d(C86232bo boVar) {
        if (boVar instanceof C86254i) {
            C86254i iVar = (C86254i) boVar;
            m138920e(this.f233143b, iVar.mo79949a());
            m138920e(this.f233151j, iVar.mo79950b());
            m138920e(this.f233152k, iVar.mo79952d());
        } else {
            this.f233143b.mo57356n(C58836b.f156633a);
            this.f233151j.mo57356n(C58836b.f156633a);
            this.f233152k.mo57356n(C58836b.f156633a);
        }
        m138920e(this.f233144c, boVar.mo79894r());
        C58833ax k = C58833ax.m90834k(boVar);
        if (!this.f233153l.isDone()) {
            this.f233153l.mo57356n(k);
        } else {
            ((C59052c) ((C59052c) f233142a.mo56225c()).mo56372aa(7727)).mo56386p("SearchResultWithHtmlSrpFuture is already set.");
        }
        m138920e(this.f233145d, boVar.mo79871G());
        m138920e(this.f233146e, boVar.mo79898v());
        m138920e(this.f233149h, boVar.mo79865A());
        m138920e(this.f233150i, boVar.mo79877M());
    }
}
