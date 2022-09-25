package com.google.android.play.core.p3538g;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.google.android.play.core.g.ax */
/* compiled from: PG */
public final class C45138ax {

    /* renamed from: a */
    private final Context f117834a;

    public C45138ax(Context context) {
        this.f117834a = context;
    }

    /* renamed from: a */
    public final SharedPreferences mo48974a() {
        return this.f117834a.getSharedPreferences("playcore_split_install_internal", 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r1 = new java.util.HashSet();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set mo48975b() {
        /*
            r4 = this;
            java.lang.Class<com.google.android.play.core.g.ax> r0 = com.google.android.play.core.p3538g.C45138ax.class
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r4.mo48974a()     // Catch:{ Exception -> 0x001c }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x001c }
            r2.<init>()     // Catch:{ Exception -> 0x001c }
            java.lang.String r3 = "modules_to_uninstall_if_emulated"
            java.util.Set r1 = r1.getStringSet(r3, r2)     // Catch:{ Exception -> 0x001c }
            if (r1 != 0) goto L_0x0021
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x001c }
            r1.<init>()     // Catch:{ Exception -> 0x001c }
            goto L_0x0021
        L_0x001a:
            r1 = move-exception
            goto L_0x0023
        L_0x001c:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x001a }
            r1.<init>()     // Catch:{ all -> 0x001a }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3538g.C45138ax.mo48975b():java.util.Set");
    }
}
