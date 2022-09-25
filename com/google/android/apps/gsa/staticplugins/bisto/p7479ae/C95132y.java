package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.amo;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.y */
/* compiled from: PG */
public class C95132y {

    /* renamed from: a */
    public final C87673aa f266156a;

    /* renamed from: b */
    public final C95131x f266157b;

    /* renamed from: c */
    private final AtomicLong f266158c = new AtomicLong(0);

    public C95132y(C87673aa aaVar, C95131x xVar) {
        this.f266156a = aaVar;
        this.f266157b = xVar;
    }

    /* renamed from: a */
    public long mo88916a(Uri uri, Bundle bundle) {
        long nextLong;
        int i;
        C58976aa aaVar = C58975e.f156826a;
        this.f266157b.mo89056a();
        do {
            nextLong = C90719ac.f253778a.f253779b.nextLong();
        } while (nextLong == 0);
        this.f266158c.set(nextLong);
        long j = this.f266158c.get();
        bundle.putBoolean("android.speech.extra.BEEP_SUPPRESSED", true);
        bundle.putBoolean("android.speech.extra.DICTATION_MODE", true);
        bundle.putString("android.speech.extra.CALLING_PACKAGE", "com.google.android.googlequicksearchbox");
        if (!bundle.containsKey("com.google.android.apps.gsa.shared.bisto.AUDIO_SAMPLING_RATE") || (i = bundle.getInt("com.google.android.apps.gsa.shared.bisto.AUDIO_SAMPLING_RATE")) == 0 || i < 0) {
            i = 0;
        }
        C90498f i2 = Query.f252741b.mo84480i();
        i2.mo84573e(0, 2);
        i2.mo84561T(QueryTriggerType.BISTO);
        this.f266156a.mo81931b(i2.mo84568a().mo84275aL("com.google.android.apps.gsa.search.core.service.SearchService").mo84272aI(amo.BISTO).mo84290aa(uri, bundle, i).mo84240C().mo84261Y(!bundle.getBoolean("com.google.android.apps.gsa.shared.bisto.ENDPOINTING_BY_CLOSING_STREAM", false)).mo84271aH(j).mo84493u());
        return j;
    }
}
