package com.google.android.libraries.p590as.p611d.p613b.p614a.p615a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.as.d.b.a.a.c */
/* compiled from: PG */
public final class C10976c extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C10976c f36107e;

    /* renamed from: f */
    private static volatile C63010eb f36108f;

    /* renamed from: a */
    public int f36109a;

    /* renamed from: b */
    public boolean f36110b = true;

    /* renamed from: c */
    public String f36111c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f36112d = C62942bv.emptyProtobufList();

    static {
        C10976c cVar = new C10976c();
        f36107e = cVar;
        C62942bv.registerDefaultInstance(C10976c.class, cVar);
    }

    private C10976c() {
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
                return newMessageInfo(f36107e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C10976c();
            case 4:
                return new C10975b();
            case 5:
                return f36107e;
            case 6:
                C63010eb ebVar = f36108f;
                if (ebVar == null) {
                    synchronized (C10976c.class) {
                        ebVar = f36108f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f36107e);
                            f36108f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
