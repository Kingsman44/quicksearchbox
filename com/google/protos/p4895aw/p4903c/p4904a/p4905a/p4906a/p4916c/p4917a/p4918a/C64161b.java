package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4917a.p4918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.a.a.b */
/* compiled from: PG */
public final class C64161b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64161b f173471a;

    /* renamed from: b */
    public static final C62940bt f173472b;

    /* renamed from: c */
    private static volatile C63010eb f173473c;

    static {
        C64161b bVar = new C64161b();
        f173471a = bVar;
        C62942bv.registerDefaultInstance(C64161b.class, bVar);
        f173472b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 248436673, C63066gd.MESSAGE, C64161b.class);
    }

    private C64161b() {
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
                return newMessageInfo(f173471a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64161b();
            case 4:
                return new C64160a();
            case 5:
                return f173471a;
            case 6:
                C63010eb ebVar = f173473c;
                if (ebVar == null) {
                    synchronized (C64161b.class) {
                        ebVar = f173473c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173471a);
                            f173473c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
