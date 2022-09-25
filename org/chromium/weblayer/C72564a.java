package org.chromium.weblayer;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import org.chromium.p5643b.p5644a.C72341bj;

/* renamed from: org.chromium.weblayer.a */
/* compiled from: PG */
public final /* synthetic */ class C72564a implements C72621j {

    /* renamed from: a */
    public final /* synthetic */ Context f193096a;

    /* renamed from: b */
    public final /* synthetic */ Intent f193097b;

    public /* synthetic */ C72564a(Context context, Intent intent) {
        this.f193096a = context;
        this.f193097b = intent;
    }

    /* renamed from: a */
    public final void mo46626a(Object obj) {
        Context context = this.f193096a;
        try {
            ((C72611bt) obj).f193174f.mo63781n(new C72341bj(context), this.f193097b);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
