package com.google.lens.p4699e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62472cv;
import com.google.lens.p4707j.C62474cx;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.be */
/* compiled from: PG */
public final class C62219be extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C62219be f167986j;

    /* renamed from: l */
    private static volatile C63010eb f167987l;

    /* renamed from: a */
    public int f167988a;

    /* renamed from: b */
    public C62215ba f167989b;

    /* renamed from: c */
    public String f167990c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f167991d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f167992e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C62971cq f167993f = emptyProtobufList();

    /* renamed from: g */
    public int f167994g;

    /* renamed from: h */
    public int f167995h;

    /* renamed from: i */
    public int f167996i;

    /* renamed from: k */
    private byte f167997k = 2;

    static {
        C62219be beVar = new C62219be();
        f167986j = beVar;
        C62942bv.registerDefaultInstance(C62219be.class, beVar);
    }

    private C62219be() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167997k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167997k = b;
                return null;
            case 2:
                return newMessageInfo(f167986j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005\u001b\u0006ဌ\u0004\u0007ဌ\u0005\bဌ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C62210aw.class, C30325g.f82003a, C62216bb.f167979a, C19618h.f54585a, C62474cx.f168681a, "i", C62472cv.f168680a});
            case 3:
                return new C62219be();
            case 4:
                return new C62206as();
            case 5:
                return f167986j;
            case 6:
                C63010eb ebVar = f167987l;
                if (ebVar == null) {
                    synchronized (C62219be.class) {
                        ebVar = f167987l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167986j);
                            f167987l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
