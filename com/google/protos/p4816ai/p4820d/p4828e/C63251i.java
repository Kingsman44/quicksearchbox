package com.google.protos.p4816ai.p4820d.p4828e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.e.i */
/* compiled from: PG */
public final class C63251i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63251i f170902d;

    /* renamed from: e */
    private static volatile C63010eb f170903e;

    /* renamed from: a */
    public int f170904a;

    /* renamed from: b */
    public String f170905b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f170906c;

    static {
        C63251i iVar = new C63251i();
        f170902d = iVar;
        C62942bv.registerDefaultInstance(C63251i.class, iVar);
    }

    private C63251i() {
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
                return newMessageInfo(f170902d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63251i();
            case 4:
                return new C63250h();
            case 5:
                return f170902d;
            case 6:
                C63010eb ebVar = f170903e;
                if (ebVar == null) {
                    synchronized (C63251i.class) {
                        ebVar = f170903e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170902d);
                            f170903e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
