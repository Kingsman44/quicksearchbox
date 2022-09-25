package com.google.android.gms.contextmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.p4184bj.p4189b.C55887d;
import com.google.p4184bj.p4189b.C55889f;
import com.google.p4184bj.p4189b.C55895l;
import com.google.p4184bj.p4189b.C55897n;
import com.google.protobuf.C62897ae;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
public class ContextData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144028b();

    /* renamed from: a */
    private C55887d f390262a = null;

    /* renamed from: b */
    private byte[] f390263b;

    public ContextData(byte[] bArr) {
        this.f390263b = (byte[]) C143919bh.m233958a(bArr);
    }

    /* renamed from: e */
    private final void m234206e() {
        byte[] bArr;
        if (this.f390262a == null && (bArr = this.f390263b) != null) {
            try {
                this.f390262a = (C55887d) C62942bv.parseFrom((C62942bv) C55887d.f148716f, bArr, C62921ba.m95368a());
                this.f390263b = null;
            } catch (C62974ct e) {
                Log.e("ContextData", "Could not deserialize context bytes.", e);
                throw new IllegalStateException(e);
            }
        }
    }

    /* renamed from: a */
    public final int mo119530a() {
        m234206e();
        C55887d dVar = this.f390262a;
        C143919bh.m233958a(dVar);
        int a = C55895l.m87800a(dVar.f148721d);
        if (a == 0) {
            a = 1;
        }
        return a - 1;
    }

    /* renamed from: b */
    public final String mo119531b() {
        m234206e();
        C55887d dVar = this.f390262a;
        C143919bh.m233958a(dVar);
        return dVar.f148719b;
    }

    /* renamed from: c */
    public final byte[] mo119532c() {
        byte[] bArr = this.f390263b;
        if (bArr != null) {
            return bArr;
        }
        C55887d dVar = this.f390262a;
        C143919bh.m233958a(dVar);
        return dVar.toByteArray();
    }

    /* renamed from: d */
    public final byte[] mo119533d() {
        m234206e();
        C55887d dVar = this.f390262a;
        C143919bh.m233958a(dVar);
        if ((dVar.f148718a & 64) == 0) {
            return null;
        }
        C55889f fVar = dVar.f148722e;
        if (fVar == null) {
            fVar = C55889f.f148724a;
        }
        byte[] byteArray = fVar.toByteArray();
        int length = byteArray.length;
        if (length == 0) {
            return byteArray;
        }
        C62897ae O = C62897ae.m95112O(byteArray, 0, length);
        try {
            O.mo58678m();
            return O.mo58665H(O.mo58675j());
        } catch (IOException e) {
            Log.e("ContextData", "Could not read extension.", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextData)) {
            return false;
        }
        ContextData contextData = (ContextData) obj;
        m234206e();
        contextData.m234206e();
        if (mo119531b().equals(contextData.mo119531b())) {
            C55887d dVar = this.f390262a;
            C143919bh.m233958a(dVar);
            C55897n nVar = dVar.f148720c;
            if (nVar == null) {
                nVar = C55897n.f148738b;
            }
            int i = nVar.f148740a;
            C55887d dVar2 = contextData.f390262a;
            C143919bh.m233958a(dVar2);
            C55897n nVar2 = dVar2.f148720c;
            if (nVar2 == null) {
                nVar2 = C55897n.f148738b;
            }
            if (i == nVar2.f148740a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        m234206e();
        Object[] objArr = new Object[2];
        objArr[0] = mo119531b();
        C55887d dVar = this.f390262a;
        C143919bh.m233958a(dVar);
        C55897n nVar = dVar.f148720c;
        if (nVar == null) {
            nVar = C55897n.f148738b;
        }
        objArr[1] = Integer.valueOf(nVar.f148740a);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        m234206e();
        C143919bh.m233958a(this.f390262a);
        return this.f390262a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 2, mo119532c());
        C143947c.m234083b(parcel, a);
    }
}
