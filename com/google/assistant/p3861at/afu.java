package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.afu */
/* compiled from: PG */
public final class afu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final afu f129178e;

    /* renamed from: f */
    private static volatile C63010eb f129179f;

    /* renamed from: a */
    public int f129180a;

    /* renamed from: b */
    public C62971cq f129181b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public C62961ch f129182c = emptyIntList();

    /* renamed from: d */
    public aey f129183d;

    static {
        afu afu = new afu();
        f129178e = afu;
        C62942bv.registerDefaultInstance(afu.class, afu);
    }

    private afu() {
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
                return newMessageInfo(f129178e, "\u0001\u0003\u0000\u0001\u0001\u000e\u0003\u0000\u0002\u0000\u0001\u001a\u0006\u001e\u000eဉ\u000b", new Object[]{"a", "b", C45240c.f118157a, agd.f129210a, "d"});
            case 3:
                return new afu();
            case 4:
                return new aft();
            case 5:
                return f129178e;
            case 6:
                C63010eb ebVar = f129179f;
                if (ebVar == null) {
                    synchronized (afu.class) {
                        ebVar = f129179f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129178e);
                            f129179f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
