package androidx.media3.extractor.p162i;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3348aw;
import androidx.media3.extractor.C3374bl;
import com.google.common.p4522b.C58485gu;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.media3.extractor.i.i */
/* compiled from: PG */
final class C3449i extends C3452l {

    /* renamed from: a */
    public static final byte[] f10651a = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: o */
    private static final byte[] f10652o = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: p */
    private boolean f10653p;

    /* renamed from: d */
    public static boolean m9990d(C2604ac acVar, byte[] bArr) {
        int i = acVar.f7236c;
        int i2 = acVar.f7235b;
        if (i - i2 < 8) {
            return false;
        }
        byte[] bArr2 = new byte[8];
        acVar.mo6155w(bArr2, 0, 8);
        acVar.mo6131A(i2);
        return Arrays.equals(bArr2, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo7403a(C2604ac acVar) {
        byte b;
        byte[] bArr = acVar.f7234a;
        byte b2 = bArr[0] & 255;
        byte b3 = b2 & 3;
        if (b3 != 0) {
            b = 2;
            if (!(b3 == 1 || b3 == 2)) {
                b = bArr[1] & 63;
            }
        } else {
            b = 1;
        }
        int i = b2 >> 3;
        int i2 = i & 3;
        return mo7411f(((long) b) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i2 & 1) : i2 == 3 ? 60000 : 10000 << i2)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7404b(boolean z) {
        super.mo7404b(z);
        if (z) {
            this.f10653p = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo7405c(C2604ac acVar, long j, C3450j jVar) {
        if (m9990d(acVar, f10651a)) {
            byte[] copyOf = Arrays.copyOf(acVar.f7234a, acVar.f7236c);
            byte b = copyOf[9] & 255;
            List a = C3348aw.m9697a(copyOf);
            if (jVar.f10654a != null) {
                return true;
            }
            C2679w wVar = new C2679w();
            wVar.f7459k = "audio/opus";
            wVar.f7472x = b;
            wVar.f7473y = 48000;
            wVar.f7461m = a;
            jVar.f10654a = new C2680x(wVar);
            return true;
        } else if (m9990d(acVar, f10652o)) {
            C2601a.m6829a(jVar.f10654a);
            if (this.f10653p) {
                return true;
            }
            this.f10653p = true;
            acVar.mo6131A(acVar.f7235b + 8);
            Metadata b2 = C3374bl.m9759b(C58485gu.m89844l(C3374bl.m9760c(acVar, false, false).f10191a));
            if (b2 == null) {
                return true;
            }
            C2680x xVar = jVar.f10654a;
            C2679w wVar2 = new C2679w(xVar);
            wVar2.f7457i = b2.mo6060b(xVar.f7494l);
            jVar.f10654a = new C2680x(wVar2);
            return true;
        } else {
            C2601a.m6829a(jVar.f10654a);
            return false;
        }
    }
}
