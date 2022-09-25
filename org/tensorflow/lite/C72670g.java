package org.tensorflow.lite;

/* renamed from: org.tensorflow.lite.g */
/* compiled from: PG */
public class C72670g implements C72669f {

    /* renamed from: a */
    public NativeInterpreterWrapper f193259a;

    public C72670g(NativeInterpreterWrapper nativeInterpreterWrapper) {
        this.f193259a = nativeInterpreterWrapper;
    }

    /* renamed from: a */
    public final void mo64502a() {
        if (this.f193259a == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    public final void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f193259a;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.f193259a = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
