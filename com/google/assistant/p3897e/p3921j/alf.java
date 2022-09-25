package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.alf */
/* compiled from: PG */
public final class alf extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final alf f135314d;

    /* renamed from: e */
    private static volatile C63010eb f135315e;

    /* renamed from: a */
    public int f135316a;

    /* renamed from: b */
    public String f135317b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f135318c = emptyProtobufList();

    static {
        alf alf = new alf();
        f135314d = alf;
        C62942bv.registerDefaultInstance(alf.class, alf);
    }

    private alf() {
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
                return newMessageInfo(f135314d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", C45240c.f118157a, alh.class});
            case 3:
                return new alf();
            case 4:
                return new ale();
            case 5:
                return f135314d;
            case 6:
                C63010eb ebVar = f135315e;
                if (ebVar == null) {
                    synchronized (alf.class) {
                        ebVar = f135315e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135314d);
                            f135315e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
