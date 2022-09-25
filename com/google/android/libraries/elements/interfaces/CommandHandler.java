package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class CommandHandler {

    /* compiled from: PG */
    final class CppProxy extends CommandHandler {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_run(long j, CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public void run(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback) {
            native_run(this.nativeRef, commandOuterClass$Command, commandRunContext, commandRunCompletionCallback);
        }
    }

    public abstract void run(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);
}
