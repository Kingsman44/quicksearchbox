package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.view.View;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42009b;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.d */
/* compiled from: PG */
final class C42058d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Channel f109926a;

    /* renamed from: b */
    final /* synthetic */ C42064j f109927b;

    public C42058d(C42064j jVar, Channel channel) {
        this.f109927b = jVar;
        this.f109926a = channel;
    }

    public final void onClick(View view) {
        C42075e eVar = this.f109927b.f109942f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144472m));
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144469j));
        peopleKitVisualElementPath.mo44564a(this.f109927b.f109941e.f109973a);
        eVar.mo44577c(4, peopleKitVisualElementPath);
        this.f109926a.mo44615G();
        Channel channel = this.f109926a;
        if (channel.mo44611C()) {
            C42064j jVar = this.f109927b;
            jVar.f109938b.setText(C42096f.m73804i(channel, jVar.f109939c));
        } else {
            C42064j jVar2 = this.f109927b;
            jVar2.f109938b.setText(channel.mo44630k(jVar2.f109939c));
        }
        this.f109927b.f109945i.dismiss();
        C42009b bVar = this.f109927b.f109953q;
        if (bVar != null) {
            bVar.f109704a.mo44498p();
        }
    }
}
