package com.google.p4017at.p4056g.p4057a.p4058a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.w */
/* compiled from: PG */
public final class C54071w extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54071w f141876c;

    /* renamed from: d */
    private static volatile C63010eb f141877d;

    /* renamed from: a */
    public int f141878a = 0;

    /* renamed from: b */
    public Object f141879b;

    static {
        C54071w wVar = new C54071w();
        f141876c = wVar;
        C62942bv.registerDefaultInstance(C54071w.class, wVar);
    }

    private C54071w() {
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
                return newMessageInfo(f141876c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002=\u0000", new Object[]{"b", "a"});
            case 3:
                return new C54071w();
            case 4:
                return new C54069u();
            case 5:
                return f141876c;
            case 6:
                C63010eb ebVar = f141877d;
                if (ebVar == null) {
                    synchronized (C54071w.class) {
                        ebVar = f141877d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141876c);
                            f141877d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
