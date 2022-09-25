package com.google.audio.p4107b.p4108a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.audio.b.a.t */
/* compiled from: PG */
public final class C54597t extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54597t f143337f;

    /* renamed from: g */
    private static volatile C63010eb f143338g;

    /* renamed from: a */
    public int f143339a;

    /* renamed from: b */
    public String f143340b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f143341c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f143342d;

    /* renamed from: e */
    public String f143343e;

    static {
        C54597t tVar = new C54597t();
        f143337f = tVar;
        C62942bv.registerDefaultInstance(C54597t.class, tVar);
    }

    private C54597t() {
        emptyProtobufList();
        this.f143342d = BuildConfig.FLAVOR;
        this.f143343e = BuildConfig.FLAVOR;
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
                return newMessageInfo(f143337f, "\u0001\u0004\u0000\u0001\u0001\u0013\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\tဈ\u0004\u0013ဈ\n", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C54597t();
            case 4:
                return new C54596s();
            case 5:
                return f143337f;
            case 6:
                C63010eb ebVar = f143338g;
                if (ebVar == null) {
                    synchronized (C54597t.class) {
                        ebVar = f143338g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143337f);
                            f143338g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
