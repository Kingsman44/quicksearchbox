package com.google.knowledge.cerebra.sense.textclassifier.lib3;

import android.content.res.AssetFileDescriptor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
public final class ActionsSuggestionsModel implements AutoCloseable {

    /* renamed from: a */
    public long f167177a;

    /* renamed from: b */
    private final AtomicBoolean f167178b = new AtomicBoolean(false);

    /* compiled from: PG */
    public final class ActionSuggestion {

        /* renamed from: a */
        public final String f167179a;

        /* renamed from: b */
        public final String f167180b;

        /* renamed from: c */
        public final float f167181c;

        /* renamed from: d */
        public final NamedVariant[] f167182d;

        /* renamed from: e */
        public final byte[] f167183e;

        /* renamed from: f */
        public final RemoteActionTemplate[] f167184f;

        /* renamed from: g */
        public final Slot[] f167185g;

        public ActionSuggestion(String str, String str2, float f, NamedVariant[] namedVariantArr, byte[] bArr, RemoteActionTemplate[] remoteActionTemplateArr, Slot[] slotArr) {
            this.f167179a = str;
            this.f167180b = str2;
            this.f167181c = f;
            this.f167182d = namedVariantArr;
            this.f167183e = bArr;
            this.f167184f = remoteActionTemplateArr;
            this.f167185g = slotArr;
        }
    }

    /* compiled from: PG */
    public final class ActionSuggestionOptions {
    }

    /* compiled from: PG */
    public final class ActionSuggestions {

        /* renamed from: a */
        public final ActionSuggestion[] f167186a;

        /* renamed from: b */
        public final boolean f167187b;

        public ActionSuggestions(ActionSuggestion[] actionSuggestionArr, boolean z) {
            this.f167186a = actionSuggestionArr;
            this.f167187b = z;
        }
    }

    /* compiled from: PG */
    public final class Conversation {

        /* renamed from: a */
        public final ConversationMessage[] f167188a;

        public Conversation(ConversationMessage[] conversationMessageArr) {
            this.f167188a = conversationMessageArr;
        }

        public ConversationMessage[] getConversationMessages() {
            return this.f167188a;
        }
    }

    /* compiled from: PG */
    public final class ConversationMessage {

        /* renamed from: a */
        private final int f167189a;

        /* renamed from: b */
        private final String f167190b;

        /* renamed from: c */
        private final long f167191c;

        /* renamed from: d */
        private final String f167192d;

        /* renamed from: e */
        private final String f167193e;

        public ConversationMessage(int i, String str, long j, String str2, String str3) {
            this.f167189a = i;
            this.f167190b = str;
            this.f167191c = j;
            this.f167192d = str2;
            this.f167193e = str3;
        }

        public String getDetectedTextLanguageTags() {
            return this.f167193e;
        }

        public long getReferenceTimeMsUtc() {
            return this.f167191c;
        }

        public String getReferenceTimezone() {
            return this.f167192d;
        }

        public String getText() {
            return this.f167190b;
        }

        public int getUserId() {
            return this.f167189a;
        }
    }

    /* compiled from: PG */
    public final class Slot {

        /* renamed from: a */
        public final String f167194a;

        /* renamed from: b */
        public final int f167195b;

        /* renamed from: c */
        public final int f167196c;

        /* renamed from: d */
        public final int f167197d;

        /* renamed from: e */
        public final float f167198e;

        public Slot(String str, int i, int i2, int i3, float f) {
            this.f167194a = str;
            this.f167195b = i;
            this.f167196c = i2;
            this.f167197d = i3;
            this.f167198e = f;
        }
    }

    static {
        C61860b.m94501a();
    }

    public ActionsSuggestionsModel(AssetFileDescriptor assetFileDescriptor) {
        long nativeNewActionsModelWithOffset = nativeNewActionsModelWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength(), (byte[]) null);
        this.f167177a = nativeNewActionsModelWithOffset;
        if (nativeNewActionsModelWithOffset == 0) {
            throw new IllegalArgumentException("Couldn't initialize actions model from file descriptor.");
        }
    }

    /* renamed from: a */
    public static int m94493a(AssetFileDescriptor assetFileDescriptor) {
        return nativeGetVersionWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    /* renamed from: b */
    public static String m94494b(AssetFileDescriptor assetFileDescriptor) {
        return nativeGetLocalesWithOffset(assetFileDescriptor.getParcelFileDescriptor().getFd(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
    }

    private native void nativeCloseActionsModel(long j);

    private static native String nativeGetLocales(int i);

    private static native String nativeGetLocalesWithOffset(int i, long j, long j2);

    private static native String nativeGetName(int i);

    private static native String nativeGetNameWithOffset(int i, long j, long j2);

    private static native int nativeGetVersion(int i);

    private static native int nativeGetVersionWithOffset(int i, long j, long j2);

    private static native long nativeNewActionsModel(int i, byte[] bArr);

    private static native long nativeNewActionsModelFromPath(String str, byte[] bArr);

    private static native long nativeNewActionsModelWithOffset(int i, long j, long j2, byte[] bArr);

    public final void close() {
        if (this.f167178b.compareAndSet(false, true)) {
            nativeCloseActionsModel(this.f167177a);
            this.f167177a = 0;
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

    public native long nativeGetNativeModelPtr(long j);

    public native boolean nativeInitializeConversationIntentDetection(long j, byte[] bArr);

    public native ActionSuggestions nativeSuggestActions(long j, Conversation conversation, ActionSuggestionOptions actionSuggestionOptions, long j2, Object obj, String str, boolean z);
}
