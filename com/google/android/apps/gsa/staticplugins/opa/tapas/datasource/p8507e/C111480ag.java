package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import android.util.Base64;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4017at.p4060h.p4073d.p4074a.C54225an;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.ag */
/* compiled from: PG */
public final /* synthetic */ class C111480ag implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C111480ag f310117a = new C111480ag();

    private /* synthetic */ C111480ag() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C54229ar arVar;
        C89057m mVar = (C89057m) obj;
        C121509q l = C111485al.f310121a.mo105243l("createSuggestResponse");
        if (mVar != null) {
            try {
                String a = mVar.mo82999g().mo83000a("Content-Type", "unknown_content_type");
                if (a.contains("application/x-protobuffer")) {
                    arVar = (C54229ar) ((C54225an) ((C54225an) C54229ar.f142352d.createBuilder()).mergeFrom(mVar.mo83036f(), C62921ba.m95368a())).build();
                } else {
                    C59104x c = C111485al.f310122b.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "TapasCSResponseFetcher");
                    ((C59052c) ((C59052c) c).mo56372aa(27214)).mo56389s("unrecognized content type: %s", a);
                    arVar = null;
                }
                if (arVar != null) {
                    C58976aa aaVar = C58975e.f156826a;
                    Base64.encodeToString(arVar.toByteArray(), 3);
                    l.close();
                    return arVar;
                }
                throw new C111484ak("suggestResponse was null.");
            } catch (Throwable th) {
                C111479af.m185241a(th, th);
            }
        } else {
            throw new C111484ak("completedHttpResponse was null.");
        }
        throw th;
    }
}
