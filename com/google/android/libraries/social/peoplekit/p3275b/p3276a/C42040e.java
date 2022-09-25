package com.google.android.libraries.social.peoplekit.p3275b.p3276a;

import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.C42138b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;

/* renamed from: com.google.android.libraries.social.peoplekit.b.a.e */
/* compiled from: PG */
public final class C42040e implements C42138b {

    /* renamed from: a */
    final /* synthetic */ C42044i f109841a;

    public C42040e(C42044i iVar) {
        this.f109841a = iVar;
    }

    /* renamed from: e */
    public final void mo44422e(Channel channel) {
        if (this.f109841a.f109848d.mo44744a() == 0) {
            this.f109841a.mo44526a(false);
            C42044i iVar = this.f109841a;
            if (((PeopleKitConfigImpl) iVar.f109849e).f110241h) {
                iVar.f109847c.setVisibility(8);
            }
        }
    }

    /* renamed from: f */
    public final void mo44423f(Channel channel, CoalescedChannels coalescedChannels) {
        this.f109841a.mo44526a(true);
        C42044i iVar = this.f109841a;
        if (((PeopleKitConfigImpl) iVar.f109849e).f110241h) {
            iVar.f109847c.setVisibility(0);
        }
    }

    /* renamed from: t */
    public final void mo44429t() {
    }
}
