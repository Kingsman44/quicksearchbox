package com.google.android.libraries.onegoogle.account.policyfooter;

import androidx.core.p097i.C1978m;
import com.google.android.libraries.onegoogle.account.p2345a.C30156a;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.account.policyfooter.a */
/* compiled from: PG */
public final class C30241a extends C30245e {

    /* renamed from: a */
    public C1978m f81756a;

    /* renamed from: b */
    public C30922i f81757b;

    /* renamed from: c */
    private C30860b f81758c;

    /* renamed from: d */
    private C63644b f81759d;

    /* renamed from: e */
    private C30897z f81760e;

    /* renamed from: f */
    private C30156a f81761f;

    /* renamed from: g */
    private C30156a f81762g;

    /* renamed from: h */
    private C58833ax f81763h;

    /* renamed from: i */
    private C58833ax f81764i;

    public C30241a() {
        C58836b bVar = C58836b.f156633a;
        this.f81763h = bVar;
        this.f81764i = bVar;
    }

    /* renamed from: a */
    public final C30246f mo35732a() {
        C30860b bVar;
        C63644b bVar2;
        C30897z zVar;
        C30156a aVar;
        C30156a aVar2;
        C30922i iVar;
        C1978m mVar = this.f81756a;
        if (mVar != null && (bVar = this.f81758c) != null && (bVar2 = this.f81759d) != null && (zVar = this.f81760e) != null && (aVar = this.f81761f) != null && (aVar2 = this.f81762g) != null && (iVar = this.f81757b) != null) {
            return new C30242b(mVar, bVar, bVar2, zVar, aVar, aVar2, this.f81763h, this.f81764i, iVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f81756a == null) {
            sb.append(" accountSupplier");
        }
        if (this.f81758c == null) {
            sb.append(" eventLogger");
        }
        if (this.f81759d == null) {
            sb.append(" logContext");
        }
        if (this.f81760e == null) {
            sb.append(" visualElements");
        }
        if (this.f81761f == null) {
            sb.append(" privacyPolicyClickListener");
        }
        if (this.f81762g == null) {
            sb.append(" termsOfServiceClickListener");
        }
        if (this.f81757b == null) {
            sb.append(" clickRunnables");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo35733b(C58833ax axVar) {
        if (axVar != null) {
            this.f81764i = axVar;
            return;
        }
        throw new NullPointerException("Null customItemClickListener");
    }

    /* renamed from: c */
    public final void mo35734c(C58833ax axVar) {
        if (axVar != null) {
            this.f81763h = axVar;
            return;
        }
        throw new NullPointerException("Null customItemLabelStringId");
    }

    /* renamed from: d */
    public final void mo35735d(C30860b bVar) {
        if (bVar != null) {
            this.f81758c = bVar;
            return;
        }
        throw new NullPointerException("Null eventLogger");
    }

    /* renamed from: e */
    public final void mo35736e(C63644b bVar) {
        if (bVar != null) {
            this.f81759d = bVar;
            return;
        }
        throw new NullPointerException("Null logContext");
    }

    /* renamed from: f */
    public final void mo35737f(C30156a aVar) {
        if (aVar != null) {
            this.f81761f = aVar;
            return;
        }
        throw new NullPointerException("Null privacyPolicyClickListener");
    }

    /* renamed from: g */
    public final void mo35738g(C30156a aVar) {
        if (aVar != null) {
            this.f81762g = aVar;
            return;
        }
        throw new NullPointerException("Null termsOfServiceClickListener");
    }

    /* renamed from: h */
    public final void mo35739h(C30897z zVar) {
        if (zVar != null) {
            this.f81760e = zVar;
            return;
        }
        throw new NullPointerException("Null visualElements");
    }
}
