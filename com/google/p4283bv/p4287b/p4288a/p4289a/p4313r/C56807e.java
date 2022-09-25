package com.google.p4283bv.p4287b.p4288a.p4289a.p4313r;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.r.e */
/* compiled from: PG */
public final class C56807e extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56807e f151588a;

    /* renamed from: c */
    private static volatile C63010eb f151589c;

    /* renamed from: b */
    private byte f151590b = 2;

    static {
        C56807e eVar = new C56807e();
        f151588a = eVar;
        C62942bv.registerDefaultInstance(C56807e.class, eVar);
    }

    private C56807e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151590b);
            case 1:
                this.f151590b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f151588a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56807e();
            case 4:
                return new C56806d();
            case 5:
                return f151588a;
            case 6:
                C63010eb ebVar = f151589c;
                if (ebVar == null) {
                    synchronized (C56807e.class) {
                        ebVar = f151589c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151588a);
                            f151589c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
