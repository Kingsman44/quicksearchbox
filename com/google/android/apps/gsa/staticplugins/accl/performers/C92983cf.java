package com.google.android.apps.gsa.staticplugins.accl.performers;

import android.accounts.Account;
import android.content.Context;
import android.util.Pair;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gcoreclient.p1774k.p1775a.C21573h;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21592d;
import com.google.android.libraries.gcoreclient.p1782o.p1783a.C21596h;
import com.google.assistant.p3897e.p3921j.alq;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.cf */
/* compiled from: PG */
public final class C92983cf {

    /* renamed from: d */
    private static final C59071e f259376d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.cf");

    /* renamed from: a */
    public final Context f259377a;

    /* renamed from: b */
    public final C68214a f259378b;

    /* renamed from: c */
    public final C86054o f259379c;

    /* renamed from: e */
    private final C69464a f259380e;

    public C92983cf(Context context, C68214a aVar, C86054o oVar, C69464a aVar2) {
        this.f259377a = context;
        this.f259378b = aVar;
        this.f259379c = oVar;
        this.f259380e = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if (r1 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        if (r1 == null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map mo87498a() {
        /*
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.Context r1 = r8.f259377a
            android.content.ContentResolver r2 = r1.getContentResolver()
            android.net.Uri$Builder r1 = new android.net.Uri$Builder
            r1.<init>()
            java.lang.String r3 = "content"
            android.net.Uri$Builder r1 = r1.scheme(r3)
            java.lang.String r3 = "com.google.android.settings.external"
            android.net.Uri$Builder r1 = r1.authority(r3)
            java.lang.String r3 = "signals"
            android.net.Uri$Builder r1 = r1.path(r3)
            android.net.Uri r3 = r1.build()
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r1 = 0
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x004e }
            if (r1 == 0) goto L_0x0050
            int r2 = r1.getColumnCount()     // Catch:{ Exception -> 0x004e }
            r3 = 2
            if (r2 < r3) goto L_0x0050
        L_0x0038:
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x004e }
            if (r2 == 0) goto L_0x0050
            r2 = 0
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Exception -> 0x004e }
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch:{ Exception -> 0x004e }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x004e }
            goto L_0x0038
        L_0x004c:
            r0 = move-exception
            goto L_0x0073
        L_0x004e:
            r2 = move-exception
            goto L_0x0056
        L_0x0050:
            if (r1 == 0) goto L_0x0072
        L_0x0052:
            r1.close()
            goto L_0x0072
        L_0x0056:
            com.google.common.f.e r3 = f259376d     // Catch:{ all -> 0x004c }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x004c }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x004c }
            r4 = 13146(0x335a, float:1.8421E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x004c }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x004c }
            java.lang.String r4 = "Error while reading signals: %s"
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x004c }
            r3.mo56389s(r4, r2)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0072
            goto L_0x0052
        L_0x0072:
            return r0
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            r1.close()
        L_0x0078:
            goto L_0x007a
        L_0x0079:
            throw r0
        L_0x007a:
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.accl.performers.C92983cf.mo87498a():java.util.Map");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C21596h mo87499b(alq alq) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : Collections.unmodifiableMap(alq.f135345i).entrySet()) {
            arrayList.add(new Pair((String) entry.getKey(), (String) entry.getValue()));
        }
        for (Map.Entry entry2 : mo87498a().entrySet()) {
            arrayList.add(new Pair((String) entry2.getKey(), (String) entry2.getValue()));
        }
        C21592d dVar = new C21592d(alq.f135341e, new C92980cc(arrayList));
        dVar.mo27019a((C21573h) this.f259380e.mo17428b());
        Account a = this.f259379c.mo79668a();
        if (a != null) {
            dVar.f59965a.f390753c = a;
        }
        C21596h hVar = new C21596h(dVar);
        int i = alq.f135337a;
        if ((i & 2) != 0) {
            hVar.f59969b = alq.f135339c;
        }
        if ((i & 4) != 0) {
            hVar.f59970c = alq.f135340d;
        }
        if ((i & 16) != 0) {
            hVar.f59972e = alq.f135342f;
        }
        if ((i & 32) != 0) {
            hVar.f59971d = alq.f135343g;
        }
        if ((i & 64) != 0) {
            hVar.f59973f = alq.f135344h;
        }
        return hVar;
    }
}
