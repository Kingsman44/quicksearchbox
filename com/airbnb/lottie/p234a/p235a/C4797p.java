package com.airbnb.lottie.p234a.p235a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C4825ac;
import com.airbnb.lottie.C4829ag;
import com.airbnb.lottie.p234a.p236b.C4802a;
import com.airbnb.lottie.p234a.p236b.C4807f;
import com.airbnb.lottie.p234a.p236b.C4809h;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.p240b.C4866i;
import com.airbnb.lottie.p238c.p241c.C4878b;
import com.airbnb.lottie.p245f.C4949f;
import com.airbnb.lottie.p246g.C4958c;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.a.p */
/* compiled from: PG */
public final class C4797p implements C4802a, C4793l, C4795n {

    /* renamed from: a */
    private final Path f15255a = new Path();

    /* renamed from: b */
    private final RectF f15256b = new RectF();

    /* renamed from: c */
    private final String f15257c;

    /* renamed from: d */
    private final boolean f15258d;

    /* renamed from: e */
    private final C4825ac f15259e;

    /* renamed from: f */
    private final C4807f f15260f;

    /* renamed from: g */
    private final C4807f f15261g;

    /* renamed from: h */
    private final C4807f f15262h;

    /* renamed from: i */
    private final C4784c f15263i = new C4784c();

    /* renamed from: j */
    private boolean f15264j;

    public C4797p(C4825ac acVar, C4878b bVar, C4866i iVar) {
        this.f15257c = iVar.f15494a;
        this.f15258d = iVar.f15498e;
        this.f15259e = acVar;
        C4807f a = iVar.f15495b.mo9797a();
        this.f15260f = a;
        C4807f a2 = iVar.f15496c.mo9797a();
        this.f15261g = a2;
        C4807f a3 = iVar.f15497d.mo9797a();
        this.f15262h = a3;
        bVar.mo9811h(a);
        bVar.mo9811h(a2);
        bVar.mo9811h(a3);
        a.mo9740g(this);
        a2.mo9740g(this);
        a3.mo9740g(this);
    }

    /* renamed from: a */
    public final void mo9714a(Object obj, C4958c cVar) {
        C4807f fVar;
        if (obj == C4829ag.f15379j) {
            fVar = this.f15261g;
        } else if (obj == C4829ag.f15381l) {
            fVar = this.f15260f;
        } else if (obj == C4829ag.f15380k) {
            fVar = this.f15262h;
        } else {
            return;
        }
        fVar.f15301d = cVar;
    }

    /* renamed from: d */
    public final void mo9717d() {
        this.f15264j = false;
        this.f15259e.invalidateSelf();
    }

    /* renamed from: e */
    public final void mo9718e(C4890e eVar, int i, List list, C4890e eVar2) {
        C4949f.m13714h(eVar, i, list, eVar2, this);
    }

    /* renamed from: f */
    public final void mo9719f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            C4785d dVar = (C4785d) list.get(i);
            if (dVar instanceof C4801t) {
                C4801t tVar = (C4801t) dVar;
                if (tVar.f15290e == 1) {
                    this.f15263i.mo9720a(tVar);
                    tVar.mo9727a(this);
                }
            }
        }
    }

    /* renamed from: g */
    public final String mo9722g() {
        return this.f15257c;
    }

    /* renamed from: i */
    public final Path mo9724i() {
        if (this.f15264j) {
            return this.f15255a;
        }
        this.f15255a.reset();
        if (this.f15258d) {
            this.f15264j = true;
            return this.f15255a;
        }
        PointF pointF = (PointF) this.f15261g.mo9738e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float k = ((C4809h) this.f15262h).mo9744k();
        float min = Math.min(f, f2);
        if (k > min) {
            k = min;
        }
        PointF pointF2 = (PointF) this.f15260f.mo9738e();
        this.f15255a.moveTo(pointF2.x + f, (pointF2.y - f2) + k);
        this.f15255a.lineTo(pointF2.x + f, (pointF2.y + f2) - k);
        if (k > 0.0f) {
            float f3 = k + k;
            this.f15256b.set((pointF2.x + f) - f3, (pointF2.y + f2) - f3, pointF2.x + f, pointF2.y + f2);
            this.f15255a.arcTo(this.f15256b, 0.0f, 90.0f, false);
        }
        this.f15255a.lineTo((pointF2.x - f) + k, pointF2.y + f2);
        if (k > 0.0f) {
            float f4 = k + k;
            this.f15256b.set(pointF2.x - f, (pointF2.y + f2) - f4, (pointF2.x - f) + f4, pointF2.y + f2);
            this.f15255a.arcTo(this.f15256b, 90.0f, 90.0f, false);
        }
        this.f15255a.lineTo(pointF2.x - f, (pointF2.y - f2) + k);
        if (k > 0.0f) {
            float f5 = k + k;
            this.f15256b.set(pointF2.x - f, pointF2.y - f2, (pointF2.x - f) + f5, (pointF2.y - f2) + f5);
            this.f15255a.arcTo(this.f15256b, 180.0f, 90.0f, false);
        }
        this.f15255a.lineTo((pointF2.x + f) - k, pointF2.y - f2);
        if (k > 0.0f) {
            float f6 = k + k;
            this.f15256b.set((pointF2.x + f) - f6, pointF2.y - f2, pointF2.x + f, (pointF2.y - f2) + f6);
            this.f15255a.arcTo(this.f15256b, 270.0f, 90.0f, false);
        }
        this.f15255a.close();
        this.f15263i.mo9721b(this.f15255a);
        this.f15264j = true;
        return this.f15255a;
    }
}
