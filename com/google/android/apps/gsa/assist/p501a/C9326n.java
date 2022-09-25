package com.google.android.apps.gsa.assist.p501a;

import com.google.common.base.C58810aa;
import com.google.common.p4552o.C60603w;

/* renamed from: com.google.android.apps.gsa.assist.a.n */
/* compiled from: PG */
abstract class C9326n extends C58810aa {
    /* renamed from: a */
    public abstract C9318f mo17533a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* synthetic */ Object mo17535b(Object obj) {
        C60603w wVar = (C60603w) obj;
        C9318f fVar = C9318f.CONTEXTUAL;
        int ordinal = wVar.ordinal();
        if (ordinal == 0) {
            return mo17533a();
        }
        if (ordinal == 1) {
            return C9318f.CONTEXTUAL;
        }
        if (ordinal == 2) {
            return C9318f.VOICE;
        }
        if (ordinal == 3) {
            return C9318f.SCREENSHOT;
        }
        if (ordinal == 4) {
            return C9318f.LIGHTWEIGHT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(wVar.f164407f)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo17536c(Object obj) {
        C9318f fVar = (C9318f) obj;
        C60603w wVar = C60603w.UNSPECIFIED;
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            return C60603w.CONTEXTUAL;
        }
        if (ordinal == 1) {
            return C60603w.VOICE;
        }
        if (ordinal == 2) {
            return C60603w.SCREENSHOT;
        }
        if (ordinal == 3) {
            return C60603w.LIGHTWEIGHT;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(fVar.toString()));
    }
}
