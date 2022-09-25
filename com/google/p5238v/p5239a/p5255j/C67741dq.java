package com.google.p5238v.p5239a.p5255j;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.dq */
/* compiled from: PG */
public final class C67741dq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67741dq f183785c;

    /* renamed from: d */
    private static volatile C63010eb f183786d;

    /* renamed from: a */
    public String f183787a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C67725da f183788b;

    static {
        C67741dq dqVar = new C67741dq();
        f183785c = dqVar;
        C62942bv.registerDefaultInstance(C67741dq.class, dqVar);
    }

    private C67741dq() {
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
                return newMessageInfo(f183785c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C67741dq();
            case 4:
                return new C67740dp();
            case 5:
                return f183785c;
            case 6:
                C63010eb ebVar = f183786d;
                if (ebVar == null) {
                    synchronized (C67741dq.class) {
                        ebVar = f183786d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183785c);
                            f183786d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
