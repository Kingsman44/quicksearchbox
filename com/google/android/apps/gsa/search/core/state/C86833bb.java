package com.google.android.apps.gsa.search.core.state;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85515b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.state.p6864a.C86787b;
import com.google.android.apps.gsa.search.core.state.p6864a.C86788c;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.search.p2904c.C37478d;
import com.google.android.libraries.search.p2904c.C37520e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.search.core.state.bb */
/* compiled from: PG */
public final class C86833bb extends C86898ct {

    /* renamed from: a */
    public static final C59071e f234523a = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.bb");

    /* renamed from: b */
    public final C68214a f234524b;

    /* renamed from: c */
    public final C68214a f234525c;

    /* renamed from: d */
    public final C85515b f234526d;

    /* renamed from: e */
    public final C86124t f234527e;

    /* renamed from: f */
    public final C58833ax f234528f;

    /* renamed from: g */
    public boolean f234529g;

    /* renamed from: h */
    public boolean f234530h;

    /* renamed from: i */
    public boolean f234531i;

    /* renamed from: j */
    public long f234532j = -1;

    /* renamed from: k */
    public C37520e f234533k;

    /* renamed from: l */
    public C37478d f234534l;

    /* renamed from: m */
    public boolean f234535m = false;

    /* renamed from: n */
    public long f234536n = 0;

    /* renamed from: o */
    public long f234537o;

    /* renamed from: p */
    private final C68214a f234538p;

    /* renamed from: q */
    private final C68214a f234539q;

    public C86833bb(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C85515b bVar, C86124t tVar, C58833ax axVar) {
        super(aVar, 73);
        this.f234524b = aVar2;
        this.f234538p = aVar3;
        this.f234539q = aVar4;
        this.f234525c = aVar5;
        this.f234526d = bVar;
        this.f234527e = tVar;
        this.f234528f = axVar;
    }

    /* renamed from: a */
    public final void mo80529a() {
        if (((C86788c) this.f234538p.mo27525b()).mo80439m()) {
            ((C86787b) this.f234539q.mo27525b()).mo80435i();
        }
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.TTS_STOP_SPEAKING};
    }

    /* renamed from: b */
    public final boolean mo80530b() {
        return this.f234530h || this.f234529g;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AudioSessionState");
        ArrayList arrayList = new ArrayList();
        if (this.f234529g) {
            arrayList.add("need_audio_for_query");
        }
        if (this.f234530h) {
            arrayList.add("need_audio_for_tts");
        }
        fVar.mo85292s(C90752i.m148229c(arrayList.toString()));
        fVar.mo85279c("session id when last requesting audio").mo85276a(C90752i.m148230d(Long.valueOf(this.f234537o)));
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        if (a == C87739bu.TTS_STOP_SPEAKING) {
            mo80529a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: hs */
    public final void mo80521hs(Bundle bundle) {
        if (this.f234527e.mo79746e(C90086ek.f250512j)) {
            this.f234529g = false;
            this.f234530h = false;
        }
    }

    public final String toString() {
        boolean z = this.f234529g;
        String str = BuildConfig.FLAVOR;
        String str2 = true != z ? str : "need_audio_for_query, ";
        if (true == this.f234530h) {
            str = "need_audio_for_tts, ";
        }
        return "AudioSessionState[" + str2 + str + "]";
    }
}
