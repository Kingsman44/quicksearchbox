package com.google.android.libraries.assistant.auto.tng.media.mediabrowser.p1063b;

import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61747i;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61751m;
import com.google.knowledge.p4661a.p4662a.C61757s;
import com.google.knowledge.p4661a.p4662a.C61758t;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.mediabrowser.b.b */
/* compiled from: PG */
public final /* synthetic */ class C14017b implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C61751m f42622a;

    /* renamed from: b */
    public final /* synthetic */ Map f42623b;

    public /* synthetic */ C14017b(C61751m mVar, Map map) {
        this.f42622a = mVar;
        this.f42623b = map;
    }

    public final void accept(Object obj) {
        C61751m mVar = this.f42622a;
        Map map = this.f42623b;
        String str = (String) obj;
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        str.getClass();
        hVar.f166793a |= 2;
        hVar.f166796d = str;
        C61747i iVar = (C61747i) C61748j.f166800d.createBuilder();
        C61757s sVar = (C61757s) C61758t.f166824c.createBuilder();
        String str2 = (String) map.get(str);
        sVar.copyOnWrite();
        C61758t tVar = (C61758t) sVar.instance;
        str2.getClass();
        tVar.f166826a = 1;
        tVar.f166827b = str2;
        C61758t tVar2 = (C61758t) sVar.build();
        iVar.copyOnWrite();
        C61748j jVar = (C61748j) iVar.instance;
        tVar2.getClass();
        jVar.f166803b = tVar2;
        jVar.f166802a = 3;
        gVar.copyOnWrite();
        C61746h hVar2 = (C61746h) gVar.instance;
        C61748j jVar2 = (C61748j) iVar.build();
        jVar2.getClass();
        hVar2.f166797e = jVar2;
        hVar2.f166793a |= 4;
        mVar.mo58185d((C61746h) gVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
