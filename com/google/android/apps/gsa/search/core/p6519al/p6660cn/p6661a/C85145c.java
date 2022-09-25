package com.google.android.apps.gsa.search.core.p6519al.p6660cn.p6661a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6660cn.C85142a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.cn.a.c */
/* compiled from: PG */
public final class C85145c extends C86731k {

    /* renamed from: c */
    private final Uri f230871c;

    public C85145c(Uri uri) {
        super("save", "save::isSaved", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230871c = uri;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85142a) obj).mo78732a(this.f230871c);
    }
}
