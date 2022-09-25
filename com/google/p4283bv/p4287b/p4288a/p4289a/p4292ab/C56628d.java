package com.google.p4283bv.p4287b.p4288a.p4289a.p4292ab;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.ab.d */
/* compiled from: PG */
public final class C56628d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56628d f151191c;

    /* renamed from: d */
    private static volatile C63010eb f151192d;

    /* renamed from: a */
    public int f151193a;

    /* renamed from: b */
    public String f151194b = BuildConfig.FLAVOR;

    static {
        C56628d dVar = new C56628d();
        f151191c = dVar;
        C62942bv.registerDefaultInstance(C56628d.class, dVar);
    }

    private C56628d() {
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
                return newMessageInfo(f151191c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56628d();
            case 4:
                return new C56627c();
            case 5:
                return f151191c;
            case 6:
                C63010eb ebVar = f151192d;
                if (ebVar == null) {
                    synchronized (C56628d.class) {
                        ebVar = f151192d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151191c);
                            f151192d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
