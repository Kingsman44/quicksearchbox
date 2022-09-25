package com.google.android.apps.gsa.staticplugins.p7377ah.p7379b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.apps.gsa.staticplugins.p7377ah.p7378a.C93848b;
import com.google.android.apps.gsa.staticplugins.p7377ah.p7378a.C93849c;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.b.c */
/* compiled from: PG */
public final class C93853c implements C23113i {

    /* renamed from: a */
    private final C93851a f262125a;

    public C93853c(C93851a aVar) {
        this.f262125a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("CorpusBarEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onCorpusClicked_com.google.android.apps.gsa.shared.search.corpus.Corpus")) {
                Corpus corpus = (Corpus) new C23269n().mo28733b("corpus", pVar);
                C93849c cVar = (C93849c) this.f262125a;
                C58833ax axVar = (C58833ax) ((C93848b) cVar.f262115a).f262111b.f63720e;
                if (!axVar.mo56113h() || !corpus.equals(axVar.mo56107c())) {
                    ((C93848b) cVar.f262115a).f262111b.mo28730f(C58833ax.m90834k(corpus), false);
                    cVar.f262116b.mo80989e(corpus.f252914e, cVar.f262118d.mo80283a().f236951d);
                }
            }
        }
    }
}
