package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p033v7.app.C0358as;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.s */
/* compiled from: PG */
public final class C15157s extends C0358as {

    /* renamed from: d */
    private static final C59071e f45478d = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.g.c.s");

    /* renamed from: a */
    public C15158t f45479a;

    /* renamed from: c */
    public C14499lm f45480c;

    public C15157s(Context context) {
        super(context, R.style.MorrisOverlayDialogTheme);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C59104x b = f45478d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.EphemeralDialog");
        ((C59052c) ((C59052c) b).mo56372aa(45988)).mo56386p("#onCreate");
        super.onCreate(bundle);
        mo1201e();
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.ephemeral_dialog, (ViewGroup) null);
        mo1197b().mo1190r(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        Window window = getWindow();
        window.getClass();
        window.setType(2038);
        IBinder windowToken = window.getDecorView().getWindowToken();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 2038, 150995208, 1);
        layoutParams.gravity = 80;
        layoutParams.token = windowToken;
        window.setAttributes(layoutParams);
        C15158t tVar = new C15158t();
        tVar.mo51130t(window, frameLayout, frameLayout.getContext());
        this.f45479a = tVar;
        tVar.mo19987jP(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C59104x b = f45478d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.EphemeralDialog");
        ((C59052c) ((C59052c) b).mo56372aa(45989)).mo56386p("onStart");
        super.onStart();
        C15158t tVar = this.f45479a;
        tVar.getClass();
        tVar.mo51128g();
        C15158t tVar2 = this.f45479a;
        tVar2.getClass();
        tVar2.mo51127f();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C59104x b = f45478d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.EphemeralDialog");
        ((C59052c) ((C59052c) b).mo56372aa(45990)).mo56386p("#onStop");
        C15158t tVar = this.f45479a;
        tVar.getClass();
        tVar.mo51126e();
        C15158t tVar2 = this.f45479a;
        tVar2.getClass();
        tVar2.mo22016h();
        super.onStop();
    }
}
