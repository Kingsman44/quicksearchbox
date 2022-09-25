package com.google.android.libraries.onegoogle.owners.mdi;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.mdi.p2213d.p2219c.C28679h;
import com.google.android.libraries.mdi.p2213d.p2219c.C28681j;
import com.google.android.libraries.mdi.p2213d.p2219c.C28682k;
import com.google.android.libraries.onegoogle.accountmanagement.C30255b;
import com.google.android.libraries.onegoogle.owners.C30969d;
import com.google.android.libraries.onegoogle.owners.C31012n;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.k */
/* compiled from: PG */
public final class C30996k implements C31012n {

    /* renamed from: a */
    private final C28682k f83487a;

    /* renamed from: b */
    private final C30969d f83488b;

    /* renamed from: c */
    private final C28679h f83489c = new C30994i(this);

    /* renamed from: d */
    private final List f83490d = new ArrayList();

    /* renamed from: e */
    private final MdiOwnersLoader f83491e;

    /* renamed from: f */
    private final C31004s f83492f;

    /* renamed from: g */
    private final C30987b f83493g;

    public C30996k(Context context, C28682k kVar, C30969d dVar, C30847m mVar) {
        context.getClass();
        kVar.getClass();
        this.f83487a = kVar;
        this.f83488b = dVar;
        this.f83493g = new C30987b(context, dVar, new C30993h(this));
        this.f83491e = new MdiOwnersLoader(context, kVar, dVar, mVar);
        this.f83492f = new C31004s(kVar, context);
    }

    /* renamed from: h */
    public static C60870cx m57866h(C60870cx cxVar) {
        C30990e eVar = C30990e.f83481a;
        return C60922j.m93044g(cxVar, C47810es.m84963c(eVar), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo36637a() {
        return this.f83491e.mo36672a(C30992g.f83483a);
    }

    /* renamed from: b */
    public final C60870cx mo36638b(String str) {
        MdiOwnersLoader mdiOwnersLoader = this.f83491e;
        C60870cx a = mdiOwnersLoader.f83459b.mo36668a();
        C31007v vVar = new C31007v(mdiOwnersLoader, str);
        return C60922j.m93045h(a, C47810es.m84966f(vVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo36639c() {
        return this.f83491e.mo36672a(C30991f.f83482a);
    }

    /* renamed from: d */
    public final C60870cx mo36640d(String str, int i) {
        return this.f83492f.mo36680a(C30988c.f83479a, str, i);
    }

    /* renamed from: e */
    public final C60870cx mo36641e(String str, int i) {
        return this.f83492f.mo36680a(C30989d.f83480a, str, i);
    }

    /* renamed from: f */
    public final void mo36642f(C30255b bVar) {
        synchronized (this.f83490d) {
            if (this.f83490d.isEmpty()) {
                C30987b bVar2 = this.f83493g;
                synchronized (bVar2) {
                    if (!bVar2.f83476a) {
                        bVar2.f83478c.addOnAccountsUpdatedListener(bVar2.f83477b, (Handler) null, false, new String[]{"com.google"});
                        bVar2.f83476a = true;
                    }
                }
                C60870cx a = this.f83488b.mo36668a();
                C30995j jVar = new C30995j(this);
                C60856cj.m92911t(a, C47810es.m84974n(jVar), C60826bg.f164896a);
            }
            this.f83490d.add(bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo36643g(com.google.android.libraries.onegoogle.accountmanagement.C30255b r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f83490d
            monitor-enter(r0)
            java.util.List r1 = r4.f83490d     // Catch:{ all -> 0x003b }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x000d:
            java.util.List r1 = r4.f83490d     // Catch:{ all -> 0x003b }
            r1.remove(r5)     // Catch:{ all -> 0x003b }
            java.util.List r5 = r4.f83490d     // Catch:{ all -> 0x003b }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x0039
            com.google.android.libraries.onegoogle.owners.mdi.b r5 = r4.f83493g     // Catch:{ all -> 0x003b }
            monitor-enter(r5)     // Catch:{ all -> 0x003b }
            boolean r1 = r5.f83476a     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0034
            android.accounts.AccountManager r1 = r5.f83478c     // Catch:{ IllegalArgumentException -> 0x0029 }
            android.accounts.OnAccountsUpdateListener r2 = r5.f83477b     // Catch:{ IllegalArgumentException -> 0x0029 }
            r1.removeOnAccountsUpdatedListener(r2)     // Catch:{ IllegalArgumentException -> 0x0029 }
            goto L_0x0031
        L_0x0029:
            r1 = move-exception
            java.lang.String r2 = "OneGoogle"
            java.lang.String r3 = "Failed to remove an OnAccountsUpdatedListener"
            android.util.Log.w(r2, r3, r1)     // Catch:{ all -> 0x0036 }
        L_0x0031:
            r1 = 0
            r5.f83476a = r1     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            goto L_0x0039
        L_0x0036:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            throw r1     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.onegoogle.owners.mdi.C30996k.mo36643g(com.google.android.libraries.onegoogle.accountmanagement.b):void");
    }

    /* renamed from: i */
    public final void mo36678i(Account account) {
        C28681j a = this.f83487a.mo34308a(account);
        a.mo34321f(this.f83489c);
        a.mo34320e(this.f83489c, C60826bg.f164896a);
    }

    /* renamed from: j */
    public final void mo36679j() {
        synchronized (this.f83490d) {
            for (C30255b a : this.f83490d) {
                a.mo35767a();
            }
        }
    }
}
