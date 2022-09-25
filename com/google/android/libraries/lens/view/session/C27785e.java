package com.google.android.libraries.lens.view.session;

import android.graphics.PointF;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.session.e */
/* compiled from: PG */
final class C27785e extends C27771bg {

    /* renamed from: a */
    private PointF f75797a;

    /* renamed from: b */
    private C24231w f75798b;

    /* renamed from: c */
    private boolean f75799c;

    /* renamed from: d */
    private C58485gu f75800d;

    /* renamed from: e */
    private byte f75801e;

    public C27785e() {
    }

    public C27785e(C27772bh bhVar) {
        C27786f fVar = (C27786f) bhVar;
        this.f75797a = fVar.f75802a;
        this.f75798b = fVar.f75803b;
        this.f75799c = fVar.f75804c;
        this.f75800d = fVar.f75805d;
        this.f75801e = 1;
    }

    /* renamed from: a */
    public final PointF mo33264a() {
        PointF pointF = this.f75797a;
        if (pointF != null) {
            return pointF;
        }
        throw new IllegalStateException("Property \"point\" has not been set");
    }

    /* renamed from: b */
    public final C27772bh mo33265b() {
        PointF pointF;
        C24231w wVar;
        C58485gu guVar;
        if (this.f75801e == 1 && (pointF = this.f75797a) != null && (wVar = this.f75798b) != null && (guVar = this.f75800d) != null) {
            return new C27786f(pointF, wVar, this.f75799c, guVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f75797a == null) {
            sb.append(" point");
        }
        if (this.f75798b == null) {
            sb.append(" interactionOrigin");
        }
        if (this.f75801e == 0) {
            sb.append(" isFrozenImageSelection");
        }
        if (this.f75800d == null) {
            sb.append(" tappedObjects");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final void mo33266c(C24231w wVar) {
        if (wVar != null) {
            this.f75798b = wVar;
            return;
        }
        throw new NullPointerException("Null interactionOrigin");
    }

    /* renamed from: d */
    public final void mo33267d(boolean z) {
        this.f75799c = z;
        this.f75801e = 1;
    }

    /* renamed from: e */
    public final void mo33268e(PointF pointF) {
        if (pointF != null) {
            this.f75797a = pointF;
            return;
        }
        throw new NullPointerException("Null point");
    }

    /* renamed from: f */
    public final void mo33269f(C58485gu guVar) {
        if (guVar != null) {
            this.f75800d = guVar;
            return;
        }
        throw new NullPointerException("Null tappedObjects");
    }
}
