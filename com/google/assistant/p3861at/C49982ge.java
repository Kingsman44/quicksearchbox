package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3562ao.p3570b.p3571a.p3572a.p3573a.C45593d;
import com.google.p4017at.p4018a.p4019a.p4020a.C53777bh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.ge */
/* compiled from: PG */
public final class C49982ge extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49982ge f129927g;

    /* renamed from: i */
    private static volatile C63010eb f129928i;

    /* renamed from: a */
    public C49981gd f129929a;

    /* renamed from: b */
    public C49978ga f129930b;

    /* renamed from: c */
    public String f129931c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f129932d;

    /* renamed from: e */
    public int f129933e;

    /* renamed from: f */
    public int f129934f;

    /* renamed from: h */
    private int f129935h;

    static {
        C49982ge geVar = new C49982ge();
        f129927g = geVar;
        C62942bv.registerDefaultInstance(C49982ge.class, geVar);
    }

    private C49982ge() {
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
                return newMessageInfo(f129927g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ဌ\u0005", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", C45593d.m81282b(), "e", C53777bh.f141155a, C10662f.f35572a, C49983gf.f129936a});
            case 3:
                return new C49982ge();
            case 4:
                return new C49979gb();
            case 5:
                return f129927g;
            case 6:
                C63010eb ebVar = f129928i;
                if (ebVar == null) {
                    synchronized (C49982ge.class) {
                        ebVar = f129928i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129927g);
                            f129928i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
