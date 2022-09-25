package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.C2333ah;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.cg */
/* compiled from: PG */
public final /* synthetic */ class C30406cg implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C30417cr f82174a;

    public /* synthetic */ C30406cg(C30417cr crVar) {
        this.f82174a = crVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C30417cr crVar = this.f82174a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C30403cd cdVar = (C30403cd) axVar.mo56107c();
            C30394bv bvVar = (C30394bv) cdVar.mo35979b().mo56111f();
            if (bvVar != null) {
                crVar.f82203t.setText(bvVar.mo35959b());
                crVar.f82203t.setContentDescription((CharSequence) bvVar.mo35958a().mo56111f());
                crVar.f82203t.setVisibility(0);
            }
            if (cdVar.mo35978a().mo56113h()) {
                Drawable c = ((C30418cs) cdVar.mo35978a().mo56107c()).mo35987c(crVar.f82191h);
                crVar.f82201r.setImageDrawable(c);
                crVar.f82201r.setVisibility(0);
                if (crVar.f82204u) {
                    crVar.f82202s.setImageDrawable(c);
                    crVar.f82202s.setVisibility(0);
                    return;
                }
                return;
            }
            crVar.f82201r.setVisibility(8);
            crVar.f82202s.setVisibility(8);
            return;
        }
        crVar.f82203t.setVisibility(8);
        crVar.f82201r.setVisibility(8);
        crVar.f82202s.setVisibility(8);
    }
}
