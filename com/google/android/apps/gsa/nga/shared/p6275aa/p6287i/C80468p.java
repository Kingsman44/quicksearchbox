package com.google.android.apps.gsa.nga.shared.p6275aa.p6287i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.i.p */
/* compiled from: PG */
public final class C80468p extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C80468p f220849f;

    /* renamed from: g */
    private static volatile C63010eb f220850g;

    /* renamed from: a */
    public int f220851a;

    /* renamed from: b */
    public String f220852b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f220853c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f220854d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C62971cq f220855e = C62942bv.emptyProtobufList();

    static {
        C80468p pVar = new C80468p();
        f220849f = pVar;
        C62942bv.registerDefaultInstance(C80468p.class, pVar);
    }

    private C80468p() {
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
                return newMessageInfo(f220849f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004\u001a", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C80468p();
            case 4:
                return new C80467o();
            case 5:
                return f220849f;
            case 6:
                C63010eb ebVar = f220850g;
                if (ebVar == null) {
                    synchronized (C80468p.class) {
                        ebVar = f220850g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220849f);
                            f220850g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
