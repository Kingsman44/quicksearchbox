package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.view.View;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.i */
/* compiled from: PG */
final class C42063i implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Channel f109934a;

    /* renamed from: b */
    final /* synthetic */ Channel f109935b;

    /* renamed from: c */
    final /* synthetic */ C42064j f109936c;

    public C42063i(C42064j jVar, Channel channel, Channel channel2) {
        this.f109936c = jVar;
        this.f109934a = channel;
        this.f109935b = channel2;
    }

    public final void onClick(View view) {
        if (!this.f109936c.f109943g.mo44751g(this.f109934a)) {
            C42064j jVar = this.f109936c;
            jVar.f109948l = true;
            jVar.f109943g.mo44749e(this.f109935b);
            C42064j jVar2 = this.f109936c;
            jVar2.f109943g.mo44752h(this.f109934a, jVar2.f109938b.f109916a.f109919b);
            this.f109936c.f109948l = false;
        }
        this.f109936c.f109945i.dismiss();
    }
}
