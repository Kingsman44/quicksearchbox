package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import com.google.assistant.p4008y.p4009a.C53541aa;
import com.google.assistant.p4008y.p4009a.C53542ab;
import com.google.assistant.p4008y.p4009a.C53610s;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.w */
/* compiled from: PG */
public final /* synthetic */ class C127707w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C53610s f351587a;

    public /* synthetic */ C127707w(C53610s sVar) {
        this.f351587a = sVar;
    }

    public final Object apply(Object obj) {
        C53610s sVar = this.f351587a;
        C53541aa aaVar = (C53541aa) ((C53542ab) obj).toBuilder();
        aaVar.copyOnWrite();
        ((C53542ab) aaVar.instance).f140511a = C53542ab.emptyProtobufList();
        C53542ab abVar = sVar.f140714a;
        if (abVar == null) {
            abVar = C53542ab.f140509b;
        }
        aaVar.mo53994a(abVar.f140511a);
        return (C53542ab) aaVar.build();
    }
}
