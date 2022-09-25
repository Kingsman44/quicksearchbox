package com.google.assistant.p3812ah.p3813a;

import com.google.assistant.p3821al.p3823b.C49241h;
import com.google.p4653i.p4654a.C61690bd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.ah.a.b */
/* compiled from: PG */
public final class C49164b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49164b f127130c;

    /* renamed from: d */
    public static final C62940bt f127131d;

    /* renamed from: e */
    private static volatile C63010eb f127132e;

    /* renamed from: a */
    public int f127133a;

    /* renamed from: b */
    public C49241h f127134b;

    static {
        C49164b bVar = new C49164b();
        f127130c = bVar;
        C62942bv.registerDefaultInstance(C49164b.class, bVar);
        f127131d = C62942bv.newSingularGeneratedExtension(C61690bd.f166668a, bVar, bVar, (C62958ce) null, 1010, C63066gd.MESSAGE, C49164b.class);
    }

    private C49164b() {
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
                return newMessageInfo(f127130c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49164b();
            case 4:
                return new C49163a();
            case 5:
                return f127130c;
            case 6:
                C63010eb ebVar = f127132e;
                if (ebVar == null) {
                    synchronized (C49164b.class) {
                        ebVar = f127132e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127130c);
                            f127132e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
