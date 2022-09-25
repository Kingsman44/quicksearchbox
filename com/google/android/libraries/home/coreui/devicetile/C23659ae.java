package com.google.android.libraries.home.coreui.devicetile;

import android.app.Dialog;
import android.support.p033v7.app.C0391l;
import android.support.p033v7.app.C0392m;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.home.coreui.devicetile.model.C23738m;
import com.google.android.libraries.home.coreui.devicetile.model.C23739n;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23639a;
import com.google.android.libraries.home.coreui.devicetile.p1954a.C23642d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.C69552c;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69660j;
import p5462h.p5473f.p5475b.C69663m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.coreui.devicetile.ae */
/* compiled from: PG */
public final /* synthetic */ class C23659ae implements C69660j {

    /* renamed from: a */
    final /* synthetic */ C23674at f64712a;

    public C23659ae(C23674at atVar) {
        this.f64712a = atVar;
    }

    /* renamed from: a */
    public final void mo29010a(C23738m mVar) {
        C69664n.m101061g(mVar, "p0");
        C23674at atVar = this.f64712a;
        atVar.f64756g.mo29111b(atVar.mo29001a().f64883a);
        boolean z = atVar.f64745I != null;
        C23738m mVar2 = C23738m.UNKNOWN;
        C0392m mVar3 = null;
        switch (mVar.ordinal()) {
            case 0:
            case 2:
            case 9:
            case 10:
                atVar.f64745I = null;
                C23642d dVar = atVar.mo29001a().f64889g;
                if ((dVar instanceof C23639a ? (C23639a) dVar : null) == null) {
                    Toast.makeText(atVar.f64764o, R.string.controls_error_failed, 1).show();
                    return;
                }
                throw null;
            case 1:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                atVar.f64745I = null;
                return;
            case 3:
                C69615a aVar = atVar.f64741E;
                C69664n.m101061g(aVar, "onCancel");
                C23739n nVar = atVar.f64763n;
                if (nVar == null) {
                    C59052c cVar = (C59052c) C23723l.f64882a.mo56225c();
                    cVar.mo56379ah(new C59094n(48666));
                    cVar.mo56386p("Confirmation Dialog attempted but no last action is set. Will not show");
                } else {
                    C0391l lVar = (C0391l) atVar.f64759j.mo5672a();
                    lVar.setTitle(atVar.f64764o.getResources().getString(R.string.controls_confirmation_message, new Object[]{atVar.f64766q.getText()}));
                    lVar.setPositiveButton(R.string.controls_dialog_button_ok, new C23716e(atVar, nVar));
                    lVar.setNegativeButton(R.string.controls_dialog_button_cancel, new C23717f(aVar));
                    mVar3 = lVar.create();
                }
                atVar.f64745I = mVar3;
                Dialog dialog = atVar.f64745I;
                if (dialog != null) {
                    dialog.show();
                    return;
                }
                return;
            case 4:
            case 17:
                atVar.f64745I = C23723l.m44215a(atVar, false, z, false, atVar.f64741E, 10);
                Dialog dialog2 = atVar.f64745I;
                if (dialog2 != null) {
                    dialog2.show();
                    return;
                }
                return;
            case 5:
                atVar.f64745I = C23723l.m44215a(atVar, true, z, false, atVar.f64741E, 8);
                Dialog dialog3 = atVar.f64745I;
                if (dialog3 != null) {
                    dialog3.show();
                    return;
                }
                return;
            case 6:
                atVar.f64758i.ifPresent(new C23668an(atVar));
                return;
            case 7:
                atVar.f64758i.ifPresent(new C23669ao(atVar));
                return;
            case 8:
                atVar.f64758i.ifPresent(new C23670ap(atVar));
                return;
            case 16:
                atVar.f64745I = C23723l.m44215a(atVar, false, z, true, atVar.f64741E, 2);
                Dialog dialog4 = atVar.f64745I;
                if (dialog4 != null) {
                    dialog4.show();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public final C69552c mo29011b() {
        return new C69663m(1, this.f64712a, C23674at.class, "onActionResponse", "onActionResponse(Lcom/google/android/libraries/home/coreui/devicetile/model/ControlAction$ResponseResult;)V", 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23659ae) || !(obj instanceof C69660j)) {
            return false;
        }
        return C69664n.m101066l(mo29011b(), ((C69660j) obj).mo29011b());
    }

    public final int hashCode() {
        return mo29011b().hashCode();
    }
}
