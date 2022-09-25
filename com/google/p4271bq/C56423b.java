package com.google.p4271bq;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bq.b */
/* compiled from: PG */
public final class C56423b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56423b f150532c;

    /* renamed from: e */
    private static volatile C63010eb f150533e;

    /* renamed from: a */
    public String f150534a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f150535b;

    /* renamed from: d */
    private int f150536d;

    static {
        C56423b bVar = new C56423b();
        f150532c = bVar;
        C62942bv.registerDefaultInstance(C56423b.class, bVar);
    }

    private C56423b() {
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
                return newMessageInfo(f150532c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C56423b();
            case 4:
                return new C56422a();
            case 5:
                return f150532c;
            case 6:
                C63010eb ebVar = f150533e;
                if (ebVar == null) {
                    synchronized (C56423b.class) {
                        ebVar = f150533e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150532c);
                            f150533e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
