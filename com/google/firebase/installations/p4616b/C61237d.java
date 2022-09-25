package com.google.firebase.installations.p4616b;

import com.google.firebase.C61204g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.b.d */
/* compiled from: PG */
public final class C61237d {

    /* renamed from: a */
    private File f165651a;

    /* renamed from: b */
    private final C61204g f165652b;

    public C61237d(C61204g gVar) {
        this.f165652b = gVar;
    }

    /* renamed from: c */
    private final File m93656c() {
        if (this.f165651a == null) {
            synchronized (this) {
                if (this.f165651a == null) {
                    C61204g gVar = this.f165652b;
                    gVar.mo57770f();
                    File filesDir = gVar.f165555c.getFilesDir();
                    String e = this.f165652b.mo57768e();
                    this.f165651a = new File(filesDir, "PersistedInstallation." + e + ".json");
                }
            }
        }
        return this.f165651a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0046 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.firebase.installations.p4616b.C61239f mo57831a() {
        /*
            r11 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x0047 }
            java.io.File r5 = r11.m93656c()     // Catch:{ IOException | JSONException -> 0x0047 }
            r4.<init>(r5)     // Catch:{ IOException | JSONException -> 0x0047 }
        L_0x0013:
            int r5 = r4.read(r2, r3, r1)     // Catch:{ all -> 0x002a }
            if (r5 >= 0) goto L_0x0026
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x002a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x002a }
            r1.<init>(r0)     // Catch:{ all -> 0x002a }
            r4.close()     // Catch:{ IOException | JSONException -> 0x0047 }
            goto L_0x004c
        L_0x0026:
            r0.write(r2, r3, r5)     // Catch:{ all -> 0x002a }
            goto L_0x0013
        L_0x002a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002f }
            goto L_0x0046
        L_0x002f:
            r1 = move-exception
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0046 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r3] = r5     // Catch:{ Exception -> 0x0046 }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x0046 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0046 }
            r2[r3] = r1     // Catch:{ Exception -> 0x0046 }
            r4.invoke(r0, r2)     // Catch:{ Exception -> 0x0046 }
        L_0x0046:
            throw r0     // Catch:{ IOException | JSONException -> 0x0047 }
        L_0x0047:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x004c:
            java.lang.String r0 = "Fid"
            r2 = 0
            java.lang.String r0 = r1.optString(r0, r2)
            java.lang.String r4 = "Status"
            int r3 = r1.optInt(r4, r3)
            java.lang.String r4 = "AuthToken"
            java.lang.String r4 = r1.optString(r4, r2)
            java.lang.String r5 = "RefreshToken"
            java.lang.String r5 = r1.optString(r5, r2)
            java.lang.String r6 = "TokenCreationEpochInSecs"
            r7 = 0
            long r9 = r1.optLong(r6, r7)
            java.lang.String r6 = "ExpiresInSecs"
            long r6 = r1.optLong(r6, r7)
            java.lang.String r8 = "FisError"
            java.lang.String r1 = r1.optString(r8, r2)
            com.google.firebase.installations.b.e r2 = com.google.firebase.installations.p4616b.C61239f.m93667i()
            r8 = r2
            com.google.firebase.installations.b.a r8 = (com.google.firebase.installations.p4616b.C61234a) r8
            r8.f165633a = r0
            r0 = 5
            int[] r0 = new int[r0]
            r0 = {1, 2, 3, 4, 5} // fill-array
            r0 = r0[r3]
            r2.mo57817f(r0)
            r8.f165634b = r4
            r8.f165635c = r5
            r2.mo57818g(r9)
            r2.mo57814c(r6)
            r8.f165636d = r1
            com.google.firebase.installations.b.f r0 = r2.mo57812a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.p4616b.C61237d.mo57831a():com.google.firebase.installations.b.f");
    }

    /* renamed from: b */
    public final void mo57832b(C61239f fVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", fVar.mo57824e());
            int h = fVar.mo57828h();
            int i = h - 1;
            if (h != 0) {
                jSONObject.put("Status", i);
                jSONObject.put("AuthToken", fVar.mo57823d());
                jSONObject.put("RefreshToken", fVar.mo57827g());
                jSONObject.put("TokenCreationEpochInSecs", fVar.mo57821b());
                jSONObject.put("ExpiresInSecs", fVar.mo57820a());
                jSONObject.put("FisError", fVar.mo57826f());
                C61204g gVar = this.f165652b;
                gVar.mo57770f();
                File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f165555c.getFilesDir());
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
                fileOutputStream.close();
                if (!createTempFile.renameTo(m93656c())) {
                    throw new IOException("unable to rename the tmpfile to PersistedInstallation");
                }
                return;
            }
            throw null;
        } catch (IOException | JSONException unused) {
        }
    }
}
