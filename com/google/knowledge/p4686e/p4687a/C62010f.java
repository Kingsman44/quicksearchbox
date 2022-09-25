package com.google.knowledge.p4686e.p4687a;

import com.google.knowledge.p4661a.p4662a.C61754p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.knowledge.e.a.f */
/* compiled from: PG */
public final class C62010f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62010f f167562c;

    /* renamed from: d */
    public static final C62940bt f167563d;

    /* renamed from: e */
    private static volatile C63010eb f167564e;

    /* renamed from: a */
    public int f167565a;

    /* renamed from: b */
    public boolean f167566b;

    static {
        C62010f fVar = new C62010f();
        f167562c = fVar;
        C62942bv.registerDefaultInstance(C62010f.class, fVar);
        f167563d = C62942bv.newSingularGeneratedExtension(C61754p.f166816a, fVar, fVar, (C62958ce) null, 311378150, C63066gd.MESSAGE, C62010f.class);
    }

    private C62010f() {
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
                return newMessageInfo(f167562c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C62010f();
            case 4:
                return new C62009e();
            case 5:
                return f167562c;
            case 6:
                C63010eb ebVar = f167564e;
                if (ebVar == null) {
                    synchronized (C62010f.class) {
                        ebVar = f167564e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167562c);
                            f167564e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
