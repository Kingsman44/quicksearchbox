package com.google.assistant.p3861at;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.au */
/* compiled from: PG */
public final class C49836au extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49836au f129497e;

    /* renamed from: g */
    private static volatile C63010eb f129498g;

    /* renamed from: a */
    public C49838aw f129499a;

    /* renamed from: b */
    public C62971cq f129500b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f129501c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f129502d = emptyProtobufList();

    /* renamed from: f */
    private int f129503f;

    static {
        C49836au auVar = new C49836au();
        f129497e = auVar;
        C62942bv.registerDefaultInstance(C49836au.class, auVar);
    }

    private C49836au() {
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
                return newMessageInfo(f129497e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{C10662f.f35572a, "a", "b", C49826ak.class, C45240c.f118157a, C49849bg.class, "d", C49847be.class});
            case 3:
                return new C49836au();
            case 4:
                return new C49835at();
            case 5:
                return f129497e;
            case 6:
                C63010eb ebVar = f129498g;
                if (ebVar == null) {
                    synchronized (C49836au.class) {
                        ebVar = f129498g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129497e);
                            f129498g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
