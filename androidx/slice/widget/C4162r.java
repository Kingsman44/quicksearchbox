package androidx.slice.widget;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/* renamed from: androidx.slice.widget.r */
/* compiled from: PG */
final class C4162r implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ Button f13428a;

    /* renamed from: b */
    final /* synthetic */ C4168x f13429b;

    public C4162r(C4168x xVar, Button button) {
        this.f13429b = xVar;
        this.f13428a = button;
    }

    public final void onClick(View view) {
        try {
            C4168x xVar = this.f13429b;
            C4141as asVar = xVar.f13256o;
            if (asVar != null) {
                asVar.mo8726b(new C4147c(xVar.mo8706fy(), 4, 0, xVar.f13470c), xVar.f13471d.f13268m);
            }
            C4168x xVar2 = this.f13429b;
            xVar2.f13469b = xVar2.f13471d.f13268m.mo8599g(xVar2.getContext(), (Intent) null);
            C4168x xVar3 = this.f13429b;
            if (xVar3.f13469b) {
                C4123aa aaVar = xVar3.f13264w;
                if (aaVar != null) {
                    aaVar.mo8686a(xVar3.f13471d.f13268m, xVar3.f13470c);
                }
                C4168x xVar4 = this.f13429b;
                xVar4.f13462a.add(xVar4.f13471d.f13268m);
                this.f13428a.setVisibility(8);
            }
            this.f13429b.mo8765l();
        } catch (PendingIntent.CanceledException e) {
            Log.e("RowView", "PendingIntent for slice cannot be sent", e);
        }
    }
}
