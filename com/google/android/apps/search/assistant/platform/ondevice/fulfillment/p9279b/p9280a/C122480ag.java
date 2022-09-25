package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122443ch;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import com.google.protos.p4985f.p5030q.C65196fc;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.ag */
/* compiled from: PG */
final class C122480ag implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C71422aw f339545a;

    /* renamed from: b */
    final /* synthetic */ C71588o f339546b;

    /* renamed from: c */
    final /* synthetic */ C122483aj f339547c;

    /* renamed from: d */
    final /* synthetic */ C122108a f339548d;

    /* renamed from: e */
    final /* synthetic */ C71389v f339549e;

    public C122480ag(C71422aw awVar, C71588o oVar, C122483aj ajVar, C122108a aVar, C71389v vVar) {
        this.f339545a = awVar;
        this.f339546b = oVar;
        this.f339547c = ajVar;
        this.f339548d = aVar;
        this.f339549e = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        int i;
        C65196fc fcVar;
        C122443ch chVar = (C122443ch) obj;
        int i2 = chVar.f339447a;
        if (i2 == 0) {
            i = 3;
        } else if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = 0;
            }
        } else {
            i = 1;
        }
        int i3 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i3 != 0) {
            if (i3 == 1) {
                C71803m.m105043d(this.f339545a, (C69585o) null, (C71424ay) null, new C122479af(this.f339547c, this.f339548d, chVar, this.f339549e, (C69577g) null), 3);
            }
            return C69788q.f186170a;
        } else {
            C71588o oVar = this.f339546b;
            if (i2 == 1) {
                fcVar = (C65196fc) chVar.f339448b;
            } else {
                fcVar = C65196fc.f176453l;
            }
            C69664n.m101060f(fcVar, "value.popResponse");
            Object a = oVar.mo20883a(fcVar, gVar);
            return a != C69554a.COROUTINE_SUSPENDED ? C69788q.f186170a : a;
        }
    }
}
