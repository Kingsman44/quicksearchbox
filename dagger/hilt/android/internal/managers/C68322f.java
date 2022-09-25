package dagger.hilt.android.internal.managers;

import com.google.android.apps.gsa.binaries.satin.app.aqy;
import com.google.android.apps.gsa.binaries.satin.app.bcs;
import com.google.android.apps.gsa.binaries.satin.app.bct;
import dagger.hilt.android.internal.p5303b.C68311b;
import dagger.hilt.p5299a.C68288b;
import p5460g.p5461a.C69464a;

/* renamed from: dagger.hilt.android.internal.managers.f */
/* compiled from: PG */
public final class C68322f implements C68288b {

    /* renamed from: a */
    private volatile Object f184671a;

    /* renamed from: b */
    private final Object f184672b = new Object();

    /* renamed from: c */
    private final bct f184673c;

    public C68322f(bct bct) {
        this.f184673c = bct;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        if (this.f184671a == null) {
            synchronized (this.f184672b) {
                if (this.f184671a == null) {
                    bct bct = this.f184673c;
                    C69464a aVar = bcs.f205179a;
                    this.f184671a = new aqy(new C68311b(bct.f205181a));
                }
            }
        }
        return this.f184671a;
    }
}
