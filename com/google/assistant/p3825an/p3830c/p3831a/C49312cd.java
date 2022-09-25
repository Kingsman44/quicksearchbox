package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.cd */
/* compiled from: PG */
public final class C49312cd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49312cd f127451c;

    /* renamed from: d */
    private static volatile C63010eb f127452d;

    /* renamed from: a */
    public C62995dn f127453a = C62995dn.f170057a;

    /* renamed from: b */
    public C62971cq f127454b = C62942bv.emptyProtobufList();

    static {
        C49312cd cdVar = new C49312cd();
        f127451c = cdVar;
        C62942bv.registerDefaultInstance(C49312cd.class, cdVar);
    }

    private C49312cd() {
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
                return newMessageInfo(f127451c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0000\u00012\u0002\u001a", new Object[]{"a", C49311cc.f127450a, "b"});
            case 3:
                return new C49312cd();
            case 4:
                return new C49310cb();
            case 5:
                return f127451c;
            case 6:
                C63010eb ebVar = f127452d;
                if (ebVar == null) {
                    synchronized (C49312cd.class) {
                        ebVar = f127452d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127451c);
                            f127452d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
