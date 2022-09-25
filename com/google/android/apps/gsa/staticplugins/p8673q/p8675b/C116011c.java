package com.google.android.apps.gsa.staticplugins.p8673q.p8675b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6807j.C86134c;
import com.google.android.apps.gsa.search.core.p6807j.C86135d;
import com.google.android.apps.gsa.search.core.service.C86669cg;
import com.google.android.apps.gsa.search.core.service.p6848e.C86681c;
import com.google.android.apps.gsa.search.core.service.p6848e.C86685g;
import com.google.android.apps.gsa.search.core.service.p6848e.C86686h;
import com.google.android.apps.gsa.search.core.service.p6851f.C86697a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86726f;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88461k;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88462l;
import com.google.android.apps.gsa.shared.p7066m.C89962aa;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.net.URISyntaxException;

/* renamed from: com.google.android.apps.gsa.staticplugins.q.b.c */
/* compiled from: PG */
public final class C116011c implements C86686h {

    /* renamed from: a */
    public static final C59071e f321685a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.q.b.c");

    /* renamed from: c */
    public final Context f321686c;

    /* renamed from: d */
    public final C91097g f321687d;

    /* renamed from: e */
    public final C86669cg f321688e;

    /* renamed from: f */
    private final C86134c f321689f;

    /* renamed from: g */
    private final C22871g f321690g;

    /* renamed from: h */
    private final C22871g f321691h;

    /* renamed from: i */
    private final C86124t f321692i;

    public C116011c(Context context, C86134c cVar, C91097g gVar, C22871g gVar2, C22871g gVar3, C86669cg cgVar, C86124t tVar) {
        this.f321686c = context;
        this.f321689f = cVar;
        this.f321687d = gVar;
        this.f321690g = gVar2;
        this.f321691h = gVar3;
        this.f321688e = cgVar;
        this.f321692i = tVar;
    }

    /* renamed from: a */
    public final void mo102406a(long j) {
        this.f321690g.mo28212l("destroy AutobotSessionController", new C116009a(this, j));
    }

    /* renamed from: b */
    public final /* synthetic */ C86726f mo80291b(C21370a aVar) {
        return C86685g.m139632a(aVar);
    }

    /* renamed from: c */
    public final void mo102407c(C88461k kVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        if (!URLUtil.isValidUrl(kVar.f239150c)) {
            C59104x c = f321685a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AutobotSessionCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(14103)).mo56389s("Fallback URI not valid: %s", kVar.f239150c);
            return;
        }
        intent.setData(Uri.parse(kVar.f239150c));
        this.f321687d.mo65089a(intent);
    }

    /* renamed from: e */
    public final /* synthetic */ C58528ij mo80292e() {
        return C86686h.f234170b;
    }

    /* renamed from: f */
    public final void mo80293f(long j, ClientEventData clientEventData, C86681c cVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo80294g(boolean z) {
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
    }

    /* renamed from: h */
    public final void mo80295h() {
    }

    /* renamed from: i */
    public final void mo80296i(C86697a aVar) {
    }

    /* renamed from: j */
    public final void mo80297j(long j, C88431bb bbVar, C58833ax axVar) {
        Object obj;
        if (bbVar != null) {
            C62940bt r7 = C62942bv.checkIsLite(C88462l.f239152a);
            bbVar.mo58887l(r7);
            if (bbVar.f169962ag.mo58857o(r7.f169971d) && this.f321692i.mo79746e(C89962aa.f246483a)) {
                C62940bt r72 = C62942bv.checkIsLite(C88462l.f239152a);
                bbVar.mo58887l(r72);
                Object l = bbVar.f169962ag.mo58854l(r72.f169971d);
                if (l == null) {
                    obj = r72.f169969b;
                } else {
                    obj = r72.mo58889c(l);
                }
                C88461k kVar = (C88461k) obj;
                try {
                    Intent parseUri = Intent.parseUri(kVar.f239149b, 1);
                    parseUri.getClass();
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    parseUri.putExtra("com.google.android.apps.gsa.customtabs.FORCE_CCT", true);
                    C86135d a = this.f321689f.mo79784a(parseUri);
                    if (!a.mo79774b()) {
                        mo102407c(kVar);
                        mo102406a(j);
                        return;
                    }
                    this.f321691h.mo28211k(a.mo79773a(), "process intent", new C116010b(this, kVar, j));
                    return;
                } catch (URISyntaxException e) {
                    C59104x c = f321685a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "AutobotSessionCtrl");
                    ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14102)).mo56389s("Invalid intent URI: %s", kVar.f239149b);
                    mo102406a(j);
                    return;
                }
            }
        }
        mo102406a(j);
    }

    /* renamed from: k */
    public final /* synthetic */ boolean mo80298k(ClientConfig clientConfig, ClientConfig clientConfig2) {
        return C86685g.m139633b(clientConfig, clientConfig2);
    }

    /* renamed from: l */
    public final /* synthetic */ boolean mo80299l() {
        return false;
    }
}
