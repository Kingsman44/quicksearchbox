package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62955cb;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.ab */
/* compiled from: PG */
public final class C80410ab extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80410ab f220683c;

    /* renamed from: d */
    private static volatile C63010eb f220684d;

    /* renamed from: a */
    public C62971cq f220685a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62955cb f220686b = emptyBooleanList();

    static {
        C80410ab abVar = new C80410ab();
        f220683c = abVar;
        C62942bv.registerDefaultInstance(C80410ab.class, abVar);
    }

    private C80410ab() {
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
                return newMessageInfo(f220683c, "\u0001\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0002\u0000\u0002\u001a\u0003\u0019", new Object[]{"a", "b"});
            case 3:
                return new C80410ab();
            case 4:
                return new C80409aa();
            case 5:
                return f220683c;
            case 6:
                C63010eb ebVar = f220684d;
                if (ebVar == null) {
                    synchronized (C80410ab.class) {
                        ebVar = f220684d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220683c);
                            f220684d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
