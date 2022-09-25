package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95130w;
import com.google.android.apps.gsa.staticplugins.bisto.p7479ae.C95131x;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.x */
/* compiled from: PG */
public final class C95006x {

    /* renamed from: a */
    public static final C59071e f265812a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.h.x");

    /* renamed from: b */
    public final Context f265813b;

    /* renamed from: c */
    public final C87673aa f265814c;

    /* renamed from: d */
    public final C95131x f265815d;

    /* renamed from: e */
    public final C21370a f265816e;

    /* renamed from: f */
    public long f265817f;

    public C95006x(Context context, C87673aa aaVar, C21370a aVar) {
        this.f265813b = context;
        this.f265814c = aaVar;
        this.f265816e = aVar;
        this.f265815d = new C95131x(aaVar);
    }

    /* renamed from: a */
    public static long m156856a(Bundle bundle) {
        if (!bundle.containsKey("com.google.android.apps.gsa.shared.bisto.QUERY_START_TIME_MILLIS")) {
            C58976aa aaVar = C58975e.f156826a;
            return 0;
        }
        long j = bundle.getLong("com.google.android.apps.gsa.shared.bisto.QUERY_START_TIME_MILLIS");
        C58976aa aaVar2 = C58975e.f156826a;
        return j;
    }

    /* renamed from: b */
    public final Bundle mo88913b(Bundle bundle, C124548d dVar) {
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("android.speech.extra.BEEP_SUPPRESSED", true);
        bundle2.putByteArray("android.opa.extra.QUERY_GACS_CAPABILITIES", bundle.getByteArray("android.opa.extra.QUERY_GACS_CAPABILITIES"));
        if (dVar != null && !dVar.mo106484Y()) {
            bundle2.putBoolean("android.opa.extra.EXTRA_BISTO_PR_DISALLOWED", !dVar.mo106488ab());
        }
        if (bundle.containsKey("android.opa.extra.VOICE_SEARCH_TTS_ENCODING")) {
            bundle2.putInt("android.opa.extra.VOICE_SEARCH_TTS_ENCODING", bundle.getInt("android.opa.extra.VOICE_SEARCH_TTS_ENCODING"));
        }
        if (bundle.getInt("android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ") != 0) {
            bundle2.putInt("android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ", bundle.getInt("android.opa.extra.VOICE_SEARCH_TTS_SAMPLE_RATE_HZ"));
        }
        if (dVar != null) {
            String d = C95130w.m157242d(this.f265813b, dVar.mo106472M(), dVar.mo106481V(), dVar.mo106513k(), bundle.getString("com.google.android.apps.gsa.shared.bisto.EXTRA_USER_AGENT_SUFFIX"));
            C59104x b = f265812a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaVoiceCM");
            ((C59052c) ((C59052c) b).mo56372aa(17836)).mo56389s("userAgent is %s", d);
            bundle2.putString("user-agent-suffix", d);
            bundle2.putString("android.opa.extra.DEVICE_MODEL_ID", dVar.mo106474O());
        }
        if (bundle.containsKey("android.opa.extra.EXTRA_HETERODYNE_TOKEN")) {
            bundle2.putString("android.opa.extra.EXTRA_HETERODYNE_TOKEN", bundle.getString("android.opa.extra.EXTRA_HETERODYNE_TOKEN"));
        }
        return bundle2;
    }

    /* renamed from: c */
    public final void mo88914c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f265815d.mo89056a();
        this.f265814c.mo81950v();
        this.f265814c.mo81930a(false);
    }

    /* renamed from: d */
    public final void mo88915d() {
        long nextLong;
        do {
            nextLong = C90719ac.f253778a.f253779b.nextLong();
            this.f265817f = nextLong;
        } while (nextLong == 0);
    }
}
