package android.support.p033v7.widget;

import androidx.p060c.C0981k;
import androidx.p060c.C0984n;

/* renamed from: android.support.v7.widget.jj */
/* compiled from: PG */
final class C0756jj {

    /* renamed from: a */
    final C0984n f2642a = new C0984n(0);

    /* renamed from: b */
    final C0981k f2643b = new C0981k(10);

    /* renamed from: a */
    public final C0645fg mo3263a(C0673gh ghVar, int i) {
        C0755ji jiVar;
        C0645fg fgVar;
        int d = this.f2642a.mo3701d(ghVar);
        if (d >= 0 && (jiVar = (C0755ji) this.f2642a.mo3708h(d)) != null) {
            int i2 = jiVar.f2639b;
            if ((i2 & i) != 0) {
                int i3 = (i ^ -1) & i2;
                jiVar.f2639b = i3;
                if (i == 4) {
                    fgVar = jiVar.f2640c;
                } else if (i == 8) {
                    fgVar = jiVar.f2641d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f2642a.mo3704f(d);
                    C0755ji.m2548c(jiVar);
                }
                return fgVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo3264b(C0673gh ghVar) {
        C0755ji jiVar = (C0755ji) this.f2642a.get(ghVar);
        if (jiVar == null) {
            jiVar = C0755ji.m2546a();
            this.f2642a.put(ghVar, jiVar);
        }
        jiVar.f2639b |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo3265c(C0673gh ghVar, C0645fg fgVar) {
        C0755ji jiVar = (C0755ji) this.f2642a.get(ghVar);
        if (jiVar == null) {
            jiVar = C0755ji.m2546a();
            this.f2642a.put(ghVar, jiVar);
        }
        jiVar.f2641d = fgVar;
        jiVar.f2639b |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo3266d(C0673gh ghVar, C0645fg fgVar) {
        C0755ji jiVar = (C0755ji) this.f2642a.get(ghVar);
        if (jiVar == null) {
            jiVar = C0755ji.m2546a();
            this.f2642a.put(ghVar, jiVar);
        }
        jiVar.f2640c = fgVar;
        jiVar.f2639b |= 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo3267e() {
        this.f2642a.clear();
        this.f2643b.mo3681h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo3268f(C0673gh ghVar) {
        C0755ji jiVar = (C0755ji) this.f2642a.get(ghVar);
        if (jiVar != null) {
            jiVar.f2639b &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo3269g(C0673gh ghVar) {
        int c = this.f2643b.mo3675c();
        while (true) {
            c--;
            if (c >= 0) {
                if (ghVar == this.f2643b.mo3680g(c)) {
                    this.f2643b.mo3684k(c);
                    break;
                }
            } else {
                break;
            }
        }
        C0755ji jiVar = (C0755ji) this.f2642a.remove(ghVar);
        if (jiVar != null) {
            C0755ji.m2548c(jiVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo3270h(C0673gh ghVar) {
        C0755ji jiVar = (C0755ji) this.f2642a.get(ghVar);
        return (jiVar == null || (jiVar.f2639b & 1) == 0) ? false : true;
    }
}
