package androidx.media3.extractor.p162i;

import androidx.media3.common.Metadata;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.extractor.C3333ah;
import androidx.media3.extractor.C3334ai;
import androidx.media3.extractor.C3336ak;
import androidx.media3.extractor.C3337al;
import java.util.Arrays;

/* renamed from: androidx.media3.extractor.i.d */
/* compiled from: PG */
final class C3444d extends C3452l {

    /* renamed from: a */
    private C3337al f10634a;

    /* renamed from: o */
    private C3443c f10635o;

    /* renamed from: d */
    private static boolean m9972d(byte[] bArr) {
        return bArr[0] == -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo7403a(C2604ac acVar) {
        if (!m9972d(acVar.f7234a)) {
            return -1;
        }
        int i = (acVar.f7234a[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int a = C3333ah.m9651a(acVar, i);
            acVar.mo6131A(0);
            return (long) a;
        }
        acVar.mo6131A(acVar.f7235b + 4);
        acVar.mo6148p();
        int a2 = C3333ah.m9651a(acVar, i);
        acVar.mo6131A(0);
        return (long) a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo7404b(boolean z) {
        super.mo7404b(z);
        if (z) {
            this.f10634a = null;
            this.f10635o = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo7405c(C2604ac acVar, long j, C3450j jVar) {
        byte[] bArr = acVar.f7234a;
        C3337al alVar = this.f10634a;
        if (alVar == null) {
            C3337al alVar2 = new C3337al(bArr, 17);
            this.f10634a = alVar2;
            jVar.f10654a = alVar2.mo7329c(Arrays.copyOfRange(bArr, 9, acVar.f7236c), (Metadata) null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            C3336ak b = C3334ai.m9655b(acVar);
            C3337al e = alVar.mo7331e(b);
            this.f10634a = e;
            this.f10635o = new C3443c(e, b);
            return true;
        } else if (!m9972d(bArr)) {
            return true;
        } else {
            C3443c cVar = this.f10635o;
            if (cVar != null) {
                cVar.f10630a = j;
                jVar.f10655b = cVar;
            }
            jVar.f10654a.getClass();
            return false;
        }
    }
}
