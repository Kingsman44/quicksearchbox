package com.google.p4242bp.p4267h.p4268a;

import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4242bp.p4267h.C56419z;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.bp.h.a.h */
/* compiled from: PG */
public final class C56375h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56375h f150339a;

    /* renamed from: b */
    public static final C62940bt f150340b = C62942bv.newSingularGeneratedExtension(C55365pr.f145876l, C56419z.UNSPECIFIED, (MessageLite) null, C56419z.f150502ao, 109696811, C63066gd.ENUM, C56419z.class);

    /* renamed from: c */
    public static final C62940bt f150341c = C62942bv.newRepeatedGeneratedExtension(C55365pr.f145876l, (MessageLite) null, (C62958ce) null, 109696812, C63066gd.STRING, false, String.class);

    /* renamed from: d */
    public static final C62940bt f150342d = C62942bv.newRepeatedGeneratedExtension(C55365pr.f145876l, (MessageLite) null, (C62958ce) null, 109696813, C63066gd.STRING, false, String.class);

    /* renamed from: e */
    private static volatile C63010eb f150343e;

    static {
        C56375h hVar = new C56375h();
        f150339a = hVar;
        C62942bv.registerDefaultInstance(C56375h.class, hVar);
    }

    private C56375h() {
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
                return newMessageInfo(f150339a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56375h();
            case 4:
                return new C56374g();
            case 5:
                return f150339a;
            case 6:
                C63010eb ebVar = f150343e;
                if (ebVar == null) {
                    synchronized (C56375h.class) {
                        ebVar = f150343e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150339a);
                            f150343e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
