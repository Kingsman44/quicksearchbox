package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9252b;

import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.widget.FrameLayout;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.b.an */
/* compiled from: PG */
final class C121917an extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ String f338318a;

    /* renamed from: b */
    final /* synthetic */ C121925av f338319b;

    /* renamed from: c */
    final /* synthetic */ C69626l f338320c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121917an(String str, C121925av avVar, C69626l lVar) {
        super(0);
        this.f338318a = str;
        this.f338319b = avVar;
        this.f338320c = lVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C59052c cVar = (C59052c) C121925av.f338328a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
        String str = this.f338318a;
        cVar.mo56379ah(new C59094n(36055));
        cVar.mo56389s("%s", str);
        C121925av avVar = this.f338319b;
        FragmentManager q = avVar.mo51122q();
        FrameLayout frameLayout = avVar.f338330c;
        if (frameLayout == null) {
            C69664n.m101065k("hostRootView");
            frameLayout = null;
        }
        Fragment b = q.f634a.mo670b(frameLayout.getId());
        if (b == null) {
            C59052c cVar2 = (C59052c) C121925av.f338328a.mo56224b();
            cVar2.mo56378ag(C58975e.f156826a, "INV.AssistLayer.Host");
            String str2 = this.f338318a;
            cVar2.mo56379ah(new C59094n(36056));
            cVar2.mo56389s("No fragment found, %s is not propagated", str2);
        } else {
            this.f338320c.mo5761a(b);
        }
        return C69788q.f186170a;
    }
}
