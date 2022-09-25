package com.google.android.libraries.onegoogle.accountmenu.features.p2359a.p2360a;

import android.content.Context;
import android.support.p033v7.widget.C0678gm;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.C133301h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30353ah;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30365at;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30437e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;
import com.google.apps.tiktok.account.data.C46108a;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.a.a.f */
/* compiled from: PG */
final class C30502f implements C30353ah {

    /* renamed from: a */
    private final Context f82377a;

    /* renamed from: b */
    private final C2391v f82378b;

    /* renamed from: c */
    private final C2333ah f82379c;

    /* renamed from: d */
    private C2333ah f82380d;

    /* renamed from: e */
    private C30497a f82381e;

    /* renamed from: f */
    private C30437e f82382f;

    /* renamed from: g */
    private final C133301h f82383g;

    public C30502f(Context context, C2391v vVar, C133301h hVar, C2333ah ahVar) {
        this.f82377a = context;
        this.f82383g = hVar;
        this.f82378b = vVar;
        this.f82379c = ahVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C30365at mo35811a(Object obj) {
        C2333ah ahVar;
        C30497a aVar = this.f82381e;
        if (!(aVar == null || (ahVar = this.f82380d) == null)) {
            aVar.f82367a.mo5679j(ahVar);
        }
        C30437e eVar = this.f82382f;
        if (eVar != null) {
            eVar.mo35943c(this.f82378b);
        }
        if (obj == null) {
            this.f82382f = null;
            this.f82380d = null;
            this.f82381e = null;
            return null;
        }
        C46108a aVar2 = (C46108a) obj;
        this.f82381e = this.f82383g.f363240a;
        C2332ag agVar = new C2332ag();
        C30462c g = C30464e.m56760g();
        g.mo36052e(C0678gm.m2375e().mo3100c(this.f82377a, R.drawable.quantum_gm_ic_history_black_24));
        g.mo36054g(this.f82377a.getString(R.string.og_search_history));
        g.mo36055h(this.f82381e.mo36141b());
        ((C30466g) g).f82290d = agVar;
        g.mo36056i(112542);
        C30437e eVar2 = new C30437e(g.mo36048a());
        this.f82382f = eVar2;
        C2333ah ahVar2 = this.f82379c;
        if (ahVar2 != null) {
            eVar2.mo35942b(this.f82378b, ahVar2);
        }
        this.f82380d = new C30501e(agVar, this.f82377a, this.f82382f);
        this.f82381e.f82367a.mo5704e(this.f82378b, this.f82380d);
        return this.f82382f;
    }
}
