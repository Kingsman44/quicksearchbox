package com.google.android.libraries.lens.common.text;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4699e.C62215ba;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.common.text.m */
/* compiled from: PG */
public final class C24137m extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C24137m f65898g;

    /* renamed from: i */
    private static volatile C63010eb f65899i;

    /* renamed from: a */
    public C62971cq f65900a = emptyProtobufList();

    /* renamed from: b */
    public int f65901b;

    /* renamed from: c */
    public int f65902c;

    /* renamed from: d */
    public C62215ba f65903d;

    /* renamed from: e */
    public String f65904e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f65905f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f65906h = 2;

    static {
        C24137m mVar = new C24137m();
        f65898g = mVar;
        C62942bv.registerDefaultInstance(C24137m.class, mVar);
    }

    private C24137m() {
    }

    /* renamed from: a */
    public final void mo29543a() {
        C62971cq cqVar = this.f65900a;
        if (!cqVar.mo58948c()) {
            this.f65900a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f65906h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f65906h = b;
                return null;
            case 2:
                return newMessageInfo(f65898g, "\u0000\u0006\u0000\u0000\u0002\u0007\u0006\u0000\u0001\u0001\u0002\u001b\u0003\f\u0004Љ\u0005Ȉ\u0006Ȉ\u0007\f", new Object[]{"a", C24135k.class, "b", "d", "e", C10662f.f35572a, C45240c.f118157a});
            case 3:
                return new C24137m();
            case 4:
                return new C24136l();
            case 5:
                return f65898g;
            case 6:
                C63010eb ebVar = f65899i;
                if (ebVar == null) {
                    synchronized (C24137m.class) {
                        ebVar = f65899i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f65898g);
                            f65899i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
