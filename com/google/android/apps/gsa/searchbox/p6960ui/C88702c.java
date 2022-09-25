package com.google.android.apps.gsa.searchbox.p6960ui;

import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89207l;
import com.google.android.apps.gsa.shared.util.p7170h.C91040a;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41704d;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.c */
/* compiled from: PG */
public final class C88702c implements C89200e, C89199d, C89207l {

    /* renamed from: a */
    public boolean f239826a;

    /* renamed from: b */
    private C88709j f239827b;

    /* renamed from: c */
    private C41704d f239828c;

    /* renamed from: b */
    public final void mo82425b(String str) {
        boolean z = false;
        if (this.f239827b.f239878d && C91040a.m148715a(str)) {
            z = true;
        }
        this.f239826a = z;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        this.f239828c = ((C88715p) obj).f239941m;
    }

    /* renamed from: e */
    public final void mo78004e() {
        mo82425b(this.f239828c.mo44287a().toString());
    }

    /* renamed from: hD */
    public final /* synthetic */ void mo82217hD(Object obj) {
        this.f239827b = (C88709j) obj;
    }
}
