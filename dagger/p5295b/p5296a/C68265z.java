package dagger.p5295b.p5296a;

import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.p5295b.C68283d;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: dagger.b.a.z */
/* compiled from: PG */
public final class C68265z extends C68241b {
    public C68265z(C58495hd hdVar) {
        super(hdVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: gp */
    public final C60870cx mo60301gp() {
        ArrayList arrayList = new ArrayList();
        C58800sl lA = this.f184602a.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            arrayList.add(C60922j.m93044g(((C68283d) entry.getValue()).mo60297gq(), new C68262w(entry), C60826bg.f164896a));
        }
        return C60922j.m93044g(C60856cj.m92896e(arrayList), new C68263x(), C60826bg.f164896a);
    }
}
