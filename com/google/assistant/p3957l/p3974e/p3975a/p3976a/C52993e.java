package com.google.assistant.p3957l.p3974e.p3975a.p3976a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.l.e.a.a.e */
/* compiled from: PG */
public final class C52993e extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C62962ci f138911h = new C52991c();

    /* renamed from: i */
    public static final C52993e f138912i;

    /* renamed from: k */
    private static volatile C63010eb f138913k;

    /* renamed from: a */
    public String f138914a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f138915b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f138916c;

    /* renamed from: d */
    public boolean f138917d;

    /* renamed from: e */
    public C62971cq f138918e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public boolean f138919f;

    /* renamed from: g */
    public C62961ch f138920g = emptyIntList();

    /* renamed from: j */
    private int f138921j;

    static {
        C52993e eVar = new C52993e();
        f138912i = eVar;
        C62942bv.registerDefaultInstance(C52993e.class, eVar);
    }

    private C52993e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f138912i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001\u0004ဇ\u0002\u0005\u001a\u0006ဇ\u0003\u0007,", new Object[]{"j", "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C52990b.m86766b()});
            case 3:
                return new C52993e();
            case 4:
                return new C52992d();
            case 5:
                return f138912i;
            case 6:
                C63010eb ebVar = f138913k;
                if (ebVar == null) {
                    synchronized (C52993e.class) {
                        ebVar = f138913k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138912i);
                            f138913k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
