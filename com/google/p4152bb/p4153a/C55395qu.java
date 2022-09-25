package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.qu */
/* compiled from: PG */
public final class C55395qu extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C55395qu f145961a;

    /* renamed from: d */
    private static volatile C63010eb f145962d;

    /* renamed from: b */
    private C62995dn f145963b = C62995dn.f170057a;

    /* renamed from: c */
    private byte f145964c = 2;

    static {
        C55395qu quVar = new C55395qu();
        f145961a = quVar;
        C62942bv.registerDefaultInstance(C55395qu.class, quVar);
    }

    private C55395qu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145964c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145964c = b;
                return null;
            case 2:
                return newMessageInfo(f145961a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0001\u0002в", new Object[]{"b", C55394qt.f145960a});
            case 3:
                return new C55395qu();
            case 4:
                return new C55393qs();
            case 5:
                return f145961a;
            case 6:
                C63010eb ebVar = f145962d;
                if (ebVar == null) {
                    synchronized (C55395qu.class) {
                        ebVar = f145962d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145961a);
                            f145962d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
