package com.google.android.apps.gsa.sidekick.shared.util;

import com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C91000i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.v */
/* compiled from: PG */
public final class C92003v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C92003v f256504a;

    /* renamed from: b */
    public static final C62940bt f256505b = C62942bv.newRepeatedGeneratedExtension(C91000i.f254200e, C92005x.f256507g, (C62958ce) null, 171006319, C63066gd.MESSAGE, false, C92005x.class);

    /* renamed from: c */
    private static volatile C63010eb f256506c;

    static {
        C92003v vVar = new C92003v();
        f256504a = vVar;
        C62942bv.registerDefaultInstance(C92003v.class, vVar);
    }

    private C92003v() {
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
                return newMessageInfo(f256504a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C92003v();
            case 4:
                return new C92002u();
            case 5:
                return f256504a;
            case 6:
                C63010eb ebVar = f256506c;
                if (ebVar == null) {
                    synchronized (C92003v.class) {
                        ebVar = f256506c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256504a);
                            f256506c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
