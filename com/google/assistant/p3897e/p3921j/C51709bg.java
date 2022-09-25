package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.bg */
/* compiled from: PG */
public final class C51709bg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51709bg f135650c;

    /* renamed from: d */
    private static volatile C63010eb f135651d;

    /* renamed from: a */
    public C62961ch f135652a = emptyIntList();

    /* renamed from: b */
    public C62961ch f135653b = emptyIntList();

    static {
        C51709bg bgVar = new C51709bg();
        f135650c = bgVar;
        C62942bv.registerDefaultInstance(C51709bg.class, bgVar);
    }

    private C51709bg() {
        emptyIntList();
        emptyIntList();
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
                return newMessageInfo(f135650c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001e", new Object[]{"a", C52354oq.f137405a, "b", C52359ov.f137411a});
            case 3:
                return new C51709bg();
            case 4:
                return new C51708bf();
            case 5:
                return f135650c;
            case 6:
                C63010eb ebVar = f135651d;
                if (ebVar == null) {
                    synchronized (C51709bg.class) {
                        ebVar = f135651d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135650c);
                            f135651d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
