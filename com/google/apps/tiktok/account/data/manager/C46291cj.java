package com.google.apps.tiktok.account.data.manager;

import android.os.IBinder;
import androidx.p104d.p105a.C2164c;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.apps.tiktok.tracing.C47842fw;

/* renamed from: com.google.apps.tiktok.account.data.manager.cj */
/* compiled from: PG */
final class C46291cj extends C47842fw {

    /* renamed from: a */
    public C2164c f121271a;

    /* renamed from: a */
    public final void mo50312a() {
        C47558bi a = C47831fm.m85006a("onNullBinding");
        try {
            this.f121271a.mo5439d(new C46289ch());
            a.close();
            return;
        } catch (Throwable th) {
            C46290ci.m82569a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    public final void mo50313b(IBinder iBinder) {
        C47558bi a = C47831fm.m85006a("onServiceConnected");
        try {
            C2164c cVar = this.f121271a;
            iBinder.getClass();
            cVar.mo5437b(iBinder);
            a.close();
            return;
        } catch (Throwable th) {
            C46290ci.m82569a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final void mo50314c() {
        C47558bi a = C47831fm.m85006a("onServiceDisconnected");
        try {
            this.f121271a.mo5439d(new C46292ck());
            a.close();
            return;
        } catch (Throwable th) {
            C46290ci.m82569a(th, th);
        }
        throw th;
    }
}
