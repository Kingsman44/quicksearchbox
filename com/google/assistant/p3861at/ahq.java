package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ahq */
/* compiled from: PG */
public final class ahq extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final ahq f129326g;

    /* renamed from: h */
    private static volatile C63010eb f129327h;

    /* renamed from: a */
    public int f129328a;

    /* renamed from: b */
    public String f129329b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f129330c = C62942bv.emptyProtobufList();

    /* renamed from: d */
    public C62971cq f129331d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public aho f129332e;

    /* renamed from: f */
    public C62971cq f129333f = emptyProtobufList();

    static {
        ahq ahq = new ahq();
        f129326g = ahq;
        C62942bv.registerDefaultInstance(ahq.class, ahq);
    }

    private ahq() {
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
                return newMessageInfo(f129326g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဉ\u0001\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, ahy.class});
            case 3:
                return new ahq();
            case 4:
                return new ahp();
            case 5:
                return f129326g;
            case 6:
                C63010eb ebVar = f129327h;
                if (ebVar == null) {
                    synchronized (ahq.class) {
                        ebVar = f129327h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129326g);
                            f129327h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
