package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.Intent;
import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m;
import com.google.android.apps.gsa.opaonboarding.p6463ui.FooterLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.eo */
/* compiled from: PG */
public final class C108669eo extends C83907bm {

    /* renamed from: b */
    public C108664ej f302246b;

    /* renamed from: c */
    public C83893b f302247c;

    /* renamed from: d */
    private C108667em f302248d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean equals = (intent == null || !intent.hasExtra("assistant_handoff_result_message")) ? i2 == -1 : "ok".equals(intent.getStringExtra("assistant_handoff_result_message"));
        for (C108679ey eyVar : this.f302246b.f302230c) {
            if (eyVar.f302275d) {
                eyVar.f302275d = false;
                if (equals) {
                    eyVar.f302274c = true;
                    this.f302248d.mObservable.mo2879a();
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        OpaPageLayout opaPageLayout = (OpaPageLayout) layoutInflater.inflate(R.layout.fragment_media_linking, (ViewGroup) null);
        HeaderLayout headerLayout = (HeaderLayout) opaPageLayout.findViewById(R.id.opa_header);
        C84018m.m133908c(headerLayout.f228718a, C84018m.m133906a(R.string.media_linking_title, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        C84018m.m133908c(headerLayout.f228719b, C84018m.m133906a(R.string.media_linking_description, headerLayout), TextView.BufferType.NORMAL, headerLayout);
        opaPageLayout.getClass();
        FooterLayout footerLayout = opaPageLayout.f228726a;
        footerLayout.mo77362c(1);
        C84018m.m133907b(footerLayout.mo77360a(), R.string.next, footerLayout);
        footerLayout.mo77360a().setOnClickListener(new C89943l(new C108668en(this)));
        RecyclerView recyclerView = (RecyclerView) opaPageLayout.findViewById(R.id.music_providers_linking);
        recyclerView.getClass();
        C108667em emVar = new C108667em(getActivity(), this, this.f302246b, this.f302247c);
        this.f302248d = emVar;
        recyclerView.setAdapter(emVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return opaPageLayout;
    }
}
