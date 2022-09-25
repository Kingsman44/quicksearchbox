package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.assistant.p3861at.C50359ud;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.a */
/* compiled from: PG */
final class C109768a extends C109817m {

    /* renamed from: a */
    public boolean f305845a;

    /* renamed from: b */
    public C50359ud f305846b;

    /* renamed from: c */
    public C58833ax f305847c = C58836b.f156633a;

    /* renamed from: d */
    public byte f305848d;

    /* renamed from: e */
    public int f305849e;

    /* renamed from: f */
    public int f305850f;

    /* renamed from: a */
    public final void mo98104a(C50359ud udVar) {
        if (udVar != null) {
            this.f305846b = udVar;
            return;
        }
        throw new NullPointerException("Null consentUi");
    }

    /* renamed from: b */
    public final void mo98105b(boolean z) {
        this.f305845a = z;
        this.f305848d = 1;
    }

    /* renamed from: c */
    public final void mo98106c(int i) {
        if (i != 0) {
            this.f305850f = i;
            return;
        }
        throw new NullPointerException("Null flowId");
    }

    /* renamed from: d */
    public final void mo98107d(int i) {
        if (i != 0) {
            this.f305849e = i;
            return;
        }
        throw new NullPointerException("Null omniconsentScope");
    }
}
