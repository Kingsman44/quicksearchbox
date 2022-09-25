package org.chromium.weblayer;

import android.os.RemoteException;
import androidx.lifecycle.C2358bf;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72322ar;
import org.chromium.p5643b.p5644a.C72343bl;

/* renamed from: org.chromium.weblayer.ay */
/* compiled from: PG */
class C72589ay extends C2358bf {

    /* renamed from: d */
    public C72588ax f193128d;

    /* renamed from: e */
    public C72322ar f193129e;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo639d() {
        C72604bm.m107399a();
        C72588ax axVar = this.f193128d;
        if (axVar != null) {
            C72343bl.m106991a();
            axVar.f193127b = true;
            try {
                axVar.f193126a.f193133e.mo63715e();
                axVar.f193127b = false;
                this.f193128d = null;
                this.f193129e = null;
            } catch (RemoteException e) {
                throw new C72304a(e);
            } catch (Throwable th) {
                axVar.f193127b = false;
                throw th;
            }
        }
    }
}
