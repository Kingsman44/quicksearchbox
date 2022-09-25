package com.google.android.libraries.search.p3055n.p3087j;

import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37422c;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p3055n.p3078f.p3080b.C39709l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.j.c */
/* compiled from: PG */
public final /* synthetic */ class C39803c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39806f f104676a;

    /* renamed from: b */
    public final /* synthetic */ C39709l f104677b;

    public /* synthetic */ C39803c(C39806f fVar, C39709l lVar) {
        this.f104676a = fVar;
        this.f104677b = lVar;
    }

    public final C60870cx apply(Object obj) {
        C39806f fVar = this.f104676a;
        C39709l lVar = this.f104677b;
        C37400be beVar = (C37400be) obj;
        C37561eb ebVar = beVar.mo40929a().f99350b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        C58838bb.m90884s(!(ebVar.f99802a == 2), "failed to open microphone");
        C58833ax c = beVar.mo40931c();
        C58838bb.m90884s(c.mo56113h(), "failed to start listening and get registry");
        return ((C37422c) c.mo56107c()).mo40946j(new C39797a(lVar, fVar.f104683c));
    }
}
