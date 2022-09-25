package com.google.protobuf;

/* renamed from: com.google.protobuf.dj */
/* compiled from: PG */
final class C62991dj implements C62999dr {

    /* renamed from: a */
    private final C62999dr[] f170049a;

    public C62991dj(C62999dr... drVarArr) {
        this.f170049a = drVarArr;
    }

    /* renamed from: a */
    public final C62998dq mo58867a(Class cls) {
        C62999dr[] drVarArr = this.f170049a;
        for (int i = 0; i < 2; i++) {
            C62999dr drVar = drVarArr[i];
            if (drVar.mo58868b(cls)) {
                return drVar.mo58867a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    /* renamed from: b */
    public final boolean mo58868b(Class cls) {
        C62999dr[] drVarArr = this.f170049a;
        for (int i = 0; i < 2; i++) {
            if (drVarArr[i].mo58868b(cls)) {
                return true;
            }
        }
        return false;
    }
}
