package com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.c.a.a.a.a.bi */
/* compiled from: PG */
public final class C45656bi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45656bi f120109c;

    /* renamed from: d */
    private static volatile C63010eb f120110d;

    /* renamed from: a */
    public int f120111a;

    /* renamed from: b */
    public String f120112b = BuildConfig.FLAVOR;

    static {
        C45656bi biVar = new C45656bi();
        f120109c = biVar;
        C62942bv.registerDefaultInstance(C45656bi.class, biVar);
    }

    private C45656bi() {
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
                return newMessageInfo(f120109c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C45656bi();
            case 4:
                return new C45655bh();
            case 5:
                return f120109c;
            case 6:
                C63010eb ebVar = f120110d;
                if (ebVar == null) {
                    synchronized (C45656bi.class) {
                        ebVar = f120110d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120109c);
                            f120110d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
