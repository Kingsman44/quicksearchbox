package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.l */
/* compiled from: PG */
public final class C119893l extends C62937bq implements C62938br {

    /* renamed from: c */
    public static final C62962ci f333892c = new C119887f();

    /* renamed from: e */
    public static final C119893l f333893e;

    /* renamed from: g */
    private static volatile C63010eb f333894g;

    /* renamed from: a */
    public int f333895a;

    /* renamed from: b */
    public C62961ch f333896b = emptyIntList();

    /* renamed from: d */
    public int f333897d;

    /* renamed from: f */
    private byte f333898f = 2;

    static {
        C119893l lVar = new C119893l();
        f333893e = lVar;
        C62942bv.registerDefaultInstance(C119893l.class, lVar);
    }

    private C119893l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f333898f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f333898f = b;
                return null;
            case 2:
                return newMessageInfo(f333893e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002ဌ\u0000", new Object[]{"a", "b", C119889h.m198764c(), "d", C119891j.m198766b()});
            case 3:
                return new C119893l();
            case 4:
                return new C119892k();
            case 5:
                return f333893e;
            case 6:
                C63010eb ebVar = f333894g;
                if (ebVar == null) {
                    synchronized (C119893l.class) {
                        ebVar = f333894g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333893e);
                            f333894g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
