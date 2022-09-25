package com.google.android.libraries.onegoogle.accountmenu.features.p2359a.p2360a;

import android.content.Context;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30395bw;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30437e;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30463d;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C30501e implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C2332ag f82374a;

    /* renamed from: b */
    public final /* synthetic */ Context f82375b;

    /* renamed from: c */
    public final /* synthetic */ C30437e f82376c;

    public /* synthetic */ C30501e(C2332ag agVar, Context context, C30437e eVar) {
        this.f82374a = agVar;
        this.f82375b = context;
        this.f82376c = eVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30395bw bwVar;
        C2332ag agVar = this.f82374a;
        Context context = this.f82375b;
        C30437e eVar = this.f82376c;
        Boolean bool = (Boolean) obj;
        agVar.mo5708l(C58833ax.m90834k(C30463d.m56757a(context.getString(true != bool.booleanValue() ? R.string.og_search_history_off : R.string.og_search_history_on))));
        if (bool.booleanValue()) {
            bwVar = C30395bw.INDENTED_DIVIDER_ACTION_CARD;
        } else {
            bwVar = C30395bw.CUSTOM_ACTION_CARD;
        }
        eVar.f82169x = C58833ax.m90834k(bwVar);
    }
}
