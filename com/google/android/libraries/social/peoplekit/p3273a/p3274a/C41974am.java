package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.view.View;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.am */
/* compiled from: PG */
final class C41974am implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Channel f109566a;

    /* renamed from: b */
    final /* synthetic */ C41979ar f109567b;

    public C41974am(C41979ar arVar, Channel channel) {
        this.f109567b = arVar;
        this.f109566a = channel;
    }

    public final void onClick(View view) {
        C42075e eVar = this.f109567b.f109579d;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144465f));
        peopleKitVisualElementPath.mo44564a(this.f109567b.f109582g.f109973a);
        eVar.mo44577c(4, peopleKitVisualElementPath);
        this.f109567b.f109588m.mo44596b(false, this.f109566a);
        this.f109567b.mo44437a();
    }
}
