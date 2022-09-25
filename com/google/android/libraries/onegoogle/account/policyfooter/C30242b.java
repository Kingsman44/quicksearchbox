package com.google.android.libraries.onegoogle.account.policyfooter;

import androidx.core.p097i.C1978m;
import com.google.android.libraries.onegoogle.account.p2345a.C30156a;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.account.policyfooter.b */
/* compiled from: PG */
final class C30242b extends C30246f {

    /* renamed from: a */
    private final C1978m f81765a;

    /* renamed from: b */
    private final C30860b f81766b;

    /* renamed from: c */
    private final C63644b f81767c;

    /* renamed from: d */
    private final C30897z f81768d;

    /* renamed from: e */
    private final C30156a f81769e;

    /* renamed from: f */
    private final C30156a f81770f;

    /* renamed from: g */
    private final C58833ax f81771g;

    /* renamed from: h */
    private final C58833ax f81772h;

    /* renamed from: i */
    private final C30922i f81773i;

    public C30242b(C1978m mVar, C30860b bVar, C63644b bVar2, C30897z zVar, C30156a aVar, C30156a aVar2, C58833ax axVar, C58833ax axVar2, C30922i iVar) {
        this.f81765a = mVar;
        this.f81766b = bVar;
        this.f81767c = bVar2;
        this.f81768d = zVar;
        this.f81769e = aVar;
        this.f81770f = aVar2;
        this.f81771g = axVar;
        this.f81772h = axVar2;
        this.f81773i = iVar;
    }

    /* renamed from: a */
    public final C1978m mo35740a() {
        return this.f81765a;
    }

    /* renamed from: b */
    public final C30156a mo35741b() {
        return this.f81769e;
    }

    /* renamed from: c */
    public final C30156a mo35742c() {
        return this.f81770f;
    }

    /* renamed from: d */
    public final C30922i mo35743d() {
        return this.f81773i;
    }

    /* renamed from: e */
    public final C30860b mo35744e() {
        return this.f81766b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C30246f) {
            C30246f fVar = (C30246f) obj;
            return this.f81765a.equals(fVar.mo35740a()) && this.f81766b.equals(fVar.mo35744e()) && this.f81767c.equals(fVar.mo35750i()) && this.f81768d.equals(fVar.mo35746f()) && this.f81769e.equals(fVar.mo35741b()) && this.f81770f.equals(fVar.mo35742c()) && this.f81771g.equals(fVar.mo35748h()) && this.f81772h.equals(fVar.mo35747g()) && this.f81773i.equals(fVar.mo35743d());
        }
    }

    /* renamed from: f */
    public final C30897z mo35746f() {
        return this.f81768d;
    }

    /* renamed from: g */
    public final C58833ax mo35747g() {
        return this.f81772h;
    }

    /* renamed from: h */
    public final C58833ax mo35748h() {
        return this.f81771g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f81765a.hashCode() ^ 1000003) * 1000003) ^ this.f81766b.hashCode()) * 1000003) ^ this.f81767c.hashCode()) * 1000003) ^ this.f81768d.hashCode()) * 1000003) ^ this.f81769e.hashCode()) * 1000003) ^ this.f81770f.hashCode()) * 1000003) ^ this.f81771g.hashCode()) * 1000003) ^ this.f81772h.hashCode()) * 1000003) ^ this.f81773i.hashCode();
    }

    /* renamed from: i */
    public final C63644b mo35750i() {
        return this.f81767c;
    }

    public final String toString() {
        String obj = this.f81765a.toString();
        String obj2 = this.f81766b.toString();
        String obj3 = this.f81767c.toString();
        String obj4 = this.f81768d.toString();
        String obj5 = this.f81769e.toString();
        String obj6 = this.f81770f.toString();
        String valueOf = String.valueOf(this.f81771g);
        String valueOf2 = String.valueOf(this.f81772h);
        String obj7 = this.f81773i.toString();
        return "PolicyFooterSpec{accountSupplier=" + obj + ", eventLogger=" + obj2 + ", logContext=" + obj3 + ", visualElements=" + obj4 + ", privacyPolicyClickListener=" + obj5 + ", termsOfServiceClickListener=" + obj6 + ", customItemLabelStringId=" + valueOf + ", customItemClickListener=" + valueOf2 + ", clickRunnables=" + obj7 + "}";
    }
}
