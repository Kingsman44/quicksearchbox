package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import java.util.Arrays;
import p3186j$.nio.charset.StandardCharsets;

/* compiled from: PG */
public class LogEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143622ac();

    /* renamed from: k */
    private static final String[] f389393k = new String[0];

    /* renamed from: a */
    public PlayLoggerContext f389394a;

    /* renamed from: b */
    public byte[] f389395b;

    /* renamed from: c */
    public int[] f389396c;

    /* renamed from: d */
    public String[] f389397d;

    /* renamed from: e */
    public int[] f389398e;

    /* renamed from: f */
    public byte[][] f389399f;

    /* renamed from: g */
    public ExperimentTokens[] f389400g;

    /* renamed from: h */
    public boolean f389401h;

    /* renamed from: i */
    public LogVerifierResultParcelable f389402i;

    /* renamed from: j */
    public C58150b f389403j;

    /* renamed from: l */
    private final String[] f389404l;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, C58150b bVar, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, ExperimentTokens[] experimentTokensArr, boolean z, String[] strArr2) {
        this.f389394a = playLoggerContext;
        this.f389403j = bVar;
        this.f389395b = bArr;
        this.f389396c = iArr;
        this.f389397d = strArr;
        this.f389398e = iArr2;
        this.f389399f = null;
        this.f389400g = experimentTokensArr;
        this.f389401h = z;
        this.f389404l = strArr2;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z, ExperimentTokens[] experimentTokensArr, LogVerifierResultParcelable logVerifierResultParcelable, String[] strArr2) {
        this.f389394a = playLoggerContext;
        this.f389395b = bArr;
        this.f389396c = iArr;
        this.f389397d = strArr;
        this.f389398e = iArr2;
        this.f389399f = bArr2;
        this.f389401h = z;
        this.f389400g = experimentTokensArr;
        this.f389402i = logVerifierResultParcelable;
        this.f389404l = strArr2;
        this.f389403j = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LogEventParcelable) {
            LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
            return C143912ba.m233950b(this.f389394a, logEventParcelable.f389394a) && Arrays.equals(this.f389395b, logEventParcelable.f389395b) && Arrays.equals(this.f389396c, logEventParcelable.f389396c) && Arrays.equals(this.f389397d, logEventParcelable.f389397d) && C143912ba.m233950b(this.f389403j, logEventParcelable.f389403j) && Arrays.equals(this.f389398e, logEventParcelable.f389398e) && Arrays.deepEquals(this.f389399f, logEventParcelable.f389399f) && Arrays.equals(this.f389400g, logEventParcelable.f389400g) && Arrays.equals(this.f389404l, logEventParcelable.f389404l) && this.f389401h == logEventParcelable.f389401h && C143912ba.m233950b(this.f389402i, logEventParcelable.f389402i);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f389394a, this.f389395b, this.f389396c, this.f389397d, this.f389403j, this.f389398e, this.f389399f, this.f389400g, Boolean.valueOf(this.f389401h), this.f389404l, this.f389402i});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LogEventParcelable[");
        sb.append(this.f389394a);
        sb.append(", LogEventBytes: ");
        byte[] bArr = this.f389395b;
        String str2 = null;
        if (bArr == null) {
            str = null;
        } else {
            str = new String(bArr, StandardCharsets.UTF_8);
        }
        sb.append(str);
        sb.append(", TestCodes: ");
        sb.append(Arrays.toString(this.f389396c));
        sb.append(", MendelPackages: ");
        sb.append(Arrays.toString(this.f389397d));
        sb.append(", LogEvent: ");
        sb.append(this.f389403j);
        sb.append(", , ExperimentIDs: ");
        sb.append(Arrays.toString(this.f389398e));
        sb.append(", ExperimentTokens: ");
        sb.append(Arrays.deepToString(this.f389399f));
        sb.append(", ExperimentTokensParcelables: ");
        sb.append(Arrays.toString(this.f389400g));
        sb.append(", MendelPackagesToFilter: ");
        sb.append(Arrays.toString(this.f389404l));
        sb.append("AddPhenotypeExperimentTokens: ");
        sb.append(this.f389401h);
        sb.append(", LogVerifierResult: ");
        LogVerifierResultParcelable logVerifierResultParcelable = this.f389402i;
        if (logVerifierResultParcelable != null) {
            str2 = logVerifierResultParcelable.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f389394a, i);
        C143947c.m234094m(parcel, 3, this.f389395b);
        C143947c.m234099r(parcel, 4, this.f389396c);
        C143947c.m234107z(parcel, 5, this.f389397d);
        C143947c.m234099r(parcel, 6, this.f389398e);
        C143947c.m234095n(parcel, 7, this.f389399f);
        C143947c.m234084c(parcel, 8, this.f389401h);
        C143947c.m234079B(parcel, 9, this.f389400g, i);
        C143947c.m234105x(parcel, 11, this.f389402i, i);
        String[] strArr = this.f389404l;
        if (strArr == null) {
            strArr = f389393k;
        }
        C143947c.m234107z(parcel, 12, strArr);
        C143947c.m234083b(parcel, a);
    }
}
