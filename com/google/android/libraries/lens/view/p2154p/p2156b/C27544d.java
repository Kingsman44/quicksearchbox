package com.google.android.libraries.lens.view.p2154p.p2156b;

import android.graphics.Bitmap;
import android.util.Pair;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.lens.p4699e.C62231l;
import com.google.lens.p4707j.C62459ci;
import com.google.lens.p4707j.C62471cu;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56262bp;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56263bq;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56264br;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.p.b.d */
/* compiled from: PG */
public final class C27544d implements C27543c {

    /* renamed from: b */
    private static final C59071e f75329b = C59071e.m91332i("com.google.android.libraries.lens.view.p.b.d");

    /* renamed from: a */
    public C58833ax f75330a;

    /* renamed from: c */
    private final Set f75331c = Collections.synchronizedSet(new HashSet());

    /* renamed from: d */
    private C58833ax f75332d = C58836b.f156633a;

    public C27544d(C27232l lVar) {
        C62459ci ciVar;
        C58833ax axVar;
        C62459ci ciVar2;
        C62471cu v = lVar.mo32717v();
        if (v.f168678a == 1) {
            ciVar = (C62459ci) v.f168679b;
        } else {
            ciVar = C62459ci.f168655c;
        }
        if ((ciVar.f168657a & 1) != 0) {
            C56263bq bqVar = (C56263bq) C56264br.f149957d.createBuilder();
            C56262bp bpVar = C56262bp.CROPPING_VIEW;
            bqVar.copyOnWrite();
            C56264br brVar = (C56264br) bqVar.instance;
            brVar.f149961c = bpVar.f149956e;
            brVar.f149959a |= 1;
            C62471cu v2 = lVar.mo32717v();
            if (v2.f168678a == 1) {
                ciVar2 = (C62459ci) v2.f168679b;
            } else {
                ciVar2 = C62459ci.f168655c;
            }
            C62231l lVar2 = ciVar2.f168658b;
            bqVar.mo54346a(lVar2 == null ? C62231l.f168023e : lVar2);
            axVar = C58833ax.m90834k((C56264br) bqVar.build());
        } else {
            axVar = C58836b.f156633a;
        }
        this.f75330a = axVar;
    }

    /* renamed from: s */
    private static boolean m51324s(C58833ax axVar) {
        return axVar.mo56113h() && !((C56264br) axVar.mo56107c()).f149960b.isEmpty();
    }

    /* renamed from: a */
    public final /* synthetic */ C58833ax mo33098a() {
        C58833ax axVar = this.f75330a;
        if (axVar.mo56113h()) {
            C56262bp a = C56262bp.m87953a(((C56264br) axVar.mo56107c()).f149961c);
            if (a == null) {
                a = C56262bp.UNSPECIFIED;
            }
            if (a.equals(C56262bp.CROPPING_VIEW)) {
                return C27541a.m51301a(this);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: b */
    public final /* synthetic */ C58833ax mo33099b() {
        return C27541a.m51301a(this);
    }

    /* renamed from: c */
    public final C58833ax mo33100c() {
        return this.f75332d;
    }

    /* renamed from: d */
    public final C58833ax mo33101d() {
        return this.f75330a;
    }

    /* renamed from: e */
    public final /* synthetic */ C56262bp mo33102e() {
        C58833ax axVar = this.f75330a;
        if (!axVar.mo56113h()) {
            return C56262bp.UNSPECIFIED;
        }
        C56262bp a = C56262bp.m87953a(((C56264br) axVar.mo56107c()).f149961c);
        if (a == null) {
            return C56262bp.UNSPECIFIED;
        }
        return a;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo33103f(C27542b bVar) {
        mo33104g(bVar, true);
    }

    /* renamed from: g */
    public final void mo33104g(C27542b bVar, boolean z) {
        this.f75331c.add(bVar);
        if (z) {
            bVar.mo31214a(this.f75330a);
        }
    }

    /* renamed from: h */
    public final void mo33105h() {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo33106i() {
        C27541a.m51303c(this);
    }

    /* renamed from: j */
    public final void mo33107j() {
        this.f75332d = C58836b.f156633a;
    }

    /* renamed from: k */
    public final void mo33108k(Bitmap bitmap) {
        C58833ax.m90834k(bitmap);
    }

    /* renamed from: m */
    public final void mo33110m(Bitmap bitmap, C24226r rVar) {
        this.f75332d = C58833ax.m90834k(Pair.create(bitmap, rVar));
    }

    /* renamed from: n */
    public final boolean mo33111n() {
        return mo33112o(C56262bp.CROPPING_VIEW) || mo33112o(C56262bp.PREVIEW_CROPPED_DOCUMENT);
    }

    /* renamed from: o */
    public final boolean mo33112o(C56262bp bpVar) {
        C58833ax axVar = this.f75330a;
        if (!axVar.mo56113h()) {
            return false;
        }
        C56262bp a = C56262bp.m87953a(((C56264br) axVar.mo56107c()).f149961c);
        if (a == null) {
            a = C56262bp.UNSPECIFIED;
        }
        return a == bpVar;
    }

    /* renamed from: p */
    public final /* synthetic */ void mo33113p(C56262bp bpVar) {
        C56263bq b = C27541a.m51302b(this);
        b.copyOnWrite();
        C56264br brVar = (C56264br) b.instance;
        C56264br brVar2 = C56264br.f149957d;
        brVar.f149961c = bpVar.f149956e;
        brVar.f149959a |= 1;
        mo33115r(C58833ax.m90834k((C56264br) b.build()));
    }

    /* renamed from: q */
    public final /* synthetic */ void mo33114q(C62231l lVar) {
        C27541a.m51304d(this, lVar);
    }

    /* renamed from: r */
    public final void mo33115r(C58833ax axVar) {
        C58833ax axVar2 = this.f75330a;
        if (!m51324s(axVar2) || !m51324s(axVar) || !m51325t((C56264br) axVar2.mo56107c()) || m51325t((C56264br) axVar.mo56107c())) {
            ((C59052c) ((C59052c) f75329b.mo56224b()).mo56372aa(49307)).mo56389s("Updating Document State: %s", axVar);
            if (!axVar2.equals(axVar)) {
                this.f75330a = axVar;
                synchronized (this.f75331c) {
                    for (C27542b a : this.f75331c) {
                        a.mo31214a(this.f75330a);
                    }
                }
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) f75329b.mo56224b()).mo56372aa(49308)).mo56389s("Not updating document state because current state is manually edited: %s", axVar2.mo56107c());
    }

    /* renamed from: l */
    public final /* synthetic */ void mo33109l(C58833ax axVar) {
        if (axVar.mo56113h()) {
            C27541a.m51304d(this, (C62231l) axVar.mo56107c());
        } else {
            C27541a.m51303c(this);
        }
    }

    /* renamed from: t */
    private static boolean m51325t(C56264br brVar) {
        C62231l lVar;
        brVar.getClass();
        if (brVar.f149960b.isEmpty()) {
            lVar = C62231l.f168023e;
        } else {
            lVar = (C62231l) brVar.f149960b.get(0);
        }
        return lVar.f168028d;
    }
}
