package com.google.android.apps.gsa.staticplugins.p7377ah.p7379b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.search.corpus.Corpus;
import com.google.android.libraries.gsa.monet.shared.C23112h;
import com.google.android.libraries.gsa.monet.shared.LazyParcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.ah.b.b */
/* compiled from: PG */
public final class C93852b implements C93851a {

    /* renamed from: a */
    private final C23112h f262124a;

    public C93852b(C23112h hVar) {
        this.f262124a = hVar;
    }

    /* renamed from: e */
    public final void mo88190e(Corpus corpus) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("corpus", new LazyParcelable((Parcelable) corpus));
        this.f262124a.mo28345s("onCorpusClicked_com.google.android.apps.gsa.shared.search.corpus.Corpus", "CorpusBarEventsDispatcher", bundle);
    }
}
