package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.w */
/* compiled from: PG */
final class C42004w implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ CoalescedChannels f109688a;

    /* renamed from: b */
    final /* synthetic */ C41967af f109689b;

    public C42004w(C41967af afVar, CoalescedChannels coalescedChannels) {
        this.f109689b = afVar;
        this.f109688a = coalescedChannels;
    }

    public final void onClick(View view) {
        C41967af afVar = this.f109689b;
        if (!afVar.f109536h.mo44751g(afVar.f109543o)) {
            C42075e eVar = this.f109689b.f109537i;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.f109973a.mo44369a(this.f109689b.mo44418a());
            peopleKitVisualElementPath.mo44564a(this.f109689b.f109540l.f109973a);
            eVar.mo44577c(4, peopleKitVisualElementPath);
            C41967af afVar2 = this.f109689b;
            afVar2.f109536h.mo44752h(afVar2.f109543o, this.f109688a);
            C41967af afVar3 = this.f109689b;
            if (!((PeopleKitConfigImpl) afVar3.f109538j).f110244k || afVar3.f109543o.mo44621b() != 1 || !TextUtils.isEmpty(this.f109689b.f109543o.mo44636q())) {
                C41967af afVar4 = this.f109689b;
                C41960a aVar = afVar4.f109541m;
                if (aVar != null) {
                    aVar.mo44409a(afVar4.f109543o.mo44626g(afVar4.f109529a));
                    return;
                }
                return;
            }
            C41967af afVar5 = this.f109689b;
            afVar5.mo44419b(afVar5.f109543o);
            return;
        }
        C42075e eVar2 = this.f109689b.f109537i;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.f109973a.mo44369a(this.f109689b.mo44418a());
        peopleKitVisualElementPath2.mo44564a(this.f109689b.f109540l.f109973a);
        eVar2.mo44577c(4, peopleKitVisualElementPath2);
        C41967af afVar6 = this.f109689b;
        afVar6.f109536h.mo44749e(afVar6.f109543o);
    }
}
