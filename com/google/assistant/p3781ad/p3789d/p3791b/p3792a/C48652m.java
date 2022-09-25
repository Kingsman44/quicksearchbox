package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.m */
/* compiled from: PG */
public final class C48652m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48652m f125740c;

    /* renamed from: d */
    private static volatile C63010eb f125741d;

    /* renamed from: a */
    public C62971cq f125742a = emptyProtobufList();

    /* renamed from: b */
    public C62995dn f125743b = C62995dn.f170057a;

    static {
        C48652m mVar = new C48652m();
        f125740c = mVar;
        C62942bv.registerDefaultInstance(C48652m.class, mVar);
    }

    private C48652m() {
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
                return newMessageInfo(f125740c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u0001\u001b\u00022", new Object[]{"a", C48649j.class, "b", C48651l.f125739a});
            case 3:
                return new C48652m();
            case 4:
                return new C48650k();
            case 5:
                return f125740c;
            case 6:
                C63010eb ebVar = f125741d;
                if (ebVar == null) {
                    synchronized (C48652m.class) {
                        ebVar = f125741d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125740c);
                            f125741d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
