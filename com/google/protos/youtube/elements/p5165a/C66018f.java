package com.google.protos.youtube.elements.p5165a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.youtube.elements.a.f */
/* compiled from: PG */
public final class C66018f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66018f f179537a;

    /* renamed from: b */
    public static final C62940bt f179538b;

    /* renamed from: c */
    private static volatile C63010eb f179539c;

    static {
        C66018f fVar = new C66018f();
        f179537a = fVar;
        C62942bv.registerDefaultInstance(C66018f.class, fVar);
        f179538b = C62942bv.newSingularGeneratedExtension(CommandOuterClass$Command.f179510a, fVar, fVar, (C62958ce) null, 336926123, C63066gd.MESSAGE, C66018f.class);
    }

    private C66018f() {
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
                return newMessageInfo(f179537a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C66018f();
            case 4:
                return new C66017e();
            case 5:
                return f179537a;
            case 6:
                C63010eb ebVar = f179539c;
                if (ebVar == null) {
                    synchronized (C66018f.class) {
                        ebVar = f179539c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179537a);
                            f179539c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
