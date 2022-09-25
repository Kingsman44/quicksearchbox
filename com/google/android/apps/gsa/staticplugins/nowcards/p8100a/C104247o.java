package com.google.android.apps.gsa.staticplugins.nowcards.p8100a;

import android.view.View;
import com.google.android.apps.gsa.sidekick.shared.monet.util.C91857e;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.a.o */
/* compiled from: PG */
public final /* synthetic */ class C104247o implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104249q f289928a;

    public /* synthetic */ C104247o(C104249q qVar) {
        this.f289928a = qVar;
    }

    public final void onClick(View view) {
        C91857e eVar = this.f289928a.f290316k;
        if (eVar != null) {
            eVar.mo86359a("EVENT_DISPLAY_CARD_ACTION_DIALOG", "WeatherForecastModuleP", ProtoParcelable.f63423a);
        }
    }
}
