package com.google.assistant.p3860as;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.as.bp */
/* compiled from: PG */
public final class C49780bp extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C49780bp f128542a;

    /* renamed from: e */
    private static volatile C63010eb f128543e;

    /* renamed from: b */
    private int f128544b;

    /* renamed from: c */
    private C61752n f128545c;

    /* renamed from: d */
    private byte f128546d = 2;

    static {
        C49780bp bpVar = new C49780bp();
        f128542a = bpVar;
        C62942bv.registerDefaultInstance(C49780bp.class, bpVar);
    }

    private C49780bp() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f128546d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f128546d = b;
                return null;
            case 2:
                return newMessageInfo(f128542a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C49780bp();
            case 4:
                return new C49779bo();
            case 5:
                return f128542a;
            case 6:
                C63010eb ebVar = f128543e;
                if (ebVar == null) {
                    synchronized (C49780bp.class) {
                        ebVar = f128543e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128542a);
                            f128543e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
