package com.google.assistant.p3861at;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.ug */
/* compiled from: PG */
public final class C50362ug extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C50362ug f131096h;

    /* renamed from: i */
    private static volatile C63010eb f131097i;

    /* renamed from: a */
    public int f131098a;

    /* renamed from: b */
    public int f131099b;

    /* renamed from: c */
    public C50359ud f131100c;

    /* renamed from: d */
    public C62971cq f131101d = emptyProtobufList();

    /* renamed from: e */
    public C50339tk f131102e;

    /* renamed from: f */
    public C50361uf f131103f;

    /* renamed from: g */
    public C63088z f131104g = C63088z.f170246b;

    static {
        C50362ug ugVar = new C50362ug();
        f131096h = ugVar;
        C62942bv.registerDefaultInstance(C50362ug.class, ugVar);
    }

    private C50362ug() {
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
                return newMessageInfo(f131096h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0007ည\u0004\b\u001b", new Object[]{"a", "b", C50341tm.f131021a, C45240c.f118157a, "e", C10662f.f35572a, C30325g.f82003a, "d", C50359ud.class});
            case 3:
                return new C50362ug();
            case 4:
                return new C50340tl();
            case 5:
                return f131096h;
            case 6:
                C63010eb ebVar = f131097i;
                if (ebVar == null) {
                    synchronized (C50362ug.class) {
                        ebVar = f131097i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131096h);
                            f131097i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
