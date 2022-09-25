package com.google.android.apps.gsa.search.core.p6519al.p6699df.p6700a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6699df.C85355a;
import com.google.android.apps.gsa.search.core.service.p6852g.C86724d;
import com.google.android.apps.gsa.search.core.service.p6852g.C86731k;
import com.google.android.apps.gsa.search.core.service.p6852g.C86732l;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.search.core.al.df.a.b */
/* compiled from: PG */
public final class C85357b extends C86731k {

    /* renamed from: c */
    private final String f231152c;

    /* renamed from: d */
    private final String f231153d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private final Suggestion f231154e;

    /* renamed from: f */
    private final String f231155f;

    public C85357b(String str, Suggestion suggestion) {
        super("suggestfeedback", "suggestfeedback::launchSuggestFeedbackWithTag", C86732l.FIRE_AND_FORGET, C86724d.IDLE);
        this.f231152c = str;
        this.f231154e = suggestion;
        this.f231155f = "com.google.android.googlequicksearchbox.NEXUS_OPA_TAPAS_FEEDBACK";
    }

    /* renamed from: g */
    public final C60870cx mo78371g(Object obj) {
        ((C85355a) obj).mo78887b(this.f231152c, this.f231153d, this.f231154e, this.f231155f);
        return C118826c.f331423b;
    }
}
