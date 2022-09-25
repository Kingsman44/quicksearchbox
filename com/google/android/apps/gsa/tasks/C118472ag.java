package com.google.android.apps.gsa.tasks;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.tasks.ag */
/* compiled from: PG */
public final class C118472ag extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C118472ag f328819i;

    /* renamed from: k */
    private static volatile C63010eb f328820k;

    /* renamed from: a */
    public int f328821a;

    /* renamed from: b */
    public long f328822b;

    /* renamed from: c */
    public long f328823c;

    /* renamed from: d */
    public int f328824d;

    /* renamed from: e */
    public boolean f328825e;

    /* renamed from: f */
    public boolean f328826f;

    /* renamed from: g */
    public C118476ak f328827g;

    /* renamed from: h */
    public C118468ac f328828h;

    /* renamed from: j */
    private byte f328829j = 2;

    static {
        C118472ag agVar = new C118472ag();
        f328819i = agVar;
        C62942bv.registerDefaultInstance(C118472ag.class, agVar);
    }

    private C118472ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f328829j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f328829j = b;
                return null;
            case 2:
                return newMessageInfo(f328819i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ᐉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", C118469ad.f328818a, "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C118472ag();
            case 4:
                return new C118471af();
            case 5:
                return f328819i;
            case 6:
                C63010eb ebVar = f328820k;
                if (ebVar == null) {
                    synchronized (C118472ag.class) {
                        ebVar = f328820k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f328819i);
                            f328820k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
