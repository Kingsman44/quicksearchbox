package com.google.android.apps.search.googleapp.saves.savefeature;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57569am;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.f */
/* compiled from: PG */
public final class C137298f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C137298f f373501b;

    /* renamed from: d */
    private static volatile C63010eb f373502d;

    /* renamed from: a */
    public C57569am f373503a;

    /* renamed from: c */
    private byte f373504c = 2;

    static {
        C137298f fVar = new C137298f();
        f373501b = fVar;
        C62942bv.registerDefaultInstance(C137298f.class, fVar);
    }

    private C137298f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f373504c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f373504c = b;
                return null;
            case 2:
                return newMessageInfo(f373501b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C137298f();
            case 4:
                return new C137297e();
            case 5:
                return f373501b;
            case 6:
                C63010eb ebVar = f373502d;
                if (ebVar == null) {
                    synchronized (C137298f.class) {
                        ebVar = f373502d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f373501b);
                            f373502d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
