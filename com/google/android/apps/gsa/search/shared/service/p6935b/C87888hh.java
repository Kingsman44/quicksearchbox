package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5146w.p5147a.p5148a.C65926d;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.hh */
/* compiled from: PG */
public final class C87888hh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C87888hh f237757d;

    /* renamed from: g */
    private static volatile C63010eb f237758g;

    /* renamed from: a */
    public String f237759a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C65926d f237760b;

    /* renamed from: c */
    public int f237761c;

    /* renamed from: e */
    private int f237762e;

    /* renamed from: f */
    private byte f237763f = 2;

    static {
        C87888hh hhVar = new C87888hh();
        f237757d = hhVar;
        C62942bv.registerDefaultInstance(C87888hh.class, hhVar);
    }

    private C87888hh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f237763f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f237763f = b;
                return null;
            case 2:
                return newMessageInfo(f237757d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003င\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C87888hh();
            case 4:
                return new C87887hg();
            case 5:
                return f237757d;
            case 6:
                C63010eb ebVar = f237758g;
                if (ebVar == null) {
                    synchronized (C87888hh.class) {
                        ebVar = f237758g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237757d);
                            f237758g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
