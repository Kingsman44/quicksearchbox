package com.google.android.apps.search.pronunciationlearning.p10638ui.mic.logoview;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.mic.logoview.q */
/* compiled from: PG */
public final class C141495q {
    /* renamed from: a */
    public static final C141492n m229664a(int i) {
        if (i == 0) {
            return C141492n.f384065e;
        }
        if (i != 1) {
            if (i == 2) {
                return C141492n.f384066f;
            }
            if (i != 3) {
                throw new IllegalArgumentException("bad state group: " + i);
            }
        }
        return C141492n.f384061a;
    }

    /* renamed from: b */
    public static final C141492n m229665b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? C141492n.f384068h : C141492n.f384063c : C141492n.f384062b : C141492n.f384061a;
    }

    /* renamed from: c */
    public static final int m229666c(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        return i != 2 ? 2 : 1;
    }
}
