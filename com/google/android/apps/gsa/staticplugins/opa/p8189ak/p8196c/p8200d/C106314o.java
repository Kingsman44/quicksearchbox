package com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8200d;

import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ak.c.d.o */
/* compiled from: PG */
public final /* synthetic */ class C106314o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C106317r f296608a;

    public /* synthetic */ C106314o(C106317r rVar) {
        this.f296608a = rVar;
    }

    public final void run() {
        C106317r rVar = this.f296608a;
        ((C107705p) rVar.f296612b.mo27525b()).mo96236i();
        ((C107705p) rVar.f296612b.mo27525b()).mo96231d();
        Callable callable = (Callable) rVar.f296614d.get();
        if (callable != null) {
            try {
                callable.call();
            } catch (Exception e) {
                C59104x c = C106317r.f296611a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OCFNgaClientEventSender");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(25235)).mo56386p("error calling callback on disconnect");
            }
        }
    }
}
