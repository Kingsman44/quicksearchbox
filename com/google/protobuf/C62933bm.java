package com.google.protobuf;

/* renamed from: com.google.protobuf.bm */
/* compiled from: PG */
final class C62933bm implements C62999dr {

    /* renamed from: a */
    public static final C62933bm f169960a = new C62933bm();

    private C62933bm() {
    }

    /* renamed from: a */
    public final C62998dq mo58867a(Class cls) {
        if (C62942bv.class.isAssignableFrom(cls)) {
            try {
                return (C62998dq) C62942bv.getDefaultInstance(cls.asSubclass(C62942bv.class)).buildMessageInfo();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    /* renamed from: b */
    public final boolean mo58868b(Class cls) {
        return C62942bv.class.isAssignableFrom(cls);
    }
}
