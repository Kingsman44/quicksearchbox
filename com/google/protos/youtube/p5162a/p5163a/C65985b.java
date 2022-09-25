package com.google.protos.youtube.p5162a.p5163a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.youtube.a.a.b */
/* compiled from: PG */
public final class C65985b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65985b f179464a;

    /* renamed from: b */
    public static final C62940bt f179465b;

    /* renamed from: c */
    private static volatile C63010eb f179466c;

    static {
        C65985b bVar = new C65985b();
        f179464a = bVar;
        C62942bv.registerDefaultInstance(C65985b.class, bVar);
        f179465b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, bVar, bVar, (C62958ce) null, 206634270, C63066gd.MESSAGE, C65985b.class);
    }

    private C65985b() {
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
                return newMessageInfo(f179464a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65985b();
            case 4:
                return new C65970a();
            case 5:
                return f179464a;
            case 6:
                C63010eb ebVar = f179466c;
                if (ebVar == null) {
                    synchronized (C65985b.class) {
                        ebVar = f179466c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179464a);
                            f179466c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
