package com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.engine.y.e.a.cg */
/* compiled from: PG */
public final class C79986cg extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C79986cg f219412i;

    /* renamed from: j */
    private static volatile C63010eb f219413j;

    /* renamed from: a */
    public int f219414a;

    /* renamed from: b */
    public C79984ce f219415b;

    /* renamed from: c */
    public C79980ca f219416c;

    /* renamed from: d */
    public C79980ca f219417d;

    /* renamed from: e */
    public C79980ca f219418e;

    /* renamed from: f */
    public C79980ca f219419f;

    /* renamed from: g */
    public C79980ca f219420g;

    /* renamed from: h */
    public C79980ca f219421h;

    static {
        C79986cg cgVar = new C79986cg();
        f219412i = cgVar;
        C62942bv.registerDefaultInstance(C79986cg.class, cgVar);
    }

    private C79986cg() {
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
                return newMessageInfo(f219412i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C79986cg();
            case 4:
                return new C79985cf();
            case 5:
                return f219412i;
            case 6:
                C63010eb ebVar = f219413j;
                if (ebVar == null) {
                    synchronized (C79986cg.class) {
                        ebVar = f219413j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219412i);
                            f219413j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
