package com.google.android.apps.gsa.p6487s3.producers;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.p4017at.p4060h.p4068b.p4069a.C54194k;
import com.google.speech.p5208h.C66556am;
import com.google.speech.p5208h.C66606cd;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.s3.producers.f */
/* compiled from: PG */
public final class C84307f extends C84321t {

    /* renamed from: a */
    private final C68214a f229445a;

    /* renamed from: b */
    private final C84306e f229446b;

    public C84307f(C84306e eVar, Query query, C68214a aVar) {
        this.f229445a = aVar;
        this.f229446b = eVar;
        eVar.mo77860f(this, query);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo77848a(C66606cd cdVar, Object obj) {
        cdVar.mo58885m(C66556am.f181039b, (C54194k) obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo77849c() {
        this.f229446b.mo77859e(this);
    }

    /* renamed from: hk */
    public final void mo77847hk() {
        close();
        ((C89859i) this.f229445a.mo27525b()).mo83702b(C89849ae.ASSIST_DATA_END_UPDATES);
    }
}
