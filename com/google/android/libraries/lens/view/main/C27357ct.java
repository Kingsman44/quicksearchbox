package com.google.android.libraries.lens.view.main;

import android.view.ViewStub;
import androidx.lifecycle.C2333ah;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.progressindicator.CircularProgressIndicator;

/* renamed from: com.google.android.libraries.lens.view.main.ct */
/* compiled from: PG */
public final /* synthetic */ class C27357ct implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C27384dt f74849a;

    public /* synthetic */ C27357ct(C27384dt dtVar) {
        this.f74849a = dtVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C27384dt dtVar = this.f74849a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) dtVar.f74910aF.findViewById(R.id.lvf_spinner);
        if (booleanValue) {
            if (circularProgressIndicator == null) {
                ((CircularProgressIndicator) ((ViewStub) dtVar.f74910aF.findViewById(R.id.lvf_spinner_stub)).inflate()).mo48278i();
            } else {
                circularProgressIndicator.mo48278i();
            }
        } else if (circularProgressIndicator != null) {
            circularProgressIndicator.animate().alpha(0.0f).setDuration(100).setListener(new C27391dz(circularProgressIndicator));
        }
    }
}
