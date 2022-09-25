package com.google.assistant.p3781ad.p3789d;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79982cc;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54814ag;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.aj */
/* compiled from: PG */
public final class C48576aj extends C62937bq implements C62938br {

    /* renamed from: h */
    public static final C48576aj f125494h;

    /* renamed from: k */
    private static volatile C63010eb f125495k;

    /* renamed from: a */
    public int f125496a;

    /* renamed from: b */
    public int f125497b;

    /* renamed from: c */
    public int f125498c;

    /* renamed from: d */
    public C54814ag f125499d;

    /* renamed from: e */
    public C48570ad f125500e;

    /* renamed from: f */
    public C79982cc f125501f;

    /* renamed from: g */
    public float f125502g;

    /* renamed from: i */
    private C48568ab f125503i;

    /* renamed from: j */
    private byte f125504j = 2;

    static {
        C48576aj ajVar = new C48576aj();
        f125494h = ajVar;
        C62942bv.registerDefaultInstance(C48576aj.class, ajVar);
    }

    private C48576aj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125504j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f125504j = b;
                return null;
            case 2:
                return newMessageInfo(f125494h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0003\u0003ဉ\u0004\u0004ဌ\u0001\u0005ဉ\u0005\u0006ခ\u0006\u0007ဉ\u0002", new Object[]{"a", "b", C48572af.f125487a, "e", "i", C45240c.f118157a, C48575ai.m85238b(), C10662f.f35572a, C30325g.f82003a, "d"});
            case 3:
                return new C48576aj();
            case 4:
                return new C48571ae();
            case 5:
                return f125494h;
            case 6:
                C63010eb ebVar = f125495k;
                if (ebVar == null) {
                    synchronized (C48576aj.class) {
                        ebVar = f125495k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125494h);
                            f125495k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
