package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.chatui.C108430ik;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.hg */
/* compiled from: PG */
public final /* synthetic */ class C109200hg implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C109258hw f304048a;

    /* renamed from: b */
    public final /* synthetic */ List f304049b;

    public /* synthetic */ C109200hg(C109258hw hwVar, List list) {
        this.f304048a = hwVar;
        this.f304049b = list;
    }

    public final void accept(Object obj) {
        C109258hw hwVar = this.f304048a;
        this.f304049b.add(0, (C108430ik) obj);
        ((C109332jw) hwVar.f304300w.mo27525b()).mo97766b();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
