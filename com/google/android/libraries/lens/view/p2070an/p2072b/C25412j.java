package com.google.android.libraries.lens.view.p2070an.p2072b;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Size;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19656d;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19658f;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b.C19660h;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62960cg;
import java.util.concurrent.Callable;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.lens.view.an.b.j */
/* compiled from: PG */
public final /* synthetic */ class C25412j implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C25417o f69248a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f69249b;

    /* renamed from: c */
    public final /* synthetic */ Size f69250c;

    /* renamed from: d */
    public final /* synthetic */ long f69251d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f69252e;

    /* renamed from: f */
    public final /* synthetic */ Rect f69253f;

    public /* synthetic */ C25412j(C25417o oVar, C60870cx cxVar, Size size, long j, C60870cx cxVar2, Rect rect) {
        this.f69248a = oVar;
        this.f69249b = cxVar;
        this.f69250c = size;
        this.f69251d = j;
        this.f69252e = cxVar2;
        this.f69253f = rect;
    }

    public final Object call() {
        C25417o oVar = this.f69248a;
        C60870cx cxVar = this.f69249b;
        Size size = this.f69250c;
        long j = this.f69251d;
        C60870cx cxVar2 = this.f69252e;
        Rect rect = this.f69253f;
        oVar.f69269e.mo32037c();
        C19658f fVar = (C19658f) C60856cj.m92909r(cxVar);
        if (fVar.f54680a.size() != 0) {
            Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            C19660h hVar = ((C19656d) fVar.f54680a.get(0)).f54676a;
            if (hVar == null) {
                hVar = C19660h.f54681b;
            }
            C58485gu j2 = C58485gu.m89842j(hVar.f54683a);
            if (j2 != null) {
                C25405c cVar = new C25405c(j2, rect2);
                long e = oVar.f69270f.mo26873e();
                C25409g h = C25411i.m46824h();
                h.mo30430c((Bitmap) C60856cj.m92909r(cxVar2));
                C25390a aVar = (C25390a) h;
                aVar.f69164a = rect;
                C58976aa aaVar = C58975e.f156826a;
                Duration.ofNanos(e - j).toMillis();
                C19660h hVar2 = ((C19656d) fVar.f54680a.get(0)).f54676a;
                if (hVar2 == null) {
                    hVar2 = C19660h.f54681b;
                }
                hVar2.f54683a.size();
                C19660h hVar3 = ((C19656d) fVar.f54680a.get(0)).f54676a;
                if (hVar3 == null) {
                    hVar3 = C19660h.f54681b;
                }
                C62960cg cgVar = hVar3.f54683a;
                aVar.f69167d = C58833ax.m90833j(cVar);
                return h.mo30466e();
            }
            throw new NullPointerException("Null values");
        }
        throw new IllegalStateException("Failed to have embeddings result.");
    }
}
