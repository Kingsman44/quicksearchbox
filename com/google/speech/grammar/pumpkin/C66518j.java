package com.google.speech.grammar.pumpkin;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.grammar.pumpkin.j */
/* compiled from: PG */
public final class C66518j extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66518j f180909a;

    /* renamed from: g */
    private static volatile C63010eb f180910g;

    /* renamed from: b */
    private int f180911b;

    /* renamed from: c */
    private String f180912c = BuildConfig.FLAVOR;

    /* renamed from: d */
    private String f180913d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private String f180914e = BuildConfig.FLAVOR;

    /* renamed from: f */
    private byte f180915f = 2;

    static {
        C66518j jVar = new C66518j();
        f180909a = jVar;
        C62942bv.registerDefaultInstance(C66518j.class, jVar);
    }

    private C66518j() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180915f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180915f = b;
                return null;
            case 2:
                return newMessageInfo(f180909a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0003\u0003ᔈ\u0002\u0004ᔈ\u0003\u0005ᔈ\u0004", new Object[]{"b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66518j();
            case 4:
                return new C66517i();
            case 5:
                return f180909a;
            case 6:
                C63010eb ebVar = f180910g;
                if (ebVar == null) {
                    synchronized (C66518j.class) {
                        ebVar = f180910g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180909a);
                            f180910g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
