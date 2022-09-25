package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.text.TextUtils;
import android.view.View;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.z */
/* compiled from: PG */
final class C42007z implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ int f109697a;

    /* renamed from: b */
    final /* synthetic */ Channel f109698b;

    /* renamed from: c */
    final /* synthetic */ CoalescedChannels f109699c;

    /* renamed from: d */
    final /* synthetic */ C41967af f109700d;

    public C42007z(C41967af afVar, int i, Channel channel, CoalescedChannels coalescedChannels) {
        this.f109700d = afVar;
        this.f109697a = i;
        this.f109698b = channel;
        this.f109699c = coalescedChannels;
    }

    public final void onClick(View view) {
        C42075e eVar = this.f109700d.f109537i;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        C41952a aVar = new C41952a(C54941a.f144464e);
        aVar.f109502b = Integer.valueOf(this.f109697a);
        peopleKitVisualElementPath.f109973a.mo44369a(aVar);
        peopleKitVisualElementPath.f109973a.mo44369a(this.f109700d.mo44418a());
        peopleKitVisualElementPath.mo44564a(this.f109700d.f109540l.f109973a);
        eVar.mo44577c(4, peopleKitVisualElementPath);
        if (!this.f109700d.f109536h.mo44751g(this.f109698b)) {
            C41967af afVar = this.f109700d;
            if (afVar.f109536h.mo44751g(afVar.f109543o)) {
                C41967af afVar2 = this.f109700d;
                afVar2.f109536h.mo44749e(afVar2.f109543o);
            }
            this.f109700d.f109536h.mo44752h(this.f109698b, this.f109699c);
            if (!((PeopleKitConfigImpl) this.f109700d.f109538j).f110244k || this.f109698b.mo44621b() != 1 || !TextUtils.isEmpty(this.f109698b.mo44636q())) {
                C41967af afVar3 = this.f109700d;
                C41960a aVar2 = afVar3.f109541m;
                if (aVar2 != null) {
                    aVar2.mo44409a(this.f109698b.mo44626g(afVar3.f109529a));
                    return;
                }
                return;
            }
            this.f109700d.mo44419b(this.f109698b);
            return;
        }
        this.f109700d.f109536h.mo44749e(this.f109698b);
    }
}
