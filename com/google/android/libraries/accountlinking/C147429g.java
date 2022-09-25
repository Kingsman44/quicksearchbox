package com.google.android.libraries.accountlinking;

import android.accounts.Account;
import android.content.Context;
import com.google.android.libraries.accountlinking.p10979b.C147412p;
import com.google.android.libraries.accountlinking.p10980c.C147416a;
import com.google.android.libraries.accountlinking.p10980c.C147417b;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p3562ao.p3563a.p3564a.p3565a.C45521a;
import com.google.p3562ao.p3563a.p3566b.C45522a;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* renamed from: com.google.android.libraries.accountlinking.g */
/* compiled from: PG */
public final class C147429g {

    /* renamed from: a */
    public static final C58495hd f397954a;

    /* renamed from: b */
    public static final C58495hd f397955b;

    /* renamed from: c */
    public final Context f397956c;

    /* renamed from: d */
    public C147431i f397957d;

    /* renamed from: e */
    public final C147417b f397958e;

    /* renamed from: f */
    public final C147412p f397959f;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C147434l.APP_FLIP, C45521a.MOBILE_APP_REDIRECT_FLOW);
        gzVar.mo55429h(C147434l.STREAMLINED_LINK_ACCOUNT, C45521a.GSI_OAUTH_LINKING_FLOW);
        gzVar.mo55429h(C147434l.STREAMLINED_CREATE_ACCOUNT, C45521a.GSI_OAUTH_CREATION_FLOW);
        gzVar.mo55429h(C147434l.WEB_OAUTH, C45521a.OAUTH2_FLOW);
        f397954a = gzVar.mo55427f(true);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(C45522a.DATA_USAGE_NOTICE_TYPE_LINKING_INFO, C147433k.LINKING_INFO);
        gzVar2.mo55429h(C45522a.DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT, C147433k.CAPABILITY_CONSENT);
        f397955b = gzVar2.mo55427f(true);
    }

    public C147429g(Context context, C147431i iVar) {
        this.f397956c = context;
        this.f397957d = iVar;
        try {
            C147416a aVar = new C147416a(context, iVar.f397972f, iVar.f397973g);
            this.f397958e = aVar;
            C147416a aVar2 = aVar;
            this.f397959f = new C147412p(context, aVar.f397939a, aVar.f397940b, C58833ax.m90833j((Object) null), C58833ax.m90833j(iVar.f397969c));
        } catch (IllegalStateException e) {
            throw new C147432j(1, "Initialization failed", e);
        }
    }

    /* renamed from: a */
    public static int m240349a() {
        return new Random().nextInt(2147483646) + 1;
    }

    /* renamed from: d */
    private final C60870cx m240350d(C60870cx cxVar, Account account, String str, int i, Set set, boolean z, Set set2) {
        C60870cx cxVar2 = cxVar;
        return C60922j.m93044g(cxVar, new C147349a(this, account, str, i, set, set2, z), C60826bg.f164896a);
    }

    /* renamed from: e */
    private static List m240351e(Set set) {
        return C58485gu.m89841i(C58431eu.m89654f(set).mo55247g(C147420d.f397946a).mo55248h());
    }

    /* renamed from: b */
    public final C60870cx mo124162b(Account account, String str, Set set, int i) {
        C60870cx e = this.f397959f.mo124159e(i, account, str, new ArrayList(set), m240351e(this.f397957d.f397967a), this.f397957d.f397971e, false, C58485gu.m89845m(), this.f397957d.f397968b);
        C58733pz pzVar = C58733pz.f156496a;
        return m240350d(e, account, str, i, pzVar, false, pzVar);
    }

    /* renamed from: c */
    public final C60870cx mo124163c(Account account, String str, Set set, Set set2, int i) {
        return m240350d(this.f397959f.mo124159e(i, account, str, new ArrayList(set), m240351e(this.f397957d.f397967a), this.f397957d.f397971e, true, C58485gu.m89842j(set2), this.f397957d.f397968b), account, str, i, C58733pz.f156496a, true, set2);
    }
}
