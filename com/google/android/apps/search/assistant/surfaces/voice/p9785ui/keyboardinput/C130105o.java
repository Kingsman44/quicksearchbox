package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.keyboardinput;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.apps.search.assistant.libraries.p8984ui.logoview.LogoView;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.keyboardinput.o */
/* compiled from: PG */
final class C130105o implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ LogoView f356743a;

    /* renamed from: b */
    final /* synthetic */ View f356744b;

    /* renamed from: c */
    final /* synthetic */ C130109s f356745c;

    public C130105o(C130109s sVar, LogoView logoView, View view) {
        this.f356745c = sVar;
        this.f356743a = logoView;
        this.f356744b = view;
    }

    public final void afterTextChanged(Editable editable) {
        C58976aa aaVar = C58975e.f156826a;
        if (C58837ba.m90859h(editable.toString())) {
            this.f356743a.setVisibility(0);
            this.f356744b.setVisibility(8);
        } else {
            this.f356743a.setVisibility(8);
            this.f356744b.setVisibility(0);
        }
        C130085af afVar = this.f356745c.f356758h;
        String obj = editable.toString();
        C69664n.m101061g(obj, "query");
        if (!((String) afVar.f356703d.get()).equals(obj)) {
            afVar.f356704e.set(Optional.empty());
            afVar.f356703d.set(obj);
        }
        afVar.f356702c.mo50787a(C60866ct.f164955a, C130085af.f356700a);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
