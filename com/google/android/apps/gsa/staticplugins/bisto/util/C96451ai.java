package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4591e.p4592a.p4594b.p4596b.C61024c;
import dagger.C68214a;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.ai */
/* compiled from: PG */
public final class C96451ai {

    /* renamed from: a */
    private final C68214a f269827a;

    /* renamed from: b */
    private final Executor f269828b;

    public C96451ai(C68214a aVar, Executor executor) {
        this.f269827a = aVar;
        this.f269828b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo90135a(C61024c cVar) {
        Object obj = cVar.f165244b.get("iss");
        Object obj2 = cVar.f165243a.get("kid");
        if (obj == null || obj2 == null) {
            return C60856cj.m92899h(new GeneralSecurityException("Missing JWT fields"));
        }
        try {
            URL url = new URL(String.format("https://www.gstatic.com/bisto/oobe/jwt_keys/%s/%s/key.pem", new Object[]{obj, obj2}));
            C89061q b = ((C89012aj) this.f269827a.mo27525b()).mo27510b(C89066v.f241382a);
            C89019aq a = C89020ar.m144756a();
            a.f241236b = url;
            a.f241245k = 59;
            return C60922j.m93045h(C60922j.m93045h(C60838bs.m92859i(((C89012aj) this.f269827a.mo27525b()).mo27495f(a.mo82989a(), C89009ag.f241207b, b)), C96449ag.f269825a, this.f269828b), new C96450ah(cVar), this.f269828b);
        } catch (MalformedURLException e) {
            return C60856cj.m92899h(e);
        }
    }
}
