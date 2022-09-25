package com.google.android.apps.gsa.staticplugins.p7930es;

import com.android.p266f.p267a.p268a.C5139x;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.e */
/* compiled from: PG */
public final /* synthetic */ class C100650e implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C100653h f281449a;

    public /* synthetic */ C100650e(C100653h hVar) {
        this.f281449a = hVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C100653h hVar = this.f281449a;
        try {
            return C100653h.m166818e(hVar.f281453a, (C5139x) obj);
        } catch (C100655j e) {
            ((C89859i) hVar.f281457e.mo27525b()).mo83702b(C89849ae.OPA_CHAT_XMSWORKER_MMS_WRITE_PDU_FAILED);
            throw e;
        }
    }
}
