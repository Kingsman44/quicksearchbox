package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.nga.shared.p6309ag.p6310a.C80606e;
import com.google.android.libraries.gsa.p1876k.C22870f;
import java.io.File;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ez */
/* compiled from: PG */
public final /* synthetic */ class C104034ez implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C104037fb f289485a;

    public /* synthetic */ C104034ez(C104037fb fbVar) {
        this.f289485a = fbVar;
    }

    public final void run() {
        C104037fb fbVar = this.f289485a;
        Locale b = fbVar.f289491d.mo93859b();
        if (b.equals(C80606e.f221278a)) {
            String path = new File(fbVar.f289492e.getDir("g3_models", 0), b.toLanguageTag()).getPath();
            ((C80606e) fbVar.f289493f.mo27525b()).mo74364d(path, !C80606e.m128235c(path));
        }
    }
}
