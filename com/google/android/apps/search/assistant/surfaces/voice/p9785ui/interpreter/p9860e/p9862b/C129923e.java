package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.p9862b;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e.C129918b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62970cp;
import java.util.Collections;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.state.datastore.InterpreterPreferenceStoreService$fetchLastSelectedMode$1", mo61344c = "InterpreterPreferenceStoreService.kt", mo61345d = "invokeSuspend", mo61346e = {37})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.b.e */
/* compiled from: PG */
public final class C129923e extends C69572j implements C69630p {

    /* renamed from: a */
    int f356378a;

    /* renamed from: b */
    final /* synthetic */ String f356379b;

    /* renamed from: c */
    final /* synthetic */ String f356380c;

    /* renamed from: d */
    final /* synthetic */ C129925g f356381d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129923e(String str, String str2, C129925g gVar, C69577g gVar2) {
        super(2, gVar2);
        this.f356379b = str;
        this.f356380c = str2;
        this.f356381d = gVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129923e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f356378a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            if (this.f356379b.length() == 0 || this.f356380c.length() == 0) {
                return C129918b.MODE_AUTO;
            }
            C60870cx d = this.f356381d.f356386c.mo46042d();
            C69664n.m101060f(d, "protoDataStore.data");
            this.f356378a = 1;
            obj = C71663i.m104690c(d, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C69664n.m101060f(obj, "protoDataStore.data.await()");
        String a = C129925g.m212117a(this.f356379b, this.f356380c);
        C129918b bVar = (C129918b) Collections.unmodifiableMap(new C62970cp(((C129921c) obj).f356377a, C129921c.f356375c)).get(a);
        if (bVar != null && bVar != C129918b.MODE_NOT_SELECTED) {
            return bVar;
        }
        C59052c cVar = (C59052c) C129925g.f356384a.mo56224b();
        cVar.mo56379ah(new C59094n(38625));
        cVar.mo56389s("Didn't find lastSelectedMode for key: %s", a);
        return C129918b.MODE_AUTO;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129923e(this.f356379b, this.f356380c, this.f356381d, gVar);
    }
}
