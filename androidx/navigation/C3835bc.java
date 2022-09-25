package androidx.navigation;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

@C3865cf(mo8118a = "navigation")
/* renamed from: androidx.navigation.bc */
/* compiled from: PG */
public final class C3835bc extends C3868ci {

    /* renamed from: b */
    private final C3870ck f12377b;

    public C3835bc(C3870ck ckVar) {
        C69664n.m101061g(ckVar, "navigatorProvider");
        this.f12377b = ckVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C3825ax mo8074a() {
        return new C3834bb(this);
    }

    /* renamed from: d */
    public final void mo8097d(List list, C3840bh bhVar, C3864ce ceVar) {
        String str;
        C69664n.m101061g(list, "entries");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3892m mVar = (C3892m) it.next();
            C3834bb bbVar = (C3834bb) mVar.f12477b;
            Bundle bundle = mVar.f12478c;
            int i = bbVar.f12375b;
            if (i == 0) {
                int i2 = bbVar.f12360i;
                if (i2 != 0) {
                    str = bbVar.f12356e;
                    if (str == null) {
                        str = String.valueOf(i2);
                    }
                } else {
                    str = "the root navigation";
                }
                throw new IllegalStateException(C69664n.m101057c("no start destination defined via app:startDestination for ", str));
            }
            C3825ax h = bbVar.mo8094h(i, false);
            if (h == null) {
                if (bbVar.f12376l == null) {
                    bbVar.f12376l = String.valueOf(bbVar.f12375b);
                }
                String str2 = bbVar.f12376l;
                C69664n.m101058d(str2);
                throw new IllegalArgumentException("navigation destination " + str2 + " is not a direct child of this NavGraph");
            }
            this.f12377b.mo8077a(h.f12354c).mo8097d(C69540x.m100944b(mo8120f().mo8125a(h, h.mo8085c(bundle))), bhVar, ceVar);
        }
    }
}
