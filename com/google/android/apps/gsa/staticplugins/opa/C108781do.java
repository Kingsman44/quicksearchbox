package com.google.android.apps.gsa.staticplugins.opa;

import android.os.RemoteException;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.do */
/* compiled from: PG */
public final /* synthetic */ class C108781do implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C108801ee f302506a;

    /* renamed from: b */
    public final /* synthetic */ String f302507b;

    /* renamed from: c */
    public final /* synthetic */ String f302508c;

    public /* synthetic */ C108781do(C108801ee eeVar, String str, String str2) {
        this.f302506a = eeVar;
        this.f302507b = str;
        this.f302508c = str2;
    }

    public final void run() {
        C108801ee eeVar = this.f302506a;
        try {
            eeVar.f302541a.f303451p.mo17570i(this.f302507b, this.f302508c, (String) null);
        } catch (RemoteException e) {
            C59104x d = C109040fj.f303210a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ChatUiController");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(22615)).mo56386p("Could not updateRecognizedText");
        }
    }
}
