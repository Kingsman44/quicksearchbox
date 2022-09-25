package com.google.android.material.progressindicator;

import android.util.Property;
import androidx.p119j.p120a.p121a.C2300b;
import androidx.p119j.p120a.p121a.C2302d;
import com.google.android.material.p3505b.C44535e;

/* renamed from: com.google.android.material.progressindicator.z */
/* compiled from: PG */
final class C44868z extends Property {
    public C44868z(Class cls) {
        super(cls, "animationFraction");
    }

    public final /* synthetic */ Object get(Object obj) {
        int i = C44837aa.f116971f;
        return Float.valueOf(((C44837aa) obj).f116977e);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        C44837aa aaVar = (C44837aa) obj;
        float floatValue = ((Float) obj2).floatValue();
        aaVar.f116977e = floatValue;
        float[] fArr = aaVar.f117065k;
        fArr[0] = 0.0f;
        float f = ((float) ((int) (floatValue * 333.0f))) / 667.0f;
        C2300b bVar = aaVar.f116973a;
        float a = C2302d.m6236a(C2300b.f6448a, f);
        fArr[2] = a;
        fArr[1] = a;
        float[] fArr2 = aaVar.f117065k;
        C2300b bVar2 = aaVar.f116973a;
        float a2 = C2302d.m6236a(C2300b.f6448a, f + 0.49925038f);
        fArr2[4] = a2;
        fArr2[3] = a2;
        float[] fArr3 = aaVar.f117065k;
        fArr3[5] = 1.0f;
        if (aaVar.f116976d && fArr3[3] < 1.0f) {
            int[] iArr = aaVar.f117066l;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = C44535e.m78718a(aaVar.f116974b.f117017c[aaVar.f116975c], aaVar.f117064j.f117060i);
            aaVar.f116976d = false;
        }
        aaVar.f117064j.invalidateSelf();
    }
}
