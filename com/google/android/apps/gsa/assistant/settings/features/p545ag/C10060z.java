package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.z */
/* compiled from: PG */
public final /* synthetic */ class C10060z implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C10005ad f34307a;

    /* renamed from: b */
    public final /* synthetic */ View f34308b;

    public /* synthetic */ C10060z(C10005ad adVar, View view) {
        this.f34307a = adVar;
        this.f34308b = view;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C10005ad adVar = this.f34307a;
        View view = this.f34308b;
        if (keyEvent.getKeyCode() != 4) {
            return false;
        }
        adVar.f34197a.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C47393f.m84235f(new C10023b(adVar.f34202f, 1), adVar.f34203g);
        dialogInterface.dismiss();
        return true;
    }
}
