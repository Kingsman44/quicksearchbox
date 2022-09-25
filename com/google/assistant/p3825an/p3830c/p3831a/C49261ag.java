package com.google.assistant.p3825an.p3830c.p3831a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.ag */
/* compiled from: PG */
public final class C49261ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49261ag f127334e;

    /* renamed from: g */
    private static volatile C63010eb f127335g;

    /* renamed from: a */
    public String f127336a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f127337b = emptyProtobufList();

    /* renamed from: c */
    public C49287bf f127338c;

    /* renamed from: d */
    public String f127339d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f127340f;

    static {
        C49261ag agVar = new C49261ag();
        f127334e = agVar;
        C62942bv.registerDefaultInstance(C49261ag.class, agVar);
    }

    private C49261ag() {
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
                return newMessageInfo(f127334e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဈ\u0002", new Object[]{C10662f.f35572a, "a", "b", C49291bj.class, C45240c.f118157a, "d"});
            case 3:
                return new C49261ag();
            case 4:
                return new C49260af();
            case 5:
                return f127334e;
            case 6:
                C63010eb ebVar = f127335g;
                if (ebVar == null) {
                    synchronized (C49261ag.class) {
                        ebVar = f127335g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127334e);
                            f127335g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
