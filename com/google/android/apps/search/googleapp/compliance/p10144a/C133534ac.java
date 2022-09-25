package com.google.android.apps.search.googleapp.compliance.p10144a;

import com.google.android.apps.search.googleapp.compliance.p10147d.C133626b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58585km;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61366ah;

/* renamed from: com.google.android.apps.search.googleapp.compliance.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C133534ac implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133543al f363839a;

    public /* synthetic */ C133534ac(C133543al alVar) {
        this.f363839a = alVar;
    }

    public final C60870cx apply(Object obj) {
        C133543al alVar = this.f363839a;
        C61366ah ahVar = (C61366ah) obj;
        int i = ahVar.f165947c;
        if (i == 200 || i == 204) {
            C58585km kmVar = ahVar.f165945a;
            if (kmVar == null) {
                ((C59052c) ((C59052c) C133543al.f363848a.mo56226d()).mo56372aa(40063)).mo56386p("Null header in response");
                return C47633f.m84733g(C60856cj.m92899h(new C133626b("Null cookie header")));
            }
            for (String str : kmVar.mo55277g(C61362ad.m93870b("Set-Cookie"))) {
                if (str.startsWith("NID=")) {
                    alVar.f363854g.set(str);
                    return C60856cj.m92900i(str);
                }
            }
            ((C59052c) ((C59052c) C133543al.f363848a.mo56226d()).mo56372aa(40062)).mo56386p("Successful set cookie doesn't contain Zwieback.");
            return C47633f.m84733g(C60856cj.m92899h(new C133626b("No Zwieback in set-cookie header.")));
        }
        ((C59052c) ((C59052c) C133543al.f363848a.mo56226d()).mo56372aa(40064)).mo56387q("Unable to get cookie from server. Response code: %s", ahVar.f165947c);
        return C47633f.m84733g(C60856cj.m92899h(new C133626b("Request to get cookie failed")));
    }
}
