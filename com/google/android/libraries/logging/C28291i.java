package com.google.android.libraries.logging;

import android.support.p033v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.logging.i */
/* compiled from: PG */
public final class C28291i {

    /* renamed from: a */
    public final C28290h f76967a;

    /* renamed from: b */
    public final RecyclerView f76968b;

    /* renamed from: c */
    public final List f76969c = new ArrayList();

    /* renamed from: d */
    public C28289g f76970d;

    /* renamed from: e */
    public C28288f f76971e;

    /* renamed from: f */
    public boolean f76972f;

    public C28291i(RecyclerView recyclerView, C28290h hVar) {
        this.f76968b = recyclerView;
        this.f76967a = hVar;
        recyclerView.addOnChildAttachStateChangeListener(new C28287e(this));
        this.f76972f = false;
    }

    /* renamed from: a */
    public final void mo33785a() {
        this.f76972f = true;
        for (C28291i a : this.f76969c) {
            a.mo33785a();
        }
    }

    /* renamed from: b */
    public final void mo33786b() {
        if (!this.f76972f) {
            this.f76968b.getViewTreeObserver().addOnGlobalLayoutListener(new C28286d(this));
        }
    }

    /* renamed from: c */
    public final void mo33787c() {
        this.f76972f = false;
        for (C28291i c : this.f76969c) {
            c.mo33787c();
        }
    }
}
