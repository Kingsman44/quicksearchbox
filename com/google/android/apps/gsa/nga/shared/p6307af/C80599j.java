package com.google.android.apps.gsa.nga.shared.p6307af;

import android.content.Intent;
import com.google.android.apps.gsa.nga.shared.android.C80939a;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.af.j */
/* compiled from: PG */
public final /* synthetic */ class C80599j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C80939a f221273a;

    public /* synthetic */ C80599j(C80939a aVar) {
        this.f221273a = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80939a aVar = this.f221273a;
        Intent intent = (Intent) obj;
        boolean z = true;
        if (!aVar.mo74725b(intent, true).isPresent() && !aVar.mo74725b(intent, false).isPresent()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
