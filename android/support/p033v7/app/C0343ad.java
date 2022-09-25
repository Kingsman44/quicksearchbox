package android.support.p033v7.app;

import android.view.View;
import android.widget.PopupWindow;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2059by;
import androidx.core.p098j.C2060bz;

/* renamed from: android.support.v7.app.ad */
/* compiled from: PG */
final class C0343ad extends C2060bz {

    /* renamed from: a */
    final /* synthetic */ C0344ae f1138a;

    public C0343ad(C0344ae aeVar) {
        this.f1138a = aeVar;
    }

    /* renamed from: a */
    public final void mo1119a(View view) {
        this.f1138a.f1139a.f1219s.setVisibility(8);
        C0356aq aqVar = this.f1138a.f1139a;
        PopupWindow popupWindow = aqVar.f1220t;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (aqVar.f1219s.getParent() instanceof View) {
            C2043bi.m5524R((View) this.f1138a.f1139a.f1219s.getParent());
        }
        this.f1138a.f1139a.f1219s.mo1835j();
        this.f1138a.f1139a.f1222v.mo5203e((C2059by) null);
        C0356aq aqVar2 = this.f1138a.f1139a;
        aqVar2.f1222v = null;
        C2043bi.m5524R(aqVar2.f1224x);
    }
}
