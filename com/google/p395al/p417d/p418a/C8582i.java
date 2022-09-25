package com.google.p395al.p417d.p418a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.d.a.i */
/* compiled from: PG */
public final class C8582i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8582i f29706c;

    /* renamed from: d */
    private static volatile C63010eb f29707d;

    /* renamed from: a */
    public int f29708a;

    /* renamed from: b */
    public String f29709b = BuildConfig.FLAVOR;

    static {
        C8582i iVar = new C8582i();
        f29706c = iVar;
        C62942bv.registerDefaultInstance(C8582i.class, iVar);
    }

    private C8582i() {
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
                return newMessageInfo(f29706c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C8582i();
            case 4:
                return new C8581h();
            case 5:
                return f29706c;
            case 6:
                C63010eb ebVar = f29707d;
                if (ebVar == null) {
                    synchronized (C8582i.class) {
                        ebVar = f29707d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29706c);
                            f29707d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
