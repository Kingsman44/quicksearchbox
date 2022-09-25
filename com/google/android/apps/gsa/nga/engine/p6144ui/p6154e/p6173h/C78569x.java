package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80758ef;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.x */
/* compiled from: PG */
public final class C78569x extends C78523af {

    /* renamed from: a */
    public String f216319a;

    /* renamed from: b */
    public String f216320b;

    /* renamed from: c */
    private C80831aj f216321c;

    /* renamed from: d */
    private C80758ef f216322d;

    /* renamed from: e */
    private int f216323e;

    /* renamed from: a */
    public final C78526ai mo73451a() {
        String str;
        int i;
        C80831aj ajVar;
        C80758ef efVar;
        String str2 = this.f216319a;
        if (str2 != null && (str = this.f216320b) != null && (i = this.f216323e) != 0 && (ajVar = this.f216321c) != null && (efVar = this.f216322d) != null) {
            return new C78570y(str2, str, i, ajVar, efVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f216319a == null) {
            sb.append(" text");
        }
        if (this.f216320b == null) {
            sb.append(" bottomText");
        }
        if (this.f216323e == 0) {
            sb.append(" type");
        }
        if (this.f216321c == null) {
            sb.append(" clickAction");
        }
        if (this.f216322d == null) {
            sb.append(" privacyInputUi");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo73452b(C80831aj ajVar) {
        if (ajVar != null) {
            this.f216321c = ajVar;
            return;
        }
        throw new NullPointerException("Null clickAction");
    }

    /* renamed from: c */
    public final void mo73453c(C80758ef efVar) {
        if (efVar != null) {
            this.f216322d = efVar;
            return;
        }
        throw new NullPointerException("Null privacyInputUi");
    }

    /* renamed from: d */
    public final void mo73454d(String str) {
        if (str != null) {
            this.f216319a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }

    /* renamed from: e */
    public final void mo73455e(int i) {
        if (i != 0) {
            this.f216323e = i;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
