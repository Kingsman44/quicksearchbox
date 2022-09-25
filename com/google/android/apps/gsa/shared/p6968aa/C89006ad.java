package com.google.android.apps.gsa.shared.p6968aa;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90457d;

/* renamed from: com.google.android.apps.gsa.shared.aa.ad */
/* compiled from: PG */
public final class C89006ad {

    /* renamed from: a */
    public final C89068x f241198a;

    /* renamed from: b */
    public C89051g f241199b;

    /* renamed from: c */
    public boolean f241200c = false;

    public C89006ad(C89068x xVar) {
        this.f241198a = xVar;
    }

    /* renamed from: a */
    public final int mo82976a() {
        if (!this.f241200c) {
            C89051g gVar = this.f241199b;
            if (gVar == null) {
                return 0;
            }
            return gVar.mo83020a();
        }
        throw new C90457d(C89885b.HTTP_STREAM_ALREADY_CLOSED_VALUE);
    }

    /* renamed from: b */
    public final void mo82977b() {
        if (!this.f241200c) {
            C89051g gVar = this.f241199b;
            if (gVar != null) {
                gVar.mo83024e();
                this.f241199b = null;
            }
            this.f241198a.mo27475d();
            this.f241200c = true;
        }
    }
}
