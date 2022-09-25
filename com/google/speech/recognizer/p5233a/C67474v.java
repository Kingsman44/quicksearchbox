package com.google.speech.recognizer.p5233a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.v */
/* compiled from: PG */
public final class C67474v extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67474v f183384d;

    /* renamed from: f */
    private static volatile C63010eb f183385f;

    /* renamed from: a */
    public int f183386a;

    /* renamed from: b */
    public String f183387b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f183388c;

    /* renamed from: e */
    private byte f183389e = 2;

    static {
        C67474v vVar = new C67474v();
        f183384d = vVar;
        C62942bv.registerDefaultInstance(C67474v.class, vVar);
    }

    private C67474v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183389e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183389e = b;
                return null;
            case 2:
                return newMessageInfo(f183384d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67474v();
            case 4:
                return new C67473u();
            case 5:
                return f183384d;
            case 6:
                C63010eb ebVar = f183385f;
                if (ebVar == null) {
                    synchronized (C67474v.class) {
                        ebVar = f183385f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183384d);
                            f183385f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
