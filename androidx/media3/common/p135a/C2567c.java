package androidx.media3.common.p135a;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import androidx.media3.common.C2667k;
import androidx.media3.common.C2668l;
import androidx.media3.common.p136b.C2601a;
import com.evernote.android.state.BuildConfig;
import java.util.Arrays;

/* renamed from: androidx.media3.common.a.c */
/* compiled from: PG */
public final class C2567c implements C2668l {

    /* renamed from: a */
    public static final C2567c f7082a;

    /* renamed from: b */
    public static final C2667k f7083b = C2565a.f7064a;

    /* renamed from: c */
    public final CharSequence f7084c;

    /* renamed from: d */
    public final Layout.Alignment f7085d;

    /* renamed from: e */
    public final Layout.Alignment f7086e;

    /* renamed from: f */
    public final Bitmap f7087f;

    /* renamed from: g */
    public final float f7088g;

    /* renamed from: h */
    public final int f7089h;

    /* renamed from: i */
    public final int f7090i;

    /* renamed from: j */
    public final float f7091j;

    /* renamed from: k */
    public final int f7092k;

    /* renamed from: l */
    public final float f7093l;

    /* renamed from: m */
    public final float f7094m;

    /* renamed from: n */
    public final boolean f7095n;

    /* renamed from: o */
    public final int f7096o;

    /* renamed from: p */
    public final int f7097p;

    /* renamed from: q */
    public final float f7098q;

    /* renamed from: r */
    public final int f7099r;

    /* renamed from: s */
    public final float f7100s;

    static {
        C2566b bVar = new C2566b();
        bVar.f7065a = BuildConfig.FLAVOR;
        f7082a = bVar.mo6076a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r2 = r4.f7087f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r3 = r5.f7087f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            if (r5 == 0) goto L_0x009a
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L_0x0013
            goto L_0x009a
        L_0x0013:
            androidx.media3.common.a.c r5 = (androidx.media3.common.p135a.C2567c) r5
            java.lang.CharSequence r2 = r4.f7084c
            java.lang.CharSequence r3 = r5.f7084c
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L_0x009a
            android.text.Layout$Alignment r2 = r4.f7085d
            android.text.Layout$Alignment r3 = r5.f7085d
            if (r2 != r3) goto L_0x009a
            android.text.Layout$Alignment r2 = r4.f7086e
            android.text.Layout$Alignment r3 = r5.f7086e
            if (r2 != r3) goto L_0x009a
            android.graphics.Bitmap r2 = r4.f7087f
            if (r2 != 0) goto L_0x0034
            android.graphics.Bitmap r2 = r5.f7087f
            if (r2 != 0) goto L_0x009a
            goto L_0x003f
        L_0x0034:
            android.graphics.Bitmap r3 = r5.f7087f
            if (r3 == 0) goto L_0x009a
            boolean r2 = r2.sameAs(r3)
            if (r2 != 0) goto L_0x003f
            goto L_0x009a
        L_0x003f:
            float r2 = r4.f7088g
            float r3 = r5.f7088g
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x009a
            int r2 = r4.f7089h
            int r3 = r5.f7089h
            if (r2 != r3) goto L_0x009a
            int r2 = r4.f7090i
            int r3 = r5.f7090i
            if (r2 != r3) goto L_0x009a
            float r2 = r4.f7091j
            float r3 = r5.f7091j
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x009a
            int r2 = r4.f7092k
            int r3 = r5.f7092k
            if (r2 != r3) goto L_0x009a
            float r2 = r4.f7093l
            float r3 = r5.f7093l
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x009a
            float r2 = r4.f7094m
            float r3 = r5.f7094m
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x009a
            boolean r2 = r4.f7095n
            boolean r3 = r5.f7095n
            if (r2 != r3) goto L_0x009a
            int r2 = r4.f7096o
            int r3 = r5.f7096o
            if (r2 != r3) goto L_0x009a
            int r2 = r4.f7097p
            int r3 = r5.f7097p
            if (r2 != r3) goto L_0x009a
            float r2 = r4.f7098q
            float r3 = r5.f7098q
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x009a
            int r2 = r4.f7099r
            int r3 = r5.f7099r
            if (r2 != r3) goto L_0x009a
            float r2 = r4.f7100s
            float r5 = r5.f7100s
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x009a
            return r0
        L_0x009a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.p135a.C2567c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7084c, this.f7085d, this.f7086e, this.f7087f, Float.valueOf(this.f7088g), Integer.valueOf(this.f7089h), Integer.valueOf(this.f7090i), Float.valueOf(this.f7091j), Integer.valueOf(this.f7092k), Float.valueOf(this.f7093l), Float.valueOf(this.f7094m), Boolean.valueOf(this.f7095n), Integer.valueOf(this.f7096o), Integer.valueOf(this.f7097p), Float.valueOf(this.f7098q), Integer.valueOf(this.f7099r), Float.valueOf(this.f7100s)});
    }

    public C2567c(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        CharSequence charSequence2 = charSequence;
        Bitmap bitmap2 = bitmap;
        if (charSequence2 == null) {
            bitmap.getClass();
        } else {
            C2601a.m6830b(bitmap2 == null);
        }
        if (charSequence2 instanceof Spanned) {
            this.f7084c = SpannedString.valueOf(charSequence);
        } else {
            this.f7084c = charSequence2 != null ? charSequence.toString() : null;
        }
        this.f7085d = alignment;
        this.f7086e = alignment2;
        this.f7087f = bitmap2;
        this.f7088g = f;
        this.f7089h = i;
        this.f7090i = i2;
        this.f7091j = f2;
        this.f7092k = i3;
        this.f7093l = f4;
        this.f7094m = f5;
        this.f7095n = z;
        this.f7096o = i5;
        this.f7097p = i4;
        this.f7098q = f3;
        this.f7099r = i6;
        this.f7100s = f6;
    }
}
