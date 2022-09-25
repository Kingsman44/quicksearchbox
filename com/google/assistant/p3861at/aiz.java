package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aiz */
/* compiled from: PG */
public final class aiz extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aiz f129446d;

    /* renamed from: f */
    private static volatile C63010eb f129447f;

    /* renamed from: a */
    public int f129448a;

    /* renamed from: b */
    public String f129449b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f129450c = emptyProtobufList();

    /* renamed from: e */
    private byte f129451e = 2;

    static {
        aiz aiz = new aiz();
        f129446d = aiz;
        C62942bv.registerDefaultInstance(aiz.class, aiz);
    }

    private aiz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129451e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129451e = b;
                return null;
            case 2:
                return newMessageInfo(f129446d, "\u0001\u0002\u0000\u0001\u0003\u0006\u0002\u0000\u0001\u0001\u0003Л\u0006ဈ\u0000", new Object[]{"a", C45240c.f118157a, aiy.class, "b"});
            case 3:
                return new aiz();
            case 4:
                return new aio();
            case 5:
                return f129446d;
            case 6:
                C63010eb ebVar = f129447f;
                if (ebVar == null) {
                    synchronized (aiz.class) {
                        ebVar = f129447f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129446d);
                            f129447f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
