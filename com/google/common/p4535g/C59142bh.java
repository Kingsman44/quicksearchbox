package com.google.common.p4535g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.common.g.bh */
/* compiled from: PG */
public final class C59142bh {

    /* renamed from: a */
    public final List f157175a = new ArrayList();

    /* renamed from: b */
    private boolean f157176b = true;

    /* renamed from: c */
    public static C59141bg m91686c(C59136bb bbVar) {
        return new C59141bg(C59226t.m91939t(bbVar), bbVar);
    }

    /* renamed from: a */
    public final C59126as mo56514a() {
        if (!this.f157176b) {
            Collections.sort(this.f157175a);
            this.f157176b = true;
        }
        return new C59126as(this.f157175a);
    }

    /* renamed from: b */
    public final void mo56515b(C59141bg bgVar) {
        this.f157176b = false;
        this.f157175a.add(bgVar);
    }
}
