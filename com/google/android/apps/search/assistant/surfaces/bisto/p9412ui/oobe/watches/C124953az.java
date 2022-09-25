package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.frameworks.client.data.android.C61531o;
import com.google.p4591e.p4592a.p4594b.p4596b.C61024c;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.az */
/* compiled from: PG */
final class C124953az implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C124955ba f344773a;

    public C124953az(C124955ba baVar) {
        this.f344773a = baVar;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        return C124955ba.f344775a;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C124955ba baVar = this.f344773a;
        C61024c cVar = baVar.f344782g;
        if (cVar == null) {
            return C60856cj.m92899h(new IllegalStateException("jsonWebSignature is null!"));
        }
        C124940am amVar = baVar.f344777b;
        Object obj = cVar.f165244b.get("iss");
        Object obj2 = cVar.f165243a.get("kid");
        if (obj == null || obj2 == null) {
            return C60856cj.m92899h(new GeneralSecurityException("Missing JWT fields"));
        }
        C61531o oVar = amVar.f344729a;
        C61363ae aeVar = new C61363ae();
        aeVar.mo57933b("GET");
        String format = String.format("https://www.gstatic.com/bisto/oobe/jwt_keys/%s/%s/key.pem", new Object[]{obj, obj2});
        format.getClass();
        aeVar.f165930a = format;
        return C60922j.m93045h(C60922j.m93045h(C60838bs.m92859i(oVar.mo42484a(new C61365ag(aeVar))), C124938ak.f344727a, amVar.f344730b), new C124939al(cVar), amVar.f344730b);
    }
}
