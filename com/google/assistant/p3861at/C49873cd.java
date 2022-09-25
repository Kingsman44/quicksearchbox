package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.cd */
/* compiled from: PG */
public final class C49873cd extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C49873cd f129594a;

    /* renamed from: d */
    private static volatile C63010eb f129595d;

    /* renamed from: b */
    private C62995dn f129596b = C62995dn.f170057a;

    /* renamed from: c */
    private byte f129597c = 2;

    static {
        C49873cd cdVar = new C49873cd();
        f129594a = cdVar;
        C62942bv.registerDefaultInstance(C49873cd.class, cdVar);
    }

    private C49873cd() {
        emptyProtobufList();
        emptyIntList();
        emptyIntList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129597c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129597c = b;
                return null;
            case 2:
                return newMessageInfo(f129594a, "\u0001\u0001\u0000\u0000\n\n\u0001\u0001\u0000\u0000\n2", new Object[]{"b", C49872cc.f129593a});
            case 3:
                return new C49873cd();
            case 4:
                return new C49871cb();
            case 5:
                return f129594a;
            case 6:
                C63010eb ebVar = f129595d;
                if (ebVar == null) {
                    synchronized (C49873cd.class) {
                        ebVar = f129595d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129594a);
                            f129595d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
