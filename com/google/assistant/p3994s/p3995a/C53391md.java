package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.md */
/* compiled from: PG */
public final class C53391md extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53391md f140101a;

    /* renamed from: c */
    private static volatile C63010eb f140102c;

    /* renamed from: b */
    private byte f140103b = 2;

    static {
        C53391md mdVar = new C53391md();
        f140101a = mdVar;
        C62942bv.registerDefaultInstance(C53391md.class, mdVar);
    }

    private C53391md() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140103b);
            case 1:
                this.f140103b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f140101a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53391md();
            case 4:
                return new C53390mc();
            case 5:
                return f140101a;
            case 6:
                C63010eb ebVar = f140102c;
                if (ebVar == null) {
                    synchronized (C53391md.class) {
                        ebVar = f140102c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140101a);
                            f140102c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
