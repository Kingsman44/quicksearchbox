package com.google.android.apps.gsa.staticplugins.nga.p8061f.p8062a;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.os.Bundle;
import com.google.android.apps.gsa.nga.api.C74669a;
import com.google.android.apps.gsa.nga.api.c;
import com.google.android.apps.gsa.nga.api.d;
import com.google.android.apps.gsa.nga.api.e;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C103189a implements C22864c {

    /* renamed from: a */
    public static final /* synthetic */ C103189a f287933a = new C103189a();

    private /* synthetic */ C103189a() {
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        Bundle bundle = (Bundle) obj;
        C74669a aVar = new C74669a();
        Optional ofNullable = Optional.ofNullable((AssistContent) bundle.getParcelable("assistContent"));
        Objects.requireNonNull(aVar);
        ofNullable.ifPresent(new c(aVar));
        Optional ofNullable2 = Optional.ofNullable((AssistStructure) bundle.getParcelable("assistStructure"));
        Objects.requireNonNull(aVar);
        ofNullable2.ifPresent(new d(aVar));
        Optional ofNullable3 = Optional.ofNullable(bundle.getBundle("assistDataBundle"));
        Objects.requireNonNull(aVar);
        ofNullable3.ifPresent(new e(aVar));
        return aVar.mo71046a();
    }
}
