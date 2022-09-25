package android.p017a.p019b;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.common.p4535g.C59203do;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@Deprecated
/* renamed from: android.a.b.m */
/* compiled from: PG */
public final class C0099m extends Number implements Comparable {
    private static final long serialVersionUID = -4756200506571685661L;
    @Deprecated

    /* renamed from: a */
    public final double f268a;
    @Deprecated

    /* renamed from: b */
    public final int f269b;
    @Deprecated

    /* renamed from: c */
    public final int f270c;
    @Deprecated

    /* renamed from: d */
    public final long f271d;
    @Deprecated

    /* renamed from: e */
    public final long f272e;
    @Deprecated

    /* renamed from: f */
    public final long f273f;
    @Deprecated

    /* renamed from: g */
    public final boolean f274g;

    @Deprecated
    public C0099m(double d, int i, long j) {
        boolean z = d < C59203do.f157270a;
        this.f274g = z;
        this.f268a = z ? -d : d;
        this.f269b = i;
        this.f271d = j;
        this.f273f = d > 1.0E18d ? 1000000000000000000L : (long) d;
        if (j == 0) {
            this.f272e = 0;
            this.f270c = 0;
        } else {
            int i2 = i;
            while (j % 10 == 0) {
                j /= 10;
                i2--;
            }
            this.f272e = j;
            this.f270c = i2;
        }
        Math.pow(10.0d, (double) i);
    }

    /* renamed from: a */
    public static int m54a(double d, int i) {
        if (i == 0) {
            return 0;
        }
        if (d < C59203do.f157270a) {
            d = -d;
        }
        int pow = (int) Math.pow(10.0d, (double) i);
        double d2 = (double) pow;
        Double.isNaN(d2);
        return (int) (Math.round(d * d2) % ((long) pow));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new NotSerializableException();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new NotSerializableException();
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0099m mVar = (C0099m) obj;
        long j = this.f273f;
        long j2 = mVar.f273f;
        if (j != j2) {
            return j >= j2 ? 1 : -1;
        }
        double d = this.f268a;
        double d2 = mVar.f268a;
        if (d != d2) {
            return d >= d2 ? 1 : -1;
        }
        int i = this.f269b;
        int i2 = mVar.f269b;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        long j3 = this.f271d - mVar.f271d;
        if (j3 != 0) {
            return j3 >= 0 ? 1 : -1;
        }
        return 0;
    }

    @Deprecated
    public final double doubleValue() {
        return this.f274g ? -this.f268a : this.f268a;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0099m)) {
            return false;
        }
        C0099m mVar = (C0099m) obj;
        return this.f268a == mVar.f268a && this.f269b == mVar.f269b && this.f271d == mVar.f271d;
    }

    @Deprecated
    public final float floatValue() {
        return (float) this.f268a;
    }

    @Deprecated
    public final int hashCode() {
        return (int) (this.f271d + ((long) ((this.f269b + ((int) (this.f268a * 37.0d))) * 37)));
    }

    @Deprecated
    public final int intValue() {
        return (int) this.f273f;
    }

    @Deprecated
    public final long longValue() {
        return this.f273f;
    }

    @Deprecated
    public final String toString() {
        int i = this.f269b;
        return String.format("%." + i + C10662f.f35572a, new Object[]{Double.valueOf(this.f268a)});
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0099m(java.lang.String r7) {
        /*
            r6 = this;
            double r1 = java.lang.Double.parseDouble(r7)
            java.lang.String r7 = r7.trim()
            r0 = 46
            int r0 = r7.indexOf(r0)
            int r0 = r0 + 1
            if (r0 != 0) goto L_0x0015
            r7 = 0
            r3 = 0
            goto L_0x001b
        L_0x0015:
            int r7 = r7.length()
            int r7 = r7 - r0
            r3 = r7
        L_0x001b:
            int r7 = m54a(r1, r3)
            long r4 = (long) r7
            r0 = r6
            r0.<init>(r1, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.p017a.p019b.C0099m.<init>(java.lang.String):void");
    }
}
