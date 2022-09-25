package androidx.media3.extractor.p159f;

import android.util.Pair;
import androidx.media3.common.C2599az;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3369bg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.f.d */
/* compiled from: PG */
public final class C3399d {

    /* renamed from: A */
    public int f10297A = -1;

    /* renamed from: B */
    public int f10298B = 1000;

    /* renamed from: C */
    public int f10299C = 200;

    /* renamed from: D */
    public float f10300D = -1.0f;

    /* renamed from: E */
    public float f10301E = -1.0f;

    /* renamed from: F */
    public float f10302F = -1.0f;

    /* renamed from: G */
    public float f10303G = -1.0f;

    /* renamed from: H */
    public float f10304H = -1.0f;

    /* renamed from: I */
    public float f10305I = -1.0f;

    /* renamed from: J */
    public float f10306J = -1.0f;

    /* renamed from: K */
    public float f10307K = -1.0f;

    /* renamed from: L */
    public float f10308L = -1.0f;

    /* renamed from: M */
    public float f10309M = -1.0f;

    /* renamed from: N */
    public byte[] f10310N;

    /* renamed from: O */
    public int f10311O = 1;

    /* renamed from: P */
    public int f10312P = -1;

    /* renamed from: Q */
    public int f10313Q = 8000;

    /* renamed from: R */
    public long f10314R = 0;

    /* renamed from: S */
    public long f10315S = 0;

    /* renamed from: T */
    public C3369bg f10316T;

    /* renamed from: U */
    public boolean f10317U;

    /* renamed from: V */
    public boolean f10318V = true;

    /* renamed from: W */
    public String f10319W = "eng";

    /* renamed from: X */
    public C3368bf f10320X;

    /* renamed from: Y */
    public int f10321Y;

    /* renamed from: a */
    public String f10322a;

    /* renamed from: b */
    public String f10323b;

    /* renamed from: c */
    public int f10324c;

    /* renamed from: d */
    public int f10325d;

    /* renamed from: e */
    public int f10326e;

    /* renamed from: f */
    public int f10327f;

    /* renamed from: g */
    public int f10328g;

    /* renamed from: h */
    public boolean f10329h;

    /* renamed from: i */
    public byte[] f10330i;

    /* renamed from: j */
    public C3367be f10331j;

    /* renamed from: k */
    public byte[] f10332k;

    /* renamed from: l */
    public DrmInitData f10333l;

    /* renamed from: m */
    public int f10334m = -1;

    /* renamed from: n */
    public int f10335n = -1;

    /* renamed from: o */
    public int f10336o = -1;

    /* renamed from: p */
    public int f10337p = -1;

    /* renamed from: q */
    public int f10338q = 0;

    /* renamed from: r */
    public int f10339r = -1;

    /* renamed from: s */
    public float f10340s = 0.0f;

    /* renamed from: t */
    public float f10341t = 0.0f;

    /* renamed from: u */
    public float f10342u = 0.0f;

    /* renamed from: v */
    public byte[] f10343v = null;

    /* renamed from: w */
    public int f10344w = -1;

    /* renamed from: x */
    public boolean f10345x = false;

    /* renamed from: y */
    public int f10346y = -1;

    /* renamed from: z */
    public int f10347z = -1;

    protected C3399d() {
    }

    /* renamed from: a */
    public static Pair m9818a(C2604ac acVar) {
        try {
            acVar.mo6131A(acVar.f7235b + 16);
            long l = acVar.mo6144l();
            if (l == 1482049860) {
                return new Pair("video/divx", (Object) null);
            }
            if (l == 859189832) {
                return new Pair("video/3gpp", (Object) null);
            }
            if (l == 826496599) {
                int i = acVar.f7235b + 20;
                byte[] bArr = acVar.f7234a;
                while (true) {
                    int length = bArr.length;
                    if (i >= length - 4) {
                        throw C2599az.m6819a("Failed to find FourCC VC1 initialization data", (Throwable) null);
                    } else if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 1 && bArr[i + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i, length)));
                    } else {
                        i++;
                    }
                }
            } else {
                C2633u.m7050e("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair("video/x-unknown", (Object) null);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C2599az.m6819a("Error parsing FourCC private data", (Throwable) null);
        }
    }

    /* renamed from: b */
    public static List m9819b(byte[] bArr) {
        byte b;
        byte b2;
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (true) {
                    b = bArr[i] & 255;
                    if (b != 255) {
                        break;
                    }
                    i2 += PrivateKeyType.INVALID;
                    i++;
                }
                int i3 = i + 1;
                int i4 = i2 + b;
                int i5 = 0;
                while (true) {
                    b2 = bArr[i3] & 255;
                    if (b2 != 255) {
                        break;
                    }
                    i5 += PrivateKeyType.INVALID;
                    i3++;
                }
                int i6 = i3 + 1;
                int i7 = i5 + b2;
                if (bArr[i6] == 1) {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i6, bArr2, 0, i4);
                    int i8 = i6 + i4;
                    if (bArr[i8] == 3) {
                        int i9 = i8 + i7;
                        if (bArr[i9] == 5) {
                            int length = bArr.length - i9;
                            byte[] bArr3 = new byte[length];
                            System.arraycopy(bArr, i9, bArr3, 0, length);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw C2599az.m6819a("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw C2599az.m6819a("Error parsing vorbis codec private", (Throwable) null);
                }
                throw C2599az.m6819a("Error parsing vorbis codec private", (Throwable) null);
            }
            throw C2599az.m6819a("Error parsing vorbis codec private", (Throwable) null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C2599az.m6819a("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    /* renamed from: c */
    public static boolean m9820c(C2604ac acVar) {
        try {
            int e = acVar.mo6137e();
            if (e == 1) {
                return true;
            }
            if (e == 65534) {
                acVar.mo6131A(24);
                return acVar.mo6145m() == C3400e.f10349b.getMostSignificantBits() && acVar.mo6145m() == C3400e.f10349b.getLeastSignificantBits();
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw C2599az.m6819a("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    /* renamed from: d */
    public final byte[] mo7372d(String str) {
        byte[] bArr = this.f10332k;
        if (bArr != null) {
            return bArr;
        }
        throw C2599az.m6819a("Missing CodecPrivate for codec ".concat(String.valueOf(str)), (Throwable) null);
    }
}
