package com.google.speech.p5195a.p5196a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import org.tensorflow.p5650a.C72654n;

/* renamed from: com.google.speech.a.a.b */
/* compiled from: PG */
public final class C66422b extends C62937bq implements C62938br {

    /* renamed from: k */
    public static final C66422b f180605k;

    /* renamed from: n */
    private static volatile C63010eb f180606n;

    /* renamed from: a */
    public int f180607a;

    /* renamed from: b */
    public String f180608b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f180609c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f180610d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f180611e;

    /* renamed from: f */
    public String f180612f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f180613g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public int f180614h;

    /* renamed from: i */
    public int f180615i;

    /* renamed from: j */
    public C62971cq f180616j;

    /* renamed from: l */
    private C72654n f180617l;

    /* renamed from: m */
    private byte f180618m = 2;

    static {
        C66422b bVar = new C66422b();
        f180605k = bVar;
        C62942bv.registerDefaultInstance(C66422b.class, bVar);
    }

    private C66422b() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        this.f180616j = emptyProtobufList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo59625a() {
        C62971cq cqVar = this.f180616j;
        if (!cqVar.mo58948c()) {
            this.f180616j = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180618m);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180618m = b;
                return null;
            case 2:
                return newMessageInfo(f180605k, "\u0001\n\u0000\u0001\u0001\u001d\n\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\bင\u0007\u0016Л\u001dဉ\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C66446z.class, "l"});
            case 3:
                return new C66422b();
            case 4:
                return new C66421a();
            case 5:
                return f180605k;
            case 6:
                C63010eb ebVar = f180606n;
                if (ebVar == null) {
                    synchronized (C66422b.class) {
                        ebVar = f180606n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180605k);
                            f180606n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
