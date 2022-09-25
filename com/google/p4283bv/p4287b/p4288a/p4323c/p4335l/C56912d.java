package com.google.p4283bv.p4287b.p4288a.p4323c.p4335l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.bv.b.a.c.l.d */
/* compiled from: PG */
public final class C56912d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56912d f151884a;

    /* renamed from: b */
    public static final C62940bt f151885b;

    /* renamed from: c */
    private static volatile C63010eb f151886c;

    static {
        C56912d dVar = new C56912d();
        f151884a = dVar;
        C62942bv.registerDefaultInstance(C56912d.class, dVar);
        f151885b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, dVar, dVar, (C62958ce) null, 455368158, C63066gd.MESSAGE, C56912d.class);
    }

    private C56912d() {
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
                return newMessageInfo(f151884a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56912d();
            case 4:
                return new C56911c();
            case 5:
                return f151884a;
            case 6:
                C63010eb ebVar = f151886c;
                if (ebVar == null) {
                    synchronized (C56912d.class) {
                        ebVar = f151886c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151884a);
                            f151886c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
