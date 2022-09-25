package com.google.android.apps.gsa.staticplugins.opa.tapas.p8471a;

import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58835az;
import com.google.common.p4522b.C58495hd;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.a.n */
/* compiled from: PG */
public final /* synthetic */ class C111064n implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C111071u f309282a;

    /* renamed from: b */
    public final /* synthetic */ String f309283b;

    /* renamed from: c */
    public final /* synthetic */ String f309284c;

    /* renamed from: d */
    public final /* synthetic */ C58495hd f309285d;

    public /* synthetic */ C111064n(C111071u uVar, String str, String str2, C58495hd hdVar) {
        this.f309282a = uVar;
        this.f309283b = str;
        this.f309284c = str2;
        this.f309285d = hdVar;
    }

    public final Object get() {
        C111071u uVar = this.f309282a;
        String str = this.f309283b;
        String str2 = this.f309284c;
        Optional b = uVar.f309296c.mo98993b(Optional.m71637of(str), Optional.m71637of(str2), this.f309285d);
        if (b.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return ((Intent) ((C58835az) b.get()).f156631a).toUri(1);
    }
}
