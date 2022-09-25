package com.google.android.libraries.assistant.auto.tng.gmm.p990b.p991a;

import com.google.android.apps.p453b.p457b.p460b.p462b.C9005e;
import com.google.android.apps.p453b.p457b.p460b.p462b.C9006f;
import com.google.android.apps.p453b.p457b.p460b.p462b.C9012l;
import com.google.android.apps.p453b.p457b.p460b.p463c.C9013a;
import com.google.android.apps.p453b.p457b.p460b.p463c.C9014b;
import com.google.android.libraries.assistant.auto.tng.gmm.p990b.C13575a;
import com.google.android.libraries.p3329t.p3330a.C43176e;
import com.google.android.libraries.search.location.C38683aa;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58836b;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.b.a.e */
/* compiled from: PG */
public final class C13580e implements C13575a {

    /* renamed from: a */
    public static final C59071e f41580a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.gmm.b.a.e");

    /* renamed from: b */
    private final C38683aa f41581b;

    /* renamed from: c */
    private final C43176e f41582c;

    /* renamed from: d */
    private final AccountId f41583d;

    /* renamed from: e */
    private final C46175b f41584e;

    /* renamed from: f */
    private final C60888db f41585f;

    public C13580e(AccountId accountId, C38683aa aaVar, C46175b bVar, C43176e eVar, C60888db dbVar) {
        this.f41581b = aaVar;
        this.f41582c = eVar;
        this.f41583d = accountId;
        this.f41584e = bVar;
        this.f41585f = dbVar;
    }

    /* renamed from: c */
    private final C60870cx m29857c(String str, boolean z) {
        String str2;
        Object obj;
        this.f41582c.mo46241a();
        C13583h hVar = new C13583h(C9012l.f31137c.getParserForType());
        C60870cx d = this.f41581b.mo41550d(C39226b.TAG_ASSISTANT_STASH, 2);
        C13578c cVar = C13578c.f41575a;
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(cVar), this.f41585f);
        C60870cx c = this.f41584e.mo50246c(this.f41583d);
        C60870cx a = C47638k.m84751b(g, c).mo51520a(new C13579d(g, c, str, z), this.f41585f);
        this.f41582c.mo46241a();
        C58872ci d2 = C58872ci.m90947d(C58274c.f155808a);
        try {
            C60870cx a2 = this.f41582c.f112885e.f112901a.mo46247a();
            C60870cx b = C47638k.m84751b(a2, a).mo51521b(new C13576a(a2, a, hVar), this.f41585f);
            C13577b bVar = new C13577b(d2);
            return C60922j.m93044g(b, C47810es.m84963c(bVar), this.f41585f);
        } catch (RuntimeException e) {
            C59071e eVar = f41580a;
            C59104x d3 = eVar.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "GmmOffroadExecutor");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e)).mo56372aa(45148)).mo56386p("Offroad search exception");
            if (!(e.getCause() instanceof C9014b)) {
                return C60856cj.m92900i(C58836b.f156633a);
            }
            C9013a aVar = new C9013a(((C9014b) e.getCause()).f31142a);
            C59104x d4 = eVar.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "GmmOffroadExecutor");
            C59052c cVar2 = (C59052c) ((C59052c) d4).mo56372aa(45149);
            C62724b bVar2 = aVar.f31142a;
            if ((bVar2.f169418a & 16) != 0) {
                C63771b bVar3 = bVar2.f169423f;
                if (bVar3 == null) {
                    bVar3 = C63771b.f172510a;
                }
                C62940bt r3 = C62942bv.checkIsLite(C9006f.f31121c);
                bVar3.mo58887l(r3);
                if (bVar3.f169962ag.mo58857o(r3.f169971d)) {
                    C63771b bVar4 = bVar2.f169423f;
                    if (bVar4 == null) {
                        bVar4 = C63771b.f172510a;
                    }
                    C62940bt r2 = C62942bv.checkIsLite(C9006f.f31121c);
                    bVar4.mo58887l(r2);
                    Object l = bVar4.f169962ag.mo58854l(r2.f169971d);
                    if (l == null) {
                        obj = r2.f169969b;
                    } else {
                        obj = r2.mo58889c(l);
                    }
                    int a3 = C9005e.m23569a(((C9006f) obj).f31123a);
                    if (a3 != 0) {
                        switch (a3) {
                            case 1:
                                break;
                            case 2:
                                str2 = "GMM_INCOGNITO";
                                break;
                            case 3:
                                str2 = "GAIA_IDS_DO_NOT_MATCH";
                                break;
                            case 4:
                                str2 = "GMM_LACKS_LOCATION_PERMISSION";
                                break;
                            case 5:
                                str2 = "INVALID_ARGUMENT";
                                break;
                            case 6:
                                str2 = "UNPARSEABLE_RESPONSE";
                                break;
                            default:
                                str2 = "CURRENT_USER_LOCATION_UNKNOWN";
                                break;
                        }
                    }
                }
            }
            str2 = "UNSPECIFIED";
            cVar2.mo56354G("Offroad error code: %s; Canonical Code: %s", str2, C62722b.m94931a(aVar.f31142a.f169422e).name());
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: a */
    public final C60870cx mo21172a(String str) {
        return m29857c(str, true);
    }

    /* renamed from: b */
    public final C60870cx mo21173b(String str) {
        return m29857c(str, false);
    }
}
