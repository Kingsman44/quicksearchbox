package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9542c.p9564p;

import com.google.android.libraries.search.assistant.p2714o.p2715a.C34913n;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.providers.display.DisplayParamsSupplier$getDisplayParams$2$foregroundAppDataDeferred$1", mo61344c = "DisplayParamsSupplier.kt", mo61345d = "invokeSuspend", mo61346e = {59})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.c.p.c */
/* compiled from: PG */
final class C127253c extends C69572j implements C69630p {

    /* renamed from: a */
    int f350440a;

    /* renamed from: b */
    final /* synthetic */ C127255e f350441b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127253c(C127255e eVar, C69577g gVar) {
        super(2, gVar);
        this.f350441b = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127253c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350440a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx f = ((C34913n) this.f350441b.f350450f).mo39623a();
            this.f350440a = 1;
            obj = C71663i.m104690c(f, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127253c(this.f350441b, gVar);
    }
}
