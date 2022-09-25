package com.google.protos.p4850an.p4853b;

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

/* renamed from: com.google.protos.an.b.b */
/* compiled from: PG */
public final class C63358b extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C63358b f171216l;

    /* renamed from: n */
    private static volatile C63010eb f171217n;

    /* renamed from: a */
    public int f171218a;

    /* renamed from: b */
    public int f171219b;

    /* renamed from: c */
    public int f171220c;

    /* renamed from: d */
    public int f171221d;

    /* renamed from: e */
    public int f171222e;

    /* renamed from: f */
    public int f171223f;

    /* renamed from: g */
    public int f171224g;

    /* renamed from: h */
    public String f171225h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C63365i f171226i;

    /* renamed from: j */
    public int f171227j;

    /* renamed from: k */
    public int f171228k;

    /* renamed from: m */
    private byte f171229m = 2;

    static {
        C63358b bVar = new C63358b();
        f171216l = bVar;
        C62942bv.registerDefaultInstance(C63358b.class, bVar);
    }

    private C63358b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171229m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171229m = b;
                return null;
            case 2:
                return newMessageInfo(f171216l, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\u0001\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002\u0005င\u0004\u0006င\u0005\u0007င\u0006\nဈ\t\fᐉ\n\rဌ\u000b\u000eဌ\f", new Object[]{"a", "b", C45240c.f118157a, C63377u.f171275a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C63375s.f171273a, C19621k.f54601a, C63376t.f171274a});
            case 3:
                return new C63358b();
            case 4:
                return new C63357a();
            case 5:
                return f171216l;
            case 6:
                C63010eb ebVar = f171217n;
                if (ebVar == null) {
                    synchronized (C63358b.class) {
                        ebVar = f171217n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171216l);
                            f171217n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
