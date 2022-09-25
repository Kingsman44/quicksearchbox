package com.google.android.libraries.phenotype.client.stable;

import android.net.Uri;
import android.util.Log;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3306b.C42737a;
import com.google.android.libraries.storage.p3304a.p3312f.C42795s;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.phenotype.client.stable.bu */
/* compiled from: PG */
public final /* synthetic */ class C31729bu implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C31731bw f85297a;

    /* renamed from: b */
    public final /* synthetic */ C31733by f85298b;

    public /* synthetic */ C31729bu(C31731bw bwVar, C31733by byVar) {
        this.f85297a = bwVar;
        this.f85298b = byVar;
    }

    public final Object call() {
        C31731bw bwVar = this.f85297a;
        C31733by byVar = this.f85298b;
        C42737a aVar = new C42737a();
        try {
            C42813k e = bwVar.f85300a.mo37367e();
            Uri uri = bwVar.f85301b;
            C42795s sVar = new C42795s(byVar);
            sVar.f112059a = new C42737a[]{aVar};
            Void voidR = (Void) e.mo45889c(uri, sVar);
            return null;
        } catch (IOException | RuntimeException e2) {
            String str = bwVar.f85302c;
            Log.w("SnapshotHandler", "Failed to update snapshot for " + str + " flags may be stale.", e2);
            return null;
        }
    }
}
