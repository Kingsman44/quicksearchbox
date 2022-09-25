package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.h */
/* compiled from: PG */
public final class C51117h extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C51117h f133040h;

    /* renamed from: i */
    private static volatile C63010eb f133041i;

    /* renamed from: a */
    public int f133042a;

    /* renamed from: b */
    public String f133043b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f133044c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f133045d = emptyProtobufList();

    /* renamed from: e */
    public int f133046e;

    /* renamed from: f */
    public C51135hr f133047f;

    /* renamed from: g */
    public boolean f133048g;

    static {
        C51117h hVar = new C51117h();
        f133040h = hVar;
        C62942bv.registerDefaultInstance(C51117h.class, hVar);
    }

    private C51117h() {
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
                return newMessageInfo(f133040h, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0004\u001b\u0005င\u0000\u0006ဉ\u0001\u0007\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", C51153j.class, "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C51117h();
            case 4:
                return new C51090g();
            case 5:
                return f133040h;
            case 6:
                C63010eb ebVar = f133041i;
                if (ebVar == null) {
                    synchronized (C51117h.class) {
                        ebVar = f133041i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133040h);
                            f133041i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
