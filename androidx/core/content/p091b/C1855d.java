package androidx.core.content.p091b;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: androidx.core.content.b.d */
/* compiled from: PG */
public final class C1855d {

    /* renamed from: a */
    public final Shader f5730a;

    /* renamed from: b */
    public int f5731b;

    /* renamed from: c */
    private final ColorStateList f5732c;

    public C1855d(Shader shader, ColorStateList colorStateList, int i) {
        this.f5730a = shader;
        this.f5732c = colorStateList;
        this.f5731b = i;
    }

    /* renamed from: a */
    public final boolean mo5034a() {
        return this.f5730a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f5732c;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo5035b() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f5730a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f5732c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p091b.C1855d.mo5035b():boolean");
    }

    /* renamed from: c */
    public final boolean mo5036c(int[] iArr) {
        if (!mo5035b()) {
            return false;
        }
        ColorStateList colorStateList = this.f5732c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f5731b) {
            return false;
        }
        this.f5731b = colorForState;
        return true;
    }

    /* renamed from: d */
    public final boolean mo5037d() {
        return mo5034a() || this.f5731b != 0;
    }
}
