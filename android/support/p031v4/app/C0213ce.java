package android.support.p031v4.app;

import androidx.lifecycle.C2383n;
import java.util.ArrayList;

/* renamed from: android.support.v4.app.ce */
/* compiled from: PG */
public abstract class C0213ce {

    /* renamed from: e */
    public final ArrayList f809e = new ArrayList();

    /* renamed from: f */
    int f810f;

    /* renamed from: g */
    int f811g;

    /* renamed from: h */
    int f812h;

    /* renamed from: i */
    int f813i;

    /* renamed from: j */
    public int f814j;

    /* renamed from: k */
    boolean f815k;

    /* renamed from: l */
    boolean f816l = true;

    /* renamed from: m */
    String f817m;

    /* renamed from: n */
    int f818n;

    /* renamed from: o */
    CharSequence f819o;

    /* renamed from: p */
    int f820p;

    /* renamed from: q */
    CharSequence f821q;

    /* renamed from: r */
    ArrayList f822r;

    /* renamed from: s */
    ArrayList f823s;

    /* renamed from: t */
    public boolean f824t = false;

    /* renamed from: u */
    ArrayList f825u;

    @Deprecated
    public C0213ce() {
    }

    /* renamed from: a */
    public abstract int mo504a();

    /* renamed from: f */
    public abstract void mo509f();

    /* renamed from: g */
    public abstract void mo510g();

    /* renamed from: h */
    public void mo511h(int i, Fragment fragment, String str, int i2) {
        throw null;
    }

    /* renamed from: k */
    public void mo514k(Fragment fragment) {
        throw null;
    }

    /* renamed from: l */
    public void mo515l(Fragment fragment) {
        throw null;
    }

    /* renamed from: m */
    public void mo516m(Fragment fragment) {
        throw null;
    }

    /* renamed from: n */
    public void mo517n(Fragment fragment, C2383n nVar) {
        throw null;
    }

    /* renamed from: o */
    public void mo518o(Fragment fragment) {
        throw null;
    }

    /* renamed from: p */
    public void mo519p(Fragment fragment) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo684q(C0212cd cdVar) {
        this.f809e.add(cdVar);
        cdVar.f803d = this.f810f;
        cdVar.f804e = this.f811g;
        cdVar.f805f = this.f812h;
        cdVar.f806g = this.f813i;
    }

    /* renamed from: r */
    public final void mo685r(Fragment fragment, String str) {
        mo511h(0, fragment, str, 1);
    }

    /* renamed from: s */
    public final void mo686s(String str) {
        if (this.f816l) {
            this.f815k = true;
            this.f817m = str;
            return;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: t */
    public final void mo687t(Fragment fragment) {
        mo684q(new C0212cd(7, fragment));
    }

    /* renamed from: u */
    public final void mo688u() {
        if (!this.f815k) {
            this.f816l = false;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: w */
    public final void mo690w(Runnable runnable) {
        mo688u();
        if (this.f825u == null) {
            this.f825u = new ArrayList();
        }
        this.f825u.add(runnable);
    }

    /* renamed from: x */
    public final void mo691x(int i, int i2, int i3, int i4) {
        this.f810f = i;
        this.f811g = i2;
        this.f812h = i3;
        this.f813i = i4;
    }

    /* renamed from: v */
    public final void mo689v(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo511h(i, fragment, str, 2);
            return;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public C0213ce(byte[] bArr) {
    }
}
