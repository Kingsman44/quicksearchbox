package com.google.apps.tiktok.account.data.manager;

import android.os.Bundle;
import androidx.p104d.p105a.C2164c;

/* renamed from: com.google.apps.tiktok.account.data.manager.br */
/* compiled from: PG */
final class C46272br extends C46284cc {

    /* renamed from: a */
    private final C2164c f121259a;

    public C46272br(C2164c cVar) {
        this.f121259a = cVar;
    }

    /* renamed from: a */
    public final void mo50308a(Bundle bundle) {
        try {
            this.f121259a.mo5439d((Throwable) bundle.getSerializable("exception"));
        } catch (RuntimeException e) {
            this.f121259a.mo5439d(e);
        }
    }

    /* renamed from: b */
    public final void mo50309b() {
        this.f121259a.mo5437b((Object) null);
    }
}
