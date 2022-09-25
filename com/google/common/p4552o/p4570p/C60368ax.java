package com.google.common.p4552o.p4570p;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.p.ax */
/* compiled from: PG */
public final class C60368ax extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C60368ax f163383j;

    /* renamed from: k */
    private static volatile C63010eb f163384k;

    /* renamed from: a */
    public int f163385a;

    /* renamed from: b */
    public String f163386b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f163387c;

    /* renamed from: d */
    public C60373bb f163388d;

    /* renamed from: e */
    public C60381bj f163389e;

    /* renamed from: f */
    public String f163390f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f163391g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public C60365au f163392h;

    /* renamed from: i */
    public C60362ar f163393i;

    static {
        C60368ax axVar = new C60368ax();
        f163383j = axVar;
        C62942bv.registerDefaultInstance(C60368ax.class, axVar);
    }

    private C60368ax() {
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
                return newMessageInfo(f163383j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0006ဈ\u0005\u0007ဈ\u0006\bဉ\u0007\tဉ\b", new Object[]{"a", "b", C45240c.f118157a, C60366av.f163382a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i"});
            case 3:
                return new C60368ax();
            case 4:
                return new C60363as();
            case 5:
                return f163383j;
            case 6:
                C63010eb ebVar = f163384k;
                if (ebVar == null) {
                    synchronized (C60368ax.class) {
                        ebVar = f163384k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163383j);
                            f163384k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
