package com.google.android.apps.gsa.search.core.state;

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

/* renamed from: com.google.android.apps.gsa.search.core.state.dl */
/* compiled from: PG */
public final class C86986dl extends C86898ct {

    /* renamed from: a */
    public final C68214a f234939a;

    /* renamed from: b */
    public final BitFlags f234940b = new BitFlags(getClass(), "FLAG_", 0);

    /* renamed from: c */
    public final C84855a f234941c;

    /* renamed from: d */
    public final C85247a f234942d;

    /* renamed from: e */
    boolean f234943e;

    /* renamed from: f */
    public boolean f234944f;

    /* renamed from: g */
    public boolean f234945g;

    /* renamed from: h */
    public boolean f234946h;

    /* renamed from: i */
    public long f234947i = -1;

    /* renamed from: j */
    public boolean f234948j;

    /* renamed from: k */
    public boolean f234949k;

    /* renamed from: l */
    public boolean f234950l;

    /* renamed from: m */
    public boolean f234951m;

    /* renamed from: n */
    private final C68214a f234952n;

    /* renamed from: o */
    private final C68214a f234953o;

    /* renamed from: p */
    private final SharedPreferences f234954p;

    /* renamed from: q */
    private boolean f234955q;

    /* renamed from: r */
    private long f234956r = -1;

    public C86986dl(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, SharedPreferences sharedPreferences, C84855a aVar5, C85247a aVar6) {
        super(aVar, 67);
        this.f234952n = aVar2;
        this.f234939a = aVar3;
        this.f234953o = aVar4;
        this.f234954p = sharedPreferences;
        this.f234941c = aVar5;
        this.f234942d = aVar6;
    }

    /* renamed from: a */
    public final void mo80623a(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        C59081b.m91349a(C58979ad.FULL, "stack size");
        long j = ((C86812ai) this.f234952n.mo27525b()).f234472b;
        boolean t = ((C86812ai) this.f234952n.mo27525b()).f234471a.mo81902t();
        if (j != this.f234956r) {
            this.f234956r = j;
            C85247a aVar = this.f234942d;
            boolean z2 = false;
            if (t && z) {
                z2 = true;
            }
            aVar.mo78826f(z2);
        }
        if (this.f234940b.mo85055h(1, z)) {
            this.f234942d.mo78824d(z);
        }
    }

    /* renamed from: e */
    public final boolean mo80624e(C86812ai aiVar, TtsState ttsState) {
        boolean z = this.f234955q;
        boolean z2 = this.f234954p.getBoolean("always_on_hotword_suppressed", false) && aiVar.f234471a.mo81893k() && !ttsState.mo80423y();
        this.f234955q = z2;
        if (!z && z2) {
            this.f234941c.mo78550t();
        }
        return z != this.f234955q;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("MicroDetectionSessionState");
        fVar.mo85279c("flags").mo85276a(C90752i.m148229c(this.f234940b.mo85048b()));
        ArrayList arrayList = new ArrayList();
        if (this.f234943e) {
            arrayList.add("active assistant interaction");
        }
        fVar.mo85292s(C90752i.m148229c(arrayList.toString()));
    }

    /* renamed from: hl */
    public final void mo80592hl(String str) {
        if ("always_on_hotword_suppressed".equals(str) && mo80624e((C86812ai) this.f234952n.mo27525b(), (TtsState) this.f234953o.mo27525b())) {
            mo80591ar();
        }
    }

    /* renamed from: hp */
    public final String[] mo80593hp() {
        return new String[]{"always_on_hotword_suppressed"};
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        boolean z = this.f234943e;
        arrayList.add("mIsActiveAssistantInteraction=" + z);
        boolean z2 = this.f234955q;
        arrayList.add("mUnenrollAlwaysOn=" + z2);
        String obj = arrayList.toString();
        String b = this.f234940b.mo85048b();
        return "MicroDetectionSessionState(state=" + obj + ", flags=" + b + ")";
    }
}
