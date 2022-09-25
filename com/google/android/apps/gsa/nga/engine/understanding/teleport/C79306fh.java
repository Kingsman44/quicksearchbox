package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.fh */
/* compiled from: PG */
public final /* synthetic */ class C79306fh implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79306fh f217800a = new C79306fh();

    private /* synthetic */ C79306fh() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80053ag agVar;
        C80047aa aaVar = (C80047aa) obj;
        if (aaVar.f219657a == 10) {
            agVar = (C80053ag) aaVar.f219658b;
        } else {
            agVar = C80053ag.f219675f;
        }
        return Collection.EL.stream(agVar.f219679c);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
