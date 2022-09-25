package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.common.p4552o.agj;
import com.google.common.p4552o.agm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.al */
/* compiled from: PG */
public final class C82788al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82788al f225568c;

    /* renamed from: d */
    private static volatile C63010eb f225569d;

    /* renamed from: a */
    public C62971cq f225570a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f225571b = emptyProtobufList();

    static {
        C82788al alVar = new C82788al();
        f225568c = alVar;
        C62942bv.registerDefaultInstance(C82788al.class, alVar);
    }

    private C82788al() {
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
                return newMessageInfo(f225568c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", agj.class, "b", agm.class});
            case 3:
                return new C82788al();
            case 4:
                return new C82787ak();
            case 5:
                return f225568c;
            case 6:
                C63010eb ebVar = f225569d;
                if (ebVar == null) {
                    synchronized (C82788al.class) {
                        ebVar = f225569d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225568c);
                            f225569d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
