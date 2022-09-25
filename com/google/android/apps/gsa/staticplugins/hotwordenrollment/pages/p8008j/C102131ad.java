package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101783w;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ad */
/* compiled from: PG */
public final class C102131ad {

    /* renamed from: a */
    public static final C59071e f284923a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ad");

    /* renamed from: b */
    public final C102130ac f284924b;

    /* renamed from: c */
    public final C102128aa f284925c;

    /* renamed from: d */
    public final C46801dp f284926d;

    /* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.ad$a */
    /* compiled from: PG */
    final class C102132a implements C46792di {
        public C102132a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C102131ad.f284923a.mo56225c()).mo56382g(th)).mo56372aa(20579)).mo56386p("Failed to obtain unified opt in status from server");
            if (C102131ad.this.f284924b.isAdded()) {
                C47393f.m84236g(new C101783w(), C102131ad.this.f284924b);
            }
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            Boolean bool = (Boolean) obj;
            ((C59052c) ((C59052c) C102131ad.f284923a.mo56224b()).mo56372aa(20580)).mo56389s("onLoaded; shouldShowNonDismissableBanner = %b", bool);
            C102131ad adVar = C102131ad.this;
            boolean booleanValue = bool.booleanValue();
            ((C59052c) ((C59052c) C102131ad.f284923a.mo56224b()).mo56372aa(20583)).mo56389s("updateEnrollmentConfigAndShowContent; shouldShowNonDismissableBanner = %b", Boolean.valueOf(booleanValue));
            if (adVar.f284924b.isAdded()) {
                boolean z = false;
                adVar.f284924b.getView().findViewById(R.id.pending_enrollment_fragment_frame_layout).setVisibility(0);
                adVar.f284924b.getView().findViewById(R.id.loading_view).setVisibility(8);
                FragmentManager childFragmentManager = adVar.f284924b.getChildFragmentManager();
                Fragment b = childFragmentManager.f634a.mo670b(R.id.pending_enrollment_fragment_frame_layout);
                C59104x b2 = C102131ad.f284923a.mo56224b();
                if (b == null) {
                    z = true;
                }
                ((C59052c) ((C59052c) b2).mo56372aa(20584)).mo56389s("attachedFragment == null: %b", Boolean.valueOf(z));
                if (b == null) {
                    C0154a aVar = new C0154a(childFragmentManager);
                    C102141am amVar = (C102141am) C102142an.f284946c.createBuilder();
                    amVar.copyOnWrite();
                    C102142an anVar = (C102142an) amVar.instance;
                    anVar.f284948a |= 1;
                    anVar.f284949b = booleanValue;
                    C102144ap apVar = new C102144ap();
                    C68324h.m98669f(apVar);
                    C47243l.m84039a(apVar, (C102142an) amVar.build());
                    aVar.mo689v(R.id.pending_enrollment_fragment_frame_layout, apVar, (String) null);
                    aVar.mo509f();
                }
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C102131ad(C102130ac acVar, C46801dp dpVar, C102128aa aaVar) {
        this.f284924b = acVar;
        this.f284926d = dpVar;
        this.f284925c = aaVar;
    }
}
