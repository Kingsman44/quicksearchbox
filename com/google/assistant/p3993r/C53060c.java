package com.google.assistant.p3993r;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.r.c */
/* compiled from: PG */
public final class C53060c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53060c f139057a;

    /* renamed from: d */
    private static volatile C63010eb f139058d;

    /* renamed from: b */
    private C62995dn f139059b = C62995dn.f170057a;

    /* renamed from: c */
    private byte f139060c = 2;

    static {
        C53060c cVar = new C53060c();
        f139057a = cVar;
        C62942bv.registerDefaultInstance(C53060c.class, cVar);
    }

    private C53060c() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139060c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139060c = b;
                return null;
            case 2:
                return newMessageInfo(f139057a, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0001\u0000\u0000\u00062", new Object[]{"b", C53059b.f139056a});
            case 3:
                return new C53060c();
            case 4:
                return new C53058a();
            case 5:
                return f139057a;
            case 6:
                C63010eb ebVar = f139058d;
                if (ebVar == null) {
                    synchronized (C53060c.class) {
                        ebVar = f139058d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139057a);
                            f139058d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
