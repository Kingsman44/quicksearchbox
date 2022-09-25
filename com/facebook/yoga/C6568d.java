package com.facebook.yoga;

/* renamed from: com.facebook.yoga.d */
/* compiled from: PG */
public final class C6568d extends C6567c {
    public C6568d() {
        super(YogaNative.jni_YGConfigNewJNI());
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            long j = this.f19558a;
            if (j != 0) {
                this.f19558a = 0;
                YogaNative.jni_YGConfigFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }
}
