package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bj */
/* compiled from: PG */
public final class C80681bj extends C80764el {

    /* renamed from: a */
    private boolean f221520a;

    /* renamed from: b */
    private boolean f221521b;

    /* renamed from: c */
    private C58495hd f221522c;

    /* renamed from: d */
    private C58495hd f221523d;

    /* renamed from: e */
    private byte f221524e;

    /* renamed from: a */
    public final C80765em mo74569a() {
        C58495hd hdVar;
        C58495hd hdVar2;
        if (this.f221524e == 3 && (hdVar = this.f221522c) != null && (hdVar2 = this.f221523d) != null) {
            return new C80682bk(this.f221520a, this.f221521b, hdVar, hdVar2);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f221524e & 1) == 0) {
            sb.append(" show");
        }
        if ((this.f221524e & 2) == 0) {
            sb.append(" forceEnable");
        }
        if (this.f221522c == null) {
            sb.append(" featureMap");
        }
        if (this.f221523d == null) {
            sb.append(" categoryFeatureMap");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74570b(C58495hd hdVar) {
        if (hdVar != null) {
            this.f221523d = hdVar;
            return;
        }
        throw new NullPointerException("Null categoryFeatureMap");
    }

    /* renamed from: c */
    public final void mo74571c(C58495hd hdVar) {
        if (hdVar != null) {
            this.f221522c = hdVar;
            return;
        }
        throw new NullPointerException("Null featureMap");
    }

    /* renamed from: d */
    public final void mo74572d(boolean z) {
        this.f221521b = z;
        this.f221524e = (byte) (this.f221524e | 2);
    }

    /* renamed from: e */
    public final void mo74573e(boolean z) {
        this.f221520a = z;
        this.f221524e = (byte) (this.f221524e | 1);
    }
}
