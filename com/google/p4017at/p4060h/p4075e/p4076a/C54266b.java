package com.google.p4017at.p4060h.p4075e.p4076a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p5269w.p5270a.C67962d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.e.a.b */
/* compiled from: PG */
public final class C54266b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C54266b f142487i;

    /* renamed from: k */
    private static volatile C63010eb f142488k;

    /* renamed from: a */
    public int f142489a;

    /* renamed from: b */
    public C67962d f142490b;

    /* renamed from: c */
    public C67962d f142491c;

    /* renamed from: d */
    public boolean f142492d;

    /* renamed from: e */
    public String f142493e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public float f142494f;

    /* renamed from: g */
    public String f142495g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f142496h = BuildConfig.FLAVOR;

    /* renamed from: j */
    private byte f142497j = 2;

    static {
        C54266b bVar = new C54266b();
        f142487i = bVar;
        C62942bv.registerDefaultInstance(C54266b.class, bVar);
    }

    private C54266b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142497j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142497j = b;
                return null;
            case 2:
                return newMessageInfo(f142487i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0006ဈ\u0003\u0007ခ\u0004\tဈ\u0006\nဈ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C54266b();
            case 4:
                return new C54263a();
            case 5:
                return f142487i;
            case 6:
                C63010eb ebVar = f142488k;
                if (ebVar == null) {
                    synchronized (C54266b.class) {
                        ebVar = f142488k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142487i);
                            f142488k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
