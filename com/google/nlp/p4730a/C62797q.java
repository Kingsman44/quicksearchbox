package com.google.nlp.p4730a;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p4988b.p4995e.C64801a;

/* renamed from: com.google.nlp.a.q */
/* compiled from: PG */
public final class C62797q extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C62797q f169576g;

    /* renamed from: l */
    private static volatile C63010eb f169577l;

    /* renamed from: a */
    public int f169578a;

    /* renamed from: b */
    public int f169579b;

    /* renamed from: c */
    public int f169580c;

    /* renamed from: d */
    public boolean f169581d;

    /* renamed from: e */
    public C62787g f169582e;

    /* renamed from: f */
    public boolean f169583f = true;

    /* renamed from: h */
    private C61752n f169584h;

    /* renamed from: i */
    private C62793m f169585i;

    /* renamed from: j */
    private C62793m f169586j;

    /* renamed from: k */
    private byte f169587k = 2;

    static {
        C62797q qVar = new C62797q();
        f169576g = qVar;
        C62942bv.registerDefaultInstance(C62797q.class, qVar);
    }

    private C62797q() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169587k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f169587k = b;
                return null;
            case 2:
                return newMessageInfo(f169576g, "\u0001\b\u0000\u0001\u0004*\b\u0000\u0000\u0003\u0004ဇ\u0005\bဇ\u000b\u0012ဌ\u0001\u0014ᐉ\u0011\u0015ᐉ\u0013\u0018ဌ\u0002 ဉ\n*ᐉ\f", new Object[]{"a", "d", C10662f.f35572a, "b", C64801a.f175617a, "i", "j", C45240c.f118157a, C52431rm.m86629c(), "e", C19618h.f54585a});
            case 3:
                return new C62797q();
            case 4:
                return new C62796p();
            case 5:
                return f169576g;
            case 6:
                C63010eb ebVar = f169577l;
                if (ebVar == null) {
                    synchronized (C62797q.class) {
                        ebVar = f169577l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169576g);
                            f169577l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
