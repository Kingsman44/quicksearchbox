package com.google.android.apps.search.googleapp.discover.p10195j;

import android.view.View;
import com.google.android.apps.search.googleapp.discover.p10166a.p10171c.C133987j;
import com.google.android.libraries.elements.interfaces.C21242al;
import com.google.android.libraries.elements.interfaces.C21247aq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57299d;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.j.m */
/* compiled from: PG */
final class C134441m implements C21247aq, C21242al {

    /* renamed from: a */
    private final C133987j f366161a;

    /* renamed from: b */
    private final C57299d f366162b;

    /* renamed from: c */
    private final int f366163c;

    public C134441m(C133987j jVar, C57299d dVar) {
        C69664n.m101061g(dVar, "actionPayload");
        this.f366161a = jVar;
        this.f366162b = dVar;
        this.f366163c = dVar.hashCode();
    }

    /* renamed from: a */
    public final void mo25924a(View view, View view2) {
        C69664n.m101061g(view, "lithoView");
        if (view2 != null) {
            C134440l.m218162a(view).put(this.f366162b, view2);
            this.f366161a.mo111504o(this.f366163c, view2, this.f366162b);
            return;
        }
        C59052c cVar = (C59052c) C134447s.f366171a.mo56226d();
        int i = this.f366163c;
        cVar.mo56379ah(new C59094n(40318));
        cVar.mo56387q("View with content key %s has view actions enabled, but there is no corresponding Elements view.", i);
    }

    /* renamed from: b */
    public final void mo25925b(View view) {
        C69664n.m101061g(view, "lithoView");
        Map a = C134440l.m218162a(view);
        View view2 = (View) a.get(this.f366162b);
        if (view2 != null) {
            this.f366161a.mo111503n(this.f366163c, view2);
            a.remove(this.f366162b);
        }
    }
}
