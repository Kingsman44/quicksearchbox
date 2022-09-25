package com.google.p335a.p336a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.a.a.j */
/* compiled from: PG */
public final class C6588j extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C6588j f19586g;

    /* renamed from: h */
    private static volatile C63010eb f19587h;

    /* renamed from: a */
    public int f19588a;

    /* renamed from: b */
    public String f19589b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f19590c;

    /* renamed from: d */
    public String f19591d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f19592e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f19593f = emptyProtobufList();

    static {
        C6588j jVar = new C6588j();
        f19586g = jVar;
        C62942bv.registerDefaultInstance(C6588j.class, jVar);
    }

    private C6588j() {
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
                return newMessageInfo(f19586g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0007\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C6597s.class});
            case 3:
                return new C6588j();
            case 4:
                return new C6587i();
            case 5:
                return f19586g;
            case 6:
                C63010eb ebVar = f19587h;
                if (ebVar == null) {
                    synchronized (C6588j.class) {
                        ebVar = f19587h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f19586g);
                            f19587h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
