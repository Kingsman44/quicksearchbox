package com.google.knowledge.p4682d.p4683a.p4684a.p4685a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.d.a.a.a.d */
/* compiled from: PG */
public final class C61988d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61988d f167524c;

    /* renamed from: d */
    private static volatile C63010eb f167525d;

    /* renamed from: a */
    public String f167526a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f167527b;

    static {
        C61988d dVar = new C61988d();
        f167524c = dVar;
        C62942bv.registerDefaultInstance(C61988d.class, dVar);
    }

    private C61988d() {
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
                return newMessageInfo(f167524c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"a", "b"});
            case 3:
                return new C61988d();
            case 4:
                return new C61987c();
            case 5:
                return f167524c;
            case 6:
                C63010eb ebVar = f167525d;
                if (ebVar == null) {
                    synchronized (C61988d.class) {
                        ebVar = f167525d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167524c);
                            f167525d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
