package com.google.android.apps.gsa.nga.shared.p6274a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5048z.p5051b.p5052a.C65402d;

/* renamed from: com.google.android.apps.gsa.nga.shared.a.d */
/* compiled from: PG */
public final class C80058d extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80058d f219690e;

    /* renamed from: f */
    private static volatile C63010eb f219691f;

    /* renamed from: a */
    public long f219692a;

    /* renamed from: b */
    public String f219693b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f219694c;

    /* renamed from: d */
    public C65402d f219695d;

    static {
        C80058d dVar = new C80058d();
        f219690e = dVar;
        C62942bv.registerDefaultInstance(C80058d.class, dVar);
    }

    private C80058d() {
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
                return newMessageInfo(f219690e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\u0004\u0004\t", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C80058d();
            case 4:
                return new C80057c();
            case 5:
                return f219690e;
            case 6:
                C63010eb ebVar = f219691f;
                if (ebVar == null) {
                    synchronized (C80058d.class) {
                        ebVar = f219691f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219690e);
                            f219691f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
