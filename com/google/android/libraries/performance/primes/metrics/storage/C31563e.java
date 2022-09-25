package com.google.android.libraries.performance.primes.metrics.storage;

import com.evernote.android.state.BuildConfig;
import java.io.File;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71290ds;

/* renamed from: com.google.android.libraries.performance.primes.metrics.storage.e */
/* compiled from: PG */
final class C31563e implements Comparable {

    /* renamed from: a */
    final C71290ds f84991a;

    /* renamed from: b */
    final File f84992b;

    /* renamed from: c */
    final C31563e f84993c;

    /* renamed from: d */
    final int f84994d;

    /* renamed from: e */
    final boolean f84995e;

    /* renamed from: f */
    final String f84996f;

    /* renamed from: g */
    long f84997g = 0;

    public C31563e(C31563e eVar, boolean z, String str) {
        this.f84991a = eVar.f84991a;
        this.f84992b = eVar.f84992b;
        this.f84993c = eVar;
        this.f84994d = eVar.f84994d + 1;
        this.f84995e = z;
        if (eVar.f84994d != 0) {
            str = eVar.f84996f + "/" + str;
        }
        this.f84996f = str;
    }

    public C31563e(C71290ds dsVar, File file) {
        this.f84991a = dsVar;
        this.f84992b = file;
        this.f84993c = null;
        this.f84994d = 0;
        this.f84995e = true;
        this.f84996f = BuildConfig.FLAVOR;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C31563e eVar = (C31563e) obj;
        int i = this.f84994d;
        int i2 = eVar.f84994d;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        boolean z = this.f84995e;
        if (z != eVar.f84995e) {
            return !z ? 1 : -1;
        }
        return this.f84996f.compareTo(eVar.f84996f);
    }
}
