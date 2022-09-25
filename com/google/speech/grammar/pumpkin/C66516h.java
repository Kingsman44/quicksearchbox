package com.google.speech.grammar.pumpkin;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.grammar.pumpkin.h */
/* compiled from: PG */
public final class C66516h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66516h f180902a;

    /* renamed from: g */
    private static volatile C63010eb f180903g;

    /* renamed from: b */
    private int f180904b;

    /* renamed from: c */
    private String f180905c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private C66518j f180906d;

    /* renamed from: e */
    private C66514f f180907e;

    /* renamed from: f */
    private byte f180908f = 2;

    static {
        C66516h hVar = new C66516h();
        f180902a = hVar;
        C62942bv.registerDefaultInstance(C66516h.class, hVar);
    }

    private C66516h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180908f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180908f = b;
                return null;
            case 2:
                return newMessageInfo(f180902a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔈ\u0000\u0002ᔉ\u0001\u0003ᔉ\u0002", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66516h();
            case 4:
                return new C66515g();
            case 5:
                return f180902a;
            case 6:
                C63010eb ebVar = f180903g;
                if (ebVar == null) {
                    synchronized (C66516h.class) {
                        ebVar = f180903g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180902a);
                            f180903g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
