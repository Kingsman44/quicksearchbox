package com.google.android.apps.gsa.staticplugins.nowstream.shared;

import com.google.android.apps.gsa.shared.monet.p7114f.C90326d;
import com.google.android.apps.gsa.shared.monet.p7114f.C90327e;
import com.google.android.apps.gsa.sidekick.shared.monet.p7245a.C91764a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.b */
/* compiled from: PG */
public final class C105419b {

    /* renamed from: a */
    public final Set f294034a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    public boolean f294035b;

    /* renamed from: c */
    public boolean f294036c;

    /* renamed from: d */
    public boolean f294037d;

    /* renamed from: e */
    public boolean f294038e;

    /* renamed from: f */
    public int f294039f;

    /* renamed from: g */
    private final C90326d f294040g;

    /* renamed from: h */
    private final boolean f294041h;

    /* renamed from: i */
    private C90327e f294042i;

    /* renamed from: j */
    private boolean f294043j;

    /* renamed from: k */
    private boolean f294044k;

    public C105419b(C90326d dVar, boolean z) {
        this.f294040g = dVar;
        this.f294041h = z;
    }

    /* renamed from: a */
    public final void mo94779a(C91764a aVar) {
        C58838bb.m90883r(!this.f294034a.contains(aVar));
        if (this.f294042i == null) {
            C105387a aVar2 = new C105387a(this);
            this.f294042i = aVar2;
            this.f294040g.mo84011c(aVar2);
        }
        this.f294034a.add(aVar);
        if (this.f294044k) {
            aVar.mo86255a();
        } else {
            aVar.mo86256b();
        }
        if (this.f294037d) {
            aVar.mo86258d();
            if (this.f294038e) {
                aVar.mo86259e();
                return;
            }
            return;
        }
        aVar.mo86257c();
    }

    /* renamed from: b */
    public final void mo94780b() {
        int i = this.f294039f;
        boolean z = true;
        if ((i != 1 && (i != 2 || !this.f294043j)) || (!this.f294041h ? !this.f294035b : !this.f294036c)) {
            z = false;
        }
        if (this.f294037d != z) {
            this.f294037d = z;
            C58976aa aaVar = C58975e.f156826a;
            C58485gu j = C58485gu.m89842j(this.f294034a);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C91764a aVar = (C91764a) j.get(i2);
                if (z) {
                    aVar.mo86258d();
                    if (this.f294038e) {
                        aVar.mo86259e();
                    }
                } else {
                    if (this.f294038e) {
                        aVar.mo86260f();
                    }
                    aVar.mo86257c();
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo94781c(C91764a aVar) {
        C90327e eVar;
        this.f294034a.remove(aVar);
        if (this.f294034a.isEmpty() && (eVar = this.f294042i) != null) {
            this.f294040g.mo84018j(eVar);
            this.f294042i = null;
        }
    }

    /* renamed from: d */
    public final void mo94782d(boolean z) {
        if (this.f294044k != z) {
            this.f294044k = z;
            C58976aa aaVar = C58975e.f156826a;
            C58485gu j = C58485gu.m89842j(this.f294034a);
            int size = j.size();
            for (int i = 0; i < size; i++) {
                C91764a aVar = (C91764a) j.get(i);
                if (z) {
                    aVar.mo86255a();
                } else {
                    aVar.mo86256b();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo94783e(boolean z) {
        if (this.f294043j != z) {
            C58976aa aaVar = C58975e.f156826a;
            this.f294043j = z;
            mo94780b();
        }
    }
}
