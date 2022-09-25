package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4907a.p4909b.p4910a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66244fd;

/* renamed from: com.google.protos.aw.c.a.a.a.a.b.a.b */
/* compiled from: PG */
public final class C64115b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C64115b f173335b;

    /* renamed from: c */
    public static final C62940bt f173336c;

    /* renamed from: e */
    private static volatile C63010eb f173337e;

    /* renamed from: a */
    public int f173338a = 1;

    /* renamed from: d */
    private int f173339d;

    static {
        C64115b bVar = new C64115b();
        f173335b = bVar;
        C62942bv.registerDefaultInstance(C64115b.class, bVar);
        f173336c = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, bVar, bVar, (C62958ce) null, 348713534, C63066gd.MESSAGE, C64115b.class);
    }

    private C64115b() {
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
                return newMessageInfo(f173335b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"d", "a"});
            case 3:
                return new C64115b();
            case 4:
                return new C64114a();
            case 5:
                return f173335b;
            case 6:
                C63010eb ebVar = f173337e;
                if (ebVar == null) {
                    synchronized (C64115b.class) {
                        ebVar = f173337e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173335b);
                            f173337e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
