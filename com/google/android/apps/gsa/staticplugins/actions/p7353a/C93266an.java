package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.Intent;
import android.net.Uri;
import android.telephony.SmsManager;
import android.text.TextUtils;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.an */
/* compiled from: PG */
public final class C93266an {

    /* renamed from: a */
    static final Uri f260053a = Uri.parse("content://sms");

    /* renamed from: b */
    private static final C59071e f260054b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.a.an");

    /* renamed from: a */
    public static Intent m153355a(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SENDTO");
        intent.setData(Uri.fromParts("smsto", TextUtils.join(",", str != null ? new String[]{str} : new String[0]), (String) null));
        if (!TextUtils.isEmpty((CharSequence) null)) {
            intent.putExtra("sms_body", (String) null);
        }
        return intent;
    }

    /* renamed from: b */
    static final int m153356b() {
        int defaultSmsSubscriptionId = SmsManager.getDefaultSmsSubscriptionId();
        if (defaultSmsSubscriptionId < 0) {
            return -1;
        }
        return defaultSmsSubscriptionId;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long m153357c(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.lang.String r1 = ","
            java.lang.String[] r1 = r11.split(r1)
            int r2 = r1.length
            r3 = 0
            r4 = 0
        L_0x000e:
            if (r4 >= r2) goto L_0x001c
            r5 = r1[r4]
            java.lang.String r5 = android.telephony.PhoneNumberUtils.stripSeparators(r5)
            r0.add(r5)
            int r4 = r4 + 1
            goto L_0x000e
        L_0x001c:
            r1 = -1
            r4 = 1
            java.lang.String r5 = "android.provider.Telephony$Threads"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            java.lang.Class<android.content.Context> r8 = android.content.Context.class
            r7[r3] = r8     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            java.lang.Class<java.util.Set> r8 = java.util.Set.class
            r7[r4] = r8     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            java.lang.String r8 = "getOrCreateThreadId"
            java.lang.reflect.Method r5 = r5.getMethod(r8, r7)     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            r6[r3] = r9     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            r6[r4] = r0     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            java.lang.Object r0 = r5.invoke(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            if (r0 != 0) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            long r5 = r0.longValue()     // Catch:{ IllegalArgumentException -> 0x0054, IllegalAccessException -> 0x0052, InvocationTargetException -> 0x0050, SecurityException -> 0x004e, NoSuchMethodException -> 0x004c, ClassNotFoundException -> 0x004a }
            goto L_0x0063
        L_0x004a:
            r0 = move-exception
            goto L_0x0055
        L_0x004c:
            r0 = move-exception
            goto L_0x0055
        L_0x004e:
            r0 = move-exception
            goto L_0x0055
        L_0x0050:
            r0 = move-exception
            goto L_0x0055
        L_0x0052:
            r0 = move-exception
            goto L_0x0055
        L_0x0054:
            r0 = move-exception
        L_0x0055:
            com.google.common.f.e r3 = f260054b
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "error inserting into sms database"
            r6 = 13556(0x34f4, float:1.8996E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r0)).mo56372aa(r6)).mo56386p(r5)
        L_0x0062:
            r5 = r1
        L_0x0063:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ad
            android.content.ContentValues r0 = new android.content.ContentValues
            r1 = 6
            r0.<init>(r1)
            java.lang.String r2 = "thread_id"
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0.put(r2, r3)
            java.lang.String r2 = "body"
            r0.put(r2, r10)
            java.lang.String r10 = "type"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r10, r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "read"
            r0.put(r1, r10)
            java.lang.String r1 = "seen"
            r0.put(r1, r10)
            java.lang.String r10 = "address"
            r0.put(r10, r11)
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ Exception -> 0x00a6 }
            android.net.Uri r10 = f260053a     // Catch:{ Exception -> 0x00a6 }
            android.net.Uri r9 = r9.insert(r10, r0)     // Catch:{ Exception -> 0x00a6 }
            long r9 = android.content.ContentUris.parseId(r9)     // Catch:{ Exception -> 0x00a6 }
            return r9
        L_0x00a6:
            r9 = move-exception
            com.google.android.apps.gsa.staticplugins.actions.a.am r10 = new com.google.android.apps.gsa.staticplugins.actions.a.am
            r10.<init>(r9)
            throw r10
        L_0x00ad:
            com.google.common.f.e r9 = f260054b
            com.google.common.f.x r9 = r9.mo56225c()
            java.lang.String r10 = "not inserting into sms database"
            r11 = 13557(0x34f5, float:1.8997E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r11)).mo56386p(r10)
            com.google.android.apps.gsa.staticplugins.actions.a.am r9 = new com.google.android.apps.gsa.staticplugins.actions.a.am
            r9.<init>()
            goto L_0x00c1
        L_0x00c0:
            throw r9
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.actions.p7353a.C93266an.m153357c(android.content.Context, java.lang.String, java.lang.String):long");
    }
}
