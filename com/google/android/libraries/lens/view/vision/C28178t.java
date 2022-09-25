package com.google.android.libraries.lens.view.vision;

import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.vision.t */
/* compiled from: PG */
public abstract class C28178t {
    /* renamed from: a */
    public abstract C28179u mo33637a();

    /* renamed from: b */
    public abstract void mo33638b(boolean z);

    /* renamed from: c */
    public abstract void mo33639c(float f);

    /* renamed from: d */
    public abstract void mo33640d(float f);

    /* renamed from: e */
    public abstract void mo33641e(C25349y yVar);

    /* renamed from: f */
    public abstract void mo33642f(boolean z);

    /* renamed from: g */
    public abstract void mo33643g(boolean z);

    /* renamed from: h */
    public abstract void mo33644h(C58485gu guVar);

    /* renamed from: i */
    public abstract void mo33645i(boolean z);

    /* renamed from: j */
    public abstract void mo33646j(float f);

    /* renamed from: k */
    public abstract void mo33647k(float f);

    /* renamed from: l */
    public abstract void mo33648l(float f);

    /* renamed from: m */
    public abstract void mo33649m(boolean z);

    /* renamed from: n */
    public abstract void mo33650n(long j);

    /* renamed from: o */
    public abstract void mo33651o(boolean z);

    /* renamed from: p */
    public abstract void mo33652p(float f);

    /* renamed from: q */
    public abstract void mo33653q(float f);

    /* renamed from: r */
    public final C28179u mo33696r() {
        C28179u a = mo33637a();
        boolean z = false;
        C58838bb.m90883r(a.mo33679u().isEmpty() || a.mo33679u().size() == 8);
        if (a.mo33664h() >= 0) {
            z = true;
        }
        C58838bb.m90884s(z, "Every TrackableBoxState must have a id >= 0.");
        return a;
    }
}
