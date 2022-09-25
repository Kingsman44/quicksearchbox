package androidx.p197u;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: androidx.u.am */
/* compiled from: PG */
public class C4202am extends C4195af {

    /* renamed from: o */
    public ArrayList f13620o = new ArrayList();

    /* renamed from: p */
    int f13621p;

    /* renamed from: q */
    boolean f13622q = false;

    /* renamed from: r */
    private boolean f13623r = true;

    /* renamed from: s */
    private int f13624s = 0;

    /* renamed from: K */
    private final void m12058K(C4195af afVar) {
        this.f13620o.add(afVar);
        afVar.f13598h = this;
    }

    /* renamed from: A */
    public final /* bridge */ /* synthetic */ void mo8869A(View view) {
        for (int i = 0; i < this.f13620o.size(); i++) {
            ((C4195af) this.f13620o.get(i)).mo8869A(view);
        }
        this.f13595e.add(view);
    }

    /* renamed from: C */
    public final /* bridge */ /* synthetic */ void mo8871C(View view) {
        for (int i = 0; i < this.f13620o.size(); i++) {
            ((C4195af) this.f13620o.get(i)).mo8871C(view);
        }
        this.f13595e.remove(view);
    }

    /* renamed from: F */
    public final /* synthetic */ void mo8874F(long j) {
        this.f13591a = j;
    }

    /* renamed from: G */
    public final void mo8875G() {
        this.f13624s |= 2;
        int size = this.f13620o.size();
        for (int i = 0; i < size; i++) {
            ((C4195af) this.f13620o.get(i)).mo8875G();
        }
    }

