package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.afs */
/* compiled from: PG */
public final class afs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final afs f129172b;

    /* renamed from: f */
    private static volatile C63010eb f129173f;

    /* renamed from: a */
    public C62971cq f129174a = emptyProtobufList();

    /* renamed from: c */
    private int f129175c;

    /* renamed from: d */
    private agc f129176d;

    /* renamed from: e */
    private afd f129177e;

    static {
        afs afs = new afs();
        f129172b = afs;
        C62942bv.registerDefaultInstance(afs.class, afs);
    }

    private afs() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f129172b, "\u0001\u0003\u0000\u0001\u0004\n\u0003\u0000\u0001\u0000\u0004\u001b\u0005ဉ\u0000\nဉ\u0001", new Object[]{C45240c.f118157a, "a", afy.class, "d", "e"});
            case 3:
                return new afs();
            case 4:
                return new afr();
            case 5:
                return f129172b;
            case 6:
                C63010eb ebVar = f129173f;
                if (ebVar == null) {
                    synchronized (afs.class) {
                        ebVar = f129173f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129172b);
                            f129173f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
