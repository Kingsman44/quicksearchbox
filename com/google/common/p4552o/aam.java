package com.google.common.p4552o;

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

/* renamed from: com.google.common.o.aam */
/* compiled from: PG */
public final class aam extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final aam f158111n;

    /* renamed from: o */
    private static volatile C63010eb f158112o;

    /* renamed from: a */
    public int f158113a;

    /* renamed from: b */
    public float f158114b;

    /* renamed from: c */
    public float f158115c;

    /* renamed from: d */
    public float f158116d;

    /* renamed from: e */
    public float f158117e;

    /* renamed from: f */
    public float f158118f;

    /* renamed from: g */
    public int f158119g;

    /* renamed from: h */
    public int f158120h;

    /* renamed from: i */
    public int f158121i;

    /* renamed from: j */
    public float f158122j;

    /* renamed from: k */
    public float f158123k;

    /* renamed from: l */
    public float f158124l;

    /* renamed from: m */
    public int f158125m;

    static {
        aam aam = new aam();
        f158111n = aam;
        C62942bv.registerDefaultInstance(aam.class, aam);
    }

    private aam() {
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
                return newMessageInfo(f158111n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tခ\b\nခ\t\u000bခ\n\fင\u000b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m"});
            case 3:
                return new aam();
            case 4:
                return new aal();
            case 5:
                return f158111n;
            case 6:
                C63010eb ebVar = f158112o;
                if (ebVar == null) {
                    synchronized (aam.class) {
                        ebVar = f158112o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158111n);
                            f158112o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
