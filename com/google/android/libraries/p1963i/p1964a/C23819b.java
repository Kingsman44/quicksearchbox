package com.google.android.libraries.p1963i.p1964a;

/* renamed from: com.google.android.libraries.i.a.b */
/* compiled from: PG */
final class C23819b extends ThreadLocal {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        boolean z;
        Thread currentThread = Thread.currentThread();
        synchronized (C23825h.f65244a) {
            Boolean bool = (Boolean) C23825h.f65244a.remove(currentThread);
            z = true;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (!booleanValue) {
                }
                return Boolean.valueOf(z);
            }
        }
        int i = C23820c.f65235a;
        if (!"Filter".equals(currentThread.getName()) && !"Instr: com.google.android.apps.common.testing.testrunner.Google3InstrumentationTestRunner".equals(currentThread.getName())) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
