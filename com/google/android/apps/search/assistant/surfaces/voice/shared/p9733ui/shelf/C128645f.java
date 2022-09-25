package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.shelf;

import android.view.View;
import androidx.core.p098j.C2097l;
import androidx.core.p098j.C2098m;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128565a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9734a.C128567c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.shelf.f */
/* compiled from: PG */
final class C128645f extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C128646g f353659a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C128645f(C128646g gVar) {
        super(1);
        this.f353659a = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C128565a aVar = (C128565a) obj;
        C69664n.m101061g(aVar, "insets");
        C128646g gVar = this.f353659a;
        View view = gVar.f353661b;
        int i = C128567c.m209820c(aVar.f353517a).f5823d;
        C2098m q = aVar.f353517a.f5994b.mo5234q();
        int max = Math.max(i, q != null ? C2097l.m5779c(q.f6013a) : 0);
        int i2 = C128567c.m209820c(aVar.f353517a).f5821b;
        C2098m q2 = aVar.f353517a.f5994b.mo5234q();
        int max2 = Math.max(i2, q2 != null ? C2097l.m5778b(q2.f6013a) : 0);
        C59052c cVar = (C59052c) C128646g.f353660a.mo56224b();
        Object a = gVar.f353662c.mo5672a();
        Integer valueOf = Integer.valueOf(max2);
        Integer valueOf2 = Integer.valueOf(max);
        cVar.mo56379ah(new C59094n(37921));
        cVar.mo56359L("Center View [%s]. LeftFinalInset: %s, RightFinalInset: %s", a, valueOf, valueOf2);
        view.setPadding(max2, 0, max, 0);
        return C69788q.f186170a;
    }
}
