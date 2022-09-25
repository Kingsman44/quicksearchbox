package com.google.android.apps.gsa.shared.p7045k.p7047b;

import com.google.android.libraries.home.p1957e.C23767b;
import com.google.android.libraries.home.p1957e.C23769d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* renamed from: com.google.android.apps.gsa.shared.k.b.b */
/* compiled from: PG */
final class C89799b {

    /* renamed from: b */
    private static final C59071e f243070b = C59071e.m91332i("com.google.android.apps.gsa.shared.k.b.b");

    /* renamed from: a */
    public SSLContext f243071a;

    public C89799b() {
        try {
            C23769d a = C23769d.m44269a();
            if (a != null) {
                SSLContext instance = SSLContext.getInstance("TLSv1");
                this.f243071a = instance;
                instance.init((KeyManager[]) null, new TrustManager[]{new C23767b(a)}, new SecureRandom());
            }
        } catch (Exception e) {
            C59104x c = f243070b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HttpsURLConnectionFty");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(10563)).mo56386p("Failed to initiate SSL context");
        }
    }
}
