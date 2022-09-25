package com.google.protos.p4985f.p4986a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5001d.C64820b;

/* renamed from: com.google.protos.f.a.ay */
/* compiled from: PG */
public final class C64671ay extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C64671ay f175294f;

    /* renamed from: g */
    private static volatile C63010eb f175295g;

    /* renamed from: a */
    public int f175296a;

    /* renamed from: b */
    public boolean f175297b;

    /* renamed from: c */
    public int f175298c;

    /* renamed from: d */
    public C62971cq f175299d = emptyProtobufList();

    /* renamed from: e */
    public C64683bj f175300e;

    static {
        C64671ay ayVar = new C64671ay();
        f175294f = ayVar;
        C62942bv.registerDefaultInstance(C64671ay.class, ayVar);
    }

    private C64671ay() {
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
                return newMessageInfo(f175294f, "\u0001\u0004\u0000\u0001\u0001\f\u0004\u0000\u0001\u0000\u0001ဇ\u0000\u0003ဌ\u0002\u000b\u001b\fဉ\t", new Object[]{"a", "b", C45240c.f118157a, C64820b.m96467b(), "d", C64669aw.class, "e"});
            case 3:
                return new C64671ay();
            case 4:
                return new C64670ax();
            case 5:
                return f175294f;
            case 6:
                C63010eb ebVar = f175295g;
                if (ebVar == null) {
                    synchronized (C64671ay.class) {
                        ebVar = f175295g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175294f);
                            f175295g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
