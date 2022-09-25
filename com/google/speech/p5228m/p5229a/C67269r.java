package com.google.speech.p5228m.p5229a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.a.r */
/* compiled from: PG */
public final class C67269r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67269r f182851c;

    /* renamed from: e */
    private static volatile C63010eb f182852e;

    /* renamed from: a */
    public String f182853a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f182854b = emptyProtobufList();

    /* renamed from: d */
    private int f182855d;

    static {
        C67269r rVar = new C67269r();
        f182851c = rVar;
        C62942bv.registerDefaultInstance(C67269r.class, rVar);
    }

    private C67269r() {
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
                return newMessageInfo(f182851c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"d", "a", "b", C67268q.class});
            case 3:
                return new C67269r();
            case 4:
                return new C67266o();
            case 5:
                return f182851c;
            case 6:
                C63010eb ebVar = f182852e;
                if (ebVar == null) {
                    synchronized (C67269r.class) {
                        ebVar = f182852e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182851c);
                            f182852e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
