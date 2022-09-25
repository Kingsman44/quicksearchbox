package com.google.p4283bv.p4354e.p4356b.p4358b.p4359a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.a.ab */
/* compiled from: PG */
public final class C57060ab extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C57060ab f152318h;

    /* renamed from: j */
    private static volatile C63010eb f152319j;

    /* renamed from: a */
    public int f152320a;

    /* renamed from: b */
    public int f152321b = 0;

    /* renamed from: c */
    public Object f152322c;

    /* renamed from: d */
    public boolean f152323d;

    /* renamed from: e */
    public int f152324e;

    /* renamed from: f */
    public int f152325f;

    /* renamed from: g */
    public String f152326g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private byte f152327i = 2;

    static {
        C57060ab abVar = new C57060ab();
        f152318h = abVar;
        C62942bv.registerDefaultInstance(C57060ab.class, abVar);
    }

    private C57060ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f152327i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f152327i = b;
                return null;
            case 2:
                return newMessageInfo(f152318h, "\u0001\u0006\u0001\u0001\u0002\b\u0006\u0000\u0000\u0001\u0002ျ\u0000\u0003ᐼ\u0000\u0005ဇ\u0002\u0006ဌ\u0003\u0007င\u0004\bဈ\u0005", new Object[]{C45240c.f118157a, "b", "a", C53842b.class, "d", "e", C57111z.f152459a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C57060ab();
            case 4:
                return new C57110y();
            case 5:
                return f152318h;
            case 6:
                C63010eb ebVar = f152319j;
                if (ebVar == null) {
                    synchronized (C57060ab.class) {
                        ebVar = f152319j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152318h);
                            f152319j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
