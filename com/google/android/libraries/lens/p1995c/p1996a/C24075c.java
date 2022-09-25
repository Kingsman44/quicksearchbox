package com.google.android.libraries.lens.p1995c.p1996a;

import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24070a;
import com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24073d;

/* renamed from: com.google.android.libraries.lens.c.a.c */
/* compiled from: PG */
final class C24075c extends AsyncTask {

    /* renamed from: a */
    final /* synthetic */ C24076d f65761a;

    /* renamed from: b */
    private int f65762b;

    /* renamed from: c */
    private int f65763c;

    public C24075c(C24076d dVar) {
        this.f65761a = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x0095  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m44704b(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "LensSdkParamsReader"
            java.lang.String r1 = "Failed to start Lens: Error "
            com.google.android.libraries.lens.c.a.d r2 = r12.f65761a
            r3 = 3
            android.content.pm.PackageManager r2 = r2.f65768d     // Catch:{ NameNotFoundException -> 0x0099 }
            java.lang.String r4 = "com.google.android.googlequicksearchbox"
            r5 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0099 }
            boolean r2 = r2.enabled     // Catch:{ NameNotFoundException -> 0x0099 }
            if (r2 != 0) goto L_0x0016
            goto L_0x009e
        L_0x0016:
            r2 = 6
            com.google.android.libraries.lens.c.a.d r4 = r12.f65761a     // Catch:{ Exception -> 0x008b }
            android.content.Context r4 = r4.f65767c     // Catch:{ Exception -> 0x008b }
            android.content.ContentResolver r6 = r4.getContentResolver()     // Catch:{ Exception -> 0x008b }
            android.net.Uri r7 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x008b }
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            android.database.Cursor r13 = r6.query(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x008b }
            if (r13 == 0) goto L_0x0082
            int r4 = r13.getCount()     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x0034
            goto L_0x0082
        L_0x0034:
            boolean r2 = r13.moveToFirst()     // Catch:{ all -> 0x0080 }
            if (r2 != 0) goto L_0x0040
            r13.close()
            r13 = 16
            return r13
        L_0x0040:
            int r2 = r13.getType(r5)     // Catch:{ all -> 0x0080 }
            if (r2 == r3) goto L_0x004c
            r13.close()
            r13 = 17
            return r13
        L_0x004c:
            java.lang.String r2 = r13.getString(r5)     // Catch:{ NumberFormatException -> 0x0074 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0074 }
            r3 = 12
            if (r2 > r3) goto L_0x005b
            r4 = -1
            if (r2 >= r4) goto L_0x006c
        L_0x005b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            r4.<init>(r1)     // Catch:{ all -> 0x0080 }
            r4.append(r2)     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0080 }
            android.util.Log.e(r0, r1)     // Catch:{ all -> 0x0080 }
            r2 = 12
        L_0x006c:
            int r0 = com.google.android.libraries.lens.p1995c.p1996a.p1997a.C24072c.m44703b(r2)     // Catch:{ all -> 0x0080 }
            r13.close()
            return r0
        L_0x0074:
            r1 = move-exception
            java.lang.String r2 = "Unable to parse Lens version code value."
            android.util.Log.e(r0, r2, r1)     // Catch:{ all -> 0x0080 }
            r13.close()
            r13 = 18
            return r13
        L_0x0080:
            r0 = move-exception
            goto L_0x0093
        L_0x0082:
            if (r13 == 0) goto L_0x0087
            r13.close()
        L_0x0087:
            return r2
        L_0x0088:
            r13 = move-exception
            r0 = r13
            goto L_0x0092
        L_0x008b:
            r13 = move-exception
            java.lang.String r1 = "Failed to start Lens due to unexpected exception."
            android.util.Log.e(r0, r1, r13)     // Catch:{ all -> 0x0088 }
            return r2
        L_0x0092:
            r13 = 0
        L_0x0093:
            if (r13 == 0) goto L_0x0098
            r13.close()
        L_0x0098:
            throw r0
        L_0x0099:
            java.lang.String r13 = "Unable to find agsa package: com.google.android.googlequicksearchbox"
            android.util.Log.e(r0, r13)
        L_0x009e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.p1995c.p1996a.C24075c.m44704b(java.lang.String):int");
    }

    /* renamed from: a */
    public final void mo29466a(int i, int i2) {
        int i3 = i - 2;
        if (i != 0) {
            Log.i("LensSdkParamsReader", "Lens availability result:" + i3);
            int i4 = i2 + -2;
            if (i2 != 0) {
                Log.i("LensSdkParamsReader", "Stickers availability result:" + i4);
                C24076d dVar = this.f65761a;
                C24070a aVar = (C24070a) dVar.f65770f.toBuilder();
                aVar.copyOnWrite();
                C24073d dVar2 = (C24073d) aVar.instance;
                dVar2.f65758d = i3;
                dVar2.f65755a |= 4;
                aVar.copyOnWrite();
                C24073d dVar3 = (C24073d) aVar.instance;
                dVar3.f65759e = i4;
                dVar3.f65755a |= 8;
                dVar.f65770f = (C24073d) aVar.build();
                C24076d dVar4 = this.f65761a;
                dVar4.f65771g = true;
                for (C24069a a : dVar4.f65769e) {
                    a.mo29464a(this.f65761a.f65770f);
                }
                this.f65761a.f65769e.clear();
                return;
            }
            throw null;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        this.f65762b = m44704b(C24076d.f65764a);
        this.f65763c = m44704b(C24076d.f65765b);
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        Void voidR = (Void) obj;
        mo29466a(this.f65762b, this.f65763c);
    }

    /* access modifiers changed from: protected */
    public final void onPreExecute() {
        new Handler(this.f65761a.f65767c.getMainLooper()).postDelayed(new C24074b(this), 4000);
    }
}
