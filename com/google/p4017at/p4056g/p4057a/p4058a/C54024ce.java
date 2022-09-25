package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.ce */
/* compiled from: PG */
public final class C54024ce extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54024ce f141745c;

    /* renamed from: e */
    private static volatile C63010eb f141746e;

    /* renamed from: a */
    public int f141747a = 0;

    /* renamed from: b */
    public Object f141748b;

    /* renamed from: d */
    private byte f141749d = 2;

    static {
        C54024ce ceVar = new C54024ce();
        f141745c = ceVar;
        C62942bv.registerDefaultInstance(C54024ce.class, ceVar);
    }

    private C54024ce() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141749d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141749d = b;
                return null;
            case 2:
                return newMessageInfo(f141745c, "\u0000\u0004\u0001\u0000\u0002\u0006\u0004\u0000\u0000\u0002\u0002м\u0000\u0004<\u0000\u0005<\u0000\u0006м\u0000", new Object[]{"b", "a", C54030ck.class, C54050dd.class, C53968ac.class, C54060l.class});
            case 3:
                return new C54024ce();
            case 4:
                return new C54023cd();
            case 5:
                return f141745c;
            case 6:
                C63010eb ebVar = f141746e;
                if (ebVar == null) {
                    synchronized (C54024ce.class) {
                        ebVar = f141746e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141745c);
                            f141746e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
