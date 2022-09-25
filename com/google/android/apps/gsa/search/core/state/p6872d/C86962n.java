package com.google.android.apps.gsa.search.core.state.p6872d;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6519al.p6711dl.C85392b;
import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85515b;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.p6864a.C86787b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.core.state.d.n */
/* compiled from: PG */
public final class C86962n extends C86898ct implements C86787b {

    /* renamed from: d */
    private static final C59071e f234887d = C59071e.m91332i("com.google.android.apps.gsa.search.core.state.d.n");

    /* renamed from: a */
    public boolean f234888a;

    /* renamed from: b */
    public boolean f234889b;

    /* renamed from: c */
    public int f234890c = 1;

    /* renamed from: e */
    private final C85515b f234891e;

    /* renamed from: f */
    private final C85392b f234892f;

    /* renamed from: g */
    private boolean f234893g;

    /* renamed from: h */
    private boolean f234894h;

    /* renamed from: i */
    private final Set f234895i = new HashSet();

    public C86962n(C68214a aVar, C85515b bVar, C85392b bVar2) {
        super(aVar, 0);
        this.f234891e = bVar;
        this.f234892f = bVar2;
    }

    /* renamed from: o */
    private final void m140373o() {
        if (!mo80440n()) {
            this.f234891e.mo79030f();
        }
    }

    /* renamed from: a */
    public final void mo80428a(long j) {
        boolean n = mo80440n();
        if (!this.f234895i.remove(Long.valueOf(j))) {
            ((C59052c) ((C59052c) f234887d.mo56226d()).mo56372aa(9101)).mo56388r("Attempting to release audio for session %d that is not using it", j);
            int i = C90755l.f253831a;
        }
        m140373o();
        if (n != mo80440n()) {
            mo80591ar();
        }
    }

    /* renamed from: b */
    public final void mo80429b(long j) {
        boolean n = mo80440n();
        if (!this.f234895i.add(Long.valueOf(j))) {
            ((C59052c) ((C59052c) f234887d.mo56226d()).mo56372aa(9103)).mo56388r("Attempting to request audio for session %d that already has audio", j);
        }
        if (n != mo80440n()) {
            mo80591ar();
        }
    }

    /* renamed from: c */
    public final void mo80430c() {
        this.f234894h = false;
        if (this.f234893g) {
            this.f234893g = false;
            m140373o();
            mo80591ar();
        }
    }

    /* renamed from: e */
    public final void mo80431e() {
        this.f234894h = true;
        if (!this.f234893g) {
            this.f234893g = true;
            mo80591ar();
        }
    }

    /* renamed from: f */
    public final void mo80432f() {
        this.f234894h = true;
    }

    /* renamed from: g */
    public final void mo80433g() {
        if (!this.f234888a) {
            ((C59052c) ((C59052c) f234887d.mo56226d()).mo56372aa(9108)).mo56386p("Tts is already done");
        }
        this.f234888a = false;
        mo80437k(1);
        mo80591ar();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("AudioState");
        ArrayList arrayList = new ArrayList();
        if (this.f234893g) {
            arrayList.add("need_audio_for_pending_beeps");
        }
        if (this.f234894h) {
            arrayList.add("need_audio_for_pending_beeps_sync");
        }
        if (this.f234889b) {
            arrayList.add("system_spoken_feedback_enabled");
        }
        fVar.mo85292s(C90752i.m148229c(arrayList.toString()));
        fVar.mo85279c("Sessions using audio:").mo85276a(C90752i.m148231e(this.f234895i));
    }

    /* renamed from: h */
    public final void mo80434h() {
        if (this.f234888a) {
            ((C59052c) ((C59052c) f234887d.mo56226d()).mo56372aa(9110)).mo56386p("Tts is already playing");
        }
        this.f234888a = true;
        mo80437k(1);
        mo80591ar();
    }

    /* renamed from: i */
    public final void mo80435i() {
        if (this.f234888a) {
            this.f234892f.mo78914c();
        }
        mo80437k(1);
    }

    /* renamed from: j */
    public final void mo80436j(boolean z) {
        if (z != this.f234889b) {
            this.f234889b = z;
            mo80591ar();
        }
    }

    /* renamed from: k */
    public final void mo80437k(int i) {
        if (!this.f234888a && i != 1) {
            ((C59052c) ((C59052c) f234887d.mo56225c()).mo56372aa(9112)).mo56386p("Trying to set status when tts is not available");
            i = 1;
        }
        if (this.f234890c != i) {
            this.f234890c = i;
            mo80591ar();
        }
    }

    /* renamed from: l */
    public final boolean mo80438l() {
        return this.f234889b;
    }

    /* renamed from: m */
    public final boolean mo80439m() {
        return this.f234888a;
    }

    /* renamed from: n */
    public final boolean mo80440n() {
        return this.f234893g || this.f234894h || !this.f234895i.isEmpty();
    }

    public final String toString() {
        boolean z = this.f234893g;
        String str = BuildConfig.FLAVOR;
        String str2 = true != z ? str : "need_audio_for_pending_beeps, ";
        if (true == this.f234889b) {
            str = "system_spoken_feedback_enabled, ";
        }
        return "AudioState[" + str2 + str + "]";
    }
}
