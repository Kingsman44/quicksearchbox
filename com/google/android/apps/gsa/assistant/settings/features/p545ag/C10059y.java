package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import android.content.DialogInterface;
import android.support.p033v7.app.C0392m;
import android.view.View;
import com.google.apps.tiktok.tracing.C47591co;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.y */
/* compiled from: PG */
public final /* synthetic */ class C10059y implements DialogInterface.OnShowListener {

    /* renamed from: a */
    public final /* synthetic */ C10005ad f34303a;

    /* renamed from: b */
    public final /* synthetic */ View f34304b;

    /* renamed from: c */
    public final /* synthetic */ C0392m f34305c;

    /* renamed from: d */
    public final /* synthetic */ View f34306d;

    public /* synthetic */ C10059y(C10005ad adVar, View view, C0392m mVar, View view2) {
        this.f34303a = adVar;
        this.f34304b = view;
        this.f34305c = mVar;
        this.f34306d = view2;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C10005ad adVar = this.f34303a;
        View view = this.f34304b;
        C0392m mVar = this.f34305c;
        View view2 = this.f34306d;
        view.setOnClickListener(new C47591co(adVar.f34199c, "WarmActionsSettingsCallsOptInDialogFragment:positiveButton clicked", new C10003ab(adVar, mVar)));
        view2.setOnClickListener(new C47591co(adVar.f34199c, "WarmActionsSettingsCallsOptInDialogFragment:negativeButton clicked", new C10004ac(adVar, mVar)));
    }
}
