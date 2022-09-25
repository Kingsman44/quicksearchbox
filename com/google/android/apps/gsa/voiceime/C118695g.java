package com.google.android.apps.gsa.voiceime;

import androidx.annotation.C0826b;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import com.google.android.apps.gsa.shared.util.p7159c.C90932cb;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4552o.amo;

/* renamed from: com.google.android.apps.gsa.voiceime.g */
/* compiled from: PG */
public final class C118695g {

    /* renamed from: a */
    public final C90932cb f331093a;

    /* renamed from: b */
    public final C87673aa f331094b;

    /* renamed from: c */
    public boolean f331095c;

    /* renamed from: d */
    private final ClientConfig f331096d;

    public C118695g(C90932cb cbVar, C87677ae aeVar, amo amo, C88499t tVar) {
        this.f331093a = cbVar;
        C88486g gVar = new C88486g();
        gVar.f239204f = "transcription";
        long j = true != amo.equals(amo.UNIFIED_IME) ? 4406636445696L : 4406636478464L;
        gVar.f239201c = amo;
        gVar.f239202d = 1;
        gVar.f239199a = j;
        ClientConfig clientConfig = new ClientConfig(gVar);
        this.f331096d = clientConfig;
        this.f331094b = aeVar.mo81958a(tVar, tVar, clientConfig);
    }

    /* renamed from: a */
    public final void mo103879a(C90904ba baVar) {
        if (C22872h.m42744d(C0826b.class)) {
            baVar.run();
        } else {
            this.f331093a.mo85151p(baVar);
        }
    }
}
