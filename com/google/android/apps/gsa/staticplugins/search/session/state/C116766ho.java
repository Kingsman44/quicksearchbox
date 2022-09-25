package com.google.android.apps.gsa.staticplugins.search.session.state;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.state.C86898ct;
import com.google.android.apps.gsa.search.core.state.C87116hk;
import com.google.android.apps.gsa.search.core.state.C87135ic;
import com.google.android.apps.gsa.search.core.state.C87138if;
import com.google.android.apps.gsa.search.core.state.C87140ih;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58512hu;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.ho */
/* compiled from: PG */
public final class C116766ho extends C87140ih implements SharedPreferences.OnSharedPreferenceChangeListener, C87138if {

    /* renamed from: h */
    public static final C59071e f323924h = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.search.session.state.ho");

    /* renamed from: i */
    public final C87140ih f323925i;

    /* renamed from: j */
    public final C86127w f323926j;

    /* renamed from: k */
    public final C68214a f323927k;

    /* renamed from: l */
    public final C68214a f323928l;

    /* renamed from: m */
    public final Set f323929m = new HashSet();

    /* renamed from: n */
    public boolean f323930n = false;

    /* renamed from: o */
    private final C22871g f323931o;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C116766ho(com.google.android.libraries.p1730f.C21370a r11, com.google.android.apps.gsa.search.core.p6805i.C86124t r12, com.google.common.p4522b.C58528ij r13, dagger.C68214a r14, com.google.android.apps.gsa.search.core.state.C87140ih r15, com.google.android.apps.gsa.search.core.p6805i.C86127w r16, com.google.android.libraries.gsa.p1876k.C22871g r17, dagger.C68214a r18, dagger.C68214a r19, com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a r20, com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a r21) {
        /*
            r10 = this;
            r9 = r10
            com.google.android.apps.gsa.search.core.state.hk r4 = com.google.android.apps.gsa.staticplugins.search.session.state.C116780ib.f323984I
            com.google.android.apps.gsa.search.core.state.hk r0 = com.google.android.apps.gsa.staticplugins.search.session.state.C116780ib.f323984I
            com.google.android.apps.gsa.search.core.state.hk r1 = com.google.android.apps.gsa.search.core.state.C86898ct.f234665C
            java.util.BitSet r2 = new java.util.BitSet
            r3 = 250(0xfa, float:3.5E-43)
            r2.<init>(r3)
            java.util.BitSet r0 = r0.f235369a
            r2.or(r0)
            java.util.BitSet r0 = r1.f235369a
            r2.or(r0)
            com.google.android.apps.gsa.search.core.state.hk r5 = com.google.android.apps.gsa.search.core.state.C87116hk.m140776a(r2)
            java.lang.String r8 = "SearchSessionEventBus"
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r14
            r6 = r20
            r7 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r9.f323929m = r0
            r0 = 0
            r9.f323930n = r0
            r0 = r15
            r9.f323925i = r0
            r0 = r16
            r9.f323926j = r0
            r0 = r17
            r9.f323931o = r0
            r0 = r18
            r9.f323927k = r0
            r0 = r19
            r9.f323928l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.search.session.state.C116766ho.<init>(com.google.android.libraries.f.a, com.google.android.apps.gsa.search.core.i.t, com.google.common.b.ij, dagger.a, com.google.android.apps.gsa.search.core.state.ih, com.google.android.apps.gsa.search.core.i.w, com.google.android.libraries.gsa.k.g, dagger.a, dagger.a, com.google.android.apps.gsa.shared.s.a.a, com.google.android.apps.gsa.shared.s.b.a):void");
    }

    /* renamed from: a */
    public final C87116hk mo80220a() {
        return C86898ct.f234665C;
    }

    /* renamed from: d */
    public final void mo80223d(C87135ic icVar) {
        mo80762p(icVar);
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C58512hu j = mo80758j();
        if (j.map.containsKey(str)) {
            this.f323931o.mo28212l("notify session states on preference changed", new C116765hn(j.mo55423a(str), str));
        }
    }
}
