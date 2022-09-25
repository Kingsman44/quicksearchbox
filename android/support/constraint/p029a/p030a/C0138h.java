package android.support.constraint.p029a.p030a;

import android.support.constraint.p029a.C0140c;
import java.util.ArrayList;

/* renamed from: android.support.constraint.a.a.h */
/* compiled from: PG */
public class C0138h extends C0133c {

    /* renamed from: an */
    public final ArrayList f501an = new ArrayList();

    /* renamed from: A */
    public final void mo157A(C0133c cVar) {
        this.f501an.remove(cVar);
        cVar.f463r = null;
    }

    /* renamed from: e */
    public void mo133e() {
        this.f501an.clear();
        super.mo133e();
    }

    /* renamed from: f */
    public final void mo134f(C0140c cVar) {
        super.mo134f(cVar);
        int size = this.f501an.size();
        for (int i = 0; i < size; i++) {
            ((C0133c) this.f501an.get(i)).mo134f(cVar);
        }
    }

    /* renamed from: k */
    public final void mo139k(int i, int i2) {
        this.f415C = i;
        this.f416D = i2;
        int size = this.f501an.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0133c) this.f501an.get(i3)).mo139k(this.f468w + this.f415C, this.f469x + this.f416D);
        }
    }

    /* renamed from: n */
    public final void mo142n() {
        super.mo142n();
        ArrayList arrayList = this.f501an;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0133c cVar = (C0133c) this.f501an.get(i);
                cVar.mo139k(this.f470y + this.f415C, this.f471z + this.f416D);
                if (!(cVar instanceof C0134d)) {
                    cVar.mo142n();
                }
            }
        }
    }

    /* renamed from: z */
    public void mo155z() {
        mo142n();
        ArrayList arrayList = this.f501an;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C0133c cVar = (C0133c) this.f501an.get(i);
                if (cVar instanceof C0138h) {
                    ((C0138h) cVar).mo155z();
                }
            }
        }
    }
}
