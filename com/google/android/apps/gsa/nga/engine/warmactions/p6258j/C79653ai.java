package com.google.android.apps.gsa.nga.engine.warmactions.p6258j;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79573e;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79574f;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.j.ai */
/* compiled from: PG */
public final /* synthetic */ class C79653ai implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f218474a;

    public /* synthetic */ C79653ai(String str) {
        this.f218474a = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        String str = this.f218474a;
        C79689br brVar = (C79689br) obj;
        brVar.mo74191c(str);
        brVar.mo74190b(str);
        C79573e eVar = (C79573e) C79574f.f218345d.createBuilder();
        C79570b bVar = C79570b.MEDIA;
        eVar.copyOnWrite();
        C79574f fVar = (C79574f) eVar.instance;
        fVar.f218349c = bVar.f218339o;
        fVar.f218347a |= 2;
        brVar.mo74192d((C79574f) eVar.build());
        return brVar.mo74189a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
