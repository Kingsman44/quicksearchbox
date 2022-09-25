package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent;

import android.os.Parcel;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.NavigatorArgs$Transition;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.intent.j */
/* compiled from: PG */
final class C129672j extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Parcel f355886a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129672j(Parcel parcel) {
        super(1);
        this.f355886a = parcel;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        NavigatorArgs$Transition.Data data = (NavigatorArgs$Transition.Data) obj;
        C69664n.m101061g(data, "transitionData");
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(data, 0);
        C69664n.m101060f(obtain, "obtain().apply { writePa…able(transitionData, 0) }");
        this.f355886a.readStrongBinder().transact(0, obtain, (Parcel) null, 0);
        return C69788q.f186170a;
    }
}
