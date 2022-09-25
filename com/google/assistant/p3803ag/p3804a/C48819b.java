package com.google.assistant.p3803ag.p3804a;

import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4985f.p5036r.p5037a.C65315b;

/* renamed from: com.google.assistant.ag.a.b */
/* compiled from: PG */
public final class C48819b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48819b f126311c;

    /* renamed from: d */
    public static final C62940bt f126312d;

    /* renamed from: e */
    private static volatile C63010eb f126313e;

    /* renamed from: a */
    public int f126314a = 0;

    /* renamed from: b */
    public Object f126315b;

    static {
        C48819b bVar = new C48819b();
        f126311c = bVar;
        C62942bv.registerDefaultInstance(C48819b.class, bVar);
        f126312d = C62942bv.newSingularGeneratedExtension(C48869l.f126467a, bVar, bVar, (C62958ce) null, 100, C63066gd.MESSAGE, C48819b.class);
    }

    private C48819b() {
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
                return newMessageInfo(f126311c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C48952az.class, C65315b.class});
            case 3:
                return new C48819b();
            case 4:
                return new C48780a();
            case 5:
                return f126311c;
            case 6:
                C63010eb ebVar = f126313e;
                if (ebVar == null) {
                    synchronized (C48819b.class) {
                        ebVar = f126313e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126311c);
                            f126313e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
