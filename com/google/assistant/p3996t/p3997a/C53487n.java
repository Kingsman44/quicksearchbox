package com.google.assistant.p3996t.p3997a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.t.a.n */
/* compiled from: PG */
public final class C53487n extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53487n f140369g;

    /* renamed from: h */
    private static volatile C63010eb f140370h;

    /* renamed from: a */
    public int f140371a = 0;

    /* renamed from: b */
    public Object f140372b;

    /* renamed from: c */
    public String f140373c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f140374d;

    /* renamed from: e */
    public C62910ar f140375e;

    /* renamed from: f */
    public String f140376f = BuildConfig.FLAVOR;

    static {
        C53487n nVar = new C53487n();
        f140369g = nVar;
        C62942bv.registerDefaultInstance(C53487n.class, nVar);
    }

    private C53487n() {
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
                return newMessageInfo(f140369g, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\t\u0004<\u0000\u0005<\u0000\u0006Ȉ", new Object[]{"b", "a", C45240c.f118157a, "d", "e", C62910ar.class, C63042fg.class, C10662f.f35572a});
            case 3:
                return new C53487n();
            case 4:
                return new C53486m();
            case 5:
                return f140369g;
            case 6:
                C63010eb ebVar = f140370h;
                if (ebVar == null) {
                    synchronized (C53487n.class) {
                        ebVar = f140370h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140369g);
                            f140370h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
