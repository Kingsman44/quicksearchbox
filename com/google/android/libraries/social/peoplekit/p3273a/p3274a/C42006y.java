package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.view.View;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.y */
/* compiled from: PG */
final class C42006y implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CoalescedChannels f109695a;

    /* renamed from: b */
    final /* synthetic */ C41967af f109696b;

    public C42006y(C41967af afVar, CoalescedChannels coalescedChannels) {
        this.f109696b = afVar;
        this.f109695a = coalescedChannels;
    }

    public final void onClick(View view) {
        this.f109696b.mo44424g(this.f109695a);
        C42075e eVar = this.f109696b.f109537i;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144478s));
        peopleKitVisualElementPath.f109973a.mo44369a(this.f109696b.mo44418a());
        peopleKitVisualElementPath.mo44564a(this.f109696b.f109540l.f109973a);
        eVar.mo44577c(4, peopleKitVisualElementPath);
        C41967af afVar = this.f109696b;
        afVar.mo44420c(afVar.f109535g.getVisibility() == 8, true);
        this.f109696b.mo44421d();
    }
}
