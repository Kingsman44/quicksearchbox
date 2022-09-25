package com.google.android.material.progressindicator;

import android.util.Property;
import androidx.p119j.p120a.p121a.C2300b;
import androidx.p119j.p120a.p121a.C2302d;
import com.google.android.material.p3504a.C44499d;
import com.google.android.material.p3505b.C44535e;

/* renamed from: com.google.android.material.progressindicator.k */
/* compiled from: PG */
final class C44853k extends Property {
    public C44853k(Class cls) {
        super(cls, "animationFraction");
    }

    public final /* synthetic */ Object get(Object obj) {
        int[] iArr = C44855m.f117027a;
        return Float.valueOf(((C44855m) obj).f117035g);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        C44855m mVar = (C44855m) obj;
        float floatValue = ((Float) obj2).floatValue();
        mVar.f117035g = floatValue;
        int i = (int) (5400.0f * floatValue);
        float[] fArr = mVar.f117065k;
        float f = floatValue * 1520.0f;
        fArr[0] = -20.0f + f;
        fArr[1] = f;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = C44855m.f117027a[i2];
            float[] fArr2 = mVar.f117065k;
            float f2 = fArr2[1];
            C2300b bVar = mVar.f117032d;
            fArr2[1] = f2 + (C2302d.m6236a(C2300b.f6448a, ((float) (i - i3)) / 667.0f) * 250.0f);
            int i4 = C44855m.f117028b[i2];
            float[] fArr3 = mVar.f117065k;
            float f3 = fArr3[0];
            C2300b bVar2 = mVar.f117032d;
            fArr3[0] = f3 + (C2302d.m6236a(C2300b.f6448a, ((float) (i - i4)) / 667.0f) * 250.0f);
        }
        float[] fArr4 = mVar.f117065k;
        float f4 = fArr4[0];
        fArr4[0] = (f4 + ((fArr4[1] - f4) * mVar.f117036h)) / 360.0f;
        fArr4[1] = fArr4[1] / 360.0f;
        int i5 = 0;
        while (true) {
            if (i5 >= 4) {
                break;
            }
            float f5 = ((float) (i - C44855m.f117029c[i5])) / 333.0f;
            if (f5 >= 0.0f && f5 <= 1.0f) {
                int i6 = mVar.f117034f;
                int[] iArr = mVar.f117033e.f117017c;
                int length = iArr.length;
                int i7 = (i5 + i6) % length;
                int a = C44535e.m78718a(iArr[i7], mVar.f117064j.f117060i);
                int a2 = C44535e.m78718a(mVar.f117033e.f117017c[(i7 + 1) % length], mVar.f117064j.f117060i);
                C2300b bVar3 = mVar.f117032d;
                mVar.f117066l[0] = C44499d.m78601a(C2302d.m6236a(C2300b.f6448a, f5), Integer.valueOf(a), Integer.valueOf(a2)).intValue();
                break;
            }
            i5++;
        }
        mVar.f117064j.invalidateSelf();
    }
}
