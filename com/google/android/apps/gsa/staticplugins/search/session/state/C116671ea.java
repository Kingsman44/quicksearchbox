package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6519al.p6592bi.C84855a;
import com.google.android.apps.gsa.search.core.p6519al.p6680cx.C85247a;
import com.google.android.apps.gsa.shared.util.BitFlags;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4526f.p4534f.C59081b;
import dagger.C68214a;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ea */
/* compiled from: PG */
public final class C116671ea extends C116780ib {

    /* renamed from: a */
    public final C68214a f323539a;

    /* renamed from: b */
    public final BitFlags f323540b = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: c */
    public final C84855a f323541c;

    /* renamed from: d */
    public final C85247a f323542d;

    /* renamed from: e */
    boolean f323543e;

    /* renamed from: f */
    public boolean f323544f;

    /* renamed from: g */
    public boolean f323545g;

    /* renamed from: h */
    public boolean f323546h;

    /* renamed from: i */
    public long f323547i = -1;

    /* renamed from: j */
    public boolean f323548j;

    /* renamed from: k */
    public boolean f323549k;

    /* renamed from: l */
    public boolean f323550l;

    /* renamed from: m */
    private final C68214a f323551m;

    /* renamed from: n */
    private final C68214a f323552n;

    /* renamed from: o */
    private final SharedPreferences f323553o;

    /* renamed from: p */
    private boolean f323554p;

    /* renamed from: q */
    private long f323555q = -1;

    public C116671ea(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, SharedPreferences sharedPreferences, C84855a aVar5, C85247a aVar6) {
        super(aVar, 171);
        this.f323551m = aVar2;
        this.f323539a = aVar3;
        this.f323552n = aVar4;
        this.f323553o = sharedPreferences;
        this.f323541c = aVar5;
        this.f323542d = aVar6;
    }

    /* renamed from: e */
    public final void mo102827e(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        long j = ((C116569ag) this.f323551m.mo27525b()).f323268b;
        boolean t = ((C116569ag) this.f323551m.mo27525b()).f323267a.mo81902t();
        if (j != this.f323555q) {
            this.f323555q = j;
            C85247a aVar = this.f323542d;
            boolean z2 = false;
            if (t && z) {
                z2 = true;
            }
            aVar.mo78826f(z2);
        }
        if (this.f323540b.mo85055h(1, z)) {
            this.f323542d.mo78824d(z);
        }
    }

    /* renamed from: g */
    public final boolean mo102828g(C116569ag agVar, TtsState ttsState) {
        boolean z = this.f323554p;
        boolean z2 = this.f323553o.getBoolean("always_on_hotword_suppressed", false) && agVar.f323267a.mo81893k() && !ttsState.mo102767y();
        this.f323554p = z2;
        if (!z && z2) {
            this.f323541c.mo78550t();
        }
        return z != this.f323554p;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MicroDetectionSessionState");
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f323540b.mo85048b()));
        ArrayList arrayList = new ArrayList();
        if (this.f323543e) {
            arrayList.add("active assistant interaction");
        }
        fVar.mo85292s(C90752i.m148229c(arrayList.toString()));
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        if ("always_on_hotword_suppressed".equals(str) && mo102828g((C116569ag) this.f323551m.mo27525b(), (TtsState) this.f323552n.mo27525b())) {
            mo80591ar();
        }
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{"always_on_hotword_suppressed"};
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        boolean z = this.f323543e;
        arrayList.add("mIsActiveAssistantInteraction=" + z);
        boolean z2 = this.f323554p;
        arrayList.add("mUnenrollAlwaysOn=" + z2);
        String obj = arrayList.toString();
        String b = this.f323540b.mo85048b();
        return "MicroDetectionSessionState(state=" + obj + ", flags=" + b + ")";
    }
}
