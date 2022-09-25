package com.google.android.apps.search.googleapp.compliance;

import android.widget.CompoundButton;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.concurrent.C46459k;

/* renamed from: com.google.android.apps.search.googleapp.compliance.aq */
/* compiled from: PG */
public final /* synthetic */ class C133592aq implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C133593ar f363945a;

    public /* synthetic */ C133592aq(C133593ar arVar) {
        this.f363945a = arVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C133593ar arVar = this.f363945a;
        arVar.f363954i.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(compoundButton));
        C46459k.m82829b(arVar.f363947b.mo111254j(1, z), "Failed to update preference", new Object[0]);
    }
}
