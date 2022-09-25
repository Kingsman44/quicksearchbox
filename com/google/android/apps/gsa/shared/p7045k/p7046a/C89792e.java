package com.google.android.apps.gsa.shared.p7045k.p7046a;

import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import dagger.C68214a;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.google.android.apps.gsa.shared.k.a.e */
/* compiled from: PG */
public final class C89792e {

    /* renamed from: a */
    public static final C59071e f243034a = C59071e.m91332i("com.google.android.apps.gsa.shared.k.a.e");

    /* renamed from: b */
    private final C68214a f243035b;

    public C89792e(C68214a aVar) {
        this.f243035b = aVar;
    }

    /* renamed from: a */
    public final void mo83642a(C89790c cVar) {
        C89019aq aqVar;
        try {
            URL url = new URL(cVar.f243031b);
            C89012aj ajVar = (C89012aj) this.f243035b.mo27525b();
            if (cVar.f243030a.equals("POST")) {
                aqVar = C89020ar.m144759d();
            } else {
                aqVar = C89020ar.m144758c();
            }
            aqVar.f241236b = url;
            aqVar.f241245k = 74;
            C89020ar.m144761h(5000);
            aqVar.f241246l = 5000;
            C89020ar.m144761h(5000);
            aqVar.f241247m = 5000;
            aqVar.f241249o = 4;
            C60856cj.m92911t(ajVar.mo27495f(aqVar.mo82989a(), C89009ag.f241207b, ((C89012aj) this.f243035b.mo27525b()).mo27510b(C89066v.f241382a)), new C89791d(cVar), C60826bg.f164896a);
        } catch (MalformedURLException e) {
            ((C59052c) ((C59052c) ((C59052c) f243034a.mo56225c()).mo56382g(e)).mo56372aa(10562)).mo56386p("Cannot parse the url.");
        }
    }
}
