package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.s */
/* compiled from: PG */
public final class C13543s extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f41497c = new C13534j();

    /* renamed from: e */
    public static final C62962ci f41498e = new C13535k();

    /* renamed from: h */
    public static final C62962ci f41499h = new C13536l();

    /* renamed from: j */
    public static final C13543s f41500j;

    /* renamed from: k */
    private static volatile C63010eb f41501k;

    /* renamed from: a */
    public C62971cq f41502a = emptyProtobufList();

    /* renamed from: b */
    public C62961ch f41503b = emptyIntList();

    /* renamed from: d */
    public C62961ch f41504d = emptyIntList();

    /* renamed from: f */
    public C62995dn f41505f = C62995dn.f170057a;

    /* renamed from: g */
    public C62961ch f41506g = emptyIntList();

    /* renamed from: i */
    public C62971cq f41507i = emptyProtobufList();

    static {
        C13543s sVar = new C13543s();
        f41500j = sVar;
        C62942bv.registerDefaultInstance(C13543s.class, sVar);
    }

    private C13543s() {
    }

    /* renamed from: a */
    public final void mo21159a() {
        C62961ch chVar = this.f41503b;
        if (!chVar.mo58948c()) {
            this.f41503b = C62942bv.mutableCopy(chVar);
        }
    }

    /* renamed from: b */
    public final void mo21160b() {
        C62961ch chVar = this.f41506g;
        if (!chVar.mo58948c()) {
            this.f41506g = C62942bv.mutableCopy(chVar);
        }
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
                return newMessageInfo(f41500j, "\u0000\u0006\u0000\u0000\u0001\u000b\u0006\u0001\u0005\u0000\u0001\u001b\u00062\b,\t\u001b\n,\u000b,", new Object[]{"a", C13541q.class, C10662f.f35572a, C13542r.f41496a, C30325g.f82003a, "i", C13539o.class, "b", "d"});
            case 3:
                return new C13543s();
            case 4:
                return new C13537m();
            case 5:
                return f41500j;
            case 6:
                C63010eb ebVar = f41501k;
                if (ebVar == null) {
                    synchronized (C13543s.class) {
                        ebVar = f41501k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f41500j);
                            f41501k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
