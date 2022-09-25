package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62965cl;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.rd */
/* compiled from: PG */
public final class C52422rd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52422rd f137548b;

    /* renamed from: c */
    public static final C62965cl f137549c = new C62965cl(C52421rc.f137545d, C52421rc.UNKNOWN);

    /* renamed from: d */
    private static volatile C63010eb f137550d;

    /* renamed from: a */
    public C62995dn f137551a = C62995dn.f170057a;

    static {
        C52422rd rdVar = new C52422rd();
        f137548b = rdVar;
        C62942bv.registerDefaultInstance(C52422rd.class, rdVar);
    }

    private C52422rd() {
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
                return newMessageInfo(f137548b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001࠲", new Object[]{"a", C52417qz.f137540a, C52421rc.m86623b()});
            case 3:
                return new C52422rd();
            case 4:
                return new C52416qy();
            case 5:
                return f137548b;
            case 6:
                C63010eb ebVar = f137550d;
                if (ebVar == null) {
                    synchronized (C52422rd.class) {
                        ebVar = f137550d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137548b);
                            f137550d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
