package com.google.android.libraries.micore.learning.training.nativeshared;

import com.google.android.gms.learning.C144827n;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.fcp.client.C61091d;

/* renamed from: com.google.android.libraries.micore.learning.training.nativeshared.n */
/* compiled from: PG */
public final class C29742n implements NativeLogManager {

    /* renamed from: a */
    public final C144827n f80526a;

    /* renamed from: b */
    public final String f80527b;

    /* renamed from: c */
    public final C59628h f80528c;

    /* renamed from: d */
    private final C61091d f80529d;

    public C29742n(C144827n nVar, String str, C59628h hVar, C61091d dVar) {
        this.f80526a = nVar;
        this.f80527b = str;
        this.f80528c = hVar;
        this.f80529d = dVar;
    }

    public final void logDebugDiag(int i) {
        this.f80529d.mo57646b(new C29741m(this, i));
    }

    public final void logProdDiag(int i) {
        this.f80529d.mo57646b(new C29739k(this, i));
    }

    public final void logToLongHistogram(int i, int i2, int i3, int i4, long j) {
        this.f80529d.mo57646b(new C29740l(this, i, i4, i2, i3, (String) null, j));
    }

    public final void logToLongHistogram(int i, int i2, int i3, int i4, String str, long j) {
        this.f80529d.mo57646b(new C29740l(this, i, i4, i2, i3, str, j));
    }
}
