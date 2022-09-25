package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.search.C90507o;
import com.google.common.base.C58881cr;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.br */
/* compiled from: PG */
public final /* synthetic */ class C103945br implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C68214a f289295a;

    public /* synthetic */ C103945br(C68214a aVar) {
        this.f289295a = aVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        return Boolean.valueOf(((SharedPreferences) this.f289295a.mo27525b()).getLong(C90507o.f253035y, 0) > 0);
    }
}
