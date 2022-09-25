package com.google.p4242bp.p4267h.p4268a;

import com.google.p4152bb.p4153a.C55265lz;
import com.google.p4242bp.p4267h.C56415v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bp.h.a.b */
/* compiled from: PG */
public final class C56369b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56369b f150328a;

    /* renamed from: b */
    public static final C62940bt f150329b = C62942bv.newSingularGeneratedExtension(C56415v.f150454c, C55265lz.f145555l, C55265lz.f145555l, (C62958ce) null, 109696811, C63066gd.MESSAGE, C55265lz.class);

    /* renamed from: c */
    private static volatile C63010eb f150330c;

    static {
        C56369b bVar = new C56369b();
        f150328a = bVar;
        C62942bv.registerDefaultInstance(C56369b.class, bVar);
    }

    private C56369b() {
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
                return newMessageInfo(f150328a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56369b();
            case 4:
                return new C56368a();
            case 5:
                return f150328a;
            case 6:
                C63010eb ebVar = f150330c;
                if (ebVar == null) {
                    synchronized (C56369b.class) {
                        ebVar = f150330c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150328a);
                            f150330c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
