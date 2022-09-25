package com.google.android.apps.gsa.assistant.settings.features.p545ag;

import android.view.View;
import com.google.android.apps.gsa.assistant.settings.features.at.a.e;
import com.google.android.apps.gsa.assistant.settings.shared.ui.ItemView;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ag.n */
/* compiled from: PG */
public final /* synthetic */ class C10048n implements Function {

    /* renamed from: a */
    public final /* synthetic */ View f34271a;

    public /* synthetic */ C10048n(View view) {
        this.f34271a = view;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        View view = this.f34271a;
        C58974d dVar = C10054t.f34279a;
        int a = ((C10053s) obj).mo18168a();
        int i = ItemView.a;
        return new e(view.findViewById(a));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
