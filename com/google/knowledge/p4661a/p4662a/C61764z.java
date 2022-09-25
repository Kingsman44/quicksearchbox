package com.google.knowledge.p4661a.p4662a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.a.a.z */
/* compiled from: PG */
public final class C61764z extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61764z f166843c;

    /* renamed from: d */
    private static volatile C63010eb f166844d;

    /* renamed from: a */
    public int f166845a;

    /* renamed from: b */
    public String f166846b = BuildConfig.FLAVOR;

    static {
        C61764z zVar = new C61764z();
        f166843c = zVar;
        C62942bv.registerDefaultInstance(C61764z.class, zVar);
    }

    private C61764z() {
        emptyProtobufList();
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
                return newMessageInfo(f166843c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C61764z();
            case 4:
                return new C61763y();
            case 5:
                return f166843c;
            case 6:
                C63010eb ebVar = f166844d;
                if (ebVar == null) {
                    synchronized (C61764z.class) {
                        ebVar = f166844d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166843c);
                            f166844d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
