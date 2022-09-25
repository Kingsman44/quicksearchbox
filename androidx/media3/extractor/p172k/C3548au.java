package androidx.media3.extractor.p172k;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3624n;
import java.util.List;

/* renamed from: androidx.media3.extractor.k.au */
/* compiled from: PG */
final class C3548au {

    /* renamed from: a */
    private final List f11113a;

    /* renamed from: b */
    private final C3368bf[] f11114b;

    public C3548au(List list) {
        this.f11113a = list;
        this.f11114b = new C3368bf[list.size()];
    }

    /* renamed from: a */
    public final void mo7464a(long j, C2604ac acVar) {
        if (acVar.f7236c - acVar.f7235b >= 9) {
            int b = acVar.mo6134b();
            int b2 = acVar.mo6134b();
            int g = acVar.mo6139g();
            if (b == 434 && b2 == 1195456820 && g == 3) {
                C3624n.m10439b(j, acVar, this.f11114b);
            }
        }
    }

    /* renamed from: b */
    public final void mo7465b(C3329ad adVar, C3545ar arVar) {
        for (int i = 0; i < this.f11114b.length; i++) {
            arVar.mo7462a();
            arVar.mo7463b();
            C3368bf eZ = adVar.mo6987eZ(arVar.f11108a, 3);
            C2680x xVar = (C2680x) this.f11113a.get(i);
            String str = xVar.f7496n;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            C2601a.m6831c(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            C2679w wVar = new C2679w();
            arVar.mo7463b();
            wVar.f7449a = arVar.f11109b;
            wVar.f7459k = str;
            wVar.f7452d = xVar.f7488f;
            wVar.f7451c = xVar.f7487e;
            wVar.f7447C = xVar.f7482F;
            wVar.f7461m = xVar.f7498p;
            eZ.mo6850b(new C2680x(wVar));
            this.f11114b[i] = eZ;
        }
    }
}
