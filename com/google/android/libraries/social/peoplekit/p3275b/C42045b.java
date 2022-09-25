package com.google.android.libraries.social.peoplekit.p3275b;

import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gsa.assistant.settings.features.people.C73436ff;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.C42138b;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.b.b */
/* compiled from: PG */
final class C42045b implements C42138b {

    /* renamed from: a */
    final /* synthetic */ C41960a f109861a;

    /* renamed from: b */
    final /* synthetic */ C42048e f109862b;

    public C42045b(C42048e eVar, C41960a aVar) {
        this.f109862b = eVar;
        this.f109861a = aVar;
    }

    /* renamed from: e */
    public final void mo44422e(Channel channel) {
        FooterLayout footerLayout;
        this.f109862b.mo44531b(channel);
        if (this.f109862b.f109877d.mo44746c().isEmpty()) {
            ((InputMethodManager) this.f109862b.f109875b.getSystemService("input_method")).hideSoftInputFromWindow(this.f109862b.f109874a.getWindowToken(), 0);
        }
        C41960a aVar = this.f109861a;
        C42096f.m73796a(channel, this.f109862b.f109875b);
        if (!(!this.f109862b.f109877d.f110228a.isEmpty()) && (footerLayout = ((C73436ff) aVar).f194426a.i) != null) {
            footerLayout.mo77360a().setEnabled(false);
        }
    }

    /* renamed from: f */
    public final void mo44423f(Channel channel, CoalescedChannels coalescedChannels) {
        this.f109862b.mo44531b(channel);
        C42075e eVar = this.f109862b.f109879f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144455R));
        peopleKitVisualElementPath.mo44564a(this.f109862b.f109880g.f109973a);
        eVar.mo44577c(1, peopleKitVisualElementPath);
    }

    /* renamed from: t */
    public final void mo44429t() {
    }
}
