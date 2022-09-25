package com.google.android.apps.gsa.search.core.p6519al.p6699df.p6700a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6699df.C85355a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.df.a.a */
/* compiled from: PG */
public final class C85356a extends C86731k {

    /* renamed from: c */
    private final String f231149c;

    /* renamed from: d */
    private final String f231150d;

    /* renamed from: e */
    private final Suggestion f231151e;

    public C85356a(String str, String str2, Suggestion suggestion) {
        super("suggestfeedback", "suggestfeedback::launchSuggestFeedback", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231149c = str;
        this.f231150d = str2;
        this.f231151e = suggestion;
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85355a) obj).mo78886a(this.f231149c, this.f231150d, this.f231151e);
        return C118826c.f331423b;
    }
}
