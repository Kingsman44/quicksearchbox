package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8232b.p8234b;

import android.content.ComponentName;
import android.content.pm.PackageItemInfo;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.libraries.assistant.pcp.p1573k.C18927g;
import com.google.android.libraries.assistant.pcp.p1573k.C18930j;
import com.google.android.libraries.search.assistant.p2566g.C33421p;
import com.google.android.libraries.search.assistant.p2566g.C33423r;
import com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a.C146595c;
import com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a.C146597e;
import com.google.android.p10897j.p10898a.p10899a.p10900a.p10901a.p10902a.p10903a.p10904a.C146599g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.e */
/* compiled from: PG */
public final class C106626e implements C33421p {

    /* renamed from: a */
    private static final C59071e f297267a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ambient.core.b.b.e");

    /* renamed from: b */
    private final C18927g f297268b;

    /* renamed from: c */
    private final C18930j f297269c;

    /* renamed from: d */
    private final C60887da f297270d;

    /* renamed from: e */
    private final C90021c f297271e;

    public C106626e(C90021c cVar, C18930j jVar, C18927g gVar, C60887da daVar) {
        this.f297269c = jVar;
        this.f297268b = gVar;
        this.f297271e = cVar;
        this.f297270d = daVar;
    }

    /* renamed from: a */
    public final C60870cx mo38837a(AccountId accountId, C33423r rVar) {
        Object obj;
        C60870cx cxVar;
        if (!this.f297271e.mo79746e(C90017bw.f247891aF)) {
            ((C59052c) ((C59052c) f297267a.mo56224b()).mo56372aa(23173)).mo56386p("App recommendations debug provider disabled.");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C62940bt r3 = C62942bv.checkIsLite(C146599g.f395958d);
        rVar.mo58887l(r3);
        if (!rVar.f169962ag.mo58857o(r3.f169971d)) {
            ((C59052c) ((C59052c) f297267a.mo56226d()).mo56372aa(23172)).mo56386p("No app recommendations request extension.");
            return C60856cj.m92900i(C58485gu.m89845m());
        }
        C62940bt r32 = C62942bv.checkIsLite(C146599g.f395958d);
        rVar.mo58887l(r32);
        Object l = rVar.f169962ag.mo58854l(r32.f169971d);
        if (l == null) {
            obj = r32.f169969b;
        } else {
            obj = r32.mo58889c(l);
        }
        C146599g gVar = (C146599g) obj;
        if ((gVar.f395960a & 1) != 0) {
            Optional findFirst = Collection.EL.stream(this.f297268b.mo24217a()).filter(new C106624c(gVar.f395961b)).findFirst();
            if (findFirst.isEmpty()) {
                C146595c cVar = (C146595c) C146597e.f395952d.createBuilder();
                cVar.copyOnWrite();
                C146597e eVar = (C146597e) cVar.instance;
                eVar.f395955b = 1;
                eVar.f395954a = 1 | eVar.f395954a;
                cxVar = C60856cj.m92900i((C146597e) cVar.build());
            } else {
                cxVar = C47633f.m84733g(this.f297269c.mo24192a(new ComponentName(((PackageItemInfo) findFirst.get()).packageName, ((PackageItemInfo) findFirst.get()).name), C53306j.AMBIENT_ASSISTANT, C58485gu.m89846n("ANY_FOLDER"))).mo51515h(C106625d.f297266a, this.f297270d);
            }
            return C47633f.m84733g(cxVar).mo51515h(C106623b.f297264a, this.f297270d);
        }
        ((C59052c) ((C59052c) f297267a.mo56226d()).mo56372aa(23171)).mo56386p("No app package provided in the request.");
        return C60856cj.m92900i(C58485gu.m89845m());
    }
}
