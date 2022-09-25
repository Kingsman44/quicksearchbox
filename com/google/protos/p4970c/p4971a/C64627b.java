package com.google.protos.p4970c.p4971a;

import com.google.p4495cl.p4496a.C58129b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.protos.c.a.b */
/* compiled from: PG */
public final class C64627b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64627b f175181c;

    /* renamed from: d */
    public static final C62940bt f175182d;

    /* renamed from: e */
    private static volatile C63010eb f175183e;

    /* renamed from: a */
    public int f175184a;

    /* renamed from: b */
    public boolean f175185b;

    static {
        C64627b bVar = new C64627b();
        f175181c = bVar;
        C62942bv.registerDefaultInstance(C64627b.class, bVar);
        f175182d = C62942bv.newSingularGeneratedExtension(C58129b.f155400a, bVar, bVar, (C62958ce) null, 156482259, C63066gd.MESSAGE, C64627b.class);
    }

    private C64627b() {
        emptyProtobufList();
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
                return newMessageInfo(f175181c, "\u0001\u0001\u0000\u0001\u001f\u001f\u0001\u0000\u0000\u0000\u001fဇ\t", new Object[]{"a", "b"});
            case 3:
                return new C64627b();
            case 4:
                return new C64626a();
            case 5:
                return f175181c;
            case 6:
                C63010eb ebVar = f175183e;
                if (ebVar == null) {
                    synchronized (C64627b.class) {
                        ebVar = f175183e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175181c);
                            f175183e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
