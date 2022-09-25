package com.google.android.apps.p489g.p493c;

import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7730hv;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.g.c.d */
/* compiled from: PG */
public final class C9131d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C9131d f31424a;

    /* renamed from: b */
    public static final C62940bt f31425b = C62942bv.newRepeatedGeneratedExtension(C118476ak.f328838a, C7718hj.f26927af, (C62958ce) null, 146008568, C63066gd.MESSAGE, false, C7718hj.class);

    /* renamed from: c */
    public static final C62940bt f31426c = C62942bv.newSingularGeneratedExtension(C118476ak.f328838a, C63088z.f170246b, (MessageLite) null, (C62958ce) null, 148829942, C63066gd.BYTES, C63088z.class);

    /* renamed from: d */
    public static final C62940bt f31427d = C62942bv.newRepeatedGeneratedExtension(C118476ak.f328838a, C7730hv.f27019e, (C62958ce) null, 215445468, C63066gd.MESSAGE, false, C7730hv.class);

    /* renamed from: e */
    private static volatile C63010eb f31428e;

    static {
        C9131d dVar = new C9131d();
        f31424a = dVar;
        C62942bv.registerDefaultInstance(C9131d.class, dVar);
    }

    private C9131d() {
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
                return newMessageInfo(f31424a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C9131d();
            case 4:
                return new C9130c();
            case 5:
                return f31424a;
            case 6:
                C63010eb ebVar = f31428e;
                if (ebVar == null) {
                    synchronized (C9131d.class) {
                        ebVar = f31428e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31424a);
                            f31428e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
