package com.google.assistant.p3745ab.p3747aa;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.aa.b */
/* compiled from: PG */
public final class C48203b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48203b f124728a;

    /* renamed from: d */
    private static volatile C63010eb f124729d;

    /* renamed from: b */
    private C48205d f124730b;

    /* renamed from: c */
    private byte f124731c = 2;

    static {
        C48203b bVar = new C48203b();
        f124728a = bVar;
        C62942bv.registerDefaultInstance(C48203b.class, bVar);
    }

    private C48203b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124731c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f124731c = b;
                return null;
            case 2:
                return newMessageInfo(f124728a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0001\u0002Љ", new Object[]{"b"});
            case 3:
                return new C48203b();
            case 4:
                return new C48202a();
            case 5:
                return f124728a;
            case 6:
                C63010eb ebVar = f124729d;
                if (ebVar == null) {
                    synchronized (C48203b.class) {
                        ebVar = f124729d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124728a);
                            f124729d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
