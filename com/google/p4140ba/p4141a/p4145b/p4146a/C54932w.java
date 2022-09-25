package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.w */
/* compiled from: PG */
public final class C54932w extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C54932w f144413i;

    /* renamed from: j */
    private static volatile C63010eb f144414j;

    /* renamed from: a */
    public int f144415a;

    /* renamed from: b */
    public boolean f144416b;

    /* renamed from: c */
    public boolean f144417c;

    /* renamed from: d */
    public float f144418d;

    /* renamed from: e */
    public float f144419e;

    /* renamed from: f */
    public float f144420f;

    /* renamed from: g */
    public float f144421g;

    /* renamed from: h */
    public float f144422h;

    static {
        C54932w wVar = new C54932w();
        f144413i = wVar;
        C62942bv.registerDefaultInstance(C54932w.class, wVar);
    }

    private C54932w() {
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
                return newMessageInfo(f144413i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C54932w();
            case 4:
                return new C54931v();
            case 5:
                return f144413i;
            case 6:
                C63010eb ebVar = f144414j;
                if (ebVar == null) {
                    synchronized (C54932w.class) {
                        ebVar = f144414j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144413i);
                            f144414j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
