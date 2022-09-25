package com.google.android.apps.gsa.nga.shared.p6275aa.p6289k.p6291b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.recognizer.p5233a.C67442ak;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.k.b.i */
/* compiled from: PG */
public final class C80484i extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C80484i f220937h;

    /* renamed from: j */
    private static volatile C63010eb f220938j;

    /* renamed from: a */
    public String f220939a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f220940b;

    /* renamed from: c */
    public C67442ak f220941c;

    /* renamed from: d */
    public int f220942d;

    /* renamed from: e */
    public C62971cq f220943e = emptyProtobufList();

    /* renamed from: f */
    public int f220944f;

    /* renamed from: g */
    public String f220945g = BuildConfig.FLAVOR;

    /* renamed from: i */
    private byte f220946i = 2;

    static {
        C80484i iVar = new C80484i();
        f220937h = iVar;
        C62942bv.registerDefaultInstance(C80484i.class, iVar);
    }

    private C80484i() {
    }

    /* renamed from: a */
    public final void mo74341a() {
        C62971cq cqVar = this.f220943e;
        if (!cqVar.mo58948c()) {
            this.f220943e = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220946i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220946i = b;
                return null;
            case 2:
                return newMessageInfo(f220937h, "\u0000\u0007\u0000\u0000\u0001\t\u0007\u0000\u0001\u0001\u0001Ȉ\u0003Љ\u0005\u001b\u0006\f\u0007Ȉ\b\f\t\u0002", new Object[]{"a", C45240c.f118157a, "e", C80483h.class, C10662f.f35572a, C30325g.f82003a, "d", "b"});
            case 3:
                return new C80484i();
            case 4:
                return new C80476a();
            case 5:
                return f220937h;
            case 6:
                C63010eb ebVar = f220938j;
                if (ebVar == null) {
                    synchronized (C80484i.class) {
                        ebVar = f220938j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220937h);
                            f220938j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
