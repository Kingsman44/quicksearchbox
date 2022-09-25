package com.google.android.apps.gsa.search.core.p6519al.p6606bp.p6609b;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84920a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.bp.b.i */
/* compiled from: PG */
public final class C84979i extends C86731k {

    /* renamed from: c */
    private final Uri f230650c;

    /* renamed from: d */
    private final String f230651d;

    public C84979i(Uri uri, String str) {
        super("opaappactions", "opaappactions::handleAppShortcutDeeplink", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230650c = uri;
        this.f230651d = str;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C84920a) obj).mo78587b(this.f230650c, this.f230651d);
    }
}
