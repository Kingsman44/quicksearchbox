package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.content.res.Resources;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90037cp;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106379d;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109399b;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109415n;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109421t;
import com.google.android.apps.gsa.staticplugins.opa.p8375l.C109422u;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113984c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.assistant.p4008y.p4009a.C53556ap;
import com.google.assistant.p4008y.p4009a.C53592by;
import com.google.assistant.p4008y.p4009a.C53593bz;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.au */
/* compiled from: PG */
public final class C109103au {

    /* renamed from: a */
    public static final /* synthetic */ int f303812a = 0;

    /* renamed from: b */
    private static final C58495hd f303813b = C58495hd.m89901o("suggestion_make_call", Integer.valueOf(R.array.dialer_promo_deeplink_query_suggestions), "suggestion_send_message", Integer.valueOf(R.array.android_messages_promo_deeplink_query_suggestions));

    /* renamed from: c */
    private final C109399b f303814c;

    /* renamed from: d */
    private final C106391p f303815d;

    /* renamed from: e */
    private final C86124t f303816e;

    /* renamed from: f */
    private final C73841bf f303817f;

    /* renamed from: g */
    private final String f303818g;

    /* renamed from: h */
    private final String f303819h;

    public C109103au(String str, String str2, C86124t tVar, C109399b bVar, C106391p pVar, C73841bf bfVar) {
        this.f303818g = str;
        this.f303819h = str2;
        this.f303816e = tVar;
        this.f303814c = bVar;
        this.f303815d = pVar;
        this.f303817f = bfVar;
    }

    /* renamed from: c */
    private static void m181632c(C60870cx cxVar, String str) {
        C60856cj.m92911t(cxVar, new C109102at(), C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo97607a(C113984c cVar, int i) {
        if (cVar != C113984c.OVERAPP_DISCOVERY_QUERY_SUGGESTION || this.f303818g == null || this.f303816e.mo79746e(C90037cp.f248436aQ)) {
            String str = this.f303819h;
            if (str != null) {
                C58495hd hdVar = f303813b;
                if (hdVar.containsKey(str)) {
                    String[] stringArray = this.f303817f.mo65322a().getStringArray(((Integer) hdVar.get(this.f303819h)).intValue());
                    int nextInt = new Random().nextInt(stringArray.length);
                    C53592by byVar = (C53592by) C53593bz.f140658j.createBuilder();
                    String str2 = stringArray[nextInt];
                    byVar.copyOnWrite();
                    C53593bz bzVar = (C53593bz) byVar.instance;
                    str2.getClass();
                    bzVar.f140660a |= 1;
                    bzVar.f140661b = str2;
                    return C60856cj.m92900i(C58485gu.m89846n((C53593bz) byVar.build()));
                }
            }
            C109399b bVar = this.f303814c;
            C109422u uVar = bVar.f304692b;
            Resources a = ((C73841bf) bVar.f304691a.mo27525b()).mo65322a();
            C60870cx a2 = uVar.mo97816a();
            C60870cx b = uVar.mo97817b();
            return C60856cj.m92893b(a2, b).mo57334a(new C109415n(uVar, b, a2, i, a), C60826bg.f164896a);
        }
        C109399b bVar2 = this.f303814c;
        String str3 = this.f303818g;
        C109422u uVar2 = bVar2.f304692b;
        Resources a3 = ((C73841bf) bVar2.f304691a.mo27525b()).mo65322a();
        if (!uVar2.f304736b.mo79745c(C90037cp.f248597do).contains(C53556ap.OVERAPP_CONTEXT.name())) {
            return uVar2.mo97818c(str3, i, a3);
        }
        C60870cx a4 = uVar2.mo97816a();
        C60870cx b2 = ((C106391p) uVar2.f304743i.mo27525b()).mo95493b();
        return C60856cj.m92895d(a4, b2).mo57335b(new C109421t(uVar2, b2, str3, a4, i, a3), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo97608b(C113984c cVar, boolean z) {
        String str;
        if (cVar == C113984c.OVERAPP_DISCOVERY_QUERY_SUGGESTION && (str = this.f303818g) != null) {
            m181632c(this.f303815d.mo95494c(str), "Incrementing suggestion shown counter");
            if (z) {
                m181632c(C118826c.m197213c(((C42876ab) this.f303815d.f296744b.mo27525b()).mo46039a(C106379d.f296731a, C60826bg.f164896a)), "Increment input plate invoked counter");
            }
        }
    }
}
