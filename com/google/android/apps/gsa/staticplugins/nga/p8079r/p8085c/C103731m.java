package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.content.ComponentName;
import android.media.session.MediaController;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80144bv;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80145bw;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80518o;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80519p;
import com.google.android.apps.gsa.search.core.google.p6790a.C85810bb;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3897e.p3917i.p3918a.C51447ia;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.protobuf.C62963cj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.m */
/* compiled from: PG */
public final /* synthetic */ class C103731m implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C103732n f288880a;

    /* renamed from: b */
    public final /* synthetic */ C80136bn f288881b;

    public /* synthetic */ C103731m(C103732n nVar, C80136bn bnVar) {
        this.f288880a = nVar;
        this.f288881b = bnVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C80519p pVar;
        C103732n nVar = this.f288880a;
        C80136bn bnVar = this.f288881b;
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        if (bnVar.f219917a == 22) {
            pVar = (C80519p) bnVar.f219918b;
        } else {
            pVar = C80519p.f221049c;
        }
        for (C80518o ordinal : new C62963cj(pVar.f221051a, C80519p.f221048b)) {
            C80518o oVar = C80518o.PARAM_UNKNOWN;
            int ordinal2 = ordinal.ordinal();
            if (ordinal2 == 0) {
                ((C58970a) ((C58970a) C103732n.f288882a.mo56225c()).mo56372aa(21617)).mo56386p("Invalid param requested.");
            } else if (ordinal2 == 1) {
                C52232kc kcVar = null;
                List<MediaController> activeSessions = nVar.f288885d.getActiveSessions((ComponentName) null);
                C0320v vVar = (activeSessions == null || activeSessions.isEmpty()) ? null : new C0320v(nVar.f288883b, MediaSessionCompat.Token.fromToken(activeSessions.get(0).getSessionToken()));
                if (nVar.f288886e.mo85405j(C90126fx.f251493jp)) {
                    C85810bb bbVar = nVar.f288884c;
                    boolean h = bbVar.mo79459h();
                    if (h || bbVar.f232036b.mo79746e(C90014bt.f247691lt)) {
                        ArrayList arrayList = new ArrayList();
                        C51447ia b = bbVar.mo79454b(vVar, h);
                        if (b != null) {
                            arrayList.add(b);
                        }
                        C51450id c = bbVar.mo79455c(arrayList, (Query) null, true);
                        if (c != null) {
                            kcVar = C85810bb.m137872f(c);
                        }
                    } else {
                        ((C59052c) ((C59052c) C85810bb.f232032a.mo56226d()).mo56372aa(7980)).mo56386p("Signed-out user adding partial media session info from mediacontroller not available.");
                    }
                } else {
                    kcVar = nVar.f288884c.mo79456d(vVar);
                }
                if (kcVar != null) {
                    ewVar.mo53792e(kcVar);
                }
            }
        }
        C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
        C80144bv bvVar = (C80144bv) C80145bw.f219932c.createBuilder();
        bvVar.copyOnWrite();
        C80145bw bwVar = (C80145bw) bvVar.instance;
        C52091ex exVar = (C52091ex) ewVar.build();
        exVar.getClass();
        bwVar.f219935b = exVar;
        bwVar.f219934a |= 1;
        buVar.copyOnWrite();
        C80275dd ddVar = (C80275dd) buVar.instance;
        C80145bw bwVar2 = (C80145bw) bvVar.build();
        bwVar2.getClass();
        ddVar.f220291b = bwVar2;
        ddVar.f220290a = 12;
        return (C80275dd) buVar.build();
    }
}
