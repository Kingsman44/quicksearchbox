package com.google.android.apps.gsa.assistant.settings.features.p538ad;

import android.widget.CompoundButton;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9796ac;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9805ak;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9808d;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9809e;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9810f;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9830z;
import com.google.apps.tiktok.dataservice.C46882v;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ad.p */
/* compiled from: PG */
public final /* synthetic */ class C9847p implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C9849r f33859a;

    public /* synthetic */ C9847p(C9849r rVar) {
        this.f33859a = rVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C9805ak akVar = this.f33859a.f33862b;
        int i = 1;
        if (true == z) {
            i = 2;
        }
        C9796ac acVar = (C9796ac) akVar;
        C60922j.m93045h(acVar.mo18046f(), C47810es.m84966f(new C9808d(i)), C60826bg.f164896a);
        C60870cx h = C60922j.m93045h(acVar.mo18044d(), C47810es.m84966f(new C9809e(i)), C60826bg.f164896a);
        C46882v vVar = new C46882v();
        vVar.f122320a = h;
        vVar.f122321b = "lockscreensettingsdata";
        vVar.f122322c = new C9810f(i);
        acVar.f33781c.mo50786a(vVar.mo50884a()).mo4106b(new C9830z(acVar), C60826bg.f164896a);
    }
}
