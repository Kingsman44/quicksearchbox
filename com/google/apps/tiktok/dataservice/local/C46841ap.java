package com.google.apps.tiktok.dataservice.local;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.apps.tiktok.dataservice.local.ap */
/* compiled from: PG */
final class C46841ap {

    /* renamed from: a */
    public C46839an f122265a;

    public C46841ap(C46839an anVar) {
        this.f122265a = anVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50849a() {
        Object obj;
        C19559g.m37304c();
        C58838bb.m90866a(this.f122265a, "LocalSubscriptionStateReference used after free.");
        C46839an anVar = this.f122265a;
        C58838bb.m90884s(anVar.mo50844a().mo56113h(), "LocalSubscriptionState detected an atomicity failure. Previous pendingResult was already cleared. If this Exception is ever thrown, it is a major bug, and should be reported to TikTok as a P1 along with the Sponge or Listnr error report. Please file at go/tiktok/bug.");
        try {
            obj = new C46850d(C60856cj.m92909r((Future) anVar.mo50844a().mo56107c()));
        } catch (ExecutionException e) {
            obj = new C46849c(e.getCause());
        }
        this.f122265a = new C46848b(anVar.mo50845b(), C58836b.f156633a, C58833ax.m90834k(obj), anVar.mo50847d());
    }
}
