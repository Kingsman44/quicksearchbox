package com.google.android.apps.gsa.staticplugins.nowcards.p8116f;

import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C7900oc;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57418cp;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.f.x */
/* compiled from: PG */
public final class C104898x {

    /* renamed from: a */
    private final Map f292311a;

    public C104898x(Map map) {
        this.f292311a = map;
    }

    /* renamed from: a */
    public final void mo94386a(C57418cp cpVar, View view) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C7900oc.f27762d);
        cpVar.mo58887l(r0);
        if (!cpVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x d = C104858aa.f292218y.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PietPresenter");
            ((C59052c) ((C59052c) d).mo56372aa(22061)).mo56386p("Received log data with no recognized extensions for ve logging on frame");
            return;
        }
        C62940bt r02 = C62942bv.checkIsLite(C7900oc.f27762d);
        cpVar.mo58887l(r02);
        Object l = cpVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C7900oc ocVar = (C7900oc) obj;
        if ((ocVar.f27764a & 1) != 0) {
            C8178yk ykVar = ocVar.f27765b;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            if (!ykVar.f28742e) {
                Map map = this.f292311a;
                C8178yk ykVar2 = ocVar.f27765b;
                if (ykVar2 == null) {
                    ykVar2 = C8178yk.f28736g;
                }
                map.put(ykVar2, view);
            }
        }
    }

    /* renamed from: b */
    public final void mo94387b(C57418cp cpVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C7900oc.f27762d);
        cpVar.mo58887l(r0);
        if (!cpVar.f169962ag.mo58857o(r0.f169971d)) {
            C59104x d = C104858aa.f292218y.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PietPresenter");
            ((C59052c) ((C59052c) d).mo56372aa(22062)).mo56386p("Received log data with no recognized extensions for ve logging");
            return;
        }
        C62940bt r02 = C62942bv.checkIsLite(C7900oc.f27762d);
        cpVar.mo58887l(r02);
        Object l = cpVar.f169962ag.mo58854l(r02.f169971d);
        if (l == null) {
            obj = r02.f169969b;
        } else {
            obj = r02.mo58889c(l);
        }
        C7900oc ocVar = (C7900oc) obj;
        if ((ocVar.f27764a & 1) != 0) {
            C8178yk ykVar = ocVar.f27765b;
            if (ykVar == null) {
                ykVar = C8178yk.f28736g;
            }
            if (!ykVar.f28742e) {
                Map map = this.f292311a;
                C8178yk ykVar2 = ocVar.f27765b;
                if (ykVar2 == null) {
                    ykVar2 = C8178yk.f28736g;
                }
                map.remove(ykVar2);
            }
        }
    }
}
