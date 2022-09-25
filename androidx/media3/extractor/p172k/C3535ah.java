package androidx.media3.extractor.p172k;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3368bf;
import java.util.List;

/* renamed from: androidx.media3.extractor.k.ah */
/* compiled from: PG */
public final class C3535ah {

    /* renamed from: a */
    public final C3368bf[] f11064a;

    /* renamed from: b */
    private final List f11065b;

    public C3535ah(List list) {
        this.f11065b = list;
        this.f11064a = new C3368bf[list.size()];
    }

    /* renamed from: a */
    public final void mo7459a(C3329ad adVar, C3545ar arVar) {
        for (int i = 0; i < this.f11064a.length; i++) {
            arVar.mo7462a();
            arVar.mo7463b();
            C3368bf eZ = adVar.mo6987eZ(arVar.f11108a, 3);
            C2680x xVar = (C2680x) this.f11065b.get(i);
            String str = xVar.f7496n;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            C2601a.m6831c(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String str2 = xVar.f7485c;
            if (str2 == null) {
                arVar.mo7463b();
                str2 = arVar.f11109b;
            }
            C2679w wVar = new C2679w();
            wVar.f7449a = str2;
            wVar.f7459k = str;
            wVar.f7452d = xVar.f7488f;
            wVar.f7451c = xVar.f7487e;
            wVar.f7447C = xVar.f7482F;
            wVar.f7461m = xVar.f7498p;
            eZ.mo6850b(new C2680x(wVar));
            this.f11064a[i] = eZ;
        }
    }
}
