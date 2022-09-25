package com.google.android.apps.gsa.nga.shared.p6319ak;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.apps.gsa.nga.api.C74697ax;
import com.google.android.apps.gsa.shared.util.C90736at;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.nga.shared.ak.a */
/* compiled from: PG */
public final /* synthetic */ class C80881a implements C90736at {

    /* renamed from: a */
    public final /* synthetic */ C74697ax f221832a;

    public /* synthetic */ C80881a(C74697ax axVar) {
        this.f221832a = axVar;
    }

    /* renamed from: a */
    public final void mo17700a(Object obj) {
        try {
            this.f221832a.mo71052e((Bitmap) obj);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C80882b.f221833a.mo56225c()).mo56382g(e)).mo56372aa(6533)).mo56386p("Failed to invoke remote listener.");
        }
    }
}
