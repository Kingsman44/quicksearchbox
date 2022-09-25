package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.p10717f.p10720c.C142627a;
import com.google.p4184bj.p4189b.C55893j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* compiled from: PG */
public class ContextFenceStub extends AwarenessFence {
    public static final Parcelable.Creator CREATOR = new C144040h();

    /* renamed from: a */
    private C55893j f390272a = null;

    /* renamed from: b */
    private byte[] f390273b;

    public ContextFenceStub(byte[] bArr) {
        this.f390273b = bArr;
        m234221b();
    }

    /* renamed from: a */
    public final byte[] mo119546a() {
        byte[] bArr = this.f390273b;
        if (bArr != null) {
            return bArr;
        }
        C55893j jVar = this.f390272a;
        C143919bh.m233958a(jVar);
        return jVar.toByteArray();
    }

    public final String toString() {
        if (this.f390272a == null) {
            try {
                C62921ba a = C62921ba.m95368a();
                this.f390272a = (C55893j) C62942bv.parseFrom((C62942bv) C55893j.f148728h, (byte[]) C143919bh.m233958a(this.f390273b), a);
                this.f390273b = null;
            } catch (C62974ct e) {
                C142627a.m231238c("ContextFenceStub", "Could not deserialize context fence bytes.", e);
                throw new IllegalStateException(e);
            }
        }
        m234221b();
        C55893j jVar = this.f390272a;
        C143919bh.m233958a(jVar);
        return jVar.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 2, mo119546a());
        C143947c.m234083b(parcel, a);
    }

    /* renamed from: b */
    private final void m234221b() {
        C55893j jVar = this.f390272a;
        if (jVar == null && this.f390273b != null) {
            return;
        }
        if (jVar != null && this.f390273b == null) {
            return;
        }
        if (jVar != null && this.f390273b != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (jVar == null && this.f390273b == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }
}
