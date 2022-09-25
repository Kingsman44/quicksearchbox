package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.z */
/* compiled from: PG */
public final class C55423z extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C55423z f146231g;

    /* renamed from: i */
    private static volatile C63010eb f146232i;

    /* renamed from: a */
    public int f146233a;

    /* renamed from: b */
    public String f146234b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f146235c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f146236d = emptyProtobufList();

    /* renamed from: e */
    public C62971cq f146237e = emptyProtobufList();

    /* renamed from: f */
    public String f146238f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f146239h = 2;

    static {
        C55423z zVar = new C55423z();
        f146231g = zVar;
        C62942bv.registerDefaultInstance(C55423z.class, zVar);
    }

    private C55423z() {
    }

    /* renamed from: a */
    public final void mo54258a() {
        C62971cq cqVar = this.f146235c;
        if (!cqVar.mo58948c()) {
            this.f146235c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f146239h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f146239h = b;
                return null;
            case 2:
                return newMessageInfo(f146231g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001b\u0003\u001b\u0004ဈ\u0002\u0005\u001b", new Object[]{"a", "b", C45240c.f118157a, C54954al.class, "d", C54952aj.class, C10662f.f35572a, "e", C54956an.class});
            case 3:
                return new C55423z();
            case 4:
                return new C55422y();
            case 5:
                return f146231g;
            case 6:
                C63010eb ebVar = f146232i;
                if (ebVar == null) {
                    synchronized (C55423z.class) {
                        ebVar = f146232i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f146231g);
                            f146232i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
