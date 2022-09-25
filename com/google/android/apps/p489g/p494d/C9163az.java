package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.android.apps.g.d.az */
/* compiled from: PG */
public final class C9163az extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C9163az f31628l;

    /* renamed from: n */
    private static volatile C63010eb f31629n;

    /* renamed from: a */
    public int f31630a;

    /* renamed from: b */
    public C9201cj f31631b;

    /* renamed from: c */
    public boolean f31632c;

    /* renamed from: d */
    public String f31633d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f31634e;

    /* renamed from: f */
    public boolean f31635f;

    /* renamed from: g */
    public int f31636g;

    /* renamed from: h */
    public int f31637h;

    /* renamed from: i */
    public int f31638i;

    /* renamed from: j */
    public int f31639j;

    /* renamed from: k */
    public int f31640k;

    /* renamed from: m */
    private byte f31641m = 2;

    static {
        C9163az azVar = new C9163az();
        f31628l = azVar;
        C62942bv.registerDefaultInstance(C9163az.class, azVar);
    }

    private C9163az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31641m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31641m = b;
                return null;
            case 2:
                return newMessageInfo(f31628l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C9163az();
            case 4:
                return new C9162ay();
            case 5:
                return f31628l;
            case 6:
                C63010eb ebVar = f31629n;
                if (ebVar == null) {
                    synchronized (C9163az.class) {
                        ebVar = f31629n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31628l);
                            f31629n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
