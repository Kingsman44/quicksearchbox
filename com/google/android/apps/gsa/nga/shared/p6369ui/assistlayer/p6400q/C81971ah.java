package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import androidx.core.content.p091b.C1874w;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.ah */
/* compiled from: PG */
public final /* synthetic */ class C81971ah implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C81975al f224105a;

    public /* synthetic */ C81971ah(C81975al alVar) {
        this.f224105a = alVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C81975al alVar = this.f224105a;
        Optional empty = Optional.empty();
        if (alVar.f224110c.isPresent()) {
            try {
                empty = Optional.ofNullable(C1874w.m5107d(alVar.f224114g, ((Integer) alVar.f224110c.get()).intValue()));
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) C81975al.f224108a.mo56226d()).mo56382g(e)).mo56372aa(6445)).mo56386p("Could not load title font");
            }
        }
        Optional empty2 = Optional.empty();
        if (alVar.f224111d.isPresent()) {
            try {
                empty2 = Optional.ofNullable(C1874w.m5107d(alVar.f224114g, ((Integer) alVar.f224111d.get()).intValue()));
            } catch (RuntimeException e2) {
                ((C59052c) ((C59052c) ((C59052c) C81975al.f224108a.mo56226d()).mo56382g(e2)).mo56372aa(6444)).mo56386p("Could not load text font");
            }
        }
        return new C82018z(empty, empty2);
    }
}
