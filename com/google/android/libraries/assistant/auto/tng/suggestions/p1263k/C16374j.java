package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p913b.p915b.C13262b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.j */
/* compiled from: PG */
public final class C16374j extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C16374j f48198h;

    /* renamed from: i */
    private static volatile C63010eb f48199i;

    /* renamed from: a */
    public C62971cq f48200a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f48201b = emptyProtobufList();

    /* renamed from: c */
    public C62971cq f48202c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f48203d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f48204e = emptyProtobufList();

    /* renamed from: f */
    public C62971cq f48205f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f48206g = emptyProtobufList();

    static {
        C16374j jVar = new C16374j();
        f48198h = jVar;
        C62942bv.registerDefaultInstance(C16374j.class, jVar);
    }

    private C16374j() {
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
                return newMessageInfo(f48198h, "\u0001\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0007\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007\u001b", new Object[]{"a", aco.class, "b", C13256b.class, C45240c.f118157a, C13256b.class, "d", C13256b.class, "e", C13262b.class, C10662f.f35572a, C13262b.class, C30325g.f82003a, C13262b.class});
            case 3:
                return new C16374j();
            case 4:
                return new C16373i();
            case 5:
                return f48198h;
            case 6:
                C63010eb ebVar = f48199i;
                if (ebVar == null) {
                    synchronized (C16374j.class) {
                        ebVar = f48199i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48198h);
                            f48199i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
