package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8112e.p8114b;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104436am;
import com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8105a.C104437an;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.p375ai.p378b.C7620dt;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.e.b.j */
/* compiled from: PG */
public final /* synthetic */ class C104849j implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C104436am f292190a;

    /* renamed from: b */
    public final /* synthetic */ C7620dt f292191b;

    public /* synthetic */ C104849j(C104436am amVar, C7620dt dtVar) {
        this.f292190a = amVar;
        this.f292191b = dtVar;
    }

    public final void onClick(View view) {
        C104436am amVar = this.f292190a;
        C7620dt dtVar = this.f292191b;
        Bundle bundle = new Bundle();
        C7620dt.f26326d.getParserForType();
        C62921ba.m95368a();
        bundle.putParcelable("targetingReason", C23245b.m43556a(dtVar));
        ((C104437an) amVar).f290566a.mo28345s("handleLearnMoreClick_com.google.geo.sidekick.ClientActionProto.WhyThisAdAction.TargetingReason", "WhyThisAdEventsDispatcher", bundle);
    }
}
