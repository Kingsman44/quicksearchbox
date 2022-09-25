package androidx.media3.extractor.p163j.p170g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.p135a.C2566b;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2633u;
import androidx.media3.extractor.p163j.C3470b;
import androidx.media3.extractor.p163j.C3482c;
import androidx.media3.extractor.p163j.C3493e;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58913w;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.media3.extractor.j.g.a */
/* compiled from: PG */
public final class C3509a extends C3470b {

    /* renamed from: f */
    private final C2604ac f10958f = new C2604ac();

    /* renamed from: g */
    private final boolean f10959g;

    /* renamed from: h */
    private final int f10960h;

    /* renamed from: i */
    private final int f10961i;

    /* renamed from: j */
    private final String f10962j;

    /* renamed from: k */
    private final float f10963k;

    /* renamed from: l */
    private final int f10964l;

    public C3509a(List list) {
        String str = "sans-serif";
        boolean z = false;
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f10960h = bArr[24];
            this.f10961i = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f10962j = true == "Serif".equals(C2612ak.m6930M(bArr, 43, bArr.length + -43)) ? "serif" : str;
            int i = bArr[25] * 20;
            this.f10964l = i;
            z = (bArr[0] & 32) != 0 ? true : z;
            this.f10959g = z;
            if (z) {
                this.f10963k = C2612ak.m6944a(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i), 0.0f, 0.95f);
            } else {
                this.f10963k = 0.85f;
            }
        } else {
            this.f10960h = 0;
            this.f10961i = -1;
            this.f10962j = str;
            this.f10959g = false;
            this.f10963k = 0.85f;
            this.f10964l = -1;
        }
    }

    /* renamed from: m */
    private static void m10145m(boolean z) {
        if (!z) {
            throw new C3493e("Unexpected subtitle format.");
        }
    }

    /* renamed from: n */
    private static void m10146n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & PrivateKeyType.INVALID) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: o */
    private static void m10147o(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            boolean z = (i & 2) != 0;
            if (i7 != 0) {
                if (z) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else if (i7 == 0 && !z) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C3482c mo7433l(byte[] bArr, int i, boolean z) {
        String str;
        int i2;
        int i3;
        this.f10958f.mo6157y(bArr, i);
        C2604ac acVar = this.f10958f;
        int i4 = 1;
        m10145m(acVar.f7236c - acVar.f7235b >= 2);
        int j = acVar.mo6142j();
        int i5 = 8;
        if (j == 0) {
            str = BuildConfig.FLAVOR;
        } else {
            int i6 = acVar.f7236c;
            int i7 = acVar.f7235b;
            if (i6 - i7 >= 2) {
                byte[] bArr2 = acVar.f7234a;
                byte b = (bArr2[i7 + 1] & 255) | ((bArr2[i7] & 255) << 8);
                if (b == 65279 || b == 65534) {
                    str = acVar.mo6151s(j, C58913w.f156755d);
                }
            }
            str = acVar.mo6151s(j, C58913w.f156754c);
        }
        if (str.isEmpty()) {
            return C3510b.f10965a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        m10147o(spannableStringBuilder2, this.f10960h, 0, 0, spannableStringBuilder.length(), 16711680);
        m10146n(spannableStringBuilder2, this.f10961i, -1, 0, spannableStringBuilder.length(), 16711680);
        String str2 = this.f10962j;
        int length = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f = this.f10963k;
        while (true) {
            C2604ac acVar2 = this.f10958f;
            int i8 = acVar2.f7236c;
            int i9 = acVar2.f7235b;
            if (i8 - i9 >= i5) {
                int b2 = acVar2.mo6134b();
                int b3 = this.f10958f.mo6134b();
                if (b3 == 1937013100) {
                    C2604ac acVar3 = this.f10958f;
                    m10145m(acVar3.f7236c - acVar3.f7235b >= 2);
                    int j2 = this.f10958f.mo6142j();
                    int i10 = 0;
                    while (i10 < j2) {
                        C2604ac acVar4 = this.f10958f;
                        m10145m(acVar4.f7236c - acVar4.f7235b >= 12);
                        int j3 = acVar4.mo6142j();
                        int j4 = acVar4.mo6142j();
                        acVar4.mo6131A(acVar4.f7235b + 2);
                        int g = acVar4.mo6139g();
                        acVar4.mo6131A(acVar4.f7235b + i4);
                        int b4 = acVar4.mo6134b();
                        if (j4 > spannableStringBuilder.length()) {
                            int length2 = spannableStringBuilder.length();
                            C2633u.m7050e("Tx3gDecoder", "Truncating styl end (" + j4 + ") to cueText.length() (" + length2 + ").");
                            i2 = spannableStringBuilder.length();
                        } else {
                            i2 = j4;
                        }
                        if (j3 >= i2) {
                            C2633u.m7050e("Tx3gDecoder", "Ignoring styl with start (" + j3 + ") >= end (" + i2 + ").");
                            i3 = i10;
                        } else {
                            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                            int i11 = j3;
                            int i12 = j3;
                            int i13 = i2;
                            i3 = i10;
                            m10147o(spannableStringBuilder3, g, this.f10960h, i11, i13, 0);
                            m10146n(spannableStringBuilder3, b4, this.f10961i, i12, i13, 0);
                        }
                        i10 = i3 + 1;
                        i4 = 1;
                    }
                } else if (b3 == 1952608120 && this.f10959g) {
                    C2604ac acVar5 = this.f10958f;
                    m10145m(acVar5.f7236c - acVar5.f7235b >= 2);
                    f = C2612ak.m6944a(((float) this.f10958f.mo6142j()) / ((float) this.f10964l), 0.0f, 0.95f);
                }
                this.f10958f.mo6131A(i9 + b2);
                i4 = 1;
                i5 = 8;
            } else {
                C2566b bVar = new C2566b();
                bVar.f7065a = spannableStringBuilder;
                bVar.f7069e = f;
                bVar.f7070f = 0;
                bVar.f7071g = 0;
                return new C3510b(bVar.mo6076a());
            }
        }
    }
}
