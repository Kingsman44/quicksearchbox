package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1317a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a.g */
/* compiled from: PG */
final class C16691g extends C16680am {

    /* renamed from: a */
    private boolean f48854a;

    /* renamed from: b */
    private boolean f48855b;

    /* renamed from: c */
    private boolean f48856c;

    /* renamed from: d */
    private byte f48857d;

    /* renamed from: a */
    public final C16681an mo22966a() {
        if (this.f48857d == 7) {
            return new C16692h(this.f48854a, this.f48855b, this.f48856c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f48857d & 1) == 0) {
            sb.append(" isValidSendChange");
        }
        if ((this.f48857d & 2) == 0) {
            sb.append(" isValidReply");
        }
        if ((this.f48857d & 4) == 0) {
            sb.append(" hasSmartActions");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo22967b(boolean z) {
        this.f48856c = z;
        this.f48857d = (byte) (this.f48857d | 4);
    }

    /* renamed from: c */
    public final void mo22968c(boolean z) {
        this.f48855b = z;
        this.f48857d = (byte) (this.f48857d | 2);
    }

    /* renamed from: d */
    public final void mo22969d(boolean z) {
        this.f48854a = z;
        this.f48857d = (byte) (this.f48857d | 1);
    }
}
