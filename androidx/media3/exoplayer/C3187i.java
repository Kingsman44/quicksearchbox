package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;

/* renamed from: androidx.media3.exoplayer.i */
/* compiled from: PG */
public final class C3187i {

    /* renamed from: a */
    public final String f9534a;

    /* renamed from: b */
    public final C2680x f9535b;

    /* renamed from: c */
    public final C2680x f9536c;

    /* renamed from: d */
    public final int f9537d;

    /* renamed from: e */
    public final int f9538e;

    public C3187i(String str, C2680x xVar, C2680x xVar2, int i, int i2) {
        boolean z = true;
        if (i != 0) {
            if (i2 == 0) {
                i2 = 0;
            } else {
                z = false;
            }
        }
        C2601a.m6830b(z);
        if (!TextUtils.isEmpty(str)) {
            this.f9534a = str;
            xVar.getClass();
            this.f9535b = xVar;
            xVar2.getClass();
            this.f9536c = xVar2;
            this.f9537d = i;
            this.f9538e = i2;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C3187i iVar = (C3187i) obj;
            return this.f9537d == iVar.f9537d && this.f9538e == iVar.f9538e && this.f9534a.equals(iVar.f9534a) && this.f9535b.equals(iVar.f9535b) && this.f9536c.equals(iVar.f9536c);
        }
    }

    public final int hashCode() {
        return ((((((((this.f9537d + 527) * 31) + this.f9538e) * 31) + this.f9534a.hashCode()) * 31) + this.f9535b.hashCode()) * 31) + this.f9536c.hashCode();
    }
}
