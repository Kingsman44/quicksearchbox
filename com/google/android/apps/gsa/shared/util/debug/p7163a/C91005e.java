package com.google.android.apps.gsa.shared.util.debug.p7163a;

import com.google.android.apps.gsa.shared.util.p7158b.C90752i;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.e */
/* compiled from: PG */
public final class C91005e {

    /* renamed from: a */
    private final boolean f254231a;

    /* renamed from: b */
    private final StringBuilder f254232b;

    /* renamed from: c */
    private final StringBuilder f254233c;

    public C91005e(boolean z, StringBuilder sb, StringBuilder sb2) {
        this.f254231a = z;
        this.f254232b = sb;
        this.f254233c = sb2;
    }

    /* renamed from: a */
    public final void mo85276a(C90752i iVar) {
        mo85277b("%s", iVar);
    }

    /* renamed from: b */
    public final void mo85277b(String str, C90752i... iVarArr) {
        this.f254232b.append(C91006f.m148647h(this.f254231a, str, iVarArr));
        StringBuilder sb = this.f254233c;
        if (sb != null) {
            sb.append(C91006f.m148647h(true, str, iVarArr));
        }
    }
}
