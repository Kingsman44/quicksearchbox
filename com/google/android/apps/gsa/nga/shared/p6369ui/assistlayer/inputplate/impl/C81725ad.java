package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.inputplate.impl;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80859e;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80870p;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80871q;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81564g;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.inputplate.impl.ad */
/* compiled from: PG */
final class C81725ad extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ URLSpan f223569a;

    /* renamed from: b */
    final /* synthetic */ C81763bo f223570b;

    public C81725ad(C81763bo boVar, URLSpan uRLSpan) {
        this.f223570b = boVar;
        this.f223569a = uRLSpan;
    }

    public final void onClick(View view) {
        C81763bo boVar = this.f223570b;
        String url = this.f223569a.getURL();
        C81772bx bxVar = boVar.f223623a;
        bxVar.f223661m.mo75430a(boVar.f223624b);
        C81564g gVar = bxVar.f223666r;
        C80859e eVar = (C80859e) C80831aj.f221751c.createBuilder();
        C80870p pVar = (C80870p) C80871q.f221819b.createBuilder();
        pVar.copyOnWrite();
        url.getClass();
        ((C80871q) pVar.instance).f221821a = url;
        eVar.copyOnWrite();
        C80831aj ajVar = (C80831aj) eVar.instance;
        C80871q qVar = (C80871q) pVar.build();
        qVar.getClass();
        ajVar.f221754b = qVar;
        ajVar.f221753a = 19;
        gVar.mo73552a((C80831aj) eVar.build());
    }
}
