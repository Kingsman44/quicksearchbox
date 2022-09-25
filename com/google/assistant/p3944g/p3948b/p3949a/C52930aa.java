package com.google.assistant.p3944g.p3948b.p3949a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.aa */
/* compiled from: PG */
public final class C52930aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52930aa f138777c;

    /* renamed from: d */
    private static volatile C63010eb f138778d;

    /* renamed from: a */
    public int f138779a;

    /* renamed from: b */
    public String f138780b = BuildConfig.FLAVOR;

    static {
        C52930aa aaVar = new C52930aa();
        f138777c = aaVar;
        C62942bv.registerDefaultInstance(C52930aa.class, aaVar);
    }

    private C52930aa() {
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
                return newMessageInfo(f138777c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52930aa();
            case 4:
                return new C52961z();
            case 5:
                return f138777c;
            case 6:
                C63010eb ebVar = f138778d;
                if (ebVar == null) {
                    synchronized (C52930aa.class) {
                        ebVar = f138778d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138777c);
                            f138778d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
