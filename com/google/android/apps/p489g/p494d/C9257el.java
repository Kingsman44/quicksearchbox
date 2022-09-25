package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.el */
/* compiled from: PG */
public final class C9257el extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C9257el f32007h;

    /* renamed from: i */
    private static volatile C63010eb f32008i;

    /* renamed from: a */
    public int f32009a;

    /* renamed from: b */
    public String f32010b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C9259en f32011c;

    /* renamed from: d */
    public String f32012d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f32013e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f32014f = emptyProtobufList();

    /* renamed from: g */
    public boolean f32015g;

    static {
        C9257el elVar = new C9257el();
        f32007h = elVar;
        C62942bv.registerDefaultInstance(C9257el.class, elVar);
    }

    private C9257el() {
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
                return newMessageInfo(f32007h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0001\u0002ဈ\u0002\u0003\u001b\u0004ဈ\u0003\u0005ဈ\u0000\u0006ဇ\u0004", new Object[]{"a", C45240c.f118157a, "d", C10662f.f35572a, C9256ek.class, "e", "b", C30325g.f82003a});
            case 3:
                return new C9257el();
            case 4:
                return new C9254ei();
            case 5:
                return f32007h;
            case 6:
                C63010eb ebVar = f32008i;
                if (ebVar == null) {
                    synchronized (C9257el.class) {
                        ebVar = f32008i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32007h);
                            f32008i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
