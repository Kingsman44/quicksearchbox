package com.google.android.libraries.elements.p1714d.p1719e;

import android.view.View;
import com.google.android.libraries.elements.interfaces.C21242al;
import com.google.android.libraries.elements.interfaces.C21247aq;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21277bt;
import com.google.android.libraries.elements.interfaces.C21278bu;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.p1714d.p1718d.C20886h;
import com.google.protos.youtube.elements.C66260r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.p5497e.p5498a.C69826b;

/* renamed from: com.google.android.libraries.elements.d.e.aq */
/* compiled from: PG */
public final class C21011aq implements C21247aq, C21242al {

    /* renamed from: a */
    private final String f58891a;

    /* renamed from: b */
    private final C21259bb f58892b;

    /* renamed from: c */
    private final C21319z f58893c;

    /* renamed from: d */
    private final AtomicReference f58894d;

    /* renamed from: e */
    private final List f58895e;

    /* renamed from: f */
    private final List f58896f = new ArrayList();

    public C21011aq(AtomicReference atomicReference, List list, String str, C21259bb bbVar, C21319z zVar) {
        this.f58894d = atomicReference;
        this.f58895e = list;
        this.f58891a = str;
        this.f58892b = bbVar;
        this.f58893c = zVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo25924a(View view, View view2) {
        C21278bu buVar = (C21278bu) this.f58894d.get();
        if (buVar == null) {
            this.f58892b.mo25782a(C66260r.LOG_TYPE_INTERNAL_ERROR, "[IntersectionListener.onVisible] scrollStrategyListenerHolder is unavailable", this.f58893c, (Throwable) null);
            return;
        }
        view.setTag(333384171, this.f58891a);
        C69826b l = this.f58893c.mo26811l();
        if (l != null) {
            l.mo61462b(new C21010ap(this));
        }
        for (C20886h hVar : this.f58895e) {
            C21277bt a = buVar.mo26011a(this.f58891a, hVar);
            if (a != null) {
                this.f58896f.add(a);
            }
            hVar.f58579e.set(view);
        }
    }

    /* renamed from: b */
    public final void mo25925b(View view) {
        String str = (String) view.getTag(333384171);
        C21278bu buVar = (C21278bu) this.f58894d.get();
        if (!(buVar == null || str == null)) {
            buVar.mo26012b(str);
        }
        mo26104c();
        view.setTag(333384171, (Object) null);
    }

    /* renamed from: c */
    public final void mo26104c() {
        for (C20886h hVar : this.f58895e) {
            hVar.f58579e.set((Object) null);
        }
        for (C21277bt a : this.f58896f) {
            try {
                a.mo26035a();
            } catch (RuntimeException unused) {
                this.f58892b.mo25782a(C66260r.LOG_TYPE_INTERNAL_ERROR, "Error in cancelling intersection subscription.", this.f58893c, (Throwable) null);
            }
        }
        this.f58896f.clear();
    }
}
