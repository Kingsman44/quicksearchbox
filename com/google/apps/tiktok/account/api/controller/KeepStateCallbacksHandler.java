package com.google.apps.tiktok.account.api.controller;

import android.os.Bundle;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.concurrent.futuresmixin.C46435a;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import java.util.ArrayList;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class KeepStateCallbacksHandler implements C2376g {

    /* renamed from: a */
    public final C46435a f120795a = new C46435a("KeepStateCallbacksHandler");

    /* renamed from: b */
    public C46004bo f120796b;

    /* renamed from: c */
    private final C47215a f120797c;

    /* renamed from: d */
    private final List f120798d = new ArrayList();

    public KeepStateCallbacksHandler(C47215a aVar) {
        C69664n.m101061g(aVar, "fragmentHost");
        this.f120797c = aVar;
        aVar.getLifecycle().mo5790b(this);
        aVar.getSavedStateRegistry().mo8585b("tiktok_keep_state_callback_handler", new C46023cg(this));
    }

    /* renamed from: g */
    public final void mo50112g() {
        C19559g.m37304c();
        C46004bo boVar = this.f120796b;
        if (boVar != null) {
            int i = boVar.f120848a;
            if (boVar.f120849b == 1) {
                ((C46022cf) this.f120795a.mo50439b(i)).mo50161a();
            }
            this.f120796b = null;
        }
    }

    /* renamed from: gV */
    public final void mo3520gV(C2391v vVar) {
        C46004bo boVar = null;
        Bundle a = this.f120797c.getSavedStateRegistry().f13079d ? this.f120797c.getSavedStateRegistry().mo8584a("tiktok_keep_state_callback_handler") : null;
        if (a != null) {
            this.f120795a.mo50442e(a);
            if (!a.containsKey("KSCH$AC$callbacks_id")) {
                if (a.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
            } else if (a.containsKey("KSCH$AC$callbacks_state")) {
                boVar = new C46004bo(a.getInt("KSCH$AC$callbacks_id"), a.getInt("KSCH$AC$callbacks_state"));
            } else {
                throw new IllegalStateException("Check failed.");
            }
            this.f120796b = boVar;
        }
        for (C46022cf d : this.f120798d) {
            this.f120795a.mo50441d(d);
        }
        this.f120798d.clear();
    }

    /* renamed from: gW */
    public final /* synthetic */ void mo3521gW(C2391v vVar) {
    }

    /* renamed from: gX */
    public final /* synthetic */ void mo3522gX(C2391v vVar) {
    }

    /* renamed from: gY */
    public final /* synthetic */ void mo3523gY(C2391v vVar) {
    }

    /* renamed from: gZ */
    public final /* synthetic */ void mo3524gZ(C2391v vVar) {
    }

    /* renamed from: ha */
    public final /* synthetic */ void mo3525ha(C2391v vVar) {
    }
}
