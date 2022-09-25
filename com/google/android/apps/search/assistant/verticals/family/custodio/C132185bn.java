package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.nav.gateway.C47506l;
import com.google.apps.tiktok.nav.gateway.C47507m;
import com.google.apps.tiktok.nav.gateway.GatewayHandler;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5124m.p5125a.C65603f;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.bn */
/* compiled from: PG */
final class C132185bn implements GatewayHandler {

    /* renamed from: a */
    public static final C59071e f360800a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.bn");

    /* renamed from: b */
    public final Context f360801b;

    /* renamed from: c */
    public final C32158h f360802c;

    /* renamed from: d */
    private final boolean f360803d;

    /* renamed from: e */
    private final boolean f360804e;

    /* renamed from: f */
    private final C58485gu f360805f;

    /* renamed from: g */
    private final C39141kp f360806g;

    public C132185bn(Context context, C32158h hVar, boolean z, boolean z2, C65603f fVar, C39141kp kpVar) {
        this.f360801b = context;
        this.f360802c = hVar;
        this.f360803d = z;
        this.f360804e = z2;
        this.f360805f = C58485gu.m89842j(fVar.f178307a);
        this.f360806g = kpVar;
    }

    /* renamed from: a */
    public final C47506l mo20007a(C47507m mVar) {
        if (this.f360803d) {
            Uri data = mVar.f123337a.getData();
            if (data == null) {
                ((C59052c) ((C59052c) f360800a.mo56226d()).mo56372aa(39541)).mo56386p("Ignoring deeplink since intent has no data!");
                return null;
            }
            String scheme = data.getScheme();
            String host = data.getHost();
            String queryParameter = data.getQueryParameter("account_name");
            String queryParameter2 = data.getQueryParameter("entry_point_id");
            String queryParameter3 = data.getQueryParameter("supervised_oid");
            String queryParameter4 = data.getQueryParameter("cast_device_id");
            String queryParameter5 = data.getQueryParameter("libassistant_device_id");
            if (scheme == null || host == null || !scheme.equals("googleassistant") || !host.equals("custodio") || queryParameter == null || queryParameter2 == null) {
                ((C59052c) ((C59052c) f360800a.mo56226d()).mo56372aa(39538)).mo56389s("Ignoring invalid deeplink: \"%s\"", data);
                return null;
            }
            C59071e eVar = f360800a;
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(39539)).mo56389s("Received valid URL deeplink: \"%s\"", data);
            if (!this.f360804e || this.f360805f.contains(queryParameter2)) {
                return new C132184bm(this, queryParameter, queryParameter2, queryParameter3, queryParameter5, queryParameter4);
            }
            ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(39540)).mo56389s("Ignoring deeplink with non-allowlisted entry-point ID \"%s\"", queryParameter2);
            ((C19567d) this.f360806g.f103043o.mo6453a()).mo24822a(1, new Object[0]);
            return null;
        }
        ((C59052c) ((C59052c) f360800a.mo56226d()).mo56372aa(39542)).mo56386p("Ignoring deeplink since handler flag disabled!");
        return null;
    }
}
