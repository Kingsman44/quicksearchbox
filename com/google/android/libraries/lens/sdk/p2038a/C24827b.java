package com.google.android.libraries.lens.sdk.p2038a;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.sdk.a.b */
/* compiled from: PG */
public abstract class C24827b {

    /* renamed from: a */
    protected final List f67855a = new ArrayList();

    /* renamed from: b */
    public boolean f67856b;

    /* renamed from: c */
    public final C24826a f67857c = new C24826a(this);

    /* renamed from: d */
    protected final C24828c f67858d;

    protected C24827b(C24828c cVar) {
        this.f67858d = cVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo30025b(Bundle bundle);

    /* renamed from: h */
    public final void mo30026h() {
        C24841p.m45970a("onError", new Object[0]);
        this.f67856b = false;
    }

    /* renamed from: i */
    public final boolean mo30027i(Bundle bundle) {
        try {
            C24828c cVar = this.f67858d;
            C24841p.m45970a("send", new Object[0]);
            C24838m mVar = ((C24840o) cVar).f67882b;
            Executor executor = mVar.f67879f;
            ((C24837l) executor).f67873a.post(new C24830e(mVar, bundle));
            return true;
        } catch (RemoteException e) {
            C24841p.m45972c(e, "Failed to send request.", new Object[0]);
            mo30026h();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo30028j(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("SessionType", "SessionTypeAvs");
        bundle2.putString("EventType", str);
        bundle2.putBundle("Payload", bundle);
        if (!this.f67856b) {
            C24841p.m45970a("Lens session not connected, caching request.", new Object[0]);
            this.f67855a.add(bundle2);
            return;
        }
        mo30027i(bundle2);
    }
}
