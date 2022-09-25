package com.google.assistant.p3838ao.p3839a;

import com.google.common.p4526f.p4527a.C58974d;
import java.util.Comparator;

/* renamed from: com.google.assistant.ao.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C49428ae implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C49428ae f127672a = new C49428ae();

    private /* synthetic */ C49428ae() {
    }

    public final int compare(Object obj, Object obj2) {
        C49503d dVar = (C49503d) obj;
        C49503d dVar2 = (C49503d) obj2;
        C58974d dVar3 = C49429af.f127673a;
        int i = dVar2.f127724e;
        int i2 = dVar.f127724e;
        int i3 = i == i2 ? 0 : i < i2 ? -1 : 1;
        return i3 != 0 ? i3 : Double.compare(dVar2.f127723d, dVar.f127723d);
    }
}
