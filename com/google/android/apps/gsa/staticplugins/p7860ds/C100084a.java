package com.google.android.apps.gsa.staticplugins.p7860ds;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6697de.C85351a;
import com.google.android.apps.gsa.search.core.p6519al.p6717do.C85403a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.speech.audio.p7263a.C92145g;
import com.google.android.ssb.C45350g;
import com.google.android.ssb.service.C45363i;

/* renamed from: com.google.android.apps.gsa.staticplugins.ds.a */
/* compiled from: PG */
public final class C100084a extends C86734a implements C85351a {

    /* renamed from: a */
    private final C92145g f279915a;

    /* renamed from: b */
    private final C85403a f279916b;

    public C100084a(C92145g gVar, C85403a aVar) {
        super(C118575h.WORKER_SSB_AUDIO, "ssb_audio");
        this.f279915a = gVar;
        this.f279916b = aVar;
    }

    /* renamed from: a */
    public final void mo78884a(int i) {
        if (this.f279915a.mo86801c() == 12) {
            this.f279916b.mo78923b(i);
        }
    }

    /* renamed from: c */
    public final void mo78885c(C45350g gVar) {
        C45363i.m80872e(gVar);
    }

    /* renamed from: hY */
    public final void mo79108hY() {
        C45363i.m80872e(C45350g.IDLE);
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
