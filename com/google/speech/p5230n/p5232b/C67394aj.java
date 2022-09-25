package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.aj */
/* compiled from: PG */
public final class C67394aj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67394aj f183175a;

    /* renamed from: b */
    private static volatile C63010eb f183176b;

    static {
        C67394aj ajVar = new C67394aj();
        f183175a = ajVar;
        C62942bv.registerDefaultInstance(C67394aj.class, ajVar);
    }

    private C67394aj() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f183175a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67394aj();
            case 4:
                return new C67393ai();
            case 5:
                return f183175a;
            case 6:
                C63010eb ebVar = f183176b;
                if (ebVar == null) {
                    synchronized (C67394aj.class) {
                        ebVar = f183176b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183175a);
                            f183176b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