    /* renamed from: H */
    public final void mo8872D(long j) {
        ArrayList arrayList;
        this.f13592b = j;
        if (this.f13592b >= 0 && (arrayList = this.f13620o) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4195af) this.f13620o.get(i)).mo8872D(j);
            }
        }
    }

    /* renamed from: I */
    public final void mo8905I(int i) {
        this.f13623r = i == 0;
    }

    /* renamed from: J */
    public final void mo8873E(TimeInterpolator timeInterpolator) {
        this.f13624s |= 1;
        ArrayList arrayList = this.f13620o;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4195af) this.f13620o.get(i)).mo8873E(timeInterpolator);
            }
        }
        this.f13593c = timeInterpolator;
    }

    /* renamed from: b */
    public final void mo8877b(C4206aq aqVar) {
        if (mo8899y(aqVar.f13626b)) {
            ArrayList arrayList = this.f13620o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C4195af afVar = (C4195af) arrayList.get(i);
                if (afVar.mo8899y(aqVar.f13626b)) {
                    afVar.mo8877b(aqVar);
                    aqVar.f13627c.add(afVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo8878c(C4206aq aqVar) {
        if (mo8899y(aqVar.f13626b)) {
            ArrayList arrayList = this.f13620o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C4195af afVar = (C4195af) arrayList.get(i);
                if (afVar.mo8899y(aqVar.f13626b)) {
                    afVar.mo8878c(aqVar);
                    aqVar.f13627c.add(afVar);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    /* renamed from: e */
    public final C4195af mo8907e(int i) {
        if (i < 0 || i >= this.f13620o.size()) {
            return null;
        }
        return (C4195af) this.f13620o.get(i);
    }

    /* renamed from: f */
    public final void mo8908f(C4195af afVar) {
        m12058K(afVar);
        long j = this.f13592b;
        if (j >= 0) {
            afVar.mo8872D(j);
        }
        if ((this.f13624s & 1) != 0) {
            afVar.mo8873E(this.f13593c);
        }
        if ((this.f13624s & 2) != 0) {
            afVar.mo8875G();
        }
        if ((this.f13624s & 4) != 0) {
            afVar.mo8896v(this.f13604n);
        }
        if ((this.f13624s & 8) != 0) {
            afVar.mo8895u(this.f13603m);
        }
    }

    /* renamed from: h */
    public final C4195af mo8881h() {
        C4202am amVar = (C4202am) super.clone();
        amVar.f13620o = new ArrayList();
        int size = this.f13620o.size();
        for (int i = 0; i < size; i++) {
            amVar.m12058K(((C4195af) this.f13620o.get(i)).clone());
        }
        return amVar;
    }

    /* renamed from: k */
    public final String mo8884k(String str) {
        String k = super.mo8884k(str);
        for (int i = 0; i < this.f13620o.size(); i++) {
            k = k + "\n" + ((C4195af) this.f13620o.get(i)).mo8884k(str.concat("  "));
        }
        return k;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo8885l() {
        super.mo8885l();
        int size = this.f13620o.size();
        for (int i = 0; i < size; i++) {
            ((C4195af) this.f13620o.get(i)).mo8885l();
        }
    }

    /* renamed from: m */
    public final void mo8886m(C4206aq aqVar) {
        int size = this.f13620o.size();
        for (int i = 0; i < size; i++) {
            ((C4195af) this.f13620o.get(i)).mo8886m(aqVar);
        }
    }

    /* renamed from: p */
    public final void mo8889p(ViewGroup viewGroup, C4207ar arVar, C4207ar arVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f13591a;
        int size = this.f13620o.size();
        int i = 0;
        while (i < size) {
            C4195af afVar = (C4195af) this.f13620o.get(i);
            if (j > 0) {
                if (!this.f13623r) {
                    if (i == 0) {
                        i = 0;
                    }
                }
                long j2 = afVar.f13591a;
                if (j2 > 0) {
                    afVar.mo8874F(j2 + j);
                } else {
                    afVar.mo8874F(j);
                }
            }
            afVar.mo8889p(viewGroup, arVar, arVar2, arrayList, arrayList2);
            i++;
        }
    }

    /* renamed from: r */
    public final void mo8891r(View view) {
        super.mo8891r(view);
        int size = this.f13620o.size();
        for (int i = 0; i < size; i++) {
            ((C4195af) this.f13620o.get(i)).mo8891r(view);
        }
    }

    /* renamed from: s */
    public final void mo8892s(View view) {
        super.mo8892s(view);
        int size = this.f13620o.size();
        for (int i = 0; i < size; i++) {
            ((C4195af) this.f13620o.get(i)).mo8892s(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo8893t() {
        if (!this.f13620o.isEmpty()) {
            C4201al alVar = new C4201al(this);
            ArrayList arrayList = this.f13620o;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C4195af) arrayList.get(i)).mo8900z(alVar);
            }
            this.f13621p = this.f13620o.size();
            if (!this.f13623r) {
                for (int i2 = 1; i2 < this.f13620o.size(); i2++) {
                    ((C4195af) this.f13620o.get(i2 - 1)).mo8900z(new C4200ak((C4195af) this.f13620o.get(i2)));
                }
                C4195af afVar = (C4195af) this.f13620o.get(0);
                if (afVar != null) {
                    afVar.mo8893t();
                    return;
                }
                return;
            }
            ArrayList arrayList2 = this.f13620o;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((C4195af) arrayList2.get(i3)).mo8893t();
            }
            return;
        }
        mo8897w();
        mo8890q();
    }

    /* renamed from: u */
    public final void mo8895u(C4193ad adVar) {
        this.f13603m = adVar;
        this.f13624s |= 8;
        int size = this.f13620o.size();
        for (int i = 0; i < size; i++) {
            ((C4195af) this.f13620o.get(i)).mo8895u(adVar);
        }
    }

    /* renamed from: v */
    public final void mo8896v(C4239x xVar) {
        super.mo8896v(xVar);
        this.f13624s |= 4;
        if (this.f13620o != null) {
            for (int i = 0; i < this.f13620o.size(); i++) {
                ((C4195af) this.f13620o.get(i)).mo8896v(xVar);
            }
        }
    }
}
