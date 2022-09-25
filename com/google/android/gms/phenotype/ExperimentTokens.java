package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public class ExperimentTokens extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145731i();

    /* renamed from: a */
    public static final byte[][] f393988a = new byte[0][];

    /* renamed from: b */
    public static final C145730h f393989b = new C145726d();

    /* renamed from: c */
    public static final C145730h f393990c = new C145727e();

    /* renamed from: d */
    public static final C145730h f393991d = new C145728f();

    /* renamed from: e */
    public static final C145730h f393992e = new C145729g();

    /* renamed from: f */
    public final String f393993f;

    /* renamed from: g */
    public final byte[] f393994g;

    /* renamed from: h */
    public final byte[][] f393995h;

    /* renamed from: i */
    public final byte[][] f393996i;

    /* renamed from: j */
    public final byte[][] f393997j;

    /* renamed from: k */
    public final byte[][] f393998k;

    /* renamed from: l */
    public final int[] f393999l;

    /* renamed from: m */
    public final byte[][] f394000m;

    /* renamed from: n */
    public final int[] f394001n;

    /* renamed from: o */
    public final byte[][] f394002o;

    public ExperimentTokens(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.f393993f = str;
        this.f393994g = bArr;
        this.f393995h = bArr2;
        this.f393996i = bArr3;
        this.f393997j = bArr4;
        this.f393998k = bArr5;
        this.f393999l = iArr;
        this.f394000m = bArr6;
        this.f394001n = iArr2;
        this.f394002o = bArr7;
    }

    /* renamed from: a */
    public static byte[][] m236914a(List list, C145730h hVar) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            ExperimentTokens experimentTokens = (ExperimentTokens) it.next();
            if (!(experimentTokens == null || hVar.mo121890a(experimentTokens) == null)) {
                byte[][] a = hVar.mo121890a(experimentTokens);
                C143919bh.m233958a(a);
                i += a.length;
            }
        }
        byte[][] bArr = new byte[i][];
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            ExperimentTokens experimentTokens2 = (ExperimentTokens) it2.next();
            if (!(experimentTokens2 == null || hVar.mo121890a(experimentTokens2) == null)) {
                byte[][] a2 = hVar.mo121890a(experimentTokens2);
                C143919bh.m233958a(a2);
                int length = a2.length;
                int i3 = 0;
                while (i3 < length) {
                    bArr[i2] = a2[i3];
                    i3++;
                    i2++;
                }
            }
        }
        return bArr;
    }

    /* renamed from: b */
    private static List m236915b(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    private static List m236916c(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(r0);
        for (byte[] bArr2 : bArr) {
            C143919bh.m233958a(bArr2);
            arrayList.add(Base64.encodeToString(bArr2, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: d */
    private static List m236917d(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new GenericDimension(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: e */
    private static void m236918e(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        int length = bArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            C143919bh.m233958a(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ExperimentTokens) {
            ExperimentTokens experimentTokens = (ExperimentTokens) obj;
            if (!C145717aa.m236984a(this.f393993f, experimentTokens.f393993f) || !Arrays.equals(this.f393994g, experimentTokens.f393994g) || !C145717aa.m236984a(m236916c(this.f393995h), m236916c(experimentTokens.f393995h)) || !C145717aa.m236984a(m236916c(this.f393996i), m236916c(experimentTokens.f393996i)) || !C145717aa.m236984a(m236916c(this.f393997j), m236916c(experimentTokens.f393997j)) || !C145717aa.m236984a(m236916c(this.f393998k), m236916c(experimentTokens.f393998k)) || !C145717aa.m236984a(m236915b(this.f393999l), m236915b(experimentTokens.f393999l)) || !C145717aa.m236984a(m236916c(this.f394000m), m236916c(experimentTokens.f394000m)) || !C145717aa.m236984a(m236917d(this.f394001n), m236917d(experimentTokens.f394001n)) || !C145717aa.m236984a(m236916c(this.f394002o), m236916c(experimentTokens.f394002o))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str2 = this.f393993f;
        if (str2 == null) {
            str = "null";
        } else {
            str = "'" + str2 + "'";
        }
        sb.append(str);
        byte[] bArr = this.f393994g;
        sb.append(", direct==");
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        m236918e(sb, "GAIA=", this.f393995h);
        sb.append(", ");
        m236918e(sb, "PSEUDO=", this.f393996i);
        sb.append(", ");
        m236918e(sb, "ALWAYS=", this.f393997j);
        sb.append(", ");
        m236918e(sb, "OTHER=", this.f393998k);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.f393999l));
        sb.append(", ");
        m236918e(sb, "directs=", this.f394000m);
        sb.append(", genDims=");
        sb.append(Arrays.toString(m236917d(this.f394001n).toArray()));
        sb.append(", ");
        m236918e(sb, "external=", this.f394002o);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f393993f);
        C143947c.m234094m(parcel, 3, this.f393994g);
        C143947c.m234095n(parcel, 4, this.f393995h);
        C143947c.m234095n(parcel, 5, this.f393996i);
        C143947c.m234095n(parcel, 6, this.f393997j);
        C143947c.m234095n(parcel, 7, this.f393998k);
        C143947c.m234099r(parcel, 8, this.f393999l);
        C143947c.m234095n(parcel, 9, this.f394000m);
        C143947c.m234099r(parcel, 10, this.f394001n);
        C143947c.m234095n(parcel, 11, this.f394002o);
        C143947c.m234083b(parcel, a);
    }
}
