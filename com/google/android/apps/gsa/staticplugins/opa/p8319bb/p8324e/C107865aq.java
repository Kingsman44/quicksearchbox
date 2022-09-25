package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6538ai.C84687a;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87790dr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87792dt;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60494rz;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.aq */
/* compiled from: PG */
public final class C107865aq implements C107874az {

    /* renamed from: a */
    public static final C59071e f300149a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.aq");

    /* renamed from: b */
    public final C68214a f300150b;

    /* renamed from: c */
    private final C84687a f300151c;

    /* renamed from: d */
    private final C22871g f300152d;

    public C107865aq(C84687a aVar, C68214a aVar2, C22871g gVar) {
        this.f300151c = aVar;
        this.f300150b = aVar2;
        this.f300152d = gVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo96296a() {
    }

    /* renamed from: b */
    public final boolean mo96322b(ClientEventData clientEventData) {
        Object obj;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a != C87739bu.EXPLORE_ON_CONTENT_REQUEST) {
            return false;
        }
        C62940bt btVar = C87790dr.f237574a;
        C87741bw bwVar = clientEventData.f236955a;
        C62940bt r0 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r0);
        Object l = bwVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        new C90873ag(this.f300151c.mo78419a(Uri.parse(((C87792dt) obj).f237577a), (Long) null, C60494rz.UNKNOWN), this.f300152d, "getRelatedDocuments", new C107863ao(this)).mo85223a(C107864ap.f300148a);
        return true;
    }
}
