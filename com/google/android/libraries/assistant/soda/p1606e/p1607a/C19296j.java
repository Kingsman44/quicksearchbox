package com.google.android.libraries.assistant.soda.p1606e.p1607a;

import com.google.android.libraries.assistant.p1363c.p1371b.p1372a.C16994a;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17035ab;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17036ac;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17039af;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17043aj;
import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17044ak;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.soda.e.a.j */
/* compiled from: PG */
public final /* synthetic */ class C19296j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C19299m f54019a;

    public /* synthetic */ C19296j(C19299m mVar) {
        this.f54019a = mVar;
    }

    public final C60870cx apply(Object obj) {
        C19299m mVar = this.f54019a;
        C17039af db = ((C19298l) C47245e.m84045a(mVar.f54022b, C19298l.class, (AccountId) obj)).mo24444db();
        C17043aj ajVar = (C17043aj) C17044ak.f49650c.createBuilder();
        C17035ab a = C16994a.m34087a(mVar.f54023c);
        a.copyOnWrite();
        C17036ac acVar = (C17036ac) a.instance;
        C17036ac acVar2 = C17036ac.f49640d;
        acVar.f49642a |= 2;
        acVar.f49644c = "*";
        ajVar.copyOnWrite();
        C17044ak akVar = (C17044ak) ajVar.instance;
        C17036ac acVar3 = (C17036ac) a.build();
        acVar3.getClass();
        akVar.f49653b = acVar3;
        akVar.f49652a |= 1;
        return db.mo23172b((C17044ak) ajVar.build());
    }
}
