package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ag */
/* compiled from: PG */
final class C108209ag extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ String f300970a;

    /* renamed from: b */
    final /* synthetic */ Map f300971b;

    /* renamed from: c */
    final /* synthetic */ C108212aj f300972c;

    public C108209ag(C108212aj ajVar, String str, Map map) {
        this.f300972c = ajVar;
        this.f300970a = str;
        this.f300971b = map;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C108212aj ajVar = this.f300972c;
        String str = this.f300970a;
        Map map = this.f300971b;
        C108211ai aiVar = ajVar.f300982h;
        if (aiVar != null) {
            aiVar.mo96592a(ajVar, str, map);
        }
    }
}
