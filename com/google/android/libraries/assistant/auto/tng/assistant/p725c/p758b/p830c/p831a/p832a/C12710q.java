package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p832a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p760a.p761a.C12182h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p862c.p863a.C12890a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p862c.p863a.C12892c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p862c.p867c.C12895a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p862c.p867c.C12896b;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C12710q implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C12714u f39795a;

    /* renamed from: b */
    public final /* synthetic */ C12182h f39796b;

    public /* synthetic */ C12710q(C12714u uVar, C12182h hVar) {
        this.f39795a = uVar;
        this.f39796b = hVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C12714u uVar = this.f39795a;
        C12182h hVar = this.f39796b;
        if (hVar.mo20477c().isEmpty()) {
            return C60866ct.f164955a;
        }
        C12892c cVar = uVar.f39804d.f39807b;
        C12989g gVar = uVar.f39802b;
        C63088z zVar = (C63088z) hVar.mo20477c().get();
        if (!cVar.f40153b.containsKey(gVar)) {
            ((C59052c) ((C59052c) C12892c.f40152a.mo56226d()).mo56372aa(44535)).mo56389s("Unable to update dialog token ProtoDataStore for entrySurface: %s", gVar.name());
            return C60866ct.f164955a;
        }
        C12895a aVar = (C12895a) C12896b.f40155c.createBuilder();
        aVar.copyOnWrite();
        C12896b bVar = (C12896b) aVar.instance;
        zVar.getClass();
        bVar.f40157a |= 1;
        bVar.f40158b = zVar;
        return ((C42876ab) cVar.f40153b.get(gVar)).mo46039a(new C12890a((C12896b) aVar.build()), cVar.f40154c);
    }
}
