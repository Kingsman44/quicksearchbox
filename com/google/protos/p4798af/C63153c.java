package com.google.protos.p4798af;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.af.c */
/* compiled from: PG */
public final class C63153c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63153c f170529c;

    /* renamed from: e */
    private static volatile C63010eb f170530e;

    /* renamed from: a */
    public String f170531a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f170532b = emptyProtobufList();

    /* renamed from: d */
    private int f170533d;

    static {
        C63153c cVar = new C63153c();
        f170529c = cVar;
        C62942bv.registerDefaultInstance(C63153c.class, cVar);
    }

    private C63153c() {
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
                return newMessageInfo(f170529c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C63158h.class});
            case 3:
                return new C63153c();
            case 4:
                return new C63152b();
            case 5:
                return f170529c;
            case 6:
                C63010eb ebVar = f170530e;
                if (ebVar == null) {
                    synchronized (C63153c.class) {
                        ebVar = f170530e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170529c);
                            f170530e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
