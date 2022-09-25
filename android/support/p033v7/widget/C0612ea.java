package android.support.p033v7.widget;

import androidx.core.p098j.C2043bi;

/* renamed from: android.support.v7.widget.ea */
/* compiled from: PG */
final class C0612ea implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0613eb f2349a;

    public C0612ea(C0613eb ebVar) {
        this.f2349a = ebVar;
    }

    public final void run() {
        C0578cu cuVar = this.f2349a.f2354e;
        if (cuVar != null && C2043bi.m5569aw(cuVar) && this.f2349a.f2354e.getCount() > this.f2349a.f2354e.getChildCount()) {
            this.f2349a.f2354e.getChildCount();
            this.f2349a.f2366q.setInputMethodMode(2);
            this.f2349a.mo1576v();
        }
    }
}
