package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85515b;
import com.google.android.apps.gsa.search.core.state.p6864a.C86787b;
import com.google.android.apps.gsa.search.core.state.p6864a.C86788c;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.search.p2904c.C37478d;
import com.google.android.libraries.search.p2904c.C37520e;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.aq */
/* compiled from: PG */
public final class C116579aq extends C116780ib {

    /* renamed from: a */
    public static final C59071e f323302a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.aq");

    /* renamed from: b */
    public final C68214a f323303b;

    /* renamed from: c */
    public final C68214a f323304c;

    /* renamed from: d */
    public final C85515b f323305d;

    /* renamed from: e */
    public final C58833ax f323306e;

    /* renamed from: f */
    public boolean f323307f;

    /* renamed from: g */
    public boolean f323308g;

    /* renamed from: h */
    public boolean f323309h;

    /* renamed from: i */
    public long f323310i = -1;

    /* renamed from: j */
    public C37520e f323311j;

    /* renamed from: k */
    public C37478d f323312k;

    /* renamed from: l */
    public boolean f323313l = false;

    /* renamed from: m */
    public long f323314m = 0;

    /* renamed from: n */
    public long f323315n;

    /* renamed from: o */
    private final C68214a f323316o;

    /* renamed from: p */
    private final C68214a f323317p;

    public C116579aq(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C85515b bVar, C58833ax axVar) {
        super(aVar, 179);
        this.f323303b = aVar2;
        this.f323316o = aVar3;
        this.f323317p = aVar4;
        this.f323304c = aVar5;
        this.f323305d = bVar;
        this.f323306e = axVar;
    }

    /* renamed from: ag */
    public final C87739bu[] mo80403ag() {
        return new C87739bu[]{C87739bu.TTS_STOP_SPEAKING};
    }

    /* renamed from: e */
    public final void mo102782e() {
        if (((C86788c) this.f323316o.mo27525b()).mo80439m()) {
            C58976aa aaVar = C58975e.f156826a;
            ((C86787b) this.f323317p.mo27525b()).mo80435i();
        }
    }

    /* renamed from: g */
    public final boolean mo102783g() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f323308g || this.f323307f;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AudioSessionState");
        ArrayList arrayList = new ArrayList();
        if (this.f323307f) {
            arrayList.add("need_audio_for_query");
        }
        if (this.f323308g) {
            arrayList.add("need_audio_for_tts");
        }
        fVar.mo85292s(C90752i.m148229c(arrayList.toString()));
        fVar.mo85279c("session id when last requesting audio").mo85276a(C90752i.m148230d(Long.valueOf(this.f323315n)));
    }

    /* renamed from: hr */
    public final void mo80408hr(long j, ClientEventData clientEventData) {
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (a.ordinal() == 40) {
            mo102782e();
        }
    }

    public final String toString() {
        boolean z = this.f323307f;
        String str = BuildConfig.FLAVOR;
        String str2 = true != z ? str : "need_audio_for_query, ";
        if (true == this.f323308g) {
            str = "need_audio_for_tts, ";
        }
        return "AudioSessionState[" + str2 + str + "]";
    }
}
