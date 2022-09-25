package android.support.p033v7.widget;

import android.view.View;
import androidx.core.p098j.C2058bx;
import androidx.core.p098j.C2059by;

/* renamed from: android.support.v7.widget.a */
/* compiled from: PG */
public final class C0490a implements C2059by {

    /* renamed from: a */
    int f1973a;

    /* renamed from: b */
    final /* synthetic */ C0529b f1974b;

    /* renamed from: c */
    private boolean f1975c = false;

    protected C0490a(C0529b bVar) {
        this.f1974b = bVar;
    }

    /* renamed from: a */
    public final void mo1119a(View view) {
        if (!this.f1975c) {
            C0529b bVar = this.f1974b;
            bVar.f2094f = null;
            C0490a.super.setVisibility(this.f1973a);
        }
    }

    /* renamed from: b */
    public final void mo1120b() {
        C0490a.super.setVisibility(0);
        this.f1975c = false;
    }

    /* renamed from: c */
    public final void mo2431c() {
        this.f1975c = true;
    }

    /* renamed from: d */
    public final void mo2432d(C2058bx bxVar, int i) {
        this.f1974b.f2094f = bxVar;
        this.f1973a = i;
    }
}
