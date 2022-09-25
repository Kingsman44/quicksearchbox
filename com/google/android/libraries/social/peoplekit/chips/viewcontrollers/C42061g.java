package com.google.android.libraries.social.peoplekit.chips.viewcontrollers;

import android.view.View;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.chips.viewcontrollers.g */
/* compiled from: PG */
final class C42061g implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Channel f109931a;

    /* renamed from: b */
    final /* synthetic */ C42064j f109932b;

    public C42061g(C42064j jVar, Channel channel) {
        this.f109932b = jVar;
        this.f109931a = channel;
    }

    public final void onClick(View view) {
        C42075e eVar = this.f109932b.f109942f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144474o));
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144469j));
        peopleKitVisualElementPath.mo44564a(this.f109932b.f109941e.f109973a);
        eVar.mo44577c(4, peopleKitVisualElementPath);
        this.f109932b.f109945i.dismiss();
        this.f109932b.f109943g.mo44749e(this.f109931a);
    }
}
