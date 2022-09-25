package androidx.mediarouter.app;

import android.view.View;

/* renamed from: androidx.mediarouter.app.r */
/* compiled from: PG */
final class C3781r implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C3758ad f12198a;

    public C3781r(C3758ad adVar) {
        this.f12198a = adVar;
    }

    public final void onClick(View view) {
        C3758ad adVar = this.f12198a;
        boolean z = !adVar.f12099P;
        adVar.f12099P = z;
        if (z) {
            adVar.f12135p.setVisibility(0);
        }
        this.f12198a.mo7965n();
        this.f12198a.mo7971u(true);
    }
}
