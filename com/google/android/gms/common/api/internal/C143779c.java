package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.c */
/* compiled from: PG */
public final class C143779c extends C143818g {

    /* renamed from: a */
    protected final C143824m f389796a;

    public C143779c(int i, C143824m mVar) {
        super(i);
        this.f389796a = mVar;
    }

    /* renamed from: d */
    public final void mo119169d(Status status) {
        try {
            this.f389796a.mo119276l(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: e */
    public final void mo119170e(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f389796a.mo119276l(new Status(1, 10, simpleName + ": " + localizedMessage, (PendingIntent) null, (ConnectionResult) null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    /* renamed from: f */
    public final void mo119171f(C143763bk bkVar) {
        try {
            this.f389796a.mo119275k(bkVar.f389748b);
        } catch (RuntimeException e) {
            mo119170e(e);
        }
    }

    /* renamed from: g */
    public final void mo119172g(C143729ad adVar, boolean z) {
        C143824m mVar = this.f389796a;
        adVar.f389650a.put(mVar, Boolean.valueOf(z));
        mVar.mo117319d(new C143727ab(adVar, mVar));
    }
}
