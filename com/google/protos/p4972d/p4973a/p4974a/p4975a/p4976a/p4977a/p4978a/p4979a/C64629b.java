package com.google.protos.p4972d.p4973a.p4974a.p4975a.p4976a.p4977a.p4978a.p4979a;

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
import com.google.protos.p5146w.p5147a.p5148a.C65930h;

/* renamed from: com.google.protos.d.a.a.a.a.a.a.a.b */
/* compiled from: PG */
public final class C64629b extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C64629b f175186i;

    /* renamed from: k */
    private static volatile C63010eb f175187k;

    /* renamed from: a */
    public int f175188a;

    /* renamed from: b */
    public C65930h f175189b;

    /* renamed from: c */
    public int f175190c;

    /* renamed from: d */
    public String f175191d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f175192e;

    /* renamed from: f */
    public boolean f175193f;

    /* renamed from: g */
    public boolean f175194g;

    /* renamed from: h */
    public boolean f175195h;

    /* renamed from: j */
    private byte f175196j = 2;

    static {
        C64629b bVar = new C64629b();
        f175186i = bVar;
        C62942bv.registerDefaultInstance(C64629b.class, bVar);
    }

    private C64629b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175196j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175196j = b;
                return null;
            case 2:
                return newMessageInfo(f175186i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C64629b();
            case 4:
                return new C64628a();
            case 5:
                return f175186i;
            case 6:
                C63010eb ebVar = f175187k;
                if (ebVar == null) {
                    synchronized (C64629b.class) {
                        ebVar = f175187k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175186i);
                            f175187k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
