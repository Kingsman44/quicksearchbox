package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C83009r;
import com.google.android.libraries.assistant.portable.p1586b.C19087s;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.assistant.p3745ab.C48219ae;
import com.google.assistant.p3745ab.C48220af;
import com.google.assistant.p3745ab.C48221ag;
import com.google.assistant.p3745ab.C48222ah;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.bh */
/* compiled from: PG */
public final /* synthetic */ class C79758bh implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C79782ce f218687a;

    public /* synthetic */ C79758bh(C79782ce ceVar) {
        this.f218687a = ceVar;
    }

    public final void accept(Object obj) {
        C19087s sVar = this.f218687a.f218728d;
        C48219ae aeVar = (C48219ae) C48220af.f124756b.createBuilder();
        C48221ag agVar = (C48221ag) C48222ah.f124759b.createBuilder();
        String str = ((C83009r) obj).f226519b;
        agVar.copyOnWrite();
        str.getClass();
        ((C48222ah) agVar.instance).f124761a = str;
        aeVar.copyOnWrite();
        C48222ah ahVar = (C48222ah) agVar.build();
        ahVar.getClass();
        ((C48220af) aeVar.instance).f124758a = ahVar;
        sVar.copyOnWrite();
        C19088t tVar = (C19088t) sVar.instance;
        C48220af afVar = (C48220af) aeVar.build();
        C19088t tVar2 = C19088t.f53533p;
        afVar.getClass();
        tVar.f53538d = afVar;
        tVar.f53535a |= 4;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
