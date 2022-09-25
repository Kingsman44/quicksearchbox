package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.binaries.satin.app.aqc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.p1714d.p1724f.p1725a.C21081e;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.logging.p2185ve.synthetic.C28470n;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40111d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3121c.C40113f;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40165ak;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.C40211c;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3125b.p3126a.C40183a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40218a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3128d.C40219b;
import com.google.android.libraries.search.rendering.xuikit.bubbles.view.BubbleView;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63088z;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.b.l */
/* compiled from: PG */
public final class C40201l implements C40219b, C40218a {

    /* renamed from: a */
    public final C40192c f105618a;

    /* renamed from: b */
    public final C40192c f105619b;

    /* renamed from: c */
    public final C40182a f105620c;

    /* renamed from: d */
    public final C40183a f105621d;

    /* renamed from: e */
    public final C40113f f105622e;

    /* renamed from: f */
    public final C40218a f105623f;

    /* renamed from: g */
    public boolean f105624g = false;

    /* renamed from: h */
    private boolean f105625h = false;

    public C40201l(Context context, C40182a aVar, C40183a aVar2, aqc aqc, C28463g gVar, C28310af afVar, C40113f fVar, C28439i iVar, C40218a aVar3) {
        Context context2 = context;
        C40182a aVar4 = aVar;
        C28463g gVar2 = gVar;
        C28310af afVar2 = afVar;
        C28439i iVar2 = iVar;
        this.f105620c = aVar4;
        this.f105621d = aVar2;
        this.f105622e = fVar;
        this.f105623f = aVar3;
        C40111d d = fVar.mo42195d();
        if (aVar4.f105562b.put(d, new C21081e()) != null) {
            ((C59052c) ((C59052c) C40182a.f105561a.mo56226d()).mo56372aa(53280)).mo56386p("An existing Bubble Datastore has not been cleared properly.");
        }
        C21232ab abVar = (C21232ab) aVar4.f105562b.get(d);
        C40206q c = m69802c(fVar.mo42195d(), fVar.mo42199g(), fVar.mo42198f(), 2);
        C40206q c2 = m69802c(fVar.mo42195d(), fVar.mo42199g(), fVar.mo42198f(), 3);
        this.f105618a = aqc.mo66641a(c, fVar.mo42192a(), R.id.collapsed_bubble_fragment_view, new C40198i(context, gVar2, afVar2, iVar2), this);
        this.f105619b = aqc.mo66641a(c2, fVar.mo42192a(), R.id.extended_bubble_fragment_view, new C40199j(context, gVar2, afVar2, iVar2), this);
    }

    /* renamed from: c */
    private static C40206q m69802c(C40111d dVar, C56943g gVar, Map map, int i) {
        C40204o oVar = (C40204o) C40206q.f105631f.createBuilder();
        C63088z a = dVar.mo42184a();
        oVar.copyOnWrite();
        C40206q qVar = (C40206q) oVar.instance;
        a.getClass();
        qVar.f105633a |= 1;
        qVar.f105634b = a;
        oVar.copyOnWrite();
        C40206q qVar2 = (C40206q) oVar.instance;
        gVar.getClass();
        qVar2.f105635c = gVar;
        qVar2.f105633a |= 2;
        oVar.copyOnWrite();
        C40206q qVar3 = (C40206q) oVar.instance;
        C62995dn dnVar = qVar3.f105636d;
        if (!dnVar.f170058b) {
            qVar3.f105636d = dnVar.mo58980a();
        }
        qVar3.f105636d.putAll(map);
        oVar.copyOnWrite();
        C40206q qVar4 = (C40206q) oVar.instance;
        qVar4.f105637e = i - 1;
        qVar4.f105633a |= 4;
        return (C40206q) oVar.build();
    }

    /* renamed from: b */
    public final void mo42271b() {
        if (!this.f105625h) {
            this.f105625h = true;
            ((C40165ak) this.f105623f).f105510q.mo42179b(C40211c.REASON_ACCOUNT_CHANGED);
        }
    }

    /* renamed from: a */
    public static BubbleView m69801a(Context context, C28463g gVar, C28310af afVar, C28439i iVar, int i, int i2) {
        gVar.getClass();
        iVar.getClass();
        afVar.getClass();
        C28313c a = afVar.mo33805a(C28427h.m53115a(i2));
        gVar.mo33919c(iVar);
        C28439i a2 = C28470n.m53226a(iVar, a);
        BubbleView bubbleView = (BubbleView) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        C28439i iVar2 = bubbleView.f105747b;
        if (iVar2 != a2) {
            if (a2 != null) {
                C58838bb.m90884s(iVar2 == null, "Binding a new CVE to a CVE-bound BubbleView.");
            }
            bubbleView.f105747b = a2;
            bubbleView.mo42360a(bubbleView.getVisibility(), false);
        }
        return bubbleView;
    }
}
