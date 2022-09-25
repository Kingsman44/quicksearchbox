package com.google.android.libraries.lens.view.p2069am;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4699e.C62225f;
import com.google.lens.p4699e.C62243x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.am.af */
/* compiled from: PG */
public final class C25298af extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62962ci f68804g = new C25295ac();

    /* renamed from: h */
    public static final C25298af f68805h;

    /* renamed from: i */
    private static volatile C63010eb f68806i;

    /* renamed from: a */
    public int f68807a = 0;

    /* renamed from: b */
    public Object f68808b;

    /* renamed from: c */
    public C62971cq f68809c = emptyProtobufList();

    /* renamed from: d */
    public int f68810d;

    /* renamed from: e */
    public String f68811e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62961ch f68812f = emptyIntList();

    static {
        C25298af afVar = new C25298af();
        f68805h = afVar;
        C62942bv.registerDefaultInstance(C25298af.class, afVar);
    }

    private C25298af() {
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
                return newMessageInfo(f68805h, "\u0000\u0006\u0001\u0000\u0001\u000b\u0006\u0000\u0002\u0000\u0001\u001b\u0002\f\u0003Ȉ\u0004,\n<\u0000\u000b<\u0000", new Object[]{"b", "a", C45240c.f118157a, C24195n.class, "d", "e", C10662f.f35572a, C62225f.class, C62243x.class});
            case 3:
                return new C25298af();
            case 4:
                return new C25296ad();
            case 5:
                return f68805h;
            case 6:
                C63010eb ebVar = f68806i;
                if (ebVar == null) {
                    synchronized (C25298af.class) {
                        ebVar = f68806i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f68805h);
                            f68806i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
