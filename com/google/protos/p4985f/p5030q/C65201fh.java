package com.google.protos.p4985f.p5030q;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.fh */
/* compiled from: PG */
public final class C65201fh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C65201fh f176474e;

    /* renamed from: f */
    private static volatile C63010eb f176475f;

    /* renamed from: a */
    public C62971cq f176476a = emptyProtobufList();

    /* renamed from: b */
    public String f176477b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f176478c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f176479d = BuildConfig.FLAVOR;

    static {
        C65201fh fhVar = new C65201fh();
        f176474e = fhVar;
        C62942bv.registerDefaultInstance(C65201fh.class, fhVar);
    }

    private C65201fh() {
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
                return newMessageInfo(f176474e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"a", C65200fg.class, "b", C45240c.f118157a, "d"});
            case 3:
                return new C65201fh();
            case 4:
                return new C65198fe();
            case 5:
                return f176474e;
            case 6:
                C63010eb ebVar = f176475f;
                if (ebVar == null) {
                    synchronized (C65201fh.class) {
                        ebVar = f176475f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176474e);
                            f176475f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
