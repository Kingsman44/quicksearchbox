package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54781a;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.c.a.u */
/* compiled from: PG */
public final class C57190u extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C57190u f152680g;

    /* renamed from: h */
    private static volatile C63010eb f152681h;

    /* renamed from: a */
    public int f152682a;

    /* renamed from: b */
    public String f152683b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f152684c = emptyProtobufList();

    /* renamed from: d */
    public String f152685d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f152686e;

    /* renamed from: f */
    public C57189t f152687f;

    static {
        C57190u uVar = new C57190u();
        f152680g = uVar;
        C62942bv.registerDefaultInstance(C57190u.class, uVar);
    }

    private C57190u() {
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
                return newMessageInfo(f152680g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဌ\u0002\u0006ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, C57181l.class, "d", "e", C54781a.f143722a, C10662f.f35572a});
            case 3:
                return new C57190u();
            case 4:
                return new C57187r();
            case 5:
                return f152680g;
            case 6:
                C63010eb ebVar = f152681h;
                if (ebVar == null) {
                    synchronized (C57190u.class) {
                        ebVar = f152681h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152680g);
                            f152681h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
