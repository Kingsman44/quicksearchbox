package com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7569a;

import com.google.android.apps.gsa.staticplugins.bubble.p7568a.p7571b.C96918r;
import com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a.C96981d;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.a.a.b */
/* compiled from: PG */
public final class C96882b extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C96882b f270854g;

    /* renamed from: i */
    private static volatile C63010eb f270855i;

    /* renamed from: a */
    public int f270856a;

    /* renamed from: b */
    public C62971cq f270857b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f270858c = emptyProtobufList();

    /* renamed from: d */
    public C62961ch f270859d = emptyIntList();

    /* renamed from: e */
    public long f270860e;

    /* renamed from: f */
    public C63088z f270861f = C63088z.f170246b;

    /* renamed from: h */
    private byte f270862h = 2;

    static {
        C96882b bVar = new C96882b();
        f270854g = bVar;
        C62942bv.registerDefaultInstance(C96882b.class, bVar);
    }

    private C96882b() {
    }

    /* renamed from: a */
    public final void mo90367a() {
        C62971cq cqVar = this.f270857b;
        if (!cqVar.mo58948c()) {
            this.f270857b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f270862h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f270862h = b;
                return null;
            case 2:
                return newMessageInfo(f270854g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0003\u0001\u0001\u001b\u0002Л\u0003\u0016\u0005ဂ\u0000\u0006ည\u0001", new Object[]{"a", "b", C96981d.class, C45240c.f118157a, C96918r.class, "d", "e", C10662f.f35572a});
            case 3:
                return new C96882b();
            case 4:
                return new C96874a();
            case 5:
                return f270854g;
            case 6:
                C63010eb ebVar = f270855i;
                if (ebVar == null) {
                    synchronized (C96882b.class) {
                        ebVar = f270855i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f270854g);
                            f270855i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
