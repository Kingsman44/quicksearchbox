package com.google.assistant.p4008y.p4013d.p4014a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.a.b */
/* compiled from: PG */
public final class C53633b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53633b f140765c;

    /* renamed from: e */
    private static volatile C63010eb f140766e;

    /* renamed from: a */
    public String f140767a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C53639h f140768b;

    /* renamed from: d */
    private int f140769d;

    static {
        C53633b bVar = new C53633b();
        f140765c = bVar;
        C62942bv.registerDefaultInstance(C53633b.class, bVar);
    }

    private C53633b() {
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
                return newMessageInfo(f140765c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C53633b();
            case 4:
                return new C53632a();
            case 5:
                return f140765c;
            case 6:
                C63010eb ebVar = f140766e;
                if (ebVar == null) {
                    synchronized (C53633b.class) {
                        ebVar = f140766e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140765c);
                            f140766e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
