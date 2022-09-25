package com.google.android.libraries.search.p6glow;

import com.google.android.libraries.animation.C147788n;

/* renamed from: com.google.android.libraries.search.p6glow.ba */
/* compiled from: PG */
public final class C39870ba implements C147788n {

    /* renamed from: a */
    final /* synthetic */ float[][] f104858a;

    /* renamed from: b */
    final /* synthetic */ float[][] f104859b;

    /* renamed from: c */
    private final Float[] f104860c;

    public C39870ba(float[][] fArr, float[][] fArr2) {
        this.f104858a = fArr;
        this.f104859b = fArr2;
        int length = fArr[0].length;
        Float[] fArr3 = new Float[length];
        for (int i = 0; i < length; i++) {
            fArr3[i] = Float.valueOf(0.0f);
        }
        this.f104860c = fArr3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo42061a(float f) {
        float length = ((float) (((Object[]) this.f104858a).length - 1)) * f;
        int floor = (int) ((float) Math.floor((double) length));
        int ceil = (int) ((float) Math.ceil((double) (((float) (((Object[]) this.f104858a).length - 1)) * f)));
        float f2 = length - ((float) floor);
        int length2 = this.f104860c.length;
        for (int i = 0; i < length2; i++) {
            Float[] fArr = this.f104860c;
            float[][] fArr2 = this.f104859b;
            float f3 = fArr2[floor][i];
            fArr[i] = Float.valueOf(f3 + ((fArr2[ceil][i] - f3) * f2));
        }
        return this.f104860c;
    }
}
