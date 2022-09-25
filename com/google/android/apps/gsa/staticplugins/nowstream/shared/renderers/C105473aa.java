package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.sidekick.shared.monet.p7245a.C91764a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.aa */
/* compiled from: PG */
final class C105473aa implements C91764a {

    /* renamed from: a */
    final /* synthetic */ C105474ab f294164a;

    public C105473aa(C105474ab abVar) {
        this.f294164a = abVar;
    }

    /* renamed from: a */
    public final void mo86255a() {
        C105474ab abVar = this.f294164a;
        abVar.f294201i = true;
        abVar.f294209q.setImportantForAccessibility(4);
        C105474ab abVar2 = this.f294164a;
        abVar2.mo94828J(false, abVar2.mo94825G());
    }

    /* renamed from: b */
    public final void mo86256b() {
        C105474ab abVar = this.f294164a;
        abVar.f294201i = false;
        abVar.f294209q.setDescendantFocusability(C89885b.S3REQUEST_VALUE);
        this.f294164a.f294209q.requestFocus();
        this.f294164a.f294209q.setImportantForAccessibility(0);
        C105474ab abVar2 = this.f294164a;
        abVar2.mo94834P(abVar2.mo94825G());
    }

    /* renamed from: c */
    public final void mo86257c() {
        C105474ab abVar = this.f294164a;
        abVar.f294200h.mo94789i(abVar.f294213u);
        C105474ab abVar2 = this.f294164a;
        abVar2.f294213u = null;
        abVar2.f294204l = false;
    }

    /* renamed from: d */
    public final void mo86258d() {
        if (this.f294164a.f294209q.getWidth() > 0) {
            C105474ab abVar = this.f294164a;
            abVar.f294200h.mo94788h(abVar.f294209q);
        }
        this.f294164a.f294204l = true;
    }

    /* renamed from: e */
    public final void mo86259e() {
        C105474ab abVar = this.f294164a;
        abVar.mo94834P(abVar.mo94825G());
    }

    /* renamed from: f */
    public final void mo86260f() {
        C105474ab abVar = this.f294164a;
        abVar.mo94828J(false, abVar.mo94825G());
    }
}
