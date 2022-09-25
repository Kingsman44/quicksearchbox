package com.google.android.libraries.lens.view.session;

import android.graphics.RectF;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.lens.view.session.g */
/* compiled from: PG */
final class C27787g extends C27773bi {

    /* renamed from: a */
    public boolean f75806a;

    /* renamed from: b */
    public byte f75807b;

    /* renamed from: c */
    public int f75808c;

    /* renamed from: d */
    private RectF f75809d;

    /* renamed from: e */
    private C24231w f75810e;

    /* renamed from: f */
    private C58485gu f75811f;

    public C27787g() {
    }

    public C27787g(C27774bj bjVar) {
        C27788h hVar = (C27788h) bjVar;
        this.f75809d = hVar.f75812a;
        this.f75810e = hVar.f75813b;
        this.f75806a = hVar.f75814c;
        this.f75811f = hVar.f75815d;
        this.f75808c = hVar.f75816e;
        this.f75807b = 1;
    }

    /* renamed from: a */
    public final RectF mo33273a() {
        RectF rectF = this.f75809d;
        if (rectF != null) {
            return rectF;
        }
        throw new IllegalStateException("Property \"box\" has not been set");
    }

    /* renamed from: b */
    public final C27774bj mo33274b() {
        RectF rectF;
        C24231w wVar;
        C58485gu guVar;
        int i;
        if (this.f75807b == 1 && (rectF = this.f75809d) != null && (wVar = this.f75810e) != null && (guVar = this.f75811f) != null && (i = this.f75808c) != 0) {
            return new C27788h(rectF, wVar, this.f75806a, guVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f75809d == null) {
            sb.append(" box");
        }
        if (this.f75810e == null) {
            sb.append(" interactionOrigin");
        }
        if (this.f75807b == 0) {
            sb.append(" isFrozenImageSelection");
        }
        if (this.f75811f == null) {
            sb.append(" tappedObjects");
        }
        if (this.f75808c == 0) {
            sb.append(" autoTextSelectionMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: c */
    public final void mo33275c(RectF rectF) {
        if (rectF != null) {
            this.f75809d = rectF;
            return;
        }
        throw new NullPointerException("Null box");
    }

    /* renamed from: d */
    public final void mo33276d(C24231w wVar) {
        if (wVar != null) {
            this.f75810e = wVar;
            return;
        }
        throw new NullPointerException("Null interactionOrigin");
    }

    /* renamed from: e */
    public final void mo33277e(C58485gu guVar) {
        if (guVar != null) {
            this.f75811f = guVar;
            return;
        }
        throw new NullPointerException("Null tappedObjects");
    }

    /* renamed from: f */
    public final void mo33278f(int i) {
        this.f75808c = 5;
    }
}
