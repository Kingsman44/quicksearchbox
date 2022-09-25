package com.google.android.apps.gsa.shared.proto.p7126io;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.gsa.util.C23338c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.shared.proto.io.LargeProtoParcelable */
/* compiled from: PG */
public class LargeProtoParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90448a();

    /* renamed from: a */
    public static final C59071e f252677a = C59071e.m91332i("com.google.android.apps.gsa.shared.proto.io.LargeProtoParcelable");

    /* renamed from: b */
    private boolean f252678b = true;

    /* renamed from: c */
    private MessageLite f252679c;

    /* renamed from: d */
    private byte[] f252680d;

    public LargeProtoParcelable(MessageLite messageLite) {
        this.f252679c = messageLite;
    }

    public LargeProtoParcelable(byte[] bArr) {
        this.f252680d = bArr;
    }

    /* renamed from: b */
    private final byte[] m147132b() {
        MessageLite messageLite;
        if (this.f252680d == null && this.f252678b && (messageLite = this.f252679c) != null) {
            this.f252680d = messageLite.toByteArray();
        }
        return this.f252680d;
    }

    /* renamed from: a */
    public final MessageLite mo84185a(C63010eb ebVar) {
        byte[] bArr;
        if (this.f252679c == null) {
            if (this.f252678b || (bArr = this.f252680d) == null) {
                return null;
            }
            try {
                this.f252679c = (MessageLite) ebVar.mo59015n(bArr, C62921ba.m95368a());
                this.f252678b = true;
            } catch (C62974ct e) {
                throw new IllegalArgumentException(e);
            }
        }
        try {
            return this.f252679c;
        } catch (ClassCastException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LargeProtoParcelable)) {
            return false;
        }
        return Arrays.equals(m147132b(), ((LargeProtoParcelable) obj).m147132b());
    }

    public final int hashCode() {
        return Arrays.hashCode(m147132b());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C23338c.m43770b(parcel, m147132b());
    }
}
