package com.google.android.libraries.elements.internal;

import com.facebook.litho.C6279fv;
import com.facebook.litho.C6281fx;
import com.facebook.litho.C6407q;
import com.facebook.litho.C6411u;
import com.facebook.litho.p323b.C6117a;
import com.facebook.litho.p323b.C6118b;
import com.facebook.litho.p323b.C6119c;
import com.google.android.libraries.elements.interfaces.C21319z;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.elements.internal.z */
/* compiled from: PG */
public final class C21365z extends C6407q {
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: a */
    C21342c f59734a;
    @C6117a(mo12871a = 13)
    @C6118b(mo12872a = C6119c.NONE)

    /* renamed from: b */
    public C21319z f59735b = C21321aa.f59683a;

    private C21365z() {
        super("LazilyConvertedElement");
    }

    /* renamed from: b */
    public static C21363x m40402b(C6411u uVar) {
        C21363x xVar = new C21363x();
        xVar.mo26867e(uVar, new C21365z());
        return xVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo12799R(C6411u uVar) {
        C6281fx fxVar = new C6281fx();
        C6281fx fxVar2 = new C6281fx();
        C21321aa.m40328b(fxVar, fxVar2);
        C21364y yVar = (C21364y) this.f18999v;
        yVar.f59733b = (AtomicReference) fxVar.f18496a;
        yVar.f59732a = (AtomicReference) fxVar2.f18496a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ac */
    public final void mo12812ac(C6279fv fvVar, C6279fv fvVar2) {
        C21364y yVar = (C21364y) fvVar;
        C21364y yVar2 = (C21364y) fvVar2;
        yVar2.f59732a = yVar.f59732a;
        yVar2.f59733b = yVar.f59733b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: ai */
    public final boolean mo12818ai() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C6407q mo12835c(C6411u uVar) {
        C21342c cVar = this.f59734a;
        C21319z zVar = this.f59735b;
        C21364y yVar = (C21364y) this.f18999v;
        return C21321aa.m40327a(uVar, cVar, zVar, yVar.f59733b, yVar.f59732a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final /* synthetic */ C6279fv mo13319o() {
        return new C21364y();
    }
}
