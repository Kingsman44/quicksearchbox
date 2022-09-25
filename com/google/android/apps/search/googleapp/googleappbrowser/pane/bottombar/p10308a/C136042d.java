package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10308a;

import android.view.View;
import com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.bottomsheetbehavior.LockableBottomSheetBehavior;
import com.google.android.material.bottomsheet.C44555f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.a.d */
/* compiled from: PG */
public final class C136042d extends C44555f implements C136039a {

    /* renamed from: a */
    private static final C59071e f370499a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.a.d");

    /* renamed from: b */
    private final Set f370500b = new HashSet();

    /* renamed from: c */
    private final LockableBottomSheetBehavior f370501c;

    /* renamed from: d */
    private boolean f370502d = false;

    /* renamed from: e */
    private int f370503e = 1;

    public C136042d(LockableBottomSheetBehavior lockableBottomSheetBehavior) {
        this.f370501c = lockableBottomSheetBehavior;
        this.f370503e = m220922v(lockableBottomSheetBehavior.f115862E);
    }

    /* renamed from: v */
    private final int m220922v(int i) {
        LockableBottomSheetBehavior lockableBottomSheetBehavior = this.f370501c;
        boolean z = lockableBottomSheetBehavior.f370626d;
        lockableBottomSheetBehavior.f370626d = false;
        switch (i) {
            case 1:
            case 2:
                return this.f370503e;
            case 3:
                return 7;
            case 4:
                return this.f370502d ? 4 : 3;
            case 5:
                return 2;
            case 6:
                return z ? 5 : 6;
            default:
                throw new AssertionError(i);
        }
    }

    /* renamed from: a */
    public final void mo32311a(View view, float f) {
        for (C136039a a : this.f370500b) {
            a.mo112532a(view, f);
        }
        if (f < 0.0f) {
            mo112549r(f);
        } else if (f == 0.0f) {
            mo112551t();
        } else {
            mo112547p(f);
            LockableBottomSheetBehavior lockableBottomSheetBehavior = this.f370501c;
            int height = view.getHeight();
            int i = lockableBottomSheetBehavior.f370625c;
            float A = ((i == 0 ? lockableBottomSheetBehavior.f115914y * ((float) height) : (float) i) - ((float) lockableBottomSheetBehavior.mo47504A())) / ((float) ((height - lockableBottomSheetBehavior.mo47504A()) - lockableBottomSheetBehavior.mo47523z()));
            ((C59052c) ((C59052c) f370499a.mo56224b()).mo56372aa(40670)).mo56389s("halfExpandedOffset : %s", Float.valueOf(A));
            if (f < A) {
                mo112550s(f);
            } else if (f == A) {
                mo112552u();
            } else {
                mo112548q(f);
            }
        }
    }

    /* renamed from: b */
    public final void mo32312b(View view, int i) {
        for (C136039a b : this.f370500b) {
            b.mo112533b(view, i);
        }
        boolean z = true;
        if (!(i == 2 || i == 1)) {
            int v = m220922v(i);
            int i2 = v - 1;
            if (v != 0) {
                switch (i2) {
                    case 1:
                        mo112539h(view);
                        break;
                    case 2:
                        mo112538g(view);
                        break;
                    case 3:
                        if (this.f370503e == 5) {
                            mo112537f(view);
                        }
                        mo112538g(view);
                        break;
                    case 4:
                        mo112546o(view);
                        mo112536e(view);
                        break;
                    case 5:
                        mo112546o(view);
                        mo112540i(view);
                        break;
                    case 6:
                        mo112542k(view);
                        int i3 = this.f370503e;
                        if (i3 != 5) {
                            if (i3 != 6) {
                                if (i3 == 3 || i3 == 4) {
                                    mo112544m(view);
                                    break;
                                }
                            } else {
                                mo112545n(view);
                                break;
                            }
                        } else {
                            mo112543l(view);
                            break;
                        }
                }
                this.f370503e = v;
            } else {
                throw null;
            }
        }
        if (i == 2) {
            z = this.f370502d;
        } else if (i != 1) {
            z = false;
        }
        this.f370502d = z;
    }

    /* renamed from: c */
    public final void mo112713c(C136039a aVar) {
        this.f370500b.add(aVar);
    }

    /* renamed from: e */
    public final void mo112536e(View view) {
        for (C136039a e : this.f370500b) {
            e.mo112536e(view);
        }
    }

    /* renamed from: f */
    public final void mo112537f(View view) {
        for (C136039a f : this.f370500b) {
            f.mo112537f(view);
        }
    }

    /* renamed from: g */
    public final void mo112538g(View view) {
        for (C136039a g : this.f370500b) {
            g.mo112538g(view);
        }
    }

    /* renamed from: h */
    public final void mo112539h(View view) {
        for (C136039a h : this.f370500b) {
            h.mo112539h(view);
        }
    }

    /* renamed from: i */
    public final void mo112540i(View view) {
        for (C136039a i : this.f370500b) {
            i.mo112540i(view);
        }
    }

    /* renamed from: j */
    public final void mo112541j() {
        for (C136039a j : this.f370500b) {
            j.mo112541j();
        }
    }

    /* renamed from: k */
    public final void mo112542k(View view) {
        for (C136039a k : this.f370500b) {
            k.mo112542k(view);
        }
    }

    /* renamed from: l */
    public final void mo112543l(View view) {
        for (C136039a l : this.f370500b) {
            l.mo112543l(view);
        }
    }

    /* renamed from: m */
    public final void mo112544m(View view) {
        for (C136039a m : this.f370500b) {
            m.mo112544m(view);
        }
    }

    /* renamed from: n */
    public final void mo112545n(View view) {
        for (C136039a n : this.f370500b) {
            n.mo112545n(view);
        }
    }

    /* renamed from: o */
    public final void mo112546o(View view) {
        for (C136039a o : this.f370500b) {
            o.mo112546o(view);
        }
    }

    /* renamed from: p */
    public final void mo112547p(float f) {
        for (C136039a p : this.f370500b) {
            p.mo112547p(f);
        }
    }

    /* renamed from: q */
    public final void mo112548q(float f) {
        for (C136039a q : this.f370500b) {
            q.mo112548q(f);
        }
    }

    /* renamed from: r */
    public final void mo112549r(float f) {
        for (C136039a r : this.f370500b) {
            r.mo112549r(f);
        }
    }

    /* renamed from: s */
    public final void mo112550s(float f) {
        for (C136039a s : this.f370500b) {
            s.mo112550s(f);
        }
    }

    /* renamed from: t */
    public final void mo112551t() {
        for (C136039a t : this.f370500b) {
            t.mo112551t();
        }
    }

    /* renamed from: u */
    public final void mo112552u() {
        for (C136039a u : this.f370500b) {
            u.mo112552u();
        }
    }
}
