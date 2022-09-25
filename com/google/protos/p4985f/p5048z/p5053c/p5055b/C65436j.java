package com.google.protos.p4985f.p5048z.p5053c.p5055b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.protos.f.z.c.b.j */
/* compiled from: PG */
public final class C65436j extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C65436j f177876a;

    /* renamed from: i */
    private static volatile C63010eb f177877i;

    /* renamed from: b */
    private int f177878b;

    /* renamed from: c */
    private C63037fb f177879c;

    /* renamed from: d */
    private C62995dn f177880d = C62995dn.f170057a;

    /* renamed from: e */
    private C62995dn f177881e;

    /* renamed from: f */
    private C62995dn f177882f;

    /* renamed from: g */
    private C62995dn f177883g;

    /* renamed from: h */
    private byte f177884h;

    static {
        C65436j jVar = new C65436j();
        f177876a = jVar;
        C62942bv.registerDefaultInstance(C65436j.class, jVar);
    }

    private C65436j() {
        C62995dn dnVar = C62995dn.f170057a;
        this.f177881e = dnVar;
        this.f177882f = dnVar;
        this.f177883g = dnVar;
        this.f177884h = 2;
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyIntList();
        emptyIntList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyLongList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177884h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177884h = b;
                return null;
            case 2:
                return newMessageInfo(f177876a, "\u0001\u0005\u0000\u0001\u000b-\u0005\u0004\u0000\u0000\u000bဉ\u0007\u00162\u001f2$2-2", new Object[]{"b", C45240c.f118157a, "e", C65433g.f177873a, "d", C65432f.f177872a, C10662f.f35572a, C65435i.f177875a, C30325g.f82003a, C65434h.f177874a});
            case 3:
                return new C65436j();
            case 4:
                return new C65427c();
            case 5:
                return f177876a;
            case 6:
                C63010eb ebVar = f177877i;
                if (ebVar == null) {
                    synchronized (C65436j.class) {
                        ebVar = f177877i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177876a);
                            f177877i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
