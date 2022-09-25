package dagger.hilt.android.internal.p5302a;

import android.os.Bundle;
import androidx.lifecycle.C2319a;
import androidx.lifecycle.C2344as;
import androidx.lifecycle.C2358bf;
import androidx.savedstate.C4091g;
import com.google.android.apps.gsa.binaries.satin.app.ayx;
import com.google.android.apps.gsa.binaries.satin.app.aza;
import dagger.hilt.C68286a;
import dagger.hilt.android.C68296b;
import dagger.hilt.android.internal.p5302a.C68306e;
import dagger.p5294a.C68225k;
import p3186j$.util.Objects;
import p5460g.p5461a.C69464a;

/* renamed from: dagger.hilt.android.internal.a.d */
/* compiled from: PG */
final class C68305d extends C2319a {

    /* renamed from: a */
    final /* synthetic */ ayx f184646a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68305d(C4091g gVar, Bundle bundle, ayx ayx) {
        super(gVar, bundle);
        this.f184646a = ayx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C2358bf mo5722d(Class cls, C2344as asVar) {
        C68308f fVar = new C68308f();
        ayx ayx = this.f184646a;
        ayx.f204791b = asVar;
        ayx.f204792c = fVar;
        C68225k.m98529a(ayx.f204791b, C2344as.class);
        C68225k.m98529a(ayx.f204792c, C68296b.class);
        C69464a aVar = (C69464a) ((C68306e.C68307a) C68286a.m98629a(new aza(ayx.f204790a, ayx.f204791b), C68306e.C68307a.class)).mo60320a().get(cls.getName());
        if (aVar != null) {
            C2358bf bfVar = (C2358bf) aVar.mo17428b();
            Objects.requireNonNull(fVar);
            C68304c cVar = new C68304c(fVar);
            synchronized (bfVar.f6574x) {
                bfVar.f6574x.add(cVar);
            }
            return bfVar;
        }
        String name = cls.getName();
        throw new IllegalStateException("Expected the @HiltViewModel-annotated class '" + name + "' to be available in the multi-binding of @HiltViewModelMap but none was found.");
    }
}
