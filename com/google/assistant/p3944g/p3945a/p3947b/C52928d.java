package com.google.assistant.p3944g.p3945a.p3947b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.a.b.d */
/* compiled from: PG */
public final class C52928d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C52928d f138772c;

    /* renamed from: d */
    private static volatile C63010eb f138773d;

    /* renamed from: a */
    public int f138774a;

    /* renamed from: b */
    public String f138775b = BuildConfig.FLAVOR;

    static {
        C52928d dVar = new C52928d();
        f138772c = dVar;
        C62942bv.registerDefaultInstance(C52928d.class, dVar);
    }

    private C52928d() {
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
                return newMessageInfo(f138772c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C52928d();
            case 4:
                return new C52927c();
            case 5:
                return f138772c;
            case 6:
                C63010eb ebVar = f138773d;
                if (ebVar == null) {
                    synchronized (C52928d.class) {
                        ebVar = f138773d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138772c);
                            f138773d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
