package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6380g.p6381a;

import android.widget.ImageView;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.g.a.j */
/* compiled from: PG */
public final /* synthetic */ class C81613j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ String f223263a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f223264b;

    public /* synthetic */ C81613j(String str, ImageView imageView) {
        this.f223263a = str;
        this.f223264b = imageView;
    }

    public final void accept(Object obj) {
        String str = this.f223263a;
        ImageView imageView = this.f223264b;
        C59071e eVar = C81603ae.f223221a;
        C80905at.m128763g(((C91189au) obj).mo85421i(str, imageView), C81612i.f223262a);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
