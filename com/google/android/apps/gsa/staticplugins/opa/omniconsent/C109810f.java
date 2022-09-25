package com.google.android.apps.gsa.staticplugins.opa.omniconsent;

import com.google.assistant.p3861at.C50359ud;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.omniconsent.f */
/* compiled from: PG */
final class C109810f extends C109798ar {

    /* renamed from: a */
    public C58833ax f305991a;

    /* renamed from: b */
    public C50359ud f305992b;

    /* renamed from: c */
    public C58485gu f305993c;

    /* renamed from: d */
    public boolean f305994d;

    /* renamed from: e */
    public boolean f305995e;

    /* renamed from: f */
    public C58833ax f305996f;

    /* renamed from: g */
    public boolean f305997g;

    /* renamed from: h */
    public C63088z f305998h;

    /* renamed from: i */
    public C58833ax f305999i;

    /* renamed from: j */
    public byte f306000j;

    /* renamed from: k */
    public int f306001k;

    /* renamed from: l */
    public int f306002l;

    /* renamed from: m */
    public int f306003m;

    /* renamed from: n */
    public int f306004n;

    public C109810f() {
        C58836b bVar = C58836b.f156633a;
        this.f305991a = bVar;
        this.f305996f = bVar;
        this.f305999i = bVar;
    }

    /* renamed from: a */
    public final void mo98132a(boolean z) {
        this.f305995e = z;
        this.f306000j = (byte) (this.f306000j | 2);
    }

    /* renamed from: b */
    public final void mo98133b(C58485gu guVar) {
        if (guVar != null) {
            this.f305993c = guVar;
            return;
        }
        throw new NullPointerException("Null multiConsentUi");
    }

    /* renamed from: c */
    public final void mo98134c(C63088z zVar) {
        if (zVar != null) {
            this.f305998h = zVar;
            return;
        }
        throw new NullPointerException("Null sessionId");
    }

    /* renamed from: d */
    public final void mo98135d(boolean z) {
        this.f305997g = z;
        this.f306000j = (byte) (this.f306000j | 4);
    }

    /* renamed from: e */
    public final void mo98136e(boolean z) {
        this.f305994d = z;
        this.f306000j = (byte) (this.f306000j | 1);
    }
}
