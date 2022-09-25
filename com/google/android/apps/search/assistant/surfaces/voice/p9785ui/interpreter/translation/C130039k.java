package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.view.View;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129937bl;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129938bm;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129939bn;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129940bo;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129942bq;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.k */
/* compiled from: PG */
final class C130039k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C130040l f356594a;

    /* renamed from: b */
    final /* synthetic */ String f356595b;

    /* renamed from: c */
    final /* synthetic */ String f356596c;

    public C130039k(C130040l lVar, String str, String str2) {
        this.f356594a = lVar;
        this.f356595b = str;
        this.f356596c = str2;
    }

    public final void onClick(View view) {
        String str = this.f356595b;
        String str2 = this.f356596c;
        C129939bn bnVar = (C129939bn) C129940bo.f356407c.createBuilder();
        C69664n.m101060f(bnVar, "newBuilder()");
        C129942bq a = C69664n.m101061g(bnVar, "builder");
        C129937bl blVar = (C129937bl) C129938bm.f356402d.createBuilder();
        C69664n.m101060f(blVar, "newBuilder()");
        C69664n.m101061g(blVar, "builder");
        C69664n.m101061g(str, "value");
        blVar.copyOnWrite();
        str.getClass();
        ((C129938bm) blVar.instance).f356405b = str;
        C69664n.m101061g(str2, "value");
        blVar.copyOnWrite();
        C129938bm bmVar = (C129938bm) blVar.instance;
        str2.getClass();
        bmVar.f356404a |= 1;
        bmVar.f356406c = str2;
        C62942bv build = blVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C129938bm bmVar2 = (C129938bm) build;
        C69664n.m101061g(bmVar2, "value");
        C129939bn bnVar2 = a.f356411a;
        bnVar2.copyOnWrite();
        C129940bo boVar = (C129940bo) bnVar2.instance;
        bmVar2.getClass();
        boVar.f356410b = bmVar2;
        boVar.f356409a = 7;
        C129940bo a2 = a.mo109348a();
        this.f356594a.f356600d.mo109385g(this.f356595b, this.f356596c);
        C130040l lVar = this.f356594a;
        lVar.f356599c.mo50428h(C46438d.m82810b(lVar.f356602f.mo109295a(a2)).f121541a, (Object) null, lVar.f356601e);
    }
}
