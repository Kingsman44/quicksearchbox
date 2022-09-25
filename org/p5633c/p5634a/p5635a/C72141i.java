package org.p5633c.p5634a.p5635a;

import java.io.Serializable;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72144ab;
import org.p5633c.p5634a.C72146ad;
import org.p5633c.p5634a.C72152aj;
import org.p5633c.p5634a.C72285i;
import org.p5633c.p5634a.C72293q;
import org.p5633c.p5634a.p5637c.C72195d;
import org.p5633c.p5634a.p5637c.C72203l;

/* renamed from: org.c.a.a.i */
/* compiled from: PG */
public class C72141i extends C72137e implements Serializable, C72152aj {
    private static final long serialVersionUID = -2110953284060001145L;

    /* renamed from: a */
    public final C72146ad f191965a;

    /* renamed from: b */
    public final int[] f191966b;

    protected C72141i(C72146ad adVar) {
        C72146ad f = C72285i.m106778f(adVar);
        C72132a c = C72285i.m106775c((C72132a) null);
        this.f191965a = f;
        this.f191966b = c.mo63340R(this, 0);
    }

    /* renamed from: e */
    public final C72146ad mo63413e() {
        return this.f191965a;
    }

    /* renamed from: f */
    public final void mo63414f(int[] iArr, C72293q qVar, int i) {
        int b = mo63413e().mo63430b(qVar);
        if (b != -1) {
            iArr[b] = i;
        } else if (i != 0) {
            String str = qVar.f192448m;
            throw new IllegalArgumentException("Period does not support field '" + str + "'");
        }
    }

    /* renamed from: h */
    public final int mo63415h(int i) {
        return this.f191966b[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo63416k(int[] iArr) {
        int[] iArr2 = this.f191966b;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    protected C72141i(Object obj, C72146ad adVar) {
        C72203l lVar = (C72203l) C72195d.m106217a().f192160b.mo63539a(obj.getClass());
        if (lVar != null) {
            C72146ad f = C72285i.m106778f(adVar == null ? lVar.mo63543c(obj) : adVar);
            this.f191965a = f;
            if (this instanceof C72144ab) {
                this.f191966b = new int[mo63413e().f191978h.length];
                lVar.mo63541h((C72144ab) this, obj, C72285i.m106775c((C72132a) null));
                return;
            }
            C72144ab abVar = new C72144ab(obj, f);
            int length = abVar.f191965a.f191978h.length;
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                iArr[i] = abVar.f191966b[i];
            }
            this.f191966b = iArr;
            return;
        }
        throw new IllegalArgumentException("No period converter found for type: ".concat(String.valueOf(obj.getClass().getName())));
    }
}
