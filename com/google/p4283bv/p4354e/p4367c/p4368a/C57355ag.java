package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ag */
/* compiled from: PG */
public final class C57355ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57355ag f153225b;

    /* renamed from: d */
    private static volatile C63010eb f153226d;

    /* renamed from: a */
    public String f153227a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f153228c;

    static {
        C57355ag agVar = new C57355ag();
        f153225b = agVar;
        C62942bv.registerDefaultInstance(C57355ag.class, agVar);
    }

    private C57355ag() {
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
                return newMessageInfo(f153225b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C57355ag();
            case 4:
                return new C57354af();
            case 5:
                return f153225b;
            case 6:
                C63010eb ebVar = f153226d;
                if (ebVar == null) {
                    synchronized (C57355ag.class) {
                        ebVar = f153226d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153225b);
                            f153226d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
