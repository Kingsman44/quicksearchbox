package android.support.p033v7.widget;

import android.support.p033v7.view.menu.C0456aj;
import android.view.View;

/* renamed from: android.support.v7.widget.as */
/* compiled from: PG */
final class C0521as extends C0587dc {

    /* renamed from: a */
    final /* synthetic */ C0533bc f2079a;

    /* renamed from: b */
    final /* synthetic */ AppCompatSpinner f2080b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0521as(AppCompatSpinner appCompatSpinner, View view, C0533bc bcVar) {
        super(view);
        this.f2080b = appCompatSpinner;
        this.f2079a = bcVar;
    }

    /* renamed from: a */
    public final C0456aj mo1611a() {
        return this.f2079a;
    }

    /* renamed from: b */
    public final boolean mo1612b() {
        if (this.f2080b.f1809b.mo2541x()) {
            return true;
        }
        this.f2080b.mo1970b();
        return true;
    }
}
