package com.google.android.apps.gsa.staticplugins.settings;

import com.google.android.apps.gsa.nga.api.C74713bn;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.settings.j */
/* compiled from: PG */
public final /* synthetic */ class C117318j implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C117320l f325665a;

    public /* synthetic */ C117318j(C117320l lVar) {
        this.f325665a = lVar;
    }

    public final Object apply(Object obj) {
        C117320l lVar = this.f325665a;
        String str = (String) obj;
        boolean z = false;
        if (((Optional) lVar.f325669c.mo27525b()).isPresent() && ((C74713bn) ((Optional) lVar.f325669c.mo27525b()).get()).mo71076a()) {
            z = true;
        }
        return C60856cj.m92900i(Boolean.valueOf(z));
    }
}
