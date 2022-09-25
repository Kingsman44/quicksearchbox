package com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.a.a.b */
/* compiled from: PG */
public final class C35492b {
    /* renamed from: a */
    public static final float m63848a(float f, C58485gu guVar) {
        if (f <= 0.0f) {
            return f;
        }
        int size = guVar.size();
        int i = 0;
        while (i < size) {
            int intValue = ((Integer) guVar.get(i)).intValue();
            i++;
            if (((int) f) <= intValue) {
                return (float) intValue;
            }
        }
        return (float) ((Integer) C58557jl.m90131l(guVar)).intValue();
    }
}
