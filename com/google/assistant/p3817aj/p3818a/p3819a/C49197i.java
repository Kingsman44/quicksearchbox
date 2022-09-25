package com.google.assistant.p3817aj.p3818a.p3819a;

import com.google.android.apps.gsa.nga.engine.p6262y.p6263a.p6264a.C79885g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.assistant.aj.a.a.i */
/* compiled from: PG */
public final class C49197i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49197i f127208d;

    /* renamed from: e */
    public static final C62940bt f127209e;

    /* renamed from: f */
    private static volatile C63010eb f127210f;

    /* renamed from: a */
    public int f127211a;

    /* renamed from: b */
    public C49192d f127212b;

    /* renamed from: c */
    public int f127213c;

    static {
        C49197i iVar = new C49197i();
        f127208d = iVar;
        C62942bv.registerDefaultInstance(C49197i.class, iVar);
        f127209e = C62942bv.newSingularGeneratedExtension(C79885g.f218957h, iVar, iVar, (C62958ce) null, 279982844, C63066gd.MESSAGE, C49197i.class);
    }

    private C49197i() {
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
                return newMessageInfo(f127208d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C49193e.f127205a});
            case 3:
                return new C49197i();
            case 4:
                return new C49196h();
            case 5:
                return f127208d;
            case 6:
                C63010eb ebVar = f127210f;
                if (ebVar == null) {
                    synchronized (C49197i.class) {
                        ebVar = f127210f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127208d);
                            f127210f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
