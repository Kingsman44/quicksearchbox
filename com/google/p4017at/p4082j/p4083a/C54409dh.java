package com.google.p4017at.p4082j.p4083a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.dh */
/* compiled from: PG */
public final class C54409dh extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54409dh f142899c;

    /* renamed from: d */
    private static volatile C63010eb f142900d;

    /* renamed from: a */
    public C54460y f142901a;

    /* renamed from: b */
    public String f142902b = BuildConfig.FLAVOR;

    static {
        C54409dh dhVar = new C54409dh();
        f142899c = dhVar;
        C62942bv.registerDefaultInstance(C54409dh.class, dhVar);
    }

    private C54409dh() {
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
                return newMessageInfo(f142899c, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003\t\u0004Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C54409dh();
            case 4:
                return new C54408dg();
            case 5:
                return f142899c;
            case 6:
                C63010eb ebVar = f142900d;
                if (ebVar == null) {
                    synchronized (C54409dh.class) {
                        ebVar = f142900d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142899c);
                            f142900d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
