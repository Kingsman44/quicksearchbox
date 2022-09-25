package com.google.assistant.p3863av.p3875f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5127o.C65682h;

/* renamed from: com.google.assistant.av.f.i */
/* compiled from: PG */
public final class C50576i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50576i f131614c;

    /* renamed from: d */
    private static volatile C63010eb f131615d;

    /* renamed from: a */
    public int f131616a;

    /* renamed from: b */
    public C65682h f131617b;

    static {
        C50576i iVar = new C50576i();
        f131614c = iVar;
        C62942bv.registerDefaultInstance(C50576i.class, iVar);
    }

    private C50576i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f131614c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C50576i();
            case 4:
                return new C50575h();
            case 5:
                return f131614c;
            case 6:
                C63010eb ebVar = f131615d;
                if (ebVar == null) {
                    synchronized (C50576i.class) {
                        ebVar = f131615d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131614c);
                            f131615d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
