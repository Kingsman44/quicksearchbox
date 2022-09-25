package com.google.android.apps.gsa.staticplugins.recently.monet.p8687ui.p8688a;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.monet.ui.a.t */
/* compiled from: PG */
public final /* synthetic */ class C116154t implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ View f322080a;

    /* renamed from: b */
    public final /* synthetic */ TextView f322081b;

    /* renamed from: c */
    public final /* synthetic */ long f322082c;

    public /* synthetic */ C116154t(View view, TextView textView, long j) {
        this.f322080a = view;
        this.f322081b = textView;
        this.f322082c = j;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        View view = this.f322080a;
        TextView textView = this.f322081b;
        Exception exc = (Exception) obj;
        if (Objects.equals(view.getTag(), Long.valueOf(this.f322082c))) {
            textView.setVisibility(0);
            ((C59052c) ((C59052c) ((C59052c) C116155u.f322083c.mo56225c()).mo56382g(exc)).mo56372aa(30910)).mo56386p("Failed to load screenshot");
        }
    }
}
