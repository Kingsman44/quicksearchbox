package com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8160b.p8161a;

import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91858f;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.recycling.p1927c.C23296l;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.b.a.q */
/* compiled from: PG */
public final class C105738q implements C105740s {

    /* renamed from: a */
    public final Long f295095a;

    /* renamed from: b */
    public Map f295096b;

    /* renamed from: c */
    public Set f295097c;

    /* renamed from: d */
    public final /* synthetic */ C105741t f295098d;

    /* renamed from: e */
    private final C23296l f295099e;

    public C105738q(C105741t tVar, C23296l lVar, Long l) {
        this.f295098d = tVar;
        this.f295099e = lVar;
        this.f295095a = l;
    }

    /* renamed from: e */
    public static final View m176028e(C22939d dVar) {
        View il = dVar.mo28297il();
        ViewParent parent = il.getParent();
        return parent instanceof FrameLayout ? (FrameLayout) parent : il;
    }

    /* renamed from: a */
    public final Long mo95023a() {
        return this.f295095a;
    }

    /* renamed from: b */
    public final void mo95024b() {
        this.f295099e.f63788I.remove(this);
        Set<C22939d> set = this.f295097c;
        if (set != null) {
            for (C22939d e : set) {
                this.f295098d.f295103c.remove(m176028e(e));
            }
            set.clear();
        }
        Map map = this.f295096b;
        if (map != null) {
            for (C105738q b : map.values()) {
                b.mo95024b();
            }
            map.clear();
        }
    }

    /* renamed from: c */
    public final void mo95025c(C23296l lVar) {
        Long l = this.f295095a;
        if (l == null && (lVar instanceof C91858f)) {
            l = ((C91858f) lVar).mo86360l();
        }
        C105738q qVar = new C105738q(this.f295098d, lVar, l);
        qVar.mo95026d();
        if (this.f295096b == null) {
            this.f295096b = new HashMap();
        }
        this.f295096b.put(lVar, qVar);
    }

    /* renamed from: d */
    public final void mo95026d() {
        for (int i = 0; i < this.f295099e.f63764D.size(); i++) {
            C23296l lVar = (C23296l) this.f295099e.mo28775W(i);
            if (lVar != null) {
                mo95025c(lVar);
            }
        }
        this.f295099e.f63788I.add(this);
    }
}
