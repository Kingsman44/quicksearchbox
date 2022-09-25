package com.google.p375ai.p378b.p380b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7891nu;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.b.g */
/* compiled from: PG */
public final class C7546g extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C7546g f26108h;

    /* renamed from: i */
    private static volatile C63010eb f26109i;

    /* renamed from: a */
    public int f26110a;

    /* renamed from: b */
    public int f26111b = 12;

    /* renamed from: c */
    public int f26112c = 1;

    /* renamed from: d */
    public int f26113d;

    /* renamed from: e */
    public int f26114e;

    /* renamed from: f */
    public int f26115f;

    /* renamed from: g */
    public int f26116g;

    static {
        C7546g gVar = new C7546g();
        f26108h = gVar;
        C62942bv.registerDefaultInstance(C7546g.class, gVar);
    }

    private C7546g() {
        emptyIntList();
        this.f26114e = 1;
        emptyIntList();
        this.f26116g = 1;
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
                return newMessageInfo(f26108h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0005ဌ\u0003\u0007င\u0004\u000bဌ\b", new Object[]{"a", "b", C7540a.f26104a, C45240c.f118157a, C7541b.f26105a, "d", C7891nu.m22888b(), "e", C7544e.f26107a, C10662f.f35572a, C30325g.f82003a, C7543d.f26106a});
            case 3:
                return new C7546g();
            case 4:
                return new C7542c();
            case 5:
                return f26108h;
            case 6:
                C63010eb ebVar = f26109i;
                if (ebVar == null) {
                    synchronized (C7546g.class) {
                        ebVar = f26109i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26108h);
                            f26109i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
