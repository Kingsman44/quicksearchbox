package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.content.DialogInterface;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.android.apps.gsa.shared.util.C90736at;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.az */
/* compiled from: PG */
public final /* synthetic */ class C9671az implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ItemView f33445a;

    /* renamed from: b */
    public final /* synthetic */ String[] f33446b;

    /* renamed from: c */
    public final /* synthetic */ C90736at f33447c;

    /* renamed from: d */
    public final /* synthetic */ String[] f33448d;

    public /* synthetic */ C9671az(ItemView itemView, String[] strArr, C90736at atVar, String[] strArr2) {
        this.f33445a = itemView;
        this.f33446b = strArr;
        this.f33447c = atVar;
        this.f33448d = strArr2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ItemView itemView = this.f33445a;
        String[] strArr = this.f33446b;
        C90736at atVar = this.f33447c;
        String[] strArr2 = this.f33448d;
        itemView.o(strArr[i]);
        atVar.mo17700a(strArr2[i]);
        dialogInterface.dismiss();
    }
}
