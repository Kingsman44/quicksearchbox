package com.google.android.libraries.assistant.auto.ondevice.utils.p715a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.p4855d.p4856a.C63442ab;
import com.google.protos.p4850an.p4855d.p4856a.C63446af;
import com.google.protos.p4850an.p4855d.p4856a.C63457j;
import com.google.protos.p4850an.p4855d.p4856a.C63463p;
import com.google.protos.p4985f.p4988b.p4993d.C64782b;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.a.d */
/* compiled from: PG */
public final class C11936d extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C11936d f38336i;

    /* renamed from: k */
    private static volatile C63010eb f38337k;

    /* renamed from: a */
    public int f38338a;

    /* renamed from: b */
    public C55093fp f38339b;

    /* renamed from: c */
    public C63442ab f38340c;

    /* renamed from: d */
    public C64782b f38341d;

    /* renamed from: e */
    public boolean f38342e;

    /* renamed from: f */
    public C62971cq f38343f = emptyProtobufList();

    /* renamed from: g */
    public C62971cq f38344g = emptyProtobufList();

    /* renamed from: h */
    public C63463p f38345h;

    /* renamed from: j */
    private byte f38346j = 2;

    static {
        C11936d dVar = new C11936d();
        f38336i = dVar;
        C62942bv.registerDefaultInstance(C11936d.class, dVar);
    }

    private C11936d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f38346j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f38346j = b;
                return null;
            case 2:
                return newMessageInfo(f38336i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005Л\u0006\u001b\u0007ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C63446af.class, C30325g.f82003a, C63457j.class, C19618h.f54585a});
            case 3:
                return new C11936d();
            case 4:
                return new C11935c();
            case 5:
                return f38336i;
            case 6:
                C63010eb ebVar = f38337k;
                if (ebVar == null) {
                    synchronized (C11936d.class) {
                        ebVar = f38337k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38336i);
                            f38337k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
