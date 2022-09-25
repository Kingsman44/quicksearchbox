package com.google.android.apps.gsa.search.core.p6519al.p6624bw.p6625a;

import com.google.android.apps.gsa.search.core.p6519al.p6624bw.C85031a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.al.bw.a.a */
/* compiled from: PG */
public final class C85032a extends C86731k {

    /* renamed from: c */
    private final List f230701c;

    public C85032a(List list) {
        super("photo_downloader", "photo_downloader::downloadPhotos", C86732l.CONTROLLED_BY_USER, C86724d.IDLE);
        this.f230701c = list;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        return ((C85031a) obj).mo78661a(this.f230701c);
    }
}
