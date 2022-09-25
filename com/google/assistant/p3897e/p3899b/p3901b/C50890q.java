package com.google.assistant.p3897e.p3899b.p3901b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63063ga;

/* renamed from: com.google.assistant.e.b.b.q */
/* compiled from: PG */
public final class C50890q extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50890q f132493e;

    /* renamed from: g */
    private static volatile C63010eb f132494g;

    /* renamed from: a */
    public int f132495a;

    /* renamed from: b */
    public String f132496b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62995dn f132497c = C62995dn.f170057a;

    /* renamed from: d */
    public C63063ga f132498d;

    /* renamed from: f */
    private C62995dn f132499f = C62995dn.f170057a;

    static {
        C50890q qVar = new C50890q();
        f132493e = qVar;
        C62942bv.registerDefaultInstance(C50890q.class, qVar);
    }

    private C50890q() {
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
                return newMessageInfo(f132493e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0002\u0000\u0000\u0001ဈ\u0000\u00022\u0003ဉ\u0001\u00042", new Object[]{"a", "b", C10662f.f35572a, C50889p.f132492a, "d", C45240c.f118157a, C50886m.f132487a});
            case 3:
                return new C50890q();
            case 4:
                return new C50885l();
            case 5:
                return f132493e;
            case 6:
                C63010eb ebVar = f132494g;
                if (ebVar == null) {
                    synchronized (C50890q.class) {
                        ebVar = f132494g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132493e);
                            f132494g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
