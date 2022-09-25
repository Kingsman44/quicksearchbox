package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.wg */
/* compiled from: PG */
public final class C8120wg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C8120wg f28540f;

    /* renamed from: g */
    private static volatile C63010eb f28541g;

    /* renamed from: a */
    public int f28542a;

    /* renamed from: b */
    public C62971cq f28543b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f28544c;

    /* renamed from: d */
    public int f28545d;

    /* renamed from: e */
    public int f28546e;

    static {
        C8120wg wgVar = new C8120wg();
        f28540f = wgVar;
        C62942bv.registerDefaultInstance(C8120wg.class, wgVar);
    }

    private C8120wg() {
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
                return newMessageInfo(f28540f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဌ\u0001\u0004င\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C8121wh.f28547a, "e"});
            case 3:
                return new C8120wg();
            case 4:
                return new C8119wf();
            case 5:
                return f28540f;
            case 6:
                C63010eb ebVar = f28541g;
                if (ebVar == null) {
                    synchronized (C8120wg.class) {
                        ebVar = f28541g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28540f);
                            f28541g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
