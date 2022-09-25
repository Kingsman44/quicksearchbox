package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.support.p031v4.app.C0167am;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.assistant.settings.shared.ui.SectionHeaderView;
import com.google.android.apps.gsa.assistant.shared.C73843bj;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.aw */
/* compiled from: PG */
public final /* synthetic */ class C9668aw implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C9670ay f33439a;

    public /* synthetic */ C9668aw(C9670ay ayVar) {
        this.f33439a = ayVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C0167am activity;
        LinearLayout linearLayout;
        C9670ay ayVar = this.f33439a;
        C58485gu<C73843bj> guVar = (C58485gu) obj;
        if (!guVar.isEmpty() && (activity = ayVar.getActivity()) != null && (linearLayout = (LinearLayout) ayVar.getView()) != null) {
            linearLayout.removeAllViews();
            SectionHeaderView sectionHeaderView = new SectionHeaderView(activity);
            sectionHeaderView.b(R.string.nexus_device_supporting_devices_title);
            linearLayout.addView(sectionHeaderView);
            for (C73843bj bjVar : guVar) {
                ItemView inflate = LayoutInflater.from(activity).inflate(R.layout.supporting_device_item_view, (ViewGroup) null, false);
                inflate.p(bjVar.mo65326b());
                inflate.setOnClickListener(new C9667av(ayVar, bjVar));
                linearLayout.addView(inflate);
            }
        }
    }
}
