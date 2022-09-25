package com.google.android.libraries.performance.primes.p2402g;

import android.content.Context;
import com.google.android.libraries.performance.primes.metrics.C31266a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.performance.primes.g.n */
/* compiled from: PG */
public final class C31251n {

    /* renamed from: a */
    public static final C59071e f84182a = C59071e.m91332i("com.google.android.libraries.performance.primes.g.n");

    /* renamed from: e */
    private static final C31247j f84183e = C31247j.m58247a(Integer.MAX_VALUE);

    /* renamed from: b */
    public volatile C31258u f84184b = C31257t.f84201a;

    /* renamed from: c */
    public volatile boolean f84185c = true;

    /* renamed from: d */
    public volatile C31247j f84186d = f84183e;

    public C31251n(Context context, Executor executor, C31257t tVar, C68214a aVar, boolean z, C69464a aVar2) {
        C60856cj.m92903l(new C31249l(this, context, aVar, executor, tVar, true != z ? null : aVar2), executor);
    }

    /* renamed from: a */
    public final void mo36972a(C68214a aVar) {
        try {
            C31266a aVar2 = (C31266a) aVar.mo27525b();
            this.f84185c = aVar2.mo36980b();
            this.f84186d = C31247j.m58247a(aVar2.mo36979a());
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) f84182a.mo56226d()).mo56382g(th)).mo56372aa(50460)).mo56386p("Couldn't get config");
            this.f84185c = false;
        }
    }
}
