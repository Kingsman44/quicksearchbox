package com.google.p374ah;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.ah.i */
/* compiled from: PG */
public final class C7507i extends C62937bq implements C62938br {

    /* renamed from: l */
    public static final C7507i f24728l;

    /* renamed from: n */
    private static volatile C63010eb f24729n;

    /* renamed from: a */
    public int f24730a;

    /* renamed from: b */
    public int f24731b;

    /* renamed from: c */
    public C7500b f24732c;

    /* renamed from: d */
    public String f24733d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f24734e;

    /* renamed from: f */
    public long f24735f;

    /* renamed from: g */
    public double f24736g;

    /* renamed from: h */
    public String f24737h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public C7504f f24738i;

    /* renamed from: j */
    public C63088z f24739j = C63088z.f170246b;

    /* renamed from: k */
    public String f24740k = BuildConfig.FLAVOR;

    /* renamed from: m */
    private byte f24741m = 2;

    static {
        C7507i iVar = new C7507i();
        f24728l = iVar;
        C62942bv.registerDefaultInstance(C7507i.class, iVar);
    }

    private C7507i() {
        emptyProtobufList();
        emptyProtobufList();
        emptyLongList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f24741m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f24741m = b;
                return null;
            case 2:
                return newMessageInfo(f24728l, "\u0001\n\u0000\u0001\u0002\u000e\n\u0000\u0000\u0002\u0002ဌ\u0000\u0003ᐉ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007က\u0005\bဈ\u0006\tᐉ\u0007\rည\f\u000eဈ\u000e", new Object[]{"a", "b", C7506h.f24727a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C7507i();
            case 4:
                return new C7505g();
            case 5:
                return f24728l;
            case 6:
                C63010eb ebVar = f24729n;
                if (ebVar == null) {
                    synchronized (C7507i.class) {
                        ebVar = f24729n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f24728l);
                            f24729n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
