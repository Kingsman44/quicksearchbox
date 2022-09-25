package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.cd */
/* compiled from: PG */
public final class C57614cd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C57614cd f153898e;

    /* renamed from: g */
    private static volatile C63010eb f153899g;

    /* renamed from: a */
    public int f153900a = 0;

    /* renamed from: b */
    public Object f153901b;

    /* renamed from: c */
    public C57601br f153902c;

    /* renamed from: d */
    public int f153903d;

    /* renamed from: f */
    private byte f153904f = 2;

    static {
        C57614cd cdVar = new C57614cd();
        f153898e = cdVar;
        C62942bv.registerDefaultInstance(C57614cd.class, cdVar);
    }

    private C57614cd() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153904f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153904f = b;
                return null;
            case 2:
                return newMessageInfo(f153898e, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001\t\u0002<\u0000\u0003м\u0000\u0004\u0004", new Object[]{"b", "a", C45240c.f118157a, C57613cc.class, C57611ca.class, "d"});
            case 3:
                return new C57614cd();
            case 4:
                return new C57608by();
            case 5:
                return f153898e;
            case 6:
                C63010eb ebVar = f153899g;
                if (ebVar == null) {
                    synchronized (C57614cd.class) {
                        ebVar = f153899g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153898e);
                            f153899g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
