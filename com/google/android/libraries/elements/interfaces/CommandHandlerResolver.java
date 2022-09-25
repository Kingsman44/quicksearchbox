package com.google.android.libraries.elements.interfaces;

import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public abstract class CommandHandlerResolver {

    /* compiled from: PG */
    final class CppProxy extends CommandHandlerResolver {
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

        public static native CommandHandlerResolver create(CommandHandler commandHandler, ExecutorRegistry executorRegistry);

        private native void nativeDestroy(long j);

        private native CommandHandler native_commandHandlerForExtension(long j, int i);

        private native Integer native_handleCommand(long j, CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

        private native void native_handleCommandWithPlatformFallback(long j, CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

        private native boolean native_hasCustomHandlerForExtension(long j, int i);

        private native void native_registerCommandHandler(long j, CommandHandler commandHandler, int i, CommandThread commandThread);

        public void _djinni_private_destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        public CommandHandler commandHandlerForExtension(int i) {
            return native_commandHandlerForExtension(this.nativeRef, i);
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            _djinni_private_destroy();
            super.finalize();
        }

        public Integer handleCommand(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback) {
            return native_handleCommand(this.nativeRef, commandOuterClass$Command, commandRunContext, commandRunCompletionCallback);
        }

        public void handleCommandWithPlatformFallback(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback) {
            native_handleCommandWithPlatformFallback(this.nativeRef, commandOuterClass$Command, commandRunContext, commandRunCompletionCallback);
        }

        public boolean hasCustomHandlerForExtension(int i) {
            return native_hasCustomHandlerForExtension(this.nativeRef, i);
        }

        public void registerCommandHandler(CommandHandler commandHandler, int i, CommandThread commandThread) {
            native_registerCommandHandler(this.nativeRef, commandHandler, i, commandThread);
        }
    }

    public static CommandHandlerResolver create(CommandHandler commandHandler, ExecutorRegistry executorRegistry) {
        return CppProxy.create(commandHandler, executorRegistry);
    }

    public abstract CommandHandler commandHandlerForExtension(int i);

    public abstract Integer handleCommand(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

    public abstract void handleCommandWithPlatformFallback(CommandOuterClass$Command commandOuterClass$Command, CommandRunContext commandRunContext, CommandRunCompletionCallback commandRunCompletionCallback);

    public abstract boolean hasCustomHandlerForExtension(int i);

    public abstract void registerCommandHandler(CommandHandler commandHandler, int i, CommandThread commandThread);
}
