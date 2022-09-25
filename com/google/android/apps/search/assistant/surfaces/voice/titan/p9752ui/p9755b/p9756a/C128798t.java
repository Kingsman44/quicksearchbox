package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.assistant.p3897e.p3921j.C51809dy;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.titan.ui.connection.impl.IntentPlateHandler$createIntentPlateAutoClearFlow$1", mo61344c = "IntentPlateHandler.kt", mo61345d = "invokeSuspend", mo61346e = {124})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.t */
/* compiled from: PG */
final class C128798t extends C69572j implements C69631q {

    /* renamed from: a */
    int f354049a;

    /* renamed from: b */
    /* synthetic */ boolean f354050b;

    /* renamed from: c */
    private /* synthetic */ Object f354051c;

    public C128798t(C69577g gVar) {
        super(3, gVar);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        C128798t tVar = new C128798t((C69577g) obj3);
        tVar.f354051c = (C71588o) obj;
        tVar.f354050b = booleanValue;
        return tVar.mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.lang.Object, kotlinx.coroutines.b.o] */
    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2 = C69554a.COROUTINE_SUSPENDED;
        if (this.f354049a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            ? r4 = this.f354051c;
            if (this.f354050b) {
                C51809dy dyVar = C51809dy.f135933f;
                C69664n.m101060f(dyVar, "getDefaultInstance()");
                this.f354049a = 1;
                if (r4.mo20883a(dyVar, this) == obj2) {
                    return obj2;
                }
            }
        }
        return C69788q.f186170a;
    }
}
