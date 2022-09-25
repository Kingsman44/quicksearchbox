package com.google.android.apps.gsa.search.core.p6519al.p6526ac.p6527a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6526ac.C84624a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.ac.a.k */
/* compiled from: PG */
public final class C84635k extends C86731k {

    /* renamed from: c */
    private final Uri f230286c;

    public C84635k(Uri uri) {
        super("customtabs", "customtabs::reopenWithoutCustomTabs", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230286c = uri;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84624a) obj).mo78390j(this.f230286c);
    }
}
