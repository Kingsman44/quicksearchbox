package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.i */
/* compiled from: PG */
public final class C57648i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57648i f153953c;

    /* renamed from: d */
    private static volatile C63010eb f153954d;

    /* renamed from: a */
    public int f153955a;

    /* renamed from: b */
    public String f153956b = BuildConfig.FLAVOR;

    static {
        C57648i iVar = new C57648i();
        f153953c = iVar;
        C62942bv.registerDefaultInstance(C57648i.class, iVar);
    }

    private C57648i() {
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
                return newMessageInfo(f153953c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C57648i();
            case 4:
                return new C57646g();
            case 5:
                return f153953c;
            case 6:
                C63010eb ebVar = f153954d;
                if (ebVar == null) {
                    synchronized (C57648i.class) {
                        ebVar = f153954d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153953c);
                            f153954d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
