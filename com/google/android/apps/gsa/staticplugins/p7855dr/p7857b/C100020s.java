package com.google.android.apps.gsa.staticplugins.p7855dr.p7857b;

import android.view.View;
import com.google.android.apps.gsa.search.core.webview.C87268n;
import com.google.android.apps.gsa.shared.util.ViewReferenceParcelable;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100031d;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.b.s */
/* compiled from: PG */
public final /* synthetic */ class C100020s implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100022u f279720a;

    /* renamed from: b */
    public final /* synthetic */ C87268n f279721b;

    public /* synthetic */ C100020s(C100022u uVar, C87268n nVar) {
        this.f279720a = uVar;
        this.f279721b = nVar;
    }

    public final void run() {
        C100022u uVar = this.f279720a;
        C87268n nVar = this.f279721b;
        C100023v vVar = uVar.f279725b;
        View c = nVar.mo80910c();
        C100031d dVar = vVar.f279727b;
        if (c != null) {
            ((C23251a) dVar.mo91711l()).mo28730f(C58833ax.m90834k(new ViewReferenceParcelable(c)), false);
        } else {
            ((C23251a) dVar.mo91711l()).mo28730f(C58836b.f156633a, false);
        }
    }
}
