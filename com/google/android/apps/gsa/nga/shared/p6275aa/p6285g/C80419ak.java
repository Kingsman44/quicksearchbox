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

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.g.ak */
/* compiled from: PG */
public final class C80419ak extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80419ak f220716e;

    /* renamed from: g */
    private static volatile C63010eb f220717g;

    /* renamed from: a */
    public int f220718a;

    /* renamed from: b */
    public String f220719b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f220720c = emptyProtobufList();

    /* renamed from: d */
    public double f220721d;

    /* renamed from: f */
    private byte f220722f = 2;

    static {
        C80419ak akVar = new C80419ak();
        f220716e = akVar;
        C62942bv.registerDefaultInstance(C80419ak.class, akVar);
    }

    private C80419ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220722f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220722f = b;
                return null;
            case 2:
                return newMessageInfo(f220716e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л\u0003က\u0001", new Object[]{"a", "b", C45240c.f118157a, C80047aa.class, "d"});
            case 3:
                return new C80419ak();
            case 4:
                return new C80418aj();
            case 5:
                return f220716e;
            case 6:
                C63010eb ebVar = f220717g;
                if (ebVar == null) {
                    synchronized (C80419ak.class) {
                        ebVar = f220717g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220716e);
                            f220717g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
