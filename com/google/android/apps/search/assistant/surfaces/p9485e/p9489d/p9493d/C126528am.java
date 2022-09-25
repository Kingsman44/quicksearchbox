package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9493d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.p1533o.C18445ah;
import com.google.android.libraries.assistant.p1533o.C18449al;
import com.google.protobuf.C62971cq;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67476x;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.d.am */
/* compiled from: PG */
final class C126528am extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C67438ag f348453a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126528am(C67438ag agVar) {
        super(1);
        this.f348453a = agVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C18445ah ahVar = (C18445ah) obj;
        C69664n.m101061g(ahVar, "$this$speechRecognitionData");
        C67476x xVar = this.f348453a.f183262e;
        if (xVar == null) {
            xVar = C67476x.f183390i;
        }
        C69664n.m101060f(xVar, "event.partialResult");
        C62971cq cqVar = xVar.f183393b;
        C69664n.m101060f(cqVar, "partList");
        String ag = C69540x.m100851ag(cqVar, BuildConfig.FLAVOR, (CharSequence) null, (CharSequence) null, C126519ad.f348437a, 30);
        ahVar.copyOnWrite();
        C18449al alVar = C18449al.f52359c;
        ag.getClass();
        ((C18449al) ahVar.instance).f52361a = ag;
        return C69788q.f186170a;
    }
}
