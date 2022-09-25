package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58662ni;
import java.util.EnumMap;

/* renamed from: com.google.android.libraries.onegoogle.common.ad */
/* compiled from: PG */
public abstract class C30904ad {
    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public static C30904ad m57690e(Context context) {
        int i;
        TypedValue typedValue = new TypedValue();
        boolean z = context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
        C30903ac[] values = C30903ac.values();
        int length = values.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = values[i2].f83332g;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        EnumMap enumMap = new EnumMap(C30903ac.class);
        int i3 = 0;
        while (i3 < values.length) {
            try {
                C30903ac acVar = values[i3];
                enumMap.put(acVar, Integer.valueOf(obtainStyledAttributes.getColor(i3, context.getResources().getColor(acVar.f83333h))));
                i3++;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        obtainStyledAttributes.recycle();
        C58495hd b = C58662ni.m90343b(enumMap);
        C58490gz gzVar = new C58490gz(4);
        for (C30902ab abVar : C30902ab.values()) {
            if (z) {
                i = abVar.f83323e;
            } else {
                i = abVar.f83324f;
            }
            gzVar.mo55429h(abVar, Integer.valueOf(C1878d.m5128a(context, i)));
        }
        return new C30916c(z, b, gzVar.mo55427f(true));
    }

    /* renamed from: a */
    public abstract C58495hd mo36587a();

    /* renamed from: b */
    public abstract C58495hd mo36588b();

    /* renamed from: c */
    public abstract boolean mo36589c();

    /* renamed from: d */
    public final int mo36590d(C30903ac acVar) {
        Integer num = (Integer) mo36587a().get(acVar);
        num.getClass();
        return num.intValue();
    }
}
