package org.p5633c.p5634a;

import java.io.Serializable;
import org.p5633c.p5634a.p5635a.C72141i;

/* renamed from: org.c.a.ab */
/* compiled from: PG */
public final class C72144ab extends C72141i implements Cloneable, Serializable, C72152aj {
    private static final long serialVersionUID = 3436451121567212165L;

    public C72144ab() {
        super((C72146ad) null);
    }

    /* renamed from: a */
    public final void mo63423a() {
        super.mo63416k(new int[this.f191965a.f191978h.length]);
    }

    /* renamed from: b */
    public final void mo63424b(int i) {
        mo63414f(this.f191966b, C72293q.f192447l, i);
    }

    /* renamed from: c */
    public final void mo63425c(C72152aj ajVar) {
        if (ajVar == null) {
            mo63416k(new int[this.f191965a.f191978h.length]);
            return;
        }
        int[] iArr = new int[this.f191965a.f191978h.length];
        C72141i iVar = (C72141i) ajVar;
        int length = iVar.f191965a.f191978h.length;
        for (int i = 0; i < length; i++) {
            C72293q qVar = iVar.f191965a.f191978h[i];
            int i2 = iVar.f191966b[i];
            int b = this.f191965a.mo63430b(qVar);
            if (b != -1) {
                iArr[b] = i2;
            } else if (i2 != 0) {
                String str = qVar.f192448m;
                throw new IllegalArgumentException("Period does not support field '" + str + "'");
            }
        }
        mo63416k(iArr);
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError("Clone error");
        }
    }

    /* renamed from: d */
    public final void mo63427d(int i) {
        mo63414f(this.f191966b, C72293q.f192446k, i);
    }

    public C72144ab(C72146ad adVar) {
        super(adVar);
    }

    public C72144ab(Object obj, C72146ad adVar) {
        super(obj, adVar);
    }
}
