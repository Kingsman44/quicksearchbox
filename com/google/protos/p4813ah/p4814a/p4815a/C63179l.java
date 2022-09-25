package com.google.protos.p4813ah.p4814a.p4815a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ah.a.a.l */
/* compiled from: PG */
public final class C63179l extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C63179l f170583h;

    /* renamed from: i */
    private static volatile C63010eb f170584i;

    /* renamed from: a */
    public int f170585a;

    /* renamed from: b */
    public int f170586b;

    /* renamed from: c */
    public int f170587c;

    /* renamed from: d */
    public long f170588d;

    /* renamed from: e */
    public C63175h f170589e;

    /* renamed from: f */
    public float f170590f;

    /* renamed from: g */
    public C63177j f170591g;

    static {
        C63179l lVar = new C63179l();
        f170583h = lVar;
        C62942bv.registerDefaultInstance(C63179l.class, lVar);
    }

    private C63179l() {
        emptyIntList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f170583h, "\u0001\u0006\u0000\u0001\u0001\u0013\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0005ဉ\u0004\u0007ခ\u0007\u0013ဉ\u0012", new Object[]{"a", "b", C63185r.m96201b(), C45240c.f118157a, C63183p.m96199b(), "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C63179l();
            case 4:
                return new C63178k();
            case 5:
                return f170583h;
            case 6:
                C63010eb ebVar = f170584i;
                if (ebVar == null) {
                    synchronized (C63179l.class) {
                        ebVar = f170584i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170583h);
                            f170584i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
