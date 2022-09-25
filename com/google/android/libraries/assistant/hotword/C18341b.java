package com.google.android.libraries.assistant.hotword;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.hotword.b */
/* compiled from: PG */
public final class C18341b extends C18371h {

    /* renamed from: a */
    C18368e f52028a;

    public C18341b(Executor executor, int i) {
        super(executor, 1999, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004f, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.os.ParcelFileDescriptor mo23807a(com.google.android.libraries.assistant.hotword.C18370g r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.mo23808b()     // Catch:{ all -> 0x0051 }
            android.os.ParcelFileDescriptor[] r0 = r7.mo23857l()     // Catch:{ all -> 0x0051 }
            r7.f52111d = r0     // Catch:{ all -> 0x0051 }
            android.os.ParcelFileDescriptor[] r0 = r7.f52111d     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x000f
            goto L_0x004e
        L_0x000f:
            com.google.android.libraries.assistant.hotword.e r0 = r7.f52028a     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x0027
            com.google.android.libraries.assistant.hotword.e r0 = new com.google.android.libraries.assistant.hotword.e     // Catch:{ all -> 0x0051 }
            java.util.concurrent.Executor r2 = r7.f52114g     // Catch:{ all -> 0x0051 }
            int r3 = r7.f52115h     // Catch:{ all -> 0x0051 }
            r4 = 16000(0x3e80, float:2.2421E-41)
            int r5 = r7.mo23853g()     // Catch:{ all -> 0x0051 }
            int r6 = r7.f52110c     // Catch:{ all -> 0x0051 }
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0051 }
            r7.f52028a = r0     // Catch:{ all -> 0x0051 }
        L_0x0027:
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r0 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ all -> 0x0051 }
            android.os.ParcelFileDescriptor[] r1 = r7.f52111d     // Catch:{ all -> 0x0051 }
            android.os.ParcelFileDescriptor[] r1 = (android.os.ParcelFileDescriptor[]) r1     // Catch:{ all -> 0x0051 }
            r2 = 1
            r1 = r1[r2]     // Catch:{ all -> 0x0051 }
            r0.<init>(r1)     // Catch:{ all -> 0x0051 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ all -> 0x0051 }
            r7.f52113f = r0     // Catch:{ all -> 0x0051 }
            com.google.android.libraries.assistant.hotword.e r0 = r7.f52028a     // Catch:{ all -> 0x0051 }
            java.nio.channels.FileChannel r1 = r7.f52113f     // Catch:{ all -> 0x0051 }
            com.google.android.libraries.assistant.hotword.a r2 = new com.google.android.libraries.assistant.hotword.a     // Catch:{ all -> 0x0051 }
            r2.<init>(r7, r8)     // Catch:{ all -> 0x0051 }
            r0.mo23849a(r1, r2)     // Catch:{ all -> 0x0051 }
            android.os.ParcelFileDescriptor[] r8 = r7.f52111d     // Catch:{ all -> 0x0051 }
            if (r8 == 0) goto L_0x004e
            r0 = 0
            r8 = r8[r0]     // Catch:{ all -> 0x0051 }
            monitor-exit(r7)
            return r8
        L_0x004e:
            monitor-exit(r7)
            r8 = 0
            return r8
        L_0x0051:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.hotword.C18341b.mo23807a(com.google.android.libraries.assistant.hotword.g):android.os.ParcelFileDescriptor");
    }

    /* renamed from: b */
    public final synchronized void mo23808b() {
        C18368e eVar = this.f52028a;
        if (eVar != null) {
            eVar.mo23850b();
        }
        super.mo23808b();
    }

    /* renamed from: c */
    public final synchronized void mo23809c() {
        C58976aa aaVar = C58975e.f156826a;
        C18368e eVar = this.f52028a;
        if (eVar != null) {
            eVar.mo23851c();
            this.f52028a = null;
        }
    }

    /* renamed from: d */
    public final boolean mo23810d() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f52111d != null;
    }

    /* renamed from: e */
    public final StringBuilder mo23811e() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("\n    Buffer Size=");
        sb.append(mo23853g());
        sb.append("\n    Last known recording state=");
        sb.append(this.f52028a == null ? "None" : "AlwaysOpenAudioReader");
        return sb;
    }
}
