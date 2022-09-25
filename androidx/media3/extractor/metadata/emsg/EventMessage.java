package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C2592as;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2612ak;
import java.util.Arrays;

/* compiled from: PG */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new C3589a();

    /* renamed from: f */
    private static final C2680x f11426f;

    /* renamed from: g */
    private static final C2680x f11427g;

    /* renamed from: a */
    public final String f11428a;

    /* renamed from: b */
    public final String f11429b;

    /* renamed from: c */
    public final long f11430c;

    /* renamed from: d */
    public final long f11431d;

    /* renamed from: e */
    public final byte[] f11432e;

    /* renamed from: h */
    private int f11433h;

    static {
        C2679w wVar = new C2679w();
        wVar.f7459k = "application/id3";
        f11426f = new C2680x(wVar);
        C2679w wVar2 = new C2679w();
        wVar2.f7459k = "application/x-scte35";
        f11427g = new C2680x(wVar2);
    }

    public EventMessage(Parcel parcel) {
        String readString = parcel.readString();
        int i = C2612ak.f7249a;
        this.f11428a = readString;
        this.f11429b = parcel.readString();
        this.f11430c = parcel.readLong();
        this.f11431d = parcel.readLong();
        this.f11432e = (byte[]) C2612ak.m6927J(parcel.createByteArray());
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f11428a = str;
        this.f11429b = str2;
        this.f11430c = j;
        this.f11431d = j2;
        this.f11432e = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.common.C2680x mo6066a() {
        /*
            r5 = this;
            java.lang.String r0 = r5.f11428a
            int r1 = r0.hashCode()
            r2 = -1468477611(0xffffffffa878cf55, float:-1.38117235E-14)
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x002c
            r2 = -795945609(0xffffffffd08ed577, float:-1.91708344E10)
            if (r1 == r2) goto L_0x0022
            r2 = 1303648457(0x4db418c9, float:3.776904E8)
            if (r1 == r2) goto L_0x0018
            goto L_0x0036
        L_0x0018:
            java.lang.String r1 = "https://developer.apple.com/streaming/emsg-id3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "https://aomedia.org/emsg/ID3"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "urn:scte:scte35:2014:bin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0042
            if (r0 == r4) goto L_0x0042
            if (r0 == r3) goto L_0x003f
            r0 = 0
            return r0
        L_0x003f:
            androidx.media3.common.x r0 = f11427g
            return r0
        L_0x0042:
            androidx.media3.common.x r0 = f11426f
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.metadata.emsg.EventMessage.mo6066a():androidx.media3.common.x");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo6067b(C2592as asVar) {
    }

    /* renamed from: c */
    public final byte[] mo6068c() {
        if (mo6066a() != null) {
            return this.f11432e;
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            EventMessage eventMessage = (EventMessage) obj;
            return this.f11430c == eventMessage.f11430c && this.f11431d == eventMessage.f11431d && C2612ak.m6951aa(this.f11428a, eventMessage.f11428a) && C2612ak.m6951aa(this.f11429b, eventMessage.f11429b) && Arrays.equals(this.f11432e, eventMessage.f11432e);
        }
    }

    public final int hashCode() {
        int i = this.f11433h;
        if (i != 0) {
            return i;
        }
        String str = this.f11428a;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f11429b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f11430c;
        long j2 = this.f11431d;
        int hashCode2 = ((((((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f11432e);
        this.f11433h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.f11428a;
        long j = this.f11431d;
        long j2 = this.f11430c;
        String str2 = this.f11429b;
        return "EMSG: scheme=" + str + ", id=" + j + ", durationMs=" + j2 + ", value=" + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11428a);
        parcel.writeString(this.f11429b);
        parcel.writeLong(this.f11430c);
        parcel.writeLong(this.f11431d);
        parcel.writeByteArray(this.f11432e);
    }
}
