package com.google.android.apps.gsa.shared.util;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90747d;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.util.be */
/* compiled from: PG */
public final class C90761be implements C90991b {

    /* renamed from: d */
    private static final C59071e f253840d = C59071e.m91332i("com.google.android.apps.gsa.shared.util.be");

    /* renamed from: a */
    public final String[] f253841a;

    /* renamed from: b */
    public final C90747d f253842b;

    /* renamed from: c */
    public int f253843c;

    /* renamed from: e */
    private final SparseArray f253844e;

    /* renamed from: f */
    private final String f253845f;

    /* renamed from: g */
    private final boolean f253846g;

    /* renamed from: h */
    private final boolean f253847h;

    /* renamed from: i */
    private int f253848i;

    public C90761be(String str, String[] strArr, int i, boolean z, boolean z2, SparseArray sparseArray, boolean z3) {
        C90747d dVar;
        if (z2) {
            dVar = C90748e.m148223a(z3);
        } else {
            dVar = new C90747d();
        }
        this.f253841a = strArr;
        this.f253844e = sparseArray;
        str.getClass();
        this.f253845f = str;
        this.f253846g = z;
        this.f253842b = dVar;
        this.f253843c = i;
        this.f253847h = z3;
        if (z3) {
            C58976aa aaVar = C58975e.f156826a;
            String str2 = strArr[this.f253843c];
        }
    }

    /* renamed from: a */
    public final void mo85098a(String str) {
        if (!this.f253846g) {
            C59052c cVar = (C59052c) f253840d.mo56225c();
            cVar.mo56378ag(C58975e.f156826a, this.f253845f);
            ((C59052c) cVar.mo56372aa(11329)).mo56389s("%s", str);
            return;
        }
        String str2 = this.f253845f;
        throw new IllegalStateException(str2 + ":  " + str);
    }

    /* renamed from: b */
    public final void mo85099b(int i) {
        this.f253842b.mo85091a();
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f253844e.get(this.f253843c);
        if (sparseBooleanArray == null || sparseBooleanArray.indexOfKey(i) < 0) {
            String str = this.f253841a[this.f253843c];
            mo85098a("Illegal transition " + str + "->" + i);
        }
        if (this.f253847h) {
            C58976aa aaVar = C58975e.f156826a;
            String[] strArr = this.f253841a;
            String str2 = strArr[this.f253843c];
            String str3 = strArr[i];
        }
        this.f253848i = this.f253843c;
        this.f253843c = i;
    }

    /* renamed from: c */
    public final boolean mo85100c(int i) {
        this.f253842b.mo85091a();
        return this.f253843c == i;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("StateMachine");
        fVar.mo85279c("current state").mo85276a(C90752i.m148229c(this.f253841a[this.f253843c]));
        fVar.mo85279c("last state").mo85276a(C90752i.m148229c(this.f253841a[this.f253848i]));
    }

    public final String toString() {
        int i = this.f253843c;
        return "Current state=" + i;
    }
}
