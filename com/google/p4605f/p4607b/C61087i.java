package com.google.p4605f.p4607b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.protos.p5064h.C65456d;
import com.google.protos.p5064h.C65460h;
import com.google.protos.p5064h.C65469q;

/* renamed from: com.google.f.b.i */
/* compiled from: PG */
public final class C61087i extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C61087i f165376a;

    /* renamed from: j */
    private static volatile C63010eb f165377j;

    /* renamed from: b */
    private int f165378b;

    /* renamed from: c */
    private C52081en f165379c;

    /* renamed from: d */
    private C65456d f165380d;

    /* renamed from: e */
    private C62995dn f165381e = C62995dn.f170057a;

    /* renamed from: f */
    private C65460h f165382f;

    /* renamed from: g */
    private C65469q f165383g;

    /* renamed from: h */
    private C61086h f165384h;

    /* renamed from: i */
    private byte f165385i = 2;

    static {
        C61087i iVar = new C61087i();
        f165376a = iVar;
        C62942bv.registerDefaultInstance(C61087i.class, iVar);
    }

    private C61087i() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f165385i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f165385i = b;
                return null;
            case 2:
                return newMessageInfo(f165376a, "\u0001\u0006\u0000\u0001\u0007\u001e\u0006\u0001\u0000\u0003\u0007ဉ\u0001\fᐉ\u0004\u0013ဉ\t\u00162\u0019ᐉ\r\u001eᐉ\u0010", new Object[]{"b", C45240c.f118157a, "d", C10662f.f35572a, "e", C61084f.f165370a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C61087i();
            case 4:
                return new C61083e();
            case 5:
                return f165376a;
            case 6:
                C63010eb ebVar = f165377j;
                if (ebVar == null) {
                    synchronized (C61087i.class) {
                        ebVar = f165377j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f165376a);
                            f165377j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
