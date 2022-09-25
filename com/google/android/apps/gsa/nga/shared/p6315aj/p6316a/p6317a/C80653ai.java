package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.graphics.Bitmap;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ai */
/* compiled from: PG */
public final class C80653ai extends C80644a {

    /* renamed from: a */
    public Boolean f221405a;

    /* renamed from: b */
    private Bitmap f221406b;

    /* renamed from: c */
    private C58485gu f221407c;

    /* renamed from: d */
    private C58485gu f221408d;

    /* renamed from: a */
    public final C80671b mo74390a() {
        if (this.f221406b != null && this.f221407c != null && this.f221405a != null && this.f221408d != null) {
            return new C80654aj(this.f221406b, this.f221407c, this.f221405a, this.f221408d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f221406b == null) {
            sb.append(" bitmap");
        }
        if (this.f221407c == null) {
            sb.append(" boundingBoxes");
        }
        if (this.f221405a == null) {
            sb.append(" shouldShowGleamTapPreview");
        }
        if (this.f221408d == null) {
            sb.append(" appFlowEvents");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74391b(C58485gu guVar) {
        if (guVar != null) {
            this.f221408d = guVar;
            return;
        }
        throw new NullPointerException("Null appFlowEvents");
    }

    /* renamed from: c */
    public final void mo74392c(Bitmap bitmap) {
        if (bitmap != null) {
            this.f221406b = bitmap;
            return;
        }
        throw new NullPointerException("Null bitmap");
    }

    /* renamed from: d */
    public final void mo74393d(C58485gu guVar) {
        if (guVar != null) {
            this.f221407c = guVar;
            return;
        }
        throw new NullPointerException("Null boundingBoxes");
    }
}
