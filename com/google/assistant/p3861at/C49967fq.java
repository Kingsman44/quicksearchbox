package com.google.assistant.p3861at;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.fq */
/* compiled from: PG */
public final class C49967fq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49967fq f129898c;

    /* renamed from: d */
    private static volatile C63010eb f129899d;

    /* renamed from: a */
    public int f129900a;

    /* renamed from: b */
    public boolean f129901b;

    static {
        C49967fq fqVar = new C49967fq();
        f129898c = fqVar;
        C62942bv.registerDefaultInstance(C49967fq.class, fqVar);
    }

    private C49967fq() {
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
                return newMessageInfo(f129898c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49967fq();
            case 4:
                return new C49966fp();
            case 5:
                return f129898c;
            case 6:
                C63010eb ebVar = f129899d;
                if (ebVar == null) {
                    synchronized (C49967fq.class) {
                        ebVar = f129899d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129898c);
                            f129899d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
