package com.google.android.libraries.notifications.entrypoints.accountchanged;

import android.content.Intent;
import com.google.android.libraries.notifications.C30007h;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.data.C29823n;
import com.google.android.libraries.notifications.entrypoints.C29965d;
import com.google.android.libraries.notifications.p2268e.p2269a.p2270a.C29831a;
import com.google.android.libraries.notifications.p2268e.p2271b.p2272a.C29835a;
import com.google.android.libraries.notifications.p2294i.p2295a.C30019b;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2318f.p2331f.p2332a.C30138a;
import com.google.android.libraries.notifications.platform.p2318f.p2331f.p2332a.p2333a.C30139a;
import com.google.p4160bf.p4164b.p4165a.p4166a.C55540at;
import java.util.Set;
import p5304e.p5305a.p5306a.p5383k.p5384a.C68804m;

/* renamed from: com.google.android.libraries.notifications.entrypoints.accountchanged.a */
/* compiled from: PG */
public final class C29961a implements C29965d {

    /* renamed from: a */
    private final C29823n f81114a;

    /* renamed from: b */
    private final C29831a f81115b;

    /* renamed from: c */
    private final C30019b f81116c;

    /* renamed from: d */
    private final C30139a f81117d;

    /* renamed from: e */
    private final C29835a f81118e;

    public C29961a(C29823n nVar, C29831a aVar, C30139a aVar2, C30019b bVar, C29835a aVar3) {
        this.f81114a = nVar;
        this.f81115b = aVar;
        this.f81117d = aVar2;
        this.f81116c = bVar;
        this.f81118e = aVar3;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo35260a(Intent intent) {
        return 10;
    }

    /* renamed from: b */
    public final void mo35261b(Intent intent, C30007h hVar, long j) {
        C30058b.m55794f("AccountChangedIntentHandler", "Account changed event received.", new Object[0]);
        this.f81118e.mo35161c(2).mo35136a();
        try {
            Set a = this.f81117d.mo35527a();
            for (C29820k kVar : this.f81114a.mo35089c()) {
                if (!a.contains(kVar.mo35009h())) {
                    this.f81115b.mo35134a(kVar, true);
                }
            }
        } catch (C30138a e) {
            this.f81118e.mo35160b(37).mo35136a();
            C30058b.m55792d("AccountChangedIntentHandler", e, "Account cleanup skipped due to error getting device accounts", new Object[0]);
        }
        if (!C68804m.f184878a.mo6453a().mo60491b()) {
            this.f81116c.mo35345a(C55540at.ACCOUNT_CHANGED);
        }
    }

    /* renamed from: c */
    public final boolean mo35262c(Intent intent) {
        return "android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(intent.getAction());
    }
}
