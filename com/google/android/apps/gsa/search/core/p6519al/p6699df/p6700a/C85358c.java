package com.google.android.apps.gsa.search.core.p6519al.p6699df.p6700a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6699df.C85355a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.core.al.df.a.c */
/* compiled from: PG */
public final class C85358c extends C86731k {

    /* renamed from: c */
    private final String f231156c;

    /* renamed from: d */
    private final Map f231157d;

    public C85358c(String str, Map map) {
        super("suggestfeedback", "suggestfeedback::submitSuggestFeedback", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231156c = str;
        this.f231157d = map;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85355a) obj).mo78888c(this.f231156c, this.f231157d);
        return C118826c.f331423b;
    }
}
