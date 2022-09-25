package com.google.android.apps.gsa.search.core.p6775c.p6776a;

import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88507a;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88508b;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;

/* renamed from: com.google.android.apps.gsa.search.core.c.a.c */
/* compiled from: PG */
public final class C85680c {

    /* renamed from: a */
    public final C88512f f231649a;

    /* renamed from: b */
    public final C88507a f231650b;

    /* renamed from: c */
    public C88508b f231651c;

    /* renamed from: d */
    public int f231652d;

    public C85680c(C88512f fVar, C88507a aVar) {
        this.f231649a = fVar;
        this.f231650b = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo79251a() {
        return this.f231652d == 2 && this.f231651c != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo79252b() {
        return this.f231651c != null && this.f231652d == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardData {controller=");
        sb.append(this.f231650b);
        sb.append(", view=");
        sb.append(this.f231651c);
        sb.append(", state=");
        int i = this.f231652d;
        if (i == 0) {
            sb.append("show_pending");
        } else if (i != 1) {
            sb.append("remove_pending");
        } else {
            sb.append("shown");
        }
        sb.append("}");
        return sb.toString();
    }
}
