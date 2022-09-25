package com.google.android.apps.gsa.speech.audio.p7263a;

import android.bluetooth.BluetoothAdapter;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.android.apps.gsa.speech.audio.a.p */
/* compiled from: PG */
public final class C92154p {

    /* renamed from: a */
    public static final C59071e f256923a = C59071e.m91332i("com.google.android.apps.gsa.speech.audio.a.p");

    /* renamed from: a */
    public static C92148j m151288a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return null;
        }
        return new C92148j(defaultAdapter);
    }

    /* renamed from: b */
    static Object m151289b(Method method, Object obj, Object... objArr) {
        if (method == null) {
            C59104x c = f256923a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "VS.BluetoothShim");
            ((C59052c) ((C59052c) c).mo56372aa(12150)).mo56386p("Unable to invoke method");
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            C59104x c2 = f256923a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "VS.BluetoothShim");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(12149)).mo56389s("Error invoking %s", method.getName());
            return null;
        }
    }
}
