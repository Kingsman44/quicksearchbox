package com.google.protos.p5146w.p5149b.p5150a.p5151a.p5152a.p5153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66244fd;

/* renamed from: com.google.protos.w.b.a.a.a.a.b */
/* compiled from: PG */
public final class C65944b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65944b f179360a;

    /* renamed from: b */
    public static final C62940bt f179361b;

    /* renamed from: c */
    private static volatile C63010eb f179362c;

    static {
        C65944b bVar = new C65944b();
        f179360a = bVar;
        C62942bv.registerDefaultInstance(C65944b.class, bVar);
        f179361b = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, bVar, bVar, (C62958ce) null, 297946236, C63066gd.MESSAGE, C65944b.class);
    }

    private C65944b() {
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
                return newMessageInfo(f179360a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C65944b();
            case 4:
                return new C65943a();
            case 5:
                return f179360a;
            case 6:
                C63010eb ebVar = f179362c;
                if (ebVar == null) {
                    synchronized (C65944b.class) {
                        ebVar = f179362c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179360a);
                            f179362c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
