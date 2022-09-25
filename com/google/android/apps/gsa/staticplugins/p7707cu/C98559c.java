package com.google.android.apps.gsa.staticplugins.p7707cu;

import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.net.MalformedURLException;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.cu.c */
/* compiled from: PG */
public final class C98559c {

    /* renamed from: a */
    public static final C59071e f275275a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.cu.c");

    /* renamed from: b */
    public final C98563g f275276b;

    /* renamed from: c */
    private final C90931ca f275277c;

    /* renamed from: d */
    private final C22871g f275278d;

    public C98559c(C90931ca caVar, C22871g gVar, C98563g gVar2) {
        this.f275276b = gVar2;
        this.f275278d = gVar;
        this.f275277c = caVar;
    }

    /* renamed from: a */
    public final C60870cx mo91177a(C98563g gVar, C87242k kVar, C89356b bVar) {
        try {
            C89019aq d = C89020ar.m144759d();
            d.mo82994f(gVar.f275290c);
            d.mo82990b("Content-Type", "application/json");
            d.mo82990b("Authorization", "Bearer ".concat(String.valueOf(gVar.f275289b)));
            d.f241245k = 35;
            C89020ar a = d.mo82989a();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("credentialType", "password");
            jSONObject.put("credential", gVar.f275291d);
            return this.f275277c.mo85141f(this.f275278d.mo28202b("make reauth http request", new C98557a(kVar, bVar, a, C89009ag.m144715a(Charset.forName("UTF-8").newEncoder().encode(CharBuffer.wrap(jSONObject.toString())), gVar.f275288a))), new C98558b());
        } catch (MalformedURLException | CharacterCodingException | JSONException e) {
            ((C59052c) ((C59052c) f275275a.mo56225c()).mo56372aa(30872)).mo56386p("Exception building reauth request.");
            return C60856cj.m92899h(new IllegalArgumentException(e));
        }
    }
}
