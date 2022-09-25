package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.base.C58880cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.j */
/* compiled from: PG */
public final class C90974j {

    /* renamed from: a */
    public final List f254185a = new ArrayList();

    /* renamed from: b */
    private int f254186b;

    /* renamed from: f */
    private final String m148596f() {
        return C58880cq.m90966b("  ", Math.max(0, this.f254186b));
    }

    /* renamed from: a */
    public final void mo85257a(String str) {
        this.f254185a.add(String.format("%s%s", new Object[]{m148596f(), str}));
    }

    /* renamed from: b */
    public final void mo85258b(String str) {
        this.f254185a.add(String.format("%s%s:", new Object[]{m148596f(), str}));
    }

    /* renamed from: c */
    public final void mo85259c(String str, String str2) {
        this.f254185a.add(String.format("%s%s: %s", new Object[]{m148596f(), str, str2}));
    }

    /* renamed from: d */
    public final void mo85260d() {
        this.f254186b--;
    }

    /* renamed from: e */
    public final void mo85261e() {
        this.f254186b++;
    }
}
