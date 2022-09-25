package android.support.p033v7.app;

import android.support.p033v7.view.C0434b;
import android.support.p033v7.widget.ActionBarOverlayLayout;
import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2060bz;

/* renamed from: android.support.v7.app.bj */
/* compiled from: PG */
final class C0376bj extends C2060bz {

    /* renamed from: a */
    final /* synthetic */ C0381bo f1265a;

    public C0376bj(C0381bo boVar) {
        this.f1265a = boVar;
    }

    /* renamed from: a */
    public final void mo1119a(View view) {
        View view2;
        C0381bo boVar = this.f1265a;
        if (boVar.f1298l && (view2 = boVar.f1292f) != null) {
            view2.setTranslationY(0.0f);
            this.f1265a.f1289c.setTranslationY(0.0f);
        }
        this.f1265a.f1289c.setVisibility(8);
        this.f1265a.f1289c.mo1817b(false);
        C0381bo boVar2 = this.f1265a;
        boVar2.f1301o = null;
        C0434b bVar = boVar2.f1296j;
        if (bVar != null) {
            bVar.mo1123a(boVar2.f1295i);
            boVar2.f1295i = null;
            boVar2.f1296j = null;
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1265a.f1288b;
        if (actionBarOverlayLayout != null) {
            C2043bi.m5524R(actionBarOverlayLayout);
        }
    }
}
