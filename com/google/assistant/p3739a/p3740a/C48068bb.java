package com.google.assistant.p3739a.p3740a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.a.a.bb */
/* compiled from: PG */
public final class C48068bb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48068bb f124406d;

    /* renamed from: e */
    private static volatile C63010eb f124407e;

    /* renamed from: a */
    public int f124408a;

    /* renamed from: b */
    public String f124409b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f124410c;

    static {
        C48068bb bbVar = new C48068bb();
        f124406d = bbVar;
        C62942bv.registerDefaultInstance(C48068bb.class, bbVar);
    }

    private C48068bb() {
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
                return newMessageInfo(f124406d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဇ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C48068bb();
            case 4:
                return new C48067ba();
            case 5:
                return f124406d;
            case 6:
                C63010eb ebVar = f124407e;
                if (ebVar == null) {
                    synchronized (C48068bb.class) {
                        ebVar = f124407e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124406d);
                            f124407e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
