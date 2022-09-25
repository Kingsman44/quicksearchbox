package com.google.protos.p4895aw.p4902b;

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
import com.google.protobuf.C63088z;

@Deprecated
/* renamed from: com.google.protos.aw.b.cr */
/* compiled from: PG */
public final class C64035cr extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C64035cr f173147h;

    /* renamed from: i */
    private static volatile C63010eb f173148i;

    /* renamed from: a */
    public int f173149a;

    /* renamed from: b */
    public int f173150b = 0;

    /* renamed from: c */
    public Object f173151c;

    /* renamed from: d */
    public String f173152d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f173153e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63088z f173154f = C63088z.f170246b;

    /* renamed from: g */
    public C62971cq f173155g = emptyProtobufList();

    static {
        C64035cr crVar = new C64035cr();
        f173147h = crVar;
        C62942bv.registerDefaultInstance(C64035cr.class, crVar);
    }

    private C64035cr() {
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
                return newMessageInfo(f173147h, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ွ\u0000\u0002ျ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ည\u0004\u0006\u001b", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C30325g.f82003a, C64034cq.class});
            case 3:
                return new C64035cr();
            case 4:
                return new C64032co();
            case 5:
                return f173147h;
            case 6:
                C63010eb ebVar = f173148i;
                if (ebVar == null) {
                    synchronized (C64035cr.class) {
                        ebVar = f173148i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173147h);
                            f173148i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
