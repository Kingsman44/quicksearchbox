package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.unifiedime.C118587e;
import com.google.android.apps.gsa.unifiedime.C118588f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.HashSet;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.aw */
/* compiled from: PG */
public final /* synthetic */ class C125487aw implements Function {

    /* renamed from: a */
    public final /* synthetic */ C125495bd f346046a;

    public /* synthetic */ C125487aw(C125495bd bdVar) {
        this.f346046a = bdVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C125495bd bdVar = this.f346046a;
        Map.Entry entry = (Map.Entry) obj;
        HashSet hashSet = new HashSet();
        C118587e eVar = (C118587e) C118588f.f330859e.createBuilder();
        int b = ((C125494bc) entry.getKey()).mo106987b();
        eVar.copyOnWrite();
        C118588f fVar = (C118588f) eVar.instance;
        fVar.f330861a |= 1;
        fVar.f330862b = b;
        int a = ((C125494bc) entry.getKey()).mo106986a();
        eVar.copyOnWrite();
        C118588f fVar2 = (C118588f) eVar.instance;
        fVar2.f330861a |= 2;
        fVar2.f330863c = a;
        eVar.mo103773a((C58485gu) Collection.EL.stream((java.util.Collection) entry.getValue()).filter(new C125489ay(bdVar, hashSet)).filter(new C125490az(bdVar, entry)).collect(C58370cn.f155946a));
        return (C118588f) eVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
