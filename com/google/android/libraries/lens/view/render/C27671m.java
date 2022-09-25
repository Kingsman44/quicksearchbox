package com.google.android.libraries.lens.view.render;

import android.content.Context;
import com.google.p3723ar.imp.view.C48008r;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.render.m */
/* compiled from: PG */
public final class C27671m extends C48008r {

    /* renamed from: a */
    public final List f75550a = new ArrayList();

    public C27671m(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo33160a(C27670l lVar) {
        this.f75550a.add(lVar);
    }

    public final void invalidate() {
        for (C27670l a : this.f75550a) {
            a.mo31807a();
        }
        super.invalidate();
    }
}
