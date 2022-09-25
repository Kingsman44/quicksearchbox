package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7603ui.p7605b.p7606a;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7572c.C96922a;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7572c.C96941b;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7572c.C96942c;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7572c.C96943d;
import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7572c.C96945f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.ui.b.a.w */
/* compiled from: PG */
public final /* synthetic */ class C97182w implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C97158ah f271528a;

    public /* synthetic */ C97182w(C97158ah ahVar) {
        this.f271528a = ahVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C28292j jVar;
        C97158ah ahVar = this.f271528a;
        compoundButton.setEnabled(false);
        C96943d dVar = ahVar.f271471e;
        C60870cx j = dVar.f270959c.mo28210j(dVar.f270958b.mo90374a(), "GetSubscriptionsEntities", new C96922a(dVar, ahVar.f271475i, z));
        C22871g gVar = dVar.f270959c;
        C96945f fVar = dVar.f270960d;
        Objects.requireNonNull(fVar);
        new C90873ag(j, gVar, "subscriptionsUpdateResult", new C96941b(fVar)).mo85223a(C96942c.f270956a);
        C90875ai.m148465b(new C97178s(compoundButton), j, ahVar.f271470d, "BubbleEnableCheckbox").mo85223a(C97183x.f271529a);
        C28292j jVar2 = z ? ((C97168i) ahVar.f271476j).f271502b : ((C97168i) ahVar.f271476j).f271503c;
        if (z) {
            jVar = ((C97168i) ahVar.f271476j).f271503c;
        } else {
            jVar = ((C97168i) ahVar.f271476j).f271502b;
        }
        C89949q.m146521e(C28285c.m52883j(jVar, 5, (Integer) null), false);
        C89949q.m146521e(C28285c.m52879f(jVar2, true), false);
        C89949q.m146521e(C28285c.m52879f(jVar, false), false);
    }
}
