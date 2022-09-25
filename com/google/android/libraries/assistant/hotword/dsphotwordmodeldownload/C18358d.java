package com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload;

import com.google.android.libraries.mdi.download.C28706al;
import com.google.android.libraries.mdi.download.C28708an;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.d */
/* compiled from: PG */
final class C18358d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C28708an f52076a;

    public C18358d(C28708an anVar) {
        this.f52076a = anVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C28708an anVar = this.f52076a;
        ((C58970a) ((C58970a) ((C58970a) C18359e.f52077a.mo56225c()).mo56382g(th)).mo56372aa(47294)).mo56354G("Failed to add hotword file group for '%s' from location: %s", anVar.f77997b, ((C28706al) anVar.f78003h.get(0)).f77980c);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C58974d dVar = C18359e.f52077a;
            C28708an anVar = this.f52076a;
            String str = anVar.f77997b;
            String str2 = ((C28706al) anVar.f78003h.get(0)).f77980c;
            return;
        }
        C28708an anVar2 = this.f52076a;
        ((C58970a) ((C58970a) C18359e.f52077a.mo56225c()).mo56372aa(47295)).mo56354G("Failed to add hotword file group for '%s' from location: %s", anVar2.f77997b, ((C28706al) anVar2.f78003h.get(0)).f77980c);
    }
}
