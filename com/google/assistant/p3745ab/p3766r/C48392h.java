package com.google.assistant.p3745ab.p3766r;

import com.google.common.p4552o.aqs;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ab.r.h */
/* compiled from: PG */
public final class C48392h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48392h f125083c;

    /* renamed from: d */
    public static final C62940bt f125084d;

    /* renamed from: e */
    private static volatile C63010eb f125085e;

    /* renamed from: a */
    public int f125086a;

    /* renamed from: b */
    public C48391g f125087b;

    static {
        C48392h hVar = new C48392h();
        f125083c = hVar;
        C62942bv.registerDefaultInstance(C48392h.class, hVar);
        f125084d = C62942bv.newSingularGeneratedExtension(aqs.f159780k, hVar, hVar, (C62958ce) null, 599, C63066gd.MESSAGE, C48392h.class);
    }

    private C48392h() {
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
                return newMessageInfo(f125083c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48392h();
            case 4:
                return new C48385a();
            case 5:
                return f125083c;
            case 6:
                C63010eb ebVar = f125085e;
                if (ebVar == null) {
                    synchronized (C48392h.class) {
                        ebVar = f125085e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125083c);
                            f125085e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
