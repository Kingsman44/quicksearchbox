package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6519al.p6598bl.C84885a;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88128qe;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88130qg;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.ay */
/* compiled from: PG */
public final class C107873ay implements C107874az {

    /* renamed from: a */
    public static final C59071e f300161a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.ay");

    /* renamed from: b */
    public final C84885a f300162b;

    /* renamed from: c */
    public final C68214a f300163c;

    /* renamed from: d */
    public final C22871g f300164d;

    public C107873ay(C84885a aVar, C68214a aVar2, C22871g gVar) {
        this.f300162b = aVar;
        this.f300163c = aVar2;
        this.f300164d = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final boolean mo96322b(ClientEventData clientEventData) {
        Object obj;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal == 200) {
            C58976aa aaVar = C58975e.f156826a;
            new C90873ag(this.f300162b.mo78559a(), this.f300164d, "sendServiceEvent", new C107871aw(this)).mo85223a(C107872ax.f300160a);
            return true;
        } else if (ordinal != 201) {
            return true;
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            C62940bt btVar = C88128qe.f238239a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r0);
            if (!bwVar.f169962ag.mo58857o(r0.f169971d)) {
                C59104x d = f300161a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NotificationSubCtrl");
                ((C59052c) ((C59052c) d).mo56372aa(26273)).mo56386p("OpaSendReplyToNotificationEvent extension is missing. Bail out.");
                return true;
            }
            C62940bt btVar2 = C88128qe.f238239a;
            C87741bw bwVar2 = clientEventData.f236955a;
            C62940bt r02 = C62942bv.checkIsLite(btVar2);
            bwVar2.mo58887l(r02);
            Object l = bwVar2.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C88130qg qgVar = (C88130qg) obj;
            if (qgVar == null) {
                C59104x d2 = f300161a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "NotificationSubCtrl");
                ((C59052c) ((C59052c) d2).mo56372aa(26272)).mo56386p("OpaSendReplyToNotificationEvent extension is null. Bail out.");
                return true;
            }
            String str = qgVar.f238243b;
            String str2 = qgVar.f238244c;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                C59104x d3 = f300161a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "NotificationSubCtrl");
                ((C59052c) ((C59052c) d3).mo56372aa(26271)).mo56386p("OpaSendReplyToNotificationEvent doesn't contain either notification key or the message. Bail out.");
                return true;
            }
            C90873ag agVar = new C90873ag(this.f300162b.mo78568k(str, str2), this.f300164d, "Reply to Notification", new C107868at(this, str));
            agVar.mo85224b(RuntimeException.class, new C107869au(this, str));
            agVar.mo85223a(new C107870av(this, str));
            return true;
        }
    }
}
