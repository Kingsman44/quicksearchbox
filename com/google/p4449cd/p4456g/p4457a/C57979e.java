package com.google.p4449cd.p4456g.p4457a;

import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60873d;

/* renamed from: com.google.cd.g.a.e */
/* compiled from: PG */
final class C57979e extends C60873d {

    /* renamed from: a */
    final /* synthetic */ C57980f f155041a;

    public C57979e(C57980f fVar) {
        this.f155041a = fVar;
    }

    /* JADX INFO: finally extract failed */
    public final boolean cancel(boolean z) {
        if (!this.f155041a.mo54586f()) {
            return false;
        }
        try {
            C58838bb.m90883r(super.cancel(z));
            this.f155041a.mo54581a();
            return true;
        } catch (Throwable th) {
            this.f155041a.mo54581a();
            throw th;
        }
    }
}
