package com.google.p4283bv.p4287b.p4288a.p4289a.p4300e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.e.d */
/* compiled from: PG */
public final class C56682d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56682d f151297c;

    /* renamed from: e */
    private static volatile C63010eb f151298e;

    /* renamed from: a */
    public String f151299a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f151300b = emptyProtobufList();

    /* renamed from: d */
    private int f151301d;

    static {
        C56682d dVar = new C56682d();
        f151297c = dVar;
        C62942bv.registerDefaultInstance(C56682d.class, dVar);
    }

    private C56682d() {
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
                return newMessageInfo(f151297c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C56681c.class});
            case 3:
                return new C56682d();
            case 4:
                return new C56679a();
            case 5:
                return f151297c;
            case 6:
                C63010eb ebVar = f151298e;
                if (ebVar == null) {
                    synchronized (C56682d.class) {
                        ebVar = f151298e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151297c);
                            f151298e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
