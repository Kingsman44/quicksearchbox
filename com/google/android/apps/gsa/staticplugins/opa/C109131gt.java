package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.gt */
/* compiled from: PG */
public final /* synthetic */ class C109131gt implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C109258hw f303897a;

    /* renamed from: b */
    public final /* synthetic */ List f303898b;

    public /* synthetic */ C109131gt(C109258hw hwVar, List list) {
        this.f303897a = hwVar;
        this.f303898b = list;
    }

    public final void accept(Object obj) {
        C109258hw hwVar = this.f303897a;
        this.f303898b.add(0, (C108430ik) obj);
        ((C109332jw) hwVar.f304300w.mo27525b()).mo97766b();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
