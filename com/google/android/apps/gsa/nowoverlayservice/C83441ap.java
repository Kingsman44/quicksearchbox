package com.google.android.apps.gsa.nowoverlayservice;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import com.google.android.apps.gsa.search.shared.overlay.C87620a;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.ap */
/* compiled from: PG */
final class C83441ap extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ boolean f227433a;

    /* renamed from: b */
    final /* synthetic */ C83444as f227434b;

    public C83441ap(C83444as asVar, boolean z) {
        this.f227434b = asVar;
        this.f227433a = z;
    }

    public final void onAnimationEnd(Animator animator) {
        C83444as asVar = this.f227434b;
        boolean z = this.f227433a;
        C87620a aVar = asVar.f227448L;
        if (aVar != null) {
            aVar.mo76799h(z);
        }
        if (z) {
            new Handler().post(new C83442aq(asVar));
        } else {
            asVar.mo76778c();
        }
    }
}
