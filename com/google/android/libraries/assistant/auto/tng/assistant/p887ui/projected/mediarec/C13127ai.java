package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13045g;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52568wo;
import java.util.Set;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.ai */
/* compiled from: PG */
public final /* synthetic */ class C13127ai implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C13045g f40708a;

    /* renamed from: b */
    public final /* synthetic */ Set f40709b;

    public /* synthetic */ C13127ai(C13045g gVar, Set set) {
        this.f40708a = gVar;
        this.f40709b = set;
    }

    public final void accept(Object obj) {
        C13045g gVar = this.f40708a;
        Set set = this.f40709b;
        C52560wg wgVar = (C52560wg) obj;
        gVar.mo20877a(wgVar);
        C52568wo woVar = wgVar.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        set.add(woVar.f137998e);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
