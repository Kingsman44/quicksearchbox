package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.DialogInterface;
import android.support.p031v4.app.C0167am;
import android.support.p033v7.app.C0391l;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.shared.util.C90736at;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.bf */
/* compiled from: PG */
public final /* synthetic */ class C9691bf implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9692bg f33488a;

    /* renamed from: b */
    public final /* synthetic */ int f33489b;

    /* renamed from: c */
    public final /* synthetic */ String[] f33490c;

    /* renamed from: d */
    public final /* synthetic */ String[] f33491d;

    /* renamed from: e */
    public final /* synthetic */ C58881cr f33492e;

    /* renamed from: f */
    public final /* synthetic */ int f33493f;

    /* renamed from: g */
    public final /* synthetic */ ItemView f33494g;

    /* renamed from: h */
    public final /* synthetic */ C90736at f33495h;

    public /* synthetic */ C9691bf(C9692bg bgVar, int i, String[] strArr, String[] strArr2, C58881cr crVar, int i2, ItemView itemView, C90736at atVar) {
        this.f33488a = bgVar;
        this.f33489b = i;
        this.f33490c = strArr;
        this.f33491d = strArr2;
        this.f33492e = crVar;
        this.f33493f = i2;
        this.f33494g = itemView;
        this.f33495h = atVar;
    }

    public final void onClick(View view) {
        C9692bg bgVar = this.f33488a;
        int i = this.f33489b;
        String[] strArr = this.f33490c;
        String[] strArr2 = this.f33491d;
        C58881cr crVar = this.f33492e;
        int i2 = this.f33493f;
        ItemView itemView = this.f33494g;
        C90736at atVar = this.f33495h;
        C0167am activity = bgVar.getActivity();
        if (activity == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C0391l lVar = new C0391l(activity);
        lVar.mo1307l(i);
        lVar.mo1295b(strArr, C9692bg.m24414d(strArr2, (String) crVar.mo6453a(), i2), new C9671az(itemView, strArr, atVar, strArr2));
        lVar.setNegativeButton(R.string.assistant_settings_cancel, (DialogInterface.OnClickListener) null);
        lVar.create().show();
    }
}
