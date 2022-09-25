package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8113a;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.nowcards.base.BottomSheetListView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.base.C58833ax;
import com.google.p375ai.p378b.C7530ar;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.a.b */
/* compiled from: PG */
public final /* synthetic */ class C104717b implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C104798e f291679a;

    /* renamed from: b */
    public final /* synthetic */ LinearLayout f291680b;

    /* renamed from: c */
    public final /* synthetic */ BottomSheetListView f291681c;

    /* renamed from: d */
    public final /* synthetic */ C44565p f291682d;

    public /* synthetic */ C104717b(C104798e eVar, LinearLayout linearLayout, BottomSheetListView bottomSheetListView, C44565p pVar) {
        this.f291679a = eVar;
        this.f291680b = linearLayout;
        this.f291681c = bottomSheetListView;
        this.f291682d = pVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C104798e eVar = this.f291679a;
        LinearLayout linearLayout = this.f291680b;
        BottomSheetListView bottomSheetListView = this.f291681c;
        C44565p pVar = this.f291682d;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            ((TextView) linearLayout.findViewById(R.id.header_text_view)).setText(((C7530ar) axVar.mo56107c()).f26072b);
            bottomSheetListView.setAdapter(new C104771d(eVar.f292016b, ((C7530ar) axVar.mo56107c()).f26071a));
            bottomSheetListView.setOnItemClickListener(new C104690a(eVar, pVar));
        }
    }
}
