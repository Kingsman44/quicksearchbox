package com.google.android.libraries.assistant.p1594s.p1599c;

import com.google.android.libraries.assistant.p1594s.p1600d.p1601a.C19222f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.c.b */
/* compiled from: PG */
public final class C19200b extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19200b f53754f;

    /* renamed from: h */
    private static volatile C63010eb f53755h;

    /* renamed from: a */
    public int f53756a;

    /* renamed from: b */
    public C62961ch f53757b;

    /* renamed from: c */
    public C19222f f53758c;

    /* renamed from: d */
    public C19213o f53759d;

    /* renamed from: e */
    public C19208j f53760e;

    /* renamed from: g */
    private byte f53761g = 2;

    static {
        C19200b bVar = new C19200b();
        f53754f = bVar;
        C62942bv.registerDefaultInstance(C19200b.class, bVar);
    }

    private C19200b() {
        emptyIntList();
        this.f53757b = emptyIntList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f53761g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f53761g = b;
                return null;
            case 2:
                return newMessageInfo(f53754f, "\u0001\u0004\u0000\u0001 g\u0004\u0000\u0001\u0001 \u0016eᐉ\u0006fဉ\u0007gဉ\b", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C19200b();
            case 4:
                return new C19199a();
            case 5:
                return f53754f;
            case 6:
                C63010eb ebVar = f53755h;
                if (ebVar == null) {
                    synchronized (C19200b.class) {
                        ebVar = f53755h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53754f);
                            f53755h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
