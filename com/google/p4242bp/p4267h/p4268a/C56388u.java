package com.google.p4242bp.p4267h.p4268a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.p4242bp.p4267h.C56394af;
import com.google.p5277z.p5282c.C68032v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bp.h.a.u */
/* compiled from: PG */
public final class C56388u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62962ci f150374c = new C56380m();

    /* renamed from: h */
    public static final C56388u f150375h;

    /* renamed from: i */
    public static final C62940bt f150376i;

    /* renamed from: l */
    private static volatile C63010eb f150377l;

    /* renamed from: a */
    public int f150378a;

    /* renamed from: b */
    public C62961ch f150379b = emptyIntList();

    /* renamed from: d */
    public C62995dn f150380d = C62995dn.f170057a;

    /* renamed from: e */
    public C68032v f150381e;

    /* renamed from: f */
    public int f150382f;

    /* renamed from: g */
    public boolean f150383g;

    /* renamed from: j */
    private C62995dn f150384j = C62995dn.f170057a;

    /* renamed from: k */
    private byte f150385k = 2;

    static {
        C56388u uVar = new C56388u();
        f150375h = uVar;
        C62942bv.registerDefaultInstance(C56388u.class, uVar);
        f150376i = C62942bv.newSingularGeneratedExtension(C56394af.f150399g, uVar, uVar, (C62958ce) null, 109594883, C63066gd.MESSAGE, C56388u.class);
    }

    private C56388u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150385k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150385k = b;
                return null;
            case 2:
                return newMessageInfo(f150375h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0002\u0001\u0003\u0001\u001e\u0002в\u0003ᐉ\u0000\u0004ဌ\u0001\u0005ဇ\u0002\u0006в", new Object[]{"a", "b", C56385r.m87983b(), "d", C56381n.f150357a, "e", C10662f.f35572a, C56386s.f150373a, C30325g.f82003a, "j", C56383p.f150358a});
            case 3:
                return new C56388u();
            case 4:
                return new C56382o();
            case 5:
                return f150375h;
            case 6:
                C63010eb ebVar = f150377l;
                if (ebVar == null) {
                    synchronized (C56388u.class) {
                        ebVar = f150377l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150375h);
                            f150377l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
