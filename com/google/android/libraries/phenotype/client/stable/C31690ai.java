package com.google.android.libraries.phenotype.client.stable;

import android.os.StrictMode;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.android.libraries.phenotype.client.p2420a.C31640h;
import com.google.android.libraries.storage.p3304a.p3312f.C42789m;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.phenotype.client.stable.ai */
/* compiled from: PG */
final class C31690ai extends C31682aa {

    /* renamed from: i */
    private volatile String f85210i;

    /* renamed from: j */
    private final C31731bw f85211j;

    public C31690ai(C31760t tVar, String str, boolean z, Set set) {
        super(tVar, str, set);
        this.f85211j = new C31731bw(tVar, str, BuildConfig.FLAVOR, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C60870cx mo37320a() {
        if (this.f85210i.isEmpty()) {
            return C60866ct.f164955a;
        }
        return C60846c.m92879h(this.f85194b.mo37365c().mo37287a(this.f85210i), C31640h.class, new C31685ad(this), this.f85194b.mo37368h());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Map mo37321b() {
        C31733by byVar;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        C31731bw bwVar = this.f85211j;
        try {
            byVar = (C31733by) bwVar.f85300a.mo37367e().mo45889c(bwVar.f85301b, C42789m.m75558b(C31733by.f85305h));
        } catch (IOException | RuntimeException unused) {
            String str = bwVar.f85302c;
            Log.i("SnapshotHandler", "Unable to retrieve flag snapshot for " + str + ", using defaults.");
            byVar = C31733by.f85305h;
        }
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
        if (byVar.f85308b.isEmpty()) {
            this.f85194b.mo37368h().execute(new C31686ae(this));
            return C58729pv.f156485a;
        }
        this.f85210i = byVar.f85308b;
        this.f85194b.mo37368h().execute(new C31687af(this));
        C31745l.m59073h().mo37358e(byVar.f85309c, this.f85200h, this.f85195c);
        this.f85194b.mo37368h().execute(new C31688ag(this));
        return C31731bw.m59061a(byVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo37322c() {
        C60870cx b = this.f85211j.mo37347b(this.f85196d);
        C31731bw bwVar = this.f85211j;
        Objects.requireNonNull(bwVar);
        C60922j.m93045h(b, new C31683ab(bwVar), this.f85194b.mo37368h()).mo4106b(new C31684ac(this, b), this.f85194b.mo37368h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo37328d(C60870cx cxVar) {
        try {
            C58495hd a = C31731bw.m59061a((C31733by) C60856cj.m92909r(cxVar));
            C31716bh bhVar = this.f85197e;
            synchronized (bhVar.f85272a) {
                if (bhVar.f85273b != null) {
                    boolean equals = bhVar.f85273b.equals(a);
                    if (!equals) {
                        this.f85194b.mo37366d();
                        this.f85194b.mo37366d().mo37332a();
                        return;
                    }
                } else {
                    bhVar.f85273b = a;
                    bhVar.f85274c = null;
                }
            }
            this.f85198f.f85228a.incrementAndGet();
        } catch (CancellationException | ExecutionException e) {
            String str = this.f85195c;
            Log.w("MobStoreFlagStore", "Unable to update local snapshot for " + str + ", may result in stale flags.", e);
        }
    }
}
