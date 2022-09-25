package com.google.android.libraries.onegoogle.accountmenu.features.education.p2367b;

import android.content.Context;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.C4833ak;
import com.airbnb.lottie.C4837ao;
import com.airbnb.lottie.C4972s;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p246g.C4958c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30554a;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30571r;
import com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c.C30572s;
import com.google.android.libraries.p2203m.p2204a.C28487a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.b.a */
/* compiled from: PG */
public final /* synthetic */ class C30550a implements C30554a {

    /* renamed from: a */
    public final /* synthetic */ String f82523a;

    public /* synthetic */ C30550a(String str) {
        this.f82523a = str;
    }

    /* renamed from: a */
    public final C30572s mo36212a(Context context) {
        String str = this.f82523a;
        C4825ac acVar = new C4825ac();
        C4833ak i = C4972s.m13751i(context, R.raw.og_search_history_education_animation, C4972s.m13754l(context, R.raw.og_search_history_education_animation));
        Objects.requireNonNull(acVar);
        i.mo9793e(new C30551b(acVar));
        acVar.f15342b.setRepeatCount(-1);
        C30571r rVar = new C30571r();
        rVar.f82586a = context;
        rVar.f82590e = 1;
        rVar.f82587b = str;
        rVar.f82589d = acVar;
        Objects.requireNonNull(acVar);
        rVar.f82588c = new C30552c(acVar);
        C30572s a = rVar.mo36256a();
        acVar.mo9756a(new C4890e("**"), C4829ag.f15366E, new C4958c(new C4837ao(C28487a.m53260a(a.getContext(), R.attr.colorControlNormal))));
        return a;
    }
}
