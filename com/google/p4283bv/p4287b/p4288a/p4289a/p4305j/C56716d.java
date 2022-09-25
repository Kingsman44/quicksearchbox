package com.google.p4283bv.p4287b.p4288a.p4289a.p4305j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.j.d */
/* compiled from: PG */
public final class C56716d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56716d f151382c;

    /* renamed from: e */
    private static volatile C63010eb f151383e;

    /* renamed from: a */
    public String f151384a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f151385b = emptyProtobufList();

    /* renamed from: d */
    private int f151386d;

    static {
        C56716d dVar = new C56716d();
        f151382c = dVar;
        C62942bv.registerDefaultInstance(C56716d.class, dVar);
    }

    private C56716d() {
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
                return newMessageInfo(f151382c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C56714b.class});
            case 3:
                return new C56716d();
            case 4:
                return new C56715c();
            case 5:
                return f151382c;
            case 6:
                C63010eb ebVar = f151383e;
                if (ebVar == null) {
                    synchronized (C56716d.class) {
                        ebVar = f151383e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151382c);
                            f151383e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
