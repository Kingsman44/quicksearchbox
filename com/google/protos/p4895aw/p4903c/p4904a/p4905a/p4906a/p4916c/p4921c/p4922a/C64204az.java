package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4922a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.a.az */
/* compiled from: PG */
public final class C64204az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64204az f173598a;

    /* renamed from: b */
    public static final C62940bt f173599b;

    /* renamed from: c */
    private static volatile C63010eb f173600c;

    static {
        C64204az azVar = new C64204az();
        f173598a = azVar;
        C62942bv.registerDefaultInstance(C64204az.class, azVar);
        f173599b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, azVar, azVar, (C62958ce) null, 303816332, C63066gd.MESSAGE, C64204az.class);
    }

    private C64204az() {
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
                return newMessageInfo(f173598a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64204az();
            case 4:
                return new C64203ay();
            case 5:
                return f173598a;
            case 6:
                C63010eb ebVar = f173600c;
                if (ebVar == null) {
                    synchronized (C64204az.class) {
                        ebVar = f173600c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173598a);
                            f173600c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
