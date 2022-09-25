package com.google.android.apps.gsa.staticplugins.opa.p8369hq;

import android.widget.ImageView;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hq.l */
/* compiled from: PG */
final class C109238l implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C50637am f304178a;

    /* renamed from: b */
    final /* synthetic */ ImageView f304179b;

    /* renamed from: c */
    final /* synthetic */ C109243q f304180c;

    public C109238l(C109243q qVar, C50637am amVar, ImageView imageView) {
        this.f304180c = qVar;
        this.f304178a = amVar;
        this.f304179b = imageView;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C109243q.f304191a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HqController");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(24595)).mo56389s("#updatesCenter Failed to bdage data from UpdatesCenterController with error %s", th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        this.f304180c.mo97701e(this.f304178a, (C50638an) obj, this.f304179b);
    }
}
