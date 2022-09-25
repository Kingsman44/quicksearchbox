package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.gms.learning.C144581d;
import com.google.android.gms.learning.internal.C144771c;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerImpl;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerResult;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.b */
/* compiled from: PG */
public final class C100797b implements C144581d {

    /* renamed from: a */
    private static final C59071e f281724a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.brella.b");

    /* renamed from: b */
    private final String f281725b;

    /* renamed from: c */
    private final EkhoMaterializerImpl f281726c;

    public C100797b(String str, EkhoMaterializerImpl ekhoMaterializerImpl) {
        this.f281725b = str;
        this.f281726c = ekhoMaterializerImpl;
    }

    /* renamed from: a */
    public final void mo92061a(int i) {
        C59104x d = f281724a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "GsaExampleStoreItr");
        ((C59052c) ((C59052c) d).mo56372aa(19499)).mo56386p("Request API not supported.");
    }

    /* renamed from: b */
    public final void mo92062b(C144771c cVar) {
        C58976aa aaVar = C58975e.f156826a;
        try {
            EkhoMaterializerResult a = this.f281726c.mo24639a();
            byte[] bArr = a.exampleBytes;
            if (bArr != null) {
                if (bArr.length != 0) {
                    cVar.mo120203b(bArr, a.resumptionToken);
                    return;
                }
            }
            cVar.mo120203b((byte[]) null, (byte[]) null);
        } catch (IOException e) {
            C59104x c = f281724a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaExampleStoreItr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19498)).mo56389s("Materializer (%s) failed to fetch the next example.", this.f281725b);
            cVar.mo120202a((String) null);
        }
    }

    public final void close() {
        C59104x b = f281724a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GsaExampleStoreItr");
        ((C59052c) ((C59052c) b).mo56372aa(19495)).mo56386p("close()");
        try {
            this.f281726c.close();
        } catch (Exception e) {
            C59104x c = f281724a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaExampleStoreItr");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19496)).mo56389s("Materializer (%s) failed to close.", this.f281725b);
        }
    }
}
