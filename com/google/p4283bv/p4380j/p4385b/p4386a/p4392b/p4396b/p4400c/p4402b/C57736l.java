package com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4400c.p4402b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4360b.C57128al;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66244fd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.j.b.a.b.b.c.b.l */
/* compiled from: PG */
public final class C57736l extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57736l f154245d;

    /* renamed from: e */
    public static final C62940bt f154246e;

    /* renamed from: g */
    private static volatile C63010eb f154247g;

    /* renamed from: a */
    public int f154248a;

    /* renamed from: b */
    public C57128al f154249b;

    /* renamed from: c */
    public CommandOuterClass$Command f154250c;

    /* renamed from: f */
    private byte f154251f = 2;

    static {
        C57736l lVar = new C57736l();
        f154245d = lVar;
        C62942bv.registerDefaultInstance(C57736l.class, lVar);
        f154246e = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, lVar, lVar, (C62958ce) null, 410530419, C63066gd.MESSAGE, C57736l.class);
    }

    private C57736l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f154251f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f154251f = b;
                return null;
            case 2:
                return newMessageInfo(f154245d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57736l();
            case 4:
                return new C57735k();
            case 5:
                return f154245d;
            case 6:
                C63010eb ebVar = f154247g;
                if (ebVar == null) {
                    synchronized (C57736l.class) {
                        ebVar = f154247g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154245d);
                            f154247g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
