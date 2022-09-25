package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8130a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23112h;
import com.google.android.libraries.gsa.monet.shared.LazyParcelable;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.p375ai.p378b.C7681g;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.b.a.c */
/* compiled from: PG */
public final class C105132c implements C105131b {

    /* renamed from: a */
    private final C23112h f293101a;

    public C105132c(C23112h hVar) {
        this.f293101a = hVar;
    }

    /* renamed from: e */
    public final void mo94572e(ProtoParcelable protoParcelable, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("entry", new LazyParcelable((Parcelable) protoParcelable));
        bundle.putBoolean("recordAction", Boolean.valueOf(z).booleanValue());
        this.f293101a.mo28345s("dismissEntry_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_boolean", "SecondScreenEntryProviderEventsDispatcher", bundle);
    }

    /* renamed from: j */
    public final void mo94576j(ProtoParcelable protoParcelable, C7681g gVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("entry", new LazyParcelable((Parcelable) protoParcelable));
        C7681g.values();
        bundle.putInt("actionType", gVar.ordinal());
        this.f293101a.mo28345s("recordFeedbackPromptAction_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_com.google.geo.sidekick.ActionProto.Action.Type", "SecondScreenEntryProviderEventsDispatcher", bundle);
    }
}
