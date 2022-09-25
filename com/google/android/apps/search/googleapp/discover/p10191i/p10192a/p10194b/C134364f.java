package com.google.android.apps.search.googleapp.discover.p10191i.p10192a.p10194b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4923b.p4925b.C64241b;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.android.apps.search.googleapp.discover.i.a.b.f */
/* compiled from: PG */
final class C134364f extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C21313t f366001a;

    /* renamed from: b */
    final /* synthetic */ C64241b f366002b;

    public C134364f(C21313t tVar, C64241b bVar) {
        this.f366001a = tVar;
        this.f366002b = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C21313t tVar = this.f366001a;
        CommandOuterClass$Command commandOuterClass$Command = this.f366002b.f173704k;
        if (commandOuterClass$Command == null) {
            commandOuterClass$Command = CommandOuterClass$Command.f179510a;
        }
        tVar.mo26124a(commandOuterClass$Command, C21311r.m40252k().mo26698a()).mo61453k();
    }
}
