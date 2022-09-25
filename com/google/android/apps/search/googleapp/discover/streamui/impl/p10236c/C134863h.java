package com.google.android.apps.search.googleapp.discover.streamui.impl.p10236c;

import com.facebook.litho.C6405o;
import com.facebook.litho.C6411u;
import com.google.android.apps.search.googleapp.discover.p10201m.C134470a;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57137au;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57139aw;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57140ax;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57151h;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.youtube.elements.C66260r;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.c.h */
/* compiled from: PG */
public final class C134863h implements C21270bm {

    /* renamed from: a */
    private final C134470a f367144a;

    /* renamed from: b */
    private final C21259bb f367145b;

    /* renamed from: c */
    private final C40480q f367146c;

    public C134863h(C134470a aVar, C21259bb bbVar, C40480q qVar) {
        this.f367144a = aVar;
        this.f367145b = bbVar;
        this.f367146c = qVar;
    }

    /* renamed from: a */
    public final C62917ay mo25837a() {
        C62940bt btVar = C57140ax.f152521d;
        C69664n.m101060f(btVar, "tooltipProperties");
        return btVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        Object obj2;
        C57140ax axVar = (C57140ax) obj;
        C69664n.m101061g(uVar, "context");
        C69664n.m101061g(zVar, "conversionContext");
        C69664n.m101061g(axVar, "tooltipProperties");
        C69664n.m101061g(arVar, "elementBuilder");
        C57137au auVar = axVar.f152523a;
        if (auVar == null) {
            auVar = C57137au.f152511a;
        }
        C62940bt r4 = C62942bv.checkIsLite(C57151h.f152574c);
        auVar.mo58887l(r4);
        if (auVar.f169962ag.mo58857o(r4.f169971d)) {
            C57137au auVar2 = axVar.f152523a;
            if (auVar2 == null) {
                auVar2 = C57137au.f152511a;
            }
            C62940bt r7 = C62942bv.checkIsLite(C57151h.f152574c);
            auVar2.mo58887l(r7);
            Object l = auVar2.f169962ag.mo58854l(r7.f169971d);
            if (l == null) {
                obj2 = r7.f169969b;
            } else {
                obj2 = r7.mo58889c(l);
            }
            C69664n.m101060f(obj2, "tooltipProperties.getToo…er.agsaTooltipIdentifier)");
            C57151h hVar = (C57151h) obj2;
            if (hVar.f152576a != 0) {
                C57139aw a = C57139aw.m88264a(axVar.f152524b);
                if (a == null) {
                    a = C57139aw.UNSPECIFIED;
                }
                if (a != C57139aw.UNSPECIFIED) {
                    int i = hVar.f152576a;
                    C57139aw a2 = C57139aw.m88264a(axVar.f152524b);
                    if (a2 == null) {
                        a2 = C57139aw.UNSPECIFIED;
                    }
                    C69664n.m101060f(a2, "tooltipProperties.getTriggerBehavior()");
                    arVar.mo25928E().mo13438V();
                    C6405o E = arVar.mo25928E();
                    E.mo13424H("2131431532" + i);
                    C134862g gVar = new C134862g(this.f367144a, hVar, a2, this.f367146c);
                    arVar.mo25948v(gVar);
                    arVar.mo25940n(gVar);
                    return;
                }
                this.f367145b.mo25782a(C66260r.LOG_TYPE_MISSING_FIELD, "The provided TooltipProperties has not specified a TriggerBehavior.", zVar, (Throwable) null);
                return;
            }
            this.f367145b.mo25782a(C66260r.LOG_TYPE_MISSING_FIELD, "The provided AgsaTooltipIdentifier does not have a tooltip id.", zVar, (Throwable) null);
            return;
        }
        this.f367145b.mo25782a(C66260r.LOG_TYPE_MISSING_FIELD, "The provided TooltipProperties do not have an AgsaTooltipIdentifier extension.", zVar, (Throwable) null);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
        throw null;
    }
}
