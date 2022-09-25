package com.facebook.yoga;

/* renamed from: com.facebook.yoga.l */
/* compiled from: PG */
public final class C6576l extends YogaNodeJNIBase {
    public C6576l() {
        super(YogaNative.jni_YGNodeNewJNI());
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            long j = this.f19543a;
            if (j != 0) {
                this.f19543a = 0;
                YogaNative.jni_YGNodeFreeJNI(j);
            }
        } finally {
            super.finalize();
        }
    }

    public C6576l(C6566b bVar) {
        super(YogaNative.jni_YGNodeNewWithConfigJNI(((C6567c) bVar).f19558a));
    }
}
