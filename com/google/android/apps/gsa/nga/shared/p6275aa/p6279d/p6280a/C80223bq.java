package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bq */
/* compiled from: PG */
public final class C80223bq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80223bq f220097c;

    /* renamed from: e */
    private static volatile C63010eb f220098e;

    /* renamed from: a */
    public boolean f220099a;

    /* renamed from: b */
    public String f220100b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f220101d;

    static {
        C80223bq bqVar = new C80223bq();
        f220097c = bqVar;
        C62942bv.registerDefaultInstance(C80223bq.class, bqVar);
    }

    private C80223bq() {
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
                return newMessageInfo(f220097c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C80223bq();
            case 4:
                return new C80222bp();
            case 5:
                return f220097c;
            case 6:
                C63010eb ebVar = f220098e;
                if (ebVar == null) {
                    synchronized (C80223bq.class) {
                        ebVar = f220098e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220097c);
                            f220098e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
