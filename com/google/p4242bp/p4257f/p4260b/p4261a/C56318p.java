package com.google.p4242bp.p4257f.p4260b.p4261a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.f.b.a.p */
/* compiled from: PG */
public final class C56318p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56318p f150087c;

    /* renamed from: d */
    private static volatile C63010eb f150088d;

    /* renamed from: a */
    public int f150089a;

    /* renamed from: b */
    public String f150090b = BuildConfig.FLAVOR;

    static {
        C56318p pVar = new C56318p();
        f150087c = pVar;
        C62942bv.registerDefaultInstance(C56318p.class, pVar);
    }

    private C56318p() {
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
                return newMessageInfo(f150087c, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"a", "b"});
            case 3:
                return new C56318p();
            case 4:
                return new C56317o();
            case 5:
                return f150087c;
            case 6:
                C63010eb ebVar = f150088d;
                if (ebVar == null) {
                    synchronized (C56318p.class) {
                        ebVar = f150088d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150087c);
                            f150088d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
