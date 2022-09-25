package com.google.android.apps.search.googleapp.discover.streamui.impl.p10236c;

import android.view.View;
import com.google.android.apps.search.googleapp.discover.p10201m.C134470a;
import com.google.android.libraries.elements.interfaces.C21242al;
import com.google.android.libraries.elements.interfaces.C21247aq;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57139aw;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57151h;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.c.g */
/* compiled from: PG */
final class C134862g implements C21247aq, C21242al {

    /* renamed from: a */
    public final C134470a f367139a;

    /* renamed from: b */
    public final C57151h f367140b;

    /* renamed from: c */
    public final C57139aw f367141c;

    /* renamed from: d */
    private final C40480q f367142d;

    /* renamed from: e */
    private View f367143e;

    public C134862g(C134470a aVar, C57151h hVar, C57139aw awVar, C40480q qVar) {
        C69664n.m101061g(hVar, "agsaTooltipIdentifier");
        C69664n.m101061g(awVar, "triggerBehavior");
        this.f367139a = aVar;
        this.f367140b = hVar;
        this.f367141c = awVar;
        this.f367142d = qVar;
    }

    /* renamed from: a */
    public final void mo25924a(View view, View view2) {
        C69664n.m101061g(view, "lithoView");
        if (view2 != null) {
            this.f367143e = view2;
            this.f367142d.mo42465b(new C134861f(this, view2), "TooltipPropertiesOnVisible", new String[0]);
        }
    }

    /* renamed from: b */
    public final void mo25925b(View view) {
        C69664n.m101061g(view, "view");
        View view2 = this.f367143e;
        if (view2 != null) {
            this.f367139a.mo111797g(this.f367140b, view2);
        }
    }
}
