package android.support.p033v7.widget;

import android.view.View;
import androidx.core.p098j.C2060bz;

/* renamed from: android.support.v7.widget.jc */
/* compiled from: PG */
final class C0749jc extends C2060bz {

    /* renamed from: a */
    final /* synthetic */ int f2611a;

    /* renamed from: b */
    final /* synthetic */ C0750jd f2612b;

    /* renamed from: c */
    private boolean f2613c = false;

    public C0749jc(C0750jd jdVar, int i) {
        this.f2612b = jdVar;
        this.f2611a = i;
    }

    /* renamed from: a */
    public final void mo1119a(View view) {
        if (!this.f2613c) {
            this.f2612b.f2614a.setVisibility(this.f2611a);
        }
    }

    /* renamed from: b */
    public final void mo1120b() {
        this.f2612b.f2614a.setVisibility(0);
    }

    /* renamed from: c */
    public final void mo2431c() {
        this.f2613c = true;
    }
}
