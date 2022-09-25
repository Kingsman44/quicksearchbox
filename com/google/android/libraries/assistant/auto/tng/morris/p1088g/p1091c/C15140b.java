package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p031v4.app.C0154a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.p098j.C2069cc;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.b */
/* compiled from: PG */
public final class C15140b extends Dialog {

    /* renamed from: a */
    public C15143e f45430a;

    public C15140b(Context context) {
        super(context, R.style.MorrisOverlayDialogTheme);
    }

    public final void hide() {
        super.hide();
        C15143e eVar = this.f45430a;
        if (eVar != null && eVar.f45436a != null) {
            C0154a aVar = new C0154a(eVar.mo51122q());
            C15142d dVar = eVar.f45436a;
            dVar.getClass();
            aVar.mo516m(dVar);
            aVar.mo509f();
            eVar.f45436a = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.bubble_dialog, (ViewGroup) null);
        setContentView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        Window window = getWindow();
        window.getClass();
        C2069cc.m5650a(window, false);
        window.setType(2038);
        IBinder windowToken = window.getDecorView().getWindowToken();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 1224802568, 1);
        layoutParams.gravity = 8388659;
        layoutParams.token = windowToken;
        window.setAttributes(layoutParams);
        C15143e eVar = new C15143e();
        eVar.mo51130t(window, frameLayout, frameLayout.getContext());
        this.f45430a = eVar;
        eVar.mo19987jP(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C58976aa aaVar = C58975e.f156826a;
        super.onStart();
        C15143e eVar = this.f45430a;
        eVar.getClass();
        eVar.mo51128g();
        C15143e eVar2 = this.f45430a;
        eVar2.getClass();
        eVar2.mo51127f();
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        C58976aa aaVar = C58975e.f156826a;
        C15143e eVar = this.f45430a;
        eVar.getClass();
        eVar.mo51126e();
        C15143e eVar2 = this.f45430a;
        eVar2.getClass();
        eVar2.mo22016h();
        super.onStop();
    }

    public final void show() {
        super.show();
        C15143e eVar = this.f45430a;
        eVar.getClass();
        eVar.mo22017i();
    }
}
