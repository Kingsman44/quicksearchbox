package com.google.android.libraries.assistant.auto.tng.suggestions.p1263k;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3994s.p3995a.C53439ny;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4818b.C63204j;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.k.ai */
/* compiled from: PG */
public final class C16335ai extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C16335ai f48090k;

    /* renamed from: m */
    private static volatile C63010eb f48091m;

    /* renamed from: a */
    public int f48092a;

    /* renamed from: b */
    public C63204j f48093b;

    /* renamed from: c */
    public int f48094c;

    /* renamed from: d */
    public String f48095d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f48096e;

    /* renamed from: f */
    public C62961ch f48097f = emptyIntList();

    /* renamed from: g */
    public C51012dc f48098g;

    /* renamed from: h */
    public C53439ny f48099h;

    /* renamed from: i */
    public C53439ny f48100i;

    /* renamed from: j */
    public int f48101j;

    /* renamed from: l */
    private byte f48102l = 2;

    static {
        C16335ai aiVar = new C16335ai();
        f48090k = aiVar;
        C62942bv.registerDefaultInstance(C16335ai.class, aiVar);
    }

    private C16335ai() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f48102l);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f48102l = b;
                return null;
            case 2:
                return newMessageInfo(f48090k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0002\u0001ᐉ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005'\u0006ᐉ\u0004\u0007ဉ\u0005\bဉ\u0006\tင\u0007", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j"});
            case 3:
                return new C16335ai();
            case 4:
                return new C16334ah();
            case 5:
                return f48090k;
            case 6:
                C63010eb ebVar = f48091m;
                if (ebVar == null) {
                    synchronized (C16335ai.class) {
                        ebVar = f48091m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f48090k);
                            f48091m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
