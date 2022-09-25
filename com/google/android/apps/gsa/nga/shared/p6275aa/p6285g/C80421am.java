package com.google.android.apps.gsa.nga.shared.p6275aa.p6285g;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.am */
/* compiled from: PG */
public final class C80421am extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80421am f220723d;

    /* renamed from: f */
    private static volatile C63010eb f220724f;

    /* renamed from: a */
    public int f220725a;

    /* renamed from: b */
    public String f220726b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f220727c = emptyProtobufList();

    /* renamed from: e */
    private byte f220728e = 2;

    static {
        C80421am amVar = new C80421am();
        f220723d = amVar;
        C62942bv.registerDefaultInstance(C80421am.class, amVar);
    }

    private C80421am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220728e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220728e = b;
                return null;
            case 2:
                return newMessageInfo(f220723d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C80047aa.class});
            case 3:
                return new C80421am();
            case 4:
                return new C80420al();
            case 5:
                return f220723d;
            case 6:
                C63010eb ebVar = f220724f;
                if (ebVar == null) {
                    synchronized (C80421am.class) {
                        ebVar = f220724f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220723d);
                            f220724f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
