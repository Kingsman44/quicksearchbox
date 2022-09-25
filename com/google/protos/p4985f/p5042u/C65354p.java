package com.google.protos.p4985f.p5042u;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4892au.C63830h;

/* renamed from: com.google.protos.f.u.p */
/* compiled from: PG */
public final class C65354p extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C65354p f177734g;

    /* renamed from: i */
    private static volatile C63010eb f177735i;

    /* renamed from: a */
    public int f177736a;

    /* renamed from: b */
    public int f177737b = 0;

    /* renamed from: c */
    public Object f177738c;

    /* renamed from: d */
    public String f177739d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f177740e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C65356r f177741f;

    /* renamed from: h */
    private byte f177742h = 2;

    static {
        C65354p pVar = new C65354p();
        f177734g = pVar;
        C62942bv.registerDefaultInstance(C65354p.class, pVar);
    }

    private C65354p() {
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177742h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177742h = b;
                return null;
            case 2:
                return newMessageInfo(f177734g, "\u0001\u0007\u0001\u0001\u0001(\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0003ဈ\u000b\u0005ြ\u0000\bᐼ\u0000\u001eᐉ\u001f'ြ\u0000(ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C63830h.class, C65351m.class, C10662f.f35572a, C65349k.class, C65353o.class});
            case 3:
                return new C65354p();
            case 4:
                return new C65347i();
            case 5:
                return f177734g;
            case 6:
                C63010eb ebVar = f177735i;
                if (ebVar == null) {
                    synchronized (C65354p.class) {
                        ebVar = f177735i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177734g);
                            f177735i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
