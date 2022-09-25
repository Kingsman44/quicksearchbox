package com.google.android.apps.gsa.staticplugins.p7845do.p7846a;

import android.net.Uri;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.do.a.b */
/* compiled from: PG */
public final /* synthetic */ class C99910b implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C99908ah f279528a;

    /* renamed from: b */
    public final /* synthetic */ Uri f279529b;

    public /* synthetic */ C99910b(C99908ah ahVar, Uri uri) {
        this.f279528a = ahVar;
        this.f279529b = uri;
    }

    public final void run() {
        C99908ah ahVar = this.f279528a;
        Uri uri = this.f279529b;
        String s = ahVar.f279488i.mo79577s(uri, false, false);
        Uri parse = s != null ? Uri.parse(s) : uri;
        ahVar.f279481b.mo91666h().mo28730f(true, false);
        ((C23251a) ahVar.f279481b.mo91662d()).mo28730f(false, false);
        new C90873ag(ahVar.f279495p.mo78732a(parse), ahVar.f279483d, "Fetch save state", new C99924p(ahVar, uri)).mo85223a(new C99925q(ahVar, uri));
    }
}
