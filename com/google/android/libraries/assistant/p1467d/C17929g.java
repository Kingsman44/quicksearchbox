package com.google.android.libraries.assistant.p1467d;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.d.g */
/* compiled from: PG */
public final /* synthetic */ class C17929g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C17934l f51360a;

    public /* synthetic */ C17929g(C17934l lVar) {
        this.f51360a = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r12 = this;
            java.lang.String r0 = "AssistantIntegClient"
            com.google.android.libraries.assistant.d.l r1 = r12.f51360a
            java.lang.String r2 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_eligibility_status"
            r3 = 0
            r4 = 1
            r5 = 0
            android.content.Context r1 = r1.f51369c     // Catch:{ RuntimeException -> 0x002e }
            android.content.ContentResolver r6 = r1.getContentResolver()     // Catch:{ RuntimeException -> 0x002e }
            android.net.Uri r7 = com.google.android.libraries.assistant.p1467d.C17934l.f51367a     // Catch:{ RuntimeException -> 0x002e }
            java.lang.String[] r10 = new java.lang.String[r4]     // Catch:{ RuntimeException -> 0x002e }
            r10[r5] = r2     // Catch:{ RuntimeException -> 0x002e }
            r8 = 0
            r9 = 0
            r11 = 0
            android.database.Cursor r3 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x002e }
            if (r3 == 0) goto L_0x0030
            boolean r1 = r3.moveToFirst()     // Catch:{ RuntimeException -> 0x002e }
            if (r1 == 0) goto L_0x0030
            int r1 = r3.getInt(r5)     // Catch:{ RuntimeException -> 0x002e }
            r3.close()
            goto L_0x005f
        L_0x002c:
            r0 = move-exception
            goto L_0x007b
        L_0x002e:
            r1 = move-exception
            goto L_0x003c
        L_0x0030:
            java.lang.String r1 = "#queryMorrisContentProvider: Error querying Morris status"
            android.util.Log.w(r0, r1)     // Catch:{ RuntimeException -> 0x002e }
            if (r3 == 0) goto L_0x003a
            r3.close()
        L_0x003a:
            r1 = 0
            goto L_0x005f
        L_0x003c:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x002c }
            java.lang.Class r6 = r1.getClass()     // Catch:{ all -> 0x002c }
            r2[r5] = r6     // Catch:{ all -> 0x002c }
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x002c }
            r2[r4] = r1     // Catch:{ all -> 0x002c }
            java.lang.String r1 = "#queryMorrisContentProviderForInt: Exception thrown [%s]: %s"
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ all -> 0x002c }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0059
            r3.close()
        L_0x0059:
            java.lang.String r1 = "#queryMorrisContentProviderForInt: Error, returning default 0"
            android.util.Log.w(r0, r1)
            goto L_0x003a
        L_0x005f:
            com.google.android.libraries.assistant.d.b.e r1 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.m35067a(r1)
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = "#getMorrisEligibilityStatusAsync: MorrisEligibilityStatus is invalid"
            android.util.Log.w(r0, r1)
            com.google.android.libraries.assistant.d.b.e r1 = com.google.android.libraries.assistant.p1467d.p1471b.C17819e.UNKNOWN
            goto L_0x007a
        L_0x006d:
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r5] = r1
            java.lang.String r3 = "#MorrisEligibilityStatus: %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            android.util.Log.d(r0, r2)
        L_0x007a:
            return r1
        L_0x007b:
            if (r3 == 0) goto L_0x0080
            r3.close()
        L_0x0080:
            goto L_0x0082
        L_0x0081:
            throw r0
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.p1467d.C17929g.call():java.lang.Object");
    }
}
