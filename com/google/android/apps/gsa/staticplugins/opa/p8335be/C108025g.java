package com.google.android.apps.gsa.staticplugins.opa.p8335be;

import com.google.android.apps.gsa.store.C118332u;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.be.g */
/* compiled from: PG */
public final /* synthetic */ class C108025g implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C108034p f300526a;

    public /* synthetic */ C108025g(C108034p pVar) {
        this.f300526a = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C108034p pVar = this.f300526a;
        C118332u uVar = (C118332u) obj;
        if (uVar.mo103670a()) {
            try {
                return C58833ax.m90834k(pVar.mo96349a(uVar.mo103671b()));
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) C108035q.f300539a.mo56225c()).mo56382g(e)).mo56372aa(26951)).mo56386p("Exception while deserializing");
            }
        }
        return C58836b.f156633a;
    }
}
