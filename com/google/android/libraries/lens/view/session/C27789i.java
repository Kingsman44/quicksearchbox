package com.google.android.libraries.lens.view.session;

import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.common.p4522b.C58485gu;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;

/* renamed from: com.google.android.libraries.lens.view.session.i */
/* compiled from: PG */
public final class C27789i extends C27775bk {

    /* renamed from: a */
    public C58485gu f75817a;

    /* renamed from: b */
    private C56226ag f75818b;

    /* renamed from: c */
    private C24231w f75819c;

    /* renamed from: d */
    private boolean f75820d;

    /* renamed from: e */
    private byte f75821e;

    /* renamed from: a */
    public final C27776bl mo33282a() {
        C58485gu guVar;
        C56226ag agVar;
        C24231w wVar;
        if (this.f75821e == 1 && (guVar = this.f75817a) != null && (agVar = this.f75818b) != null && (wVar = this.f75819c) != null) {
            return new C27790j(guVar, agVar, wVar, this.f75820d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f75817a == null) {
            sb.append(" words");
        }
        if (this.f75818b == null) {
            sb.append(" clientTextSelection");
        }
        if (this.f75819c == null) {
            sb.append(" interactionOrigin");
        }
        if (this.f75821e == 0) {
            sb.append(" isFrozenImageSelection");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo33283b(C56226ag agVar) {
        if (agVar != null) {
            this.f75818b = agVar;
            return;
        }
        throw new NullPointerException("Null clientTextSelection");
    }

    /* renamed from: c */
    public final void mo33284c(C24231w wVar) {
        if (wVar != null) {
            this.f75819c = wVar;
            return;
        }
        throw new NullPointerException("Null interactionOrigin");
    }

    /* renamed from: d */
    public final void mo33285d(boolean z) {
        this.f75820d = z;
        this.f75821e = 1;
    }
}
