package com.google.android.apps.gsa.staticplugins.nowcards.p8116f;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.p2460r.p2469c.p2470a.C32060c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4283bv.p4354e.p4367c.p4368a.C57366ar;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.f.c */
/* compiled from: PG */
final class C104877c implements C32060c {

    /* renamed from: a */
    private static final C59071e f292275a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowcards.f.c");

    /* renamed from: b */
    private final Context f292276b;

    /* renamed from: c */
    private final Map f292277c;

    public C104877c(Context context, Map map) {
        this.f292276b = context;
        this.f292277c = map;
    }

    /* renamed from: a */
    public final View mo37845a(C57366ar arVar) {
        C32060c cVar;
        C62921ba a = C62921ba.m95368a();
        for (Integer num : this.f292277c.keySet()) {
            if (a.mo58830c(arVar, num.intValue()) != null) {
                C62940bt r3 = C62942bv.checkIsLite(a.mo58830c(arVar, num.intValue()));
                arVar.mo58887l(r3);
                if (arVar.f169962ag.mo58857o(r3.f169971d) && (cVar = (C32060c) this.f292277c.get(num)) != null) {
                    return cVar.mo37845a(arVar);
                }
            }
        }
        C59104x d = f292275a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PietCustomElementProvid");
        ((C59052c) ((C59052c) d).mo56372aa(22057)).mo56386p("No CustomElementProvider for the given extension field number key was found.");
        return new View(this.f292276b);
    }

    /* renamed from: b */
    public final void mo37846b(View view, C57366ar arVar) {
        C32060c cVar;
        C62921ba a = C62921ba.m95368a();
        for (Integer num : this.f292277c.keySet()) {
            if (a.mo58830c(arVar, num.intValue()) != null) {
                C62940bt r3 = C62942bv.checkIsLite(a.mo58830c(arVar, num.intValue()));
                arVar.mo58887l(r3);
                if (arVar.f169962ag.mo58857o(r3.f169971d) && (cVar = (C32060c) this.f292277c.get(num)) != null) {
                    cVar.mo37846b(view, arVar);
                    return;
                }
            }
        }
        C59104x d = f292275a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PietCustomElementProvid");
        ((C59052c) ((C59052c) d).mo56372aa(22058)).mo56386p("No CustomElementProvider for the given extension field number key was found.");
    }
}
