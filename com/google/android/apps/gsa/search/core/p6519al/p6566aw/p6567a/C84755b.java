package com.google.android.apps.gsa.search.core.p6519al.p6566aw.p6567a;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6566aw.C84753a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.aw.a.b */
/* compiled from: PG */
public final class C84755b extends C86731k {

    /* renamed from: c */
    private final Uri f230386c;

    /* renamed from: d */
    private final boolean f230387d;

    public C84755b(Uri uri, boolean z) {
        super("networkimageloader", "networkimageloader::openFile", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230386c = uri;
        this.f230387d = z;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84753a) obj).mo78461a(this.f230386c, this.f230387d);
    }
}
