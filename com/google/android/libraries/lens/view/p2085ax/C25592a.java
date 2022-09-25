package com.google.android.libraries.lens.view.p2085ax;

import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.C119103al;
import com.google.common.p4522b.C58495hd;
import com.google.p440an.p441a.C8841h;

/* renamed from: com.google.android.libraries.lens.view.ax.a */
/* compiled from: PG */
final class C25592a extends C25603e {

    /* renamed from: a */
    public C58495hd f69627a;

    /* renamed from: b */
    public C8841h f69628b;

    /* renamed from: c */
    private C119103al f69629c;

    /* renamed from: a */
    public final C25604f mo30689a() {
        C58495hd hdVar;
        C119103al alVar = this.f69629c;
        if (alVar != null && (hdVar = this.f69627a) != null) {
            return new C25600b(alVar, hdVar, this.f69628b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f69629c == null) {
            sb.append(" speakrInput");
        }
        if (this.f69627a == null) {
            sb.append(" wordStartIndexPosition");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo30690b(C119103al alVar) {
        if (alVar != null) {
            this.f69629c = alVar;
            return;
        }
        throw new NullPointerException("Null speakrInput");
    }
}
