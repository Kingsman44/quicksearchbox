package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.appwidget.AppWidgetManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16782d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16789g;
import com.google.assistant.p3931f.p3942e.C52920a;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.aj */
/* compiled from: PG */
final class C16801aj {

    /* renamed from: a */
    public static final C59071e f49191a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.aj");

    /* renamed from: b */
    public final View f49192b;

    /* renamed from: c */
    public final C16782d f49193c;

    /* renamed from: d */
    public final AppWidgetManager f49194d;

    /* renamed from: e */
    public final C16789g f49195e;

    /* renamed from: f */
    public final Optional f49196f;

    /* renamed from: g */
    public ViewGroup f49197g;

    /* renamed from: h */
    public C16799ah f49198h;

    /* renamed from: i */
    public int f49199i;

    /* renamed from: j */
    public boolean f49200j;

    /* renamed from: k */
    public Bundle f49201k = Bundle.EMPTY;

    /* renamed from: l */
    private final C52920a f49202l = new C16798ag(this);

    public C16801aj(C16782d dVar, AppWidgetManager appWidgetManager, View view, Optional optional) {
        this.f49193c = dVar;
        this.f49194d = appWidgetManager;
        this.f49192b = view;
        this.f49196f = optional;
        this.f49198h = new C16799ah(view.getContext());
        this.f49195e = new C16789g(view);
    }

    /* renamed from: a */
    public final Bundle mo23026a() {
        Bundle bundle = new Bundle();
        bundle.putString("DeviceType", "AutoProjected");
        C16789g gVar = this.f49195e;
        bundle.putInt("appWidgetMaxWidth", gVar.mo23015d(gVar.mo23013b()));
        C16789g gVar2 = this.f49195e;
        bundle.putInt("appWidgetMaxHeight", gVar2.mo23015d(gVar2.mo23012a()));
        C16789g gVar3 = this.f49195e;
        bundle.putInt("appWidgetMinWidth", gVar3.mo23015d(gVar3.mo23013b()));
        C16789g gVar4 = this.f49195e;
        bundle.putInt("appWidgetMinHeight", gVar4.mo23015d(gVar4.mo23012a()));
        C52920a aVar = this.f49202l;
        aVar.asBinder();
        bundle.putBinder("appActionsWidgetExtensionSender", aVar);
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo23027b() {
        ViewGroup viewGroup = this.f49197g;
        if (viewGroup != null) {
            if (viewGroup.getChildCount() != 0) {
                this.f49197g.getChildAt(0).setVisibility(8);
            }
            this.f49197g.removeAllViews();
            this.f49197g.setVisibility(8);
        }
        C16799ah ahVar = this.f49198h;
        if (ahVar != null && this.f49200j) {
            ahVar.stopListening();
            this.f49198h.deleteAppWidgetId(this.f49199i);
            this.f49200j = false;
        }
    }
}
