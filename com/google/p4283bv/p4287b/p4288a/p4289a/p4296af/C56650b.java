package com.google.p4283bv.p4287b.p4288a.p4289a.p4296af;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4283bv.p4287b.p4342b.C56943g;
import com.google.p4283bv.p4380j.p4385b.p4411b.C57827x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.a.a.af.b */
/* compiled from: PG */
public final class C56650b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56650b f151234d;

    /* renamed from: g */
    private static volatile C63010eb f151235g;

    /* renamed from: a */
    public int f151236a = 0;

    /* renamed from: b */
    public Object f151237b;

    /* renamed from: c */
    public boolean f151238c;

    /* renamed from: e */
    private int f151239e;

    /* renamed from: f */
    private byte f151240f = 2;

    static {
        C56650b bVar = new C56650b();
        f151234d = bVar;
        C62942bv.registerDefaultInstance(C56650b.class, bVar);
    }

    private C56650b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151240f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f151240f = b;
                return null;
            case 2:
                return newMessageInfo(f151234d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ြ\u0000\u0002ဇ\u0002\u0003ᐼ\u0000", new Object[]{"b", "a", "e", C56943g.class, C45240c.f118157a, C57827x.class});
            case 3:
                return new C56650b();
            case 4:
                return new C56649a();
            case 5:
                return f151234d;
            case 6:
                C63010eb ebVar = f151235g;
                if (ebVar == null) {
                    synchronized (C56650b.class) {
                        ebVar = f151235g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151234d);
                            f151235g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
