package com.google.android.apps.gsa.staticplugins.opa.appactions.p8288a;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.gsa.staticplugins.opa.appactions.C107239ah;
import com.google.android.apps.gsa.staticplugins.opa.appactions.C107307h;
import com.google.android.apps.gsa.staticplugins.opa.appactions.C107308i;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.a.c */
/* compiled from: PG */
public final class C107231c implements C107230b {

    /* renamed from: a */
    private static final C59071e f298434a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appactions.a.c");

    /* renamed from: b */
    private static Optional m177989b(Uri uri, String str) {
        String queryParameter = uri.getQueryParameter(str);
        return TextUtils.isEmpty(queryParameter) ? Optional.empty() : Optional.m71637of(queryParameter);
    }

    /* renamed from: a */
    public final C107308i mo95841a(Intent intent) {
        if (intent == null || intent.getData() == null) {
            throw new C107229a(String.format("Cannot retrieve URI from intent: %s", new Object[]{intent}));
        }
        Uri data = intent.getData();
        data.getClass();
        C59104x b = f298434a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ShorcutDeeplinkParser");
        ((C59052c) ((C59052c) b).mo56372aa(23558)).mo56389s("parsing URI: %s", data);
        C107307h a = C107308i.m178129a();
        String path = data.getPath();
        if (path == null || !path.matches("/shortcuts/new/package/[\\w._]+$")) {
            String path2 = data.getPath();
            if (path2 == null || !path2.matches("/shortcuts/new/uid/\\w+$")) {
                throw new C107229a(String.format("Unexpected URI path: %s does not match %s", new Object[]{path2, "/shortcuts/new/uid/\\w+$"}));
            }
            ((C107239ah) a).f298464a = Optional.m71637of("uid/".concat(String.valueOf(data.getLastPathSegment())));
        } else {
            String lastPathSegment = data.getLastPathSegment();
            if (lastPathSegment != null) {
                ((C107239ah) a).f298470g = Optional.m71637of(lastPathSegment);
            } else {
                throw new C107229a("Failed to get package name from URI.");
            }
        }
        Optional b2 = m177989b(data, "command");
        if (b2 != null) {
            C107239ah ahVar = (C107239ah) a;
            ahVar.f298466c = b2;
            String queryParameter = data.getQueryParameter("intent");
            if (queryParameter != null) {
                ahVar.f298468e = Optional.m71637of(queryParameter);
                C58490gz gzVar = new C58490gz(4);
                for (String next : data.getQueryParameterNames()) {
                    if (next.startsWith("param.")) {
                        Optional b3 = m177989b(data, next);
                        if (b3.isPresent()) {
                            gzVar.mo55429h(next.substring(6), (String) b3.get());
                        }
                    }
                }
                ahVar.f298469f = gzVar.mo55427f(false);
                ahVar.f298475l = 5;
                return a.mo95845a();
            }
            throw new C107229a("Intent name is missing");
        }
        throw new NullPointerException("Null command");
    }
}
