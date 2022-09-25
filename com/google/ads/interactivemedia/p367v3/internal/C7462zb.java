package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Looper;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.zb */
/* compiled from: PG */
final class C7462zb extends C7353va {

    /* renamed from: a */
    private final Map f24492a;

    /* renamed from: b */
    private C7031jc f24493b;

    public /* synthetic */ C7462zb(acc acc, Looper looper, C7036jh jhVar, C7033je jeVar, Map map) {
        super(acc, looper, jhVar, jeVar);
        this.f24492a = map;
    }

    /* renamed from: K */
    public final C6864cy mo16616K(C6864cy cyVar) {
        C7031jc jcVar;
        C7031jc jcVar2 = this.f24493b;
        if (jcVar2 == null) {
            jcVar2 = cyVar.f21815o;
        }
        if (!(jcVar2 == null || (jcVar = (C7031jc) this.f24492a.get(jcVar2.f22535a)) == null)) {
            jcVar2 = jcVar;
        }
        C7243qz qzVar = cyVar.f21810j;
        if (qzVar != null) {
            int a = qzVar.mo16341a();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= a) {
                    i2 = -1;
                    break;
                }
                C7242qy b = qzVar.mo16342b(i2);
                if ((b instanceof C7279sh) && "com.apple.streaming.transportStreamTimestamp".equals(((C7279sh) b).f23748a)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (a != 1) {
                    C7242qy[] qyVarArr = new C7242qy[(a - 1)];
                    while (i < a) {
                        if (i != i2) {
                            qyVarArr[i < i2 ? i : i - 1] = qzVar.mo16342b(i);
                        }
                        i++;
                    }
                    qzVar = new C7243qz(qyVarArr);
                }
            }
            if (!(jcVar2 == cyVar.f21815o && qzVar == cyVar.f21810j)) {
                C6863cx a2 = cyVar.mo15636a();
                a2.mo15610L(jcVar2);
                a2.mo15622X(qzVar);
                cyVar = a2.mo15625a();
            }
            return super.mo16616K(cyVar);
        }
        qzVar = null;
        C6863cx a22 = cyVar.mo15636a();
        a22.mo15610L(jcVar2);
        a22.mo15622X(qzVar);
        cyVar = a22.mo15625a();
        return super.mo16616K(cyVar);
    }

    /* renamed from: M */
    public final void mo16841M(C7450yq yqVar) {
        mo16622k(yqVar.f24423a);
    }

    /* renamed from: N */
    public final void mo16842N(C7031jc jcVar) {
        this.f24493b = jcVar;
        mo16615J();
    }
}
