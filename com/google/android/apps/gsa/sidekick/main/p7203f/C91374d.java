package com.google.android.apps.gsa.sidekick.main.p7203f;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60870cx;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7718hj;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.f.d */
/* compiled from: PG */
public interface C91374d extends C90991b {

    /* renamed from: a */
    public static final long f254942a = TimeUnit.DAYS.toSeconds(1);

    /* renamed from: b */
    public static final C58528ij f254943b = C58528ij.m90012L(C7681g.DISMISS_NOTIFICATION, C7681g.DISMISS, C7681g.CLICK_NOTIFICATION);

    /* renamed from: c */
    public static final C58528ij f254944c = C58528ij.m90013M(C7681g.VIEW, C7681g.CARD_VISIBLE, C7681g.FOREGROUND_START, C7681g.FOREGROUND_END);

    /* renamed from: d */
    public static final C7681g[] f254945d = {C7681g.AD_DOMAIN_BLOCK, C7681g.BILINGUAL_OPT_OUT, C7681g.INTEREST_PICKER_ADD, C7681g.INTEREST_PICKER_CLEAR, C7681g.INTEREST_PICKER_REMOVE, C7681g.HEART_REACTION, C7681g.HEART_REACTION_UNDO};

    static {
        C58528ij.m90014N(C7681g.VIEW, C7681g.CARD_VISIBLE, C7681g.DISPLAYED_NOTIFICATION, C7681g.FOREGROUND_START, C7681g.FOREGROUND_END);
    }

    /* renamed from: a */
    C60870cx mo85681a(C7718hj hjVar, C7708h hVar);

    /* renamed from: b */
    C60870cx mo85682b();

    /* renamed from: c */
    C60870cx mo85683c(boolean z, C7708h hVar);

    /* renamed from: e */
    C60870cx mo85684e();

    /* renamed from: f */
    C60870cx mo85685f(C7718hj hjVar, C7708h hVar);

    /* renamed from: g */
    C60870cx mo85686g(C7718hj hjVar, C7708h hVar);

    /* renamed from: h */
    C60870cx mo85687h();

    /* renamed from: i */
    C60870cx mo85688i(C7718hj hjVar, C7708h hVar);

    /* renamed from: j */
    C60870cx mo85689j(C7718hj hjVar, C7708h hVar);

    /* renamed from: k */
    C60870cx mo85690k(C7718hj hjVar, C7708h hVar, C7669fo foVar);

    /* renamed from: l */
    C60870cx mo85691l(List list);

    /* renamed from: m */
    C60870cx mo85692m(List list);

    /* renamed from: n */
    void mo85693n(boolean z);

    /* renamed from: o */
    C60870cx mo85694o(int i);
}
