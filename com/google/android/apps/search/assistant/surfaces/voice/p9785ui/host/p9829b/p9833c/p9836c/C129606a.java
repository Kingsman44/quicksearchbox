package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.p9829b.p9833c.p9836c;

import android.os.Parcel;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129670h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129671i;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129674l;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.intent.C129675m;
import kotlinx.coroutines.C71808r;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.b.c.c.a */
/* compiled from: PG */
public final class C129606a implements C129609d {

    /* renamed from: a */
    private final C129675m f355720a;

    public C129606a(C129675m mVar) {
        this.f355720a = mVar;
    }

    /* renamed from: a */
    public final Object mo109128a(C69577g gVar) {
        C129675m mVar = this.f355720a;
        C71808r rVar = new C71808r(C69555b.m100961b(gVar), 1);
        rVar.mo63041A();
        Parcel obtain = Parcel.obtain();
        C69664n.m101060f(obtain, "obtain()");
        obtain.writeStrongBinder(new C129670h(new C129674l(rVar)));
        mVar.f355889a.transact(C129671i.EXIT_TRANSITION.ordinal(), obtain, (Parcel) null, 0);
        Object n = rVar.mo63043n();
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        return n;
    }

    /* renamed from: b */
    public final void mo109129b() {
        this.f355720a.f355889a.transact(C129671i.DISMISS.ordinal(), Parcel.obtain(), (Parcel) null, 0);
    }
}
