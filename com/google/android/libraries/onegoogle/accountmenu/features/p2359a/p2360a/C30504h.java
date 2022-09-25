package com.google.android.libraries.onegoogle.accountmenu.features.p2359a.p2360a;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import com.google.android.apps.search.googleapp.accounts.p10126ui.features.C133301h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30353ah;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30365at;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30395bw;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30437e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30466g;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.a.a.h */
/* compiled from: PG */
final class C30504h implements C30353ah {

    /* renamed from: a */
    public C30437e f82385a;

    /* renamed from: b */
    private final C2333ah f82386b = new C30503g(this);

    /* renamed from: c */
    private final C2391v f82387c;

    /* renamed from: d */
    private final C2333ah f82388d;

    /* renamed from: e */
    private final String f82389e;

    /* renamed from: f */
    private final String f82390f;

    /* renamed from: g */
    private C30497a f82391g;

    /* renamed from: h */
    private final C133301h f82392h;

    public C30504h(Context context, C2391v vVar, C133301h hVar, C2333ah ahVar) {
        this.f82389e = context.getString(R.string.og_delete_search_history);
        this.f82390f = context.getString(R.string.og_delete_search_history_content_description);
        this.f82387c = vVar;
        this.f82388d = ahVar;
        this.f82392h = hVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C30365at mo35811a(Object obj) {
        C30497a aVar = this.f82391g;
        if (aVar != null) {
            aVar.f82367a.mo5679j(this.f82386b);
        }
        C30437e eVar = this.f82385a;
        if (eVar != null) {
            eVar.mo35943c(this.f82387c);
        }
        if (obj == null) {
            this.f82385a = null;
            this.f82391g = null;
            return null;
        }
        C30497a aVar2 = this.f82392h.f363240a;
        C46108a aVar3 = (C46108a) obj;
        aVar2.getClass();
        this.f82391g = aVar2;
        C30462c g = C30464e.m56760g();
        g.mo36054g(this.f82389e);
        C30466g gVar = (C30466g) g;
        gVar.f82291e = C58833ax.m90834k(this.f82390f);
        gVar.f82287a = new ColorDrawable();
        g.mo36055h(this.f82391g.mo36140a());
        g.mo36053f(R.id.og_search_history_trailing_card);
        g.mo36056i(112541);
        C30437e eVar2 = new C30437e(g.mo36048a());
        this.f82385a = eVar2;
        eVar2.f82169x = C58833ax.m90834k(C30395bw.INDENTED_DIVIDER_ACTION_CARD);
        C2333ah ahVar = this.f82388d;
        if (ahVar != null) {
            this.f82385a.mo35942b(this.f82387c, ahVar);
        }
        this.f82391g.f82367a.mo5704e(this.f82387c, this.f82386b);
        return this.f82385a;
    }
}
