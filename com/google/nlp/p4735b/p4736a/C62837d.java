package com.google.nlp.p4735b.p4736a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.b.a.d */
/* compiled from: PG */
public final class C62837d extends C62937bq implements C62938br {

    /* renamed from: e */
    public static final C62837d f169685e;

    /* renamed from: g */
    private static volatile C63010eb f169686g;

    /* renamed from: a */
    public int f169687a;

    /* renamed from: b */
    public String f169688b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f169689c;

    /* renamed from: d */
    public int f169690d;

    /* renamed from: f */
    private byte f169691f = 2;

    static {
        C62837d dVar = new C62837d();
        f169685e = dVar;
        C62942bv.registerDefaultInstance(C62837d.class, dVar);
    }

    private C62837d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169691f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169691f = b;
                return null;
            case 2:
                return newMessageInfo(f169685e, "\u0001\u0003\u0000\u0001\u0003\u001d\u0003\u0000\u0000\u0000\u0003ဈ\u0000\u001cင\u0001\u001dင\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62837d();
            case 4:
                return new C62836c();
            case 5:
                return f169685e;
            case 6:
                C63010eb ebVar = f169686g;
                if (ebVar == null) {
                    synchronized (C62837d.class) {
                        ebVar = f169686g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169685e);
                            f169686g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
