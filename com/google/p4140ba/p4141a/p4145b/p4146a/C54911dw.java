package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.dw */
/* compiled from: PG */
public final class C54911dw extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C54911dw f144322l;

    /* renamed from: m */
    private static volatile C63010eb f144323m;

    /* renamed from: a */
    public int f144324a;

    /* renamed from: b */
    public float f144325b;

    /* renamed from: c */
    public float f144326c;

    /* renamed from: d */
    public float f144327d;

    /* renamed from: e */
    public float f144328e;

    /* renamed from: f */
    public float f144329f;

    /* renamed from: g */
    public float f144330g;

    /* renamed from: h */
    public float f144331h;

    /* renamed from: i */
    public float f144332i;

    /* renamed from: j */
    public float f144333j;

    /* renamed from: k */
    public float f144334k;

    static {
        C54911dw dwVar = new C54911dw();
        f144322l = dwVar;
        C62942bv.registerDefaultInstance(C54911dw.class, dwVar);
    }

    private C54911dw() {
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
                return newMessageInfo(f144322l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C54911dw();
            case 4:
                return new C54910dv();
            case 5:
                return f144322l;
            case 6:
                C63010eb ebVar = f144323m;
                if (ebVar == null) {
                    synchronized (C54911dw.class) {
                        ebVar = f144323m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144322l);
                            f144323m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
