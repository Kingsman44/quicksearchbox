package com.google.android.libraries.lens.view.infopanel;

import android.view.View;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27129ae;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27130af;
import com.google.android.libraries.lens.view.infopanel.p2144e.C27131ag;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ah */
/* compiled from: PG */
public final class C26990ah implements C27131ag {

    /* renamed from: a */
    private static final C59071e f73601a = C59071e.m91332i("com.google.android.libraries.lens.view.infopanel.ah");

    /* renamed from: c */
    private final C58495hd f73602c;

    public C26990ah(C58495hd hdVar) {
        this.f73602c = hdVar;
    }

    /* renamed from: a */
    public final /* synthetic */ View mo32451a(C27129ae aeVar) {
        return C27130af.m50335a(this, aeVar);
    }

    /* renamed from: b */
    public final View mo32452b(C27129ae aeVar) {
        View view = aeVar.f74134c;
        if (view != null) {
            return view;
        }
        C27131ag agVar = (C27131ag) this.f73602c.get(aeVar.mo32561a());
        if (agVar == null) {
            ((C59052c) ((C59052c) f73601a.mo56225c()).mo56372aa(49524)).mo56389s("No renderer for %s", aeVar.mo32561a());
            return null;
        }
        View a = agVar.mo32451a(aeVar);
        if (a != null) {
            aeVar.f74134c = a;
        }
        return a;
    }
}
