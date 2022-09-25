package com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload;

import com.google.android.apps.gsa.shared.speech.hotword.C90586c;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p395al.p408c.p414c.p415a.C8456f;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Map;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.assistant.hotword.dsphotwordmodeldownload.b */
/* compiled from: PG */
public final /* synthetic */ class C18356b implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ List f52073a;

    /* renamed from: b */
    public final /* synthetic */ C29409fd f52074b;

    public /* synthetic */ C18356b(List list, C29409fd fdVar) {
        this.f52073a = list;
        this.f52074b = fdVar;
    }

    public final void accept(Object obj, Object obj2) {
        List list = this.f52073a;
        C29409fd fdVar = this.f52074b;
        C58974d dVar = C18359e.f52077a;
        Map.EL.forEach(C90586c.m147803a(Collections.unmodifiableMap(((C8456f) obj2).f29369a)), new C18354a(list, (Integer) obj, fdVar));
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
