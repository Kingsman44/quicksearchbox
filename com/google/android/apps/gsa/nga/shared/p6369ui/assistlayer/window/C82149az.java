package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import com.google.android.apps.gsa.nga.shared.p6417x.C83349aj;
import com.google.android.apps.gsa.nga.shared.p6417x.C83361k;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.az */
/* compiled from: PG */
public final /* synthetic */ class C82149az implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C82155be f224555a;

    public /* synthetic */ C82149az(C82155be beVar) {
        this.f224555a = beVar;
    }

    public final void run() {
        C82155be beVar = this.f224555a;
        if (!((C82154bd) ((C83361k) beVar.f224570g).f227199b.get()).equals(C82154bd.REQUESTED)) {
            ((C83361k) beVar.f224570g).f227199b.get();
            return;
        }
        ((C59052c) ((C59052c) C82156bf.f224573a.mo56224b()).mo56372aa(6504)).mo56389s("%s enabled", beVar.f224566c);
        beVar.f224572i.cancel(false);
        beVar.f224570g.mo76660b(C82154bd.ENABLED);
        beVar.f224572i = C83349aj.m132646a(beVar.f224569f, C82152bb.f224558a);
        C90875ai.m148465b(new C82146aw(beVar), beVar.f224572i, beVar.f224567d, "[NGA] disable").mo85223a(new C82153bc(beVar));
    }
}
