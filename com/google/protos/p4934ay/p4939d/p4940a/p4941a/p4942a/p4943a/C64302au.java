package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3863av.p3871d.p3872a.C50564f;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5048z.p5053c.p5054a.C65405c;
import com.google.protos.p4985f.p5048z.p5053c.p5054a.C65408f;
import com.google.protos.p4985f.p5048z.p5053c.p5055b.p5058b.C65426b;

/* renamed from: com.google.protos.ay.d.a.a.a.a.au */
/* compiled from: PG */
public final class C64302au extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C64302au f173853h;

    /* renamed from: l */
    private static volatile C63010eb f173854l;

    /* renamed from: a */
    public int f173855a;

    /* renamed from: b */
    public C62971cq f173856b = emptyProtobufList();

    /* renamed from: c */
    public String f173857c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f173858d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C65426b f173859e;

    /* renamed from: f */
    public C65405c f173860f;

    /* renamed from: g */
    public C65408f f173861g;

    /* renamed from: i */
    private C50564f f173862i;

    /* renamed from: j */
    private C51715bm f173863j;

    /* renamed from: k */
    private byte f173864k = 2;

    static {
        C64302au auVar = new C64302au();
        f173853h = auVar;
        C62942bv.registerDefaultInstance(C64302au.class, auVar);
    }

    private C64302au() {
    }

    /* renamed from: a */
    public final void mo59270a() {
        C62971cq cqVar = this.f173856b;
        if (!cqVar.mo58948c()) {
            this.f173856b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173864k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173864k = b;
                return null;
            case 2:
                return newMessageInfo(f173853h, "\u0001\b\u0000\u0001\u0001\u0014\b\u0000\u0001\u0003\u0001\u001b\u0002ဈ\u0000\u0003ဈ\u0001\u0006ဉ\u0006\tᐉ\t\nဉ\u000b\fᐉ\u0007\u0014ᐉ\n", new Object[]{"a", "b", C64289ah.class, C45240c.f118157a, "d", "e", "j", C30325g.f82003a, "i", C10662f.f35572a});
            case 3:
                return new C64302au();
            case 4:
                return new C64301at();
            case 5:
                return f173853h;
            case 6:
                C63010eb ebVar = f173854l;
                if (ebVar == null) {
                    synchronized (C64302au.class) {
                        ebVar = f173854l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173853h);
                            f173854l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
