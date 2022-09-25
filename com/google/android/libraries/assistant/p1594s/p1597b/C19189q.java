package com.google.android.libraries.assistant.p1594s.p1597b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3781ad.p3789d.p3790a.C48566s;
import com.google.assistant.p3781ad.p3789d.p3791b.C48674ai;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.b.q */
/* compiled from: PG */
public final class C19189q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19189q f53734e;

    /* renamed from: g */
    private static volatile C63010eb f53735g;

    /* renamed from: a */
    public int f53736a;

    /* renamed from: b */
    public String f53737b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f53738c = emptyProtobufList();

    /* renamed from: d */
    public int f53739d;

    /* renamed from: f */
    private int f53740f;

    static {
        C19189q qVar = new C19189q();
        f53734e = qVar;
        C62942bv.registerDefaultInstance(C19189q.class, qVar);
    }

    private C19189q() {
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
                return newMessageInfo(f53734e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b\u0004င\u0002", new Object[]{C10662f.f35572a, "a", C48674ai.m85262b(), "b", C45240c.f118157a, C48566s.class, "d"});
            case 3:
                return new C19189q();
            case 4:
                return new C19188p();
            case 5:
                return f53734e;
            case 6:
                C63010eb ebVar = f53735g;
                if (ebVar == null) {
                    synchronized (C19189q.class) {
                        ebVar = f53735g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53734e);
                            f53735g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
