package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8511i;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113407er;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.gms.appdatasearch.C142796al;
import com.google.android.gms.appdatasearch.C142797am;
import com.google.android.gms.appdatasearch.SearchResults;
import com.google.android.libraries.searchbox.shared.suggestion.C41662ab;
import com.google.android.libraries.searchbox.shared.suggestion.C41663ac;
import com.google.android.libraries.searchbox.shared.suggestion.C41678d;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41688n;
import com.google.android.libraries.searchbox.shared.suggestion.C41689o;
import com.google.android.libraries.searchbox.shared.suggestion.C41692r;
import com.google.android.libraries.searchbox.shared.suggestion.C41693s;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.i.f */
/* compiled from: PG */
public final /* synthetic */ class C111537f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C111538g f310228a;

    public /* synthetic */ C111537f(C111538g gVar) {
        this.f310228a = gVar;
    }

    public final Object apply(Object obj) {
        String str;
        C111532a aVar = this.f310228a.f310231a;
        C58480gp e = C58485gu.m89837e();
        C142797am amVar = new C142797am((SearchResults) obj);
        while (amVar.hasNext()) {
            C142796al a = amVar.next();
            String h = a.mo117712h("text1");
            String a2 = C111532a.m185295a(a, "image");
            String h2 = a.mo117712h("intent_data");
            if (!TextUtils.isEmpty(h) && !TextUtils.isEmpty(a2) && !TextUtils.isEmpty(h2)) {
                if (a2.contains("resource_name_obfuscated")) {
                    String host = Uri.parse(a2).getHost();
                    String str2 = null;
                    if (host != null) {
                        int i = 0;
                        try {
                            ApplicationInfo applicationInfo = aVar.f310223b.getApplicationInfo(host, 128);
                            if (applicationInfo != null) {
                                i = applicationInfo.icon;
                            }
                        } catch (PackageManager.NameNotFoundException e2) {
                            ((C58970a) ((C58970a) ((C58970a) C111532a.f310222a.mo56226d()).mo56382g(e2)).mo56372aa(27236)).mo56389s("Invalid package name: %s", host);
                        }
                        if (i > 0) {
                            str2 = "android.resource://" + host + "/" + i;
                        }
                    }
                    if (str2 != null) {
                        a2 = str2;
                    }
                }
                C113414ey R = C113415ez.m187750R();
                R.mo100164i(h);
                R.mo100175t(C48672ag.ICING);
                R.mo100180y(84);
                R.mo100174s(a.mo117705a());
                if (aVar.f310224c.mo79746e(C90063do.f249493ea)) {
                    str = C111532a.m185295a(a, "identifier");
                } else {
                    str = Uri.parse(a2).getHost();
                }
                if (str != null) {
                    C41678d dVar = (C41678d) C41679e.f109005p.createBuilder();
                    C41692r rVar = (C41692r) C41693s.f109053h.createBuilder();
                    rVar.copyOnWrite();
                    C41693s sVar = (C41693s) rVar.instance;
                    sVar.f109055a |= 8;
                    sVar.f109059e = str;
                    rVar.copyOnWrite();
                    C41693s sVar2 = (C41693s) rVar.instance;
                    h2.getClass();
                    sVar2.f109055a |= 2;
                    sVar2.f109057c = h2;
                    dVar.copyOnWrite();
                    C41679e eVar = (C41679e) dVar.instance;
                    C41693s sVar3 = (C41693s) rVar.build();
                    sVar3.getClass();
                    eVar.f109009c = sVar3;
                    eVar.f109007a |= 4;
                    C41662ab abVar = (C41662ab) C41663ac.f108934g.createBuilder();
                    abVar.copyOnWrite();
                    C41663ac acVar = (C41663ac) abVar.instance;
                    a2.getClass();
                    acVar.f108937b = 3;
                    acVar.f108938c = a2;
                    dVar.copyOnWrite();
                    C41679e eVar2 = (C41679e) dVar.instance;
                    C41663ac acVar2 = (C41663ac) abVar.build();
                    acVar2.getClass();
                    eVar2.f109008b = acVar2;
                    eVar2.f109007a |= 2;
                    C41688n nVar = (C41688n) C41689o.f109041e.createBuilder();
                    nVar.copyOnWrite();
                    C41689o oVar = (C41689o) nVar.instance;
                    oVar.f109043a |= 2;
                    oVar.f109045c = "internal.3p:MobileApplication";
                    dVar.copyOnWrite();
                    C41679e eVar3 = (C41679e) dVar.instance;
                    C41689o oVar2 = (C41689o) nVar.build();
                    oVar2.getClass();
                    eVar3.f109010d = oVar2;
                    eVar3.f109007a |= 8;
                    R.mo100161f((C41679e) dVar.build());
                    e.mo55395g(R.mo100156a());
                }
            }
        }
        C113407er p = C113408es.m187705p();
        p.mo100096f(C113339cj.m187495c(C113339cj.m187496d(e.mo55394f())));
        return p.mo100091a();
    }
}
