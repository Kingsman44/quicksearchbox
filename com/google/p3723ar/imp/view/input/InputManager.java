package com.google.p3723ar.imp.view.input;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ar.imp.view.input.InputManager */
/* compiled from: PG */
public class InputManager {

    /* renamed from: a */
    public static final Map f124210a;

    /* renamed from: b */
    public final long f124211b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(3, 0);
        hashMap.put(0, 1);
        hashMap.put(5, 1);
        hashMap.put(1, 2);
        hashMap.put(6, 2);
        hashMap.put(2, 3);
        f124210a = hashMap;
    }

    public InputManager(long j) {
        this.f124211b = j;
    }

    public static native void nProcessPointerEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2, long j2);
}
