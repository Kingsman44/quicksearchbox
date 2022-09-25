package com.google.android.libraries.play.unison.binding;

import android.support.p033v7.p040e.C0430l;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.search.podcasts.p10600q.C140946e;
import com.google.android.libraries.play.p2446b.p2447a.C31950a;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.play.unison.binding.ap */
/* compiled from: PG */
final class C31967ap extends C0640fb implements C31970as {

    /* renamed from: a */
    public final C31998x f85950a;

    /* renamed from: b */
    public final C31998x f85951b;

    /* renamed from: c */
    public final C31958ag f85952c;

    /* renamed from: d */
    public final C0430l f85953d;

    /* renamed from: e */
    public C31955ad f85954e = C31953ab.f85936a;

    /* renamed from: f */
    public C31955ad[] f85955f;

    /* renamed from: g */
    public int f85956g;

    /* renamed from: h */
    final /* synthetic */ C31969ar f85957h;

    /* renamed from: i */
    public C140946e f85958i;

    /* renamed from: j */
    private int f85959j = -1;

    public C31967ap(C31969ar arVar, C31998x xVar, C31998x xVar2, C31958ag agVar) {
        this.f85957h = arVar;
        C58485gu.m89845m();
        this.f85950a = xVar;
        this.f85951b = xVar2;
        this.f85952c = agVar;
        this.f85953d = new C31966ao(this);
        this.f85955f = C31965an.m59555a(0);
        setHasStableIds(false);
    }

    /* renamed from: d */
    private final C31955ad m59560d(int i) {
        C31955ad adVar = m59561e(i) ? this.f85954e : this.f85955f[i];
        if (adVar != null) {
            return adVar;
        }
        C31969ar arVar = this.f85957h;
        C31955ad c = arVar.mo37728c(arVar.f85941b, m59562f().f382699a.get(i));
        this.f85955f[i] = c;
        return c;
    }

    /* renamed from: e */
    private final boolean m59561e(int i) {
        return i == mo37733b() && this.f85954e.mo37726b();
    }

    /* renamed from: f */
    private final C140946e m59562f() {
        C140946e eVar = this.f85958i;
        C31950a.m59524a(eVar, "RecyclerViewBindable is not bound");
        return eVar;
    }

    /* renamed from: a */
    public final int mo37732a() {
        return this.f85959j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo37733b() {
        C140946e eVar = this.f85958i;
        if (eVar != null) {
            return eVar.f382699a.size();
        }
        return 0;
    }

    /* renamed from: c */
    public final RecyclerView mo37734c() {
        return (RecyclerView) this.f85957h.mo37744f();
    }

    public final int getItemCount() {
        return mo37733b() + (this.f85954e.mo37726b() ? 1 : 0);
    }

    public final long getItemId(int i) {
        if (m59561e(i)) {
            return -1;
        }
        throw null;
    }

    public final int getItemViewType(int i) {
        return m59560d(i).mo37727c().f85972a;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C31968aq aqVar = (C31968aq) ghVar;
        throw new UnsupportedOperationException("Unexpected call to onBindViewHolder(ViewHolder, int); expected all calls to reach onBindViewHolder(ViewHolder, int, List)");
    }

    public final /* synthetic */ void onBindViewHolder$ar$ds(C0673gh ghVar, int i) {
        Object obj;
        boolean z;
        C31968aq aqVar = (C31968aq) ghVar;
        boolean e = m59561e(i);
        Object obj2 = null;
        if (e) {
            obj = null;
        } else {
            obj = m59562f().f382699a.get(i);
            C31950a.m59524a(obj, "RecyclerViewBindable list cannot contain null items");
        }
        this.f85959j = i;
        try {
            C31969ar arVar = this.f85957h;
            C31956ae aeVar = aqVar.f85960a;
            C31955ad d = m59560d(i);
            C31956ae aeVar2 = (!d.mo37726b() || d.mo37727c() != aeVar.f85940b) ? null : aeVar;
            if (aeVar2 != null) {
                C31978d dVar = aeVar2.f85939a;
                Object a = d.mo37725a();
                if (obj != null) {
                    obj2 = arVar.f85943d.mo37739a(obj);
                }
                arVar.mo37742e(dVar, a, obj2);
                z = true;
            } else {
                C31951a.m59536b(aeVar.f85939a);
                z = false;
            }
            if (e) {
                C58838bb.m90885t(z, "Unexpected failure when binding trailing item at position %s; do not share a RecycledViewPool among RecyclerViewBindables using different Projector instances", i);
            } else {
                C58838bb.m90889x(z, "Unexpected failure when binding list item %s at position %s; do not share a RecycledViewPool among RecyclerViewBindables using different Projector instances", obj.getClass().getSimpleName(), i);
            }
        } finally {
            C58485gu.m89845m();
            this.f85959j = -1;
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C31969ar arVar = this.f85957h;
        C31975ax axVar = (C31975ax) arVar.f85942c.mo3726e(i);
        C31950a.m59524a(axVar, "unseen itemViewType");
        ViewGroup viewGroup2 = (ViewGroup) arVar.mo37744f();
        return new C31968aq(new C31956ae(axVar, axVar.f85973b.mo37748a(LayoutInflater.from(viewGroup2.getContext()).inflate(axVar.f85972a, viewGroup2, false))));
    }

    public final /* synthetic */ boolean onFailedToRecycleView(C0673gh ghVar) {
        C31951a.m59536b(((C31968aq) ghVar).f85960a.f85939a);
        return false;
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        C31951a.m59536b(((C31968aq) ghVar).f85960a.f85939a);
    }
}
