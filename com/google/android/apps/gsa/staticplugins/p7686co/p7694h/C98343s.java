package com.google.android.apps.gsa.staticplugins.p7686co.p7694h;

import com.google.android.apps.gsa.store.C118332u;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.h.s */
/* compiled from: PG */
public final /* synthetic */ class C98343s implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C98321ac f274500a;

    public /* synthetic */ C98343s(C98321ac acVar) {
        this.f274500a = acVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C98321ac acVar = this.f274500a;
        C118332u uVar = (C118332u) obj;
        if (uVar.mo103670a()) {
            try {
                return C58833ax.m90834k(acVar.mo91049a(uVar.mo103671b()));
            } catch (IOException e) {
                C59104x c = C98323ae.f274452a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NowContentStore");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(30608)).mo56386p("Exception while deserializing");
            }
        }
        return C58836b.f156633a;
    }
}
