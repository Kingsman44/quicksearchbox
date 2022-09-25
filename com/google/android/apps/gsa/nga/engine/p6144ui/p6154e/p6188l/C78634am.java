package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import android.os.Bundle;
import android.os.RemoteException;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.C74737q;
import com.google.android.apps.gsa.nga.engine.ay.p;
import com.google.android.apps.gsa.nga.engine.p5977ay.C75179b;
import com.google.android.apps.gsa.nga.engine.p5977ay.C75181f;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.am */
/* compiled from: PG */
public final class C78634am {

    /* renamed from: a */
    public final p f216529a;

    /* renamed from: b */
    private final C78632ak f216530b;

    public C78634am(p pVar, C78632ak akVar) {
        this.f216529a = pVar;
        this.f216530b = akVar;
    }

    /* renamed from: a */
    public final void mo73559a(int i, Bundle bundle) {
        if (i - 1 != 0) {
            C78632ak akVar = this.f216530b;
            C74737q qVar = akVar.f216525e;
            if (qVar != null) {
                try {
                    qVar.mo71117e(bundle);
                } catch (RemoteException e) {
                    ((C59052c) ((C59052c) ((C59052c) C78632ak.f216521a.mo56225c()).mo56382g(e)).mo56372aa(5263)).mo56386p("Could not send bundle");
                    akVar.mo73558c();
                }
            } else {
                ((C59052c) ((C59052c) C78632ak.f216521a.mo56225c()).mo56372aa(5262)).mo56389s("Sending %s bundle on null callback", bundle.getString("action", BuildConfig.FLAVOR));
            }
        } else {
            p pVar = this.f216529a;
            pVar.h.mo28212l("ngaSetUiHints", new C75181f(pVar, new C75179b(bundle)));
        }
    }
}
