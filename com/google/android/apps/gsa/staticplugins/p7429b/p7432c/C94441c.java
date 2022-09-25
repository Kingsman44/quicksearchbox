package com.google.android.apps.gsa.staticplugins.p7429b.p7432c;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.monet.p7070b.p7083b.C90219d;
import com.google.android.apps.gsa.staticplugins.p7429b.p7431b.C94435a;
import com.google.android.apps.gsa.staticplugins.p7429b.p7431b.C94436b;
import com.google.android.apps.gsa.staticplugins.p7429b.p7431b.C94438d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23133c;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23134d;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23135e;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23166c;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23167d;
import com.google.android.libraries.gsa.monet.tools.p1897b.p1904d.C23168e;
import com.google.common.base.C58833ax;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.b.c.c */
/* compiled from: PG */
public final class C94441c extends C22939d {

    /* renamed from: a */
    private final C94438d f264029a;

    /* renamed from: b */
    private final C94435a f264030b;

    /* renamed from: c */
    private final Context f264031c;

    /* renamed from: d */
    private ViewGroup f264032d;

    public C94441c(C22945j jVar, C94438d dVar, C94435a aVar, Context context) {
        super(jVar);
        this.f264029a = dVar;
        this.f264030b = aVar;
        this.f264031c = context;
    }

    /* renamed from: e */
    private static final C23168e m155769e(C90219d dVar) {
        C23134d dVar2;
        C23134d dVar3 = C23135e.f63483a;
        int i = dVar.f252042b;
        C23134d cVar = i != 0 ? new C23133c(i) : dVar3;
        int i2 = dVar.f252043c;
        C23134d cVar2 = i2 != 0 ? new C23133c(i2) : dVar3;
        if (dVar.f252044d) {
            int i3 = dVar.f252045e;
            dVar2 = i3 == 0 ? dVar3 : new C23133c(i3);
        } else {
            dVar2 = null;
        }
        if (dVar.f252046f) {
            int i4 = dVar.f252047g;
            if (i4 != 0) {
                dVar3 = new C23133c(i4);
            }
        } else {
            dVar3 = null;
        }
        return new C23168e(cVar, cVar2, dVar2, dVar3);
    }

    /* renamed from: d */
    public final void mo88471d() {
        if (this.f63126Q.mo28316z()) {
            C94435a aVar = this.f264030b;
            ((C94436b) aVar).f264025a.mo28345s("onStackFinished", "ActivityPageManagerEventsDispatcher", new Bundle());
        }
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f264031c).inflate(R.layout.activity_page_manager_root, (ViewGroup) null);
        this.f264032d = viewGroup;
        mo28295iC(viewGroup);
        C23251a aVar = ((C94443e) this.f264029a).f264035b;
        ViewGroup viewGroup2 = this.f264032d;
        Objects.requireNonNull(viewGroup2);
        aVar.mo28726b(new C94439a(viewGroup2));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        if (((C58833ax) ((C94443e) this.f264029a).f264037d.f63720e).mo56113h() || ((C58833ax) ((C94443e) this.f264029a).f264036c.f63720e).mo56113h()) {
            ViewGroup viewGroup = this.f264032d;
            C23168e eVar = C23168e.f63543a;
            C94440b bVar = new C94440b(this);
            C23168e e = ((C58833ax) ((C94443e) this.f264029a).f264037d.f63720e).mo56113h() ? m155769e((C90219d) ((C58833ax) ((C94443e) this.f264029a).f264037d.f63720e).mo56107c()) : null;
            if (((C58833ax) ((C94443e) this.f264029a).f264036c.f63720e).mo56113h()) {
                eVar = m155769e((C90219d) ((C58833ax) ((C94443e) this.f264029a).f264036c.f63720e).mo56107c());
            }
            ((C94443e) this.f264029a).f264034a.mo28617a(new C23166c(viewGroup, eVar, e, bVar));
            return;
        }
        ((C94443e) this.f264029a).f264034a.mo28617a(new C23167d(R.id.activity_pages, this.f264032d));
    }
}
