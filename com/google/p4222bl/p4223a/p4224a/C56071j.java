package com.google.p4222bl.p4223a.p4224a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.j */
/* compiled from: PG */
public final class C56071j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56071j f149401c;

    /* renamed from: d */
    private static volatile C63010eb f149402d;

    /* renamed from: a */
    public String f149403a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f149404b = BuildConfig.FLAVOR;

    static {
        C56071j jVar = new C56071j();
        f149401c = jVar;
        C62942bv.registerDefaultInstance(C56071j.class, jVar);
    }

    private C56071j() {
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
                return newMessageInfo(f149401c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C56071j();
            case 4:
                return new C56070i();
            case 5:
                return f149401c;
            case 6:
                C63010eb ebVar = f149402d;
                if (ebVar == null) {
                    synchronized (C56071j.class) {
                        ebVar = f149402d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149401c);
                            f149402d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
