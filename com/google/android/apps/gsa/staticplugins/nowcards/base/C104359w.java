package com.google.android.apps.gsa.staticplugins.nowcards.base;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.p4526f.C59052c;
import com.google.p375ai.p378b.C8194z;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.base.w */
/* compiled from: PG */
public final /* synthetic */ class C104359w implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104302ad f290410a;

    /* renamed from: b */
    public final /* synthetic */ BottomSheetListView f290411b;

    /* renamed from: c */
    public final /* synthetic */ C44565p f290412c;

    public /* synthetic */ C104359w(C104302ad adVar, BottomSheetListView bottomSheetListView, C44565p pVar) {
        this.f290410a = adVar;
        this.f290411b = bottomSheetListView;
        this.f290412c = pVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C104302ad adVar = this.f290410a;
        BottomSheetListView bottomSheetListView = this.f290411b;
        C44565p pVar = this.f290412c;
        if (adVar.f290107q.size() > i && i >= 0) {
            adVar.f290102l = adVar.f290096f.mo94079a((C8194z) adVar.f290107q.get(i), true, adVar.f290105o, adVar.f290092b, bottomSheetListView, adVar.f290098h, adVar.f290099i, adVar.f290101k, new C104361y(adVar));
            adVar.f290102l.mo94078b();
        } else if (!(view == null || view.getId() == R.id.close_back_of_card_view) || view == null) {
            ((C59052c) ((C59052c) C104302ad.f290091a.mo56226d()).mo56372aa(21934)).mo56386p("Clicked on an invalid card action.");
            int i2 = C90755l.f253831a;
        }
        pVar.dismiss();
    }
}
