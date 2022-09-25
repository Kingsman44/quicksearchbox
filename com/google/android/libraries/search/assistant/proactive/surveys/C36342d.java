package com.google.android.libraries.search.assistant.proactive.surveys;

import android.accounts.Account;
import android.app.Activity;
import androidx.core.p097i.C1970e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajz;
import java.util.ArrayList;
import p3186j$.util.StringJoiner;

/* renamed from: com.google.android.libraries.search.assistant.proactive.surveys.d */
/* compiled from: PG */
public final class C36342d {

    /* renamed from: a */
    public static final C59071e f94913a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.surveys.d");

    /* renamed from: b */
    public final Activity f94914b;

    /* renamed from: c */
    public final AccountId f94915c;

    /* renamed from: d */
    public final C36345f f94916d;

    /* renamed from: e */
    public final C46128f f94917e;

    /* renamed from: f */
    public final C36348i f94918f;

    /* renamed from: g */
    public final C46801dp f94919g;

    /* renamed from: h */
    public final C46723bg f94920h;

    /* renamed from: com.google.android.libraries.search.assistant.proactive.surveys.d$a */
    /* compiled from: PG */
    final class C36343a implements C46792di {

        /* renamed from: a */
        private final Activity f94921a;

        /* renamed from: b */
        private final C36345f f94922b;

        /* renamed from: c */
        private final C36348i f94923c;

        public C36343a(Activity activity, C36345f fVar, C36348i iVar) {
            this.f94921a = activity;
            this.f94922b = fVar;
            this.f94923c = iVar;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59104x c = C36342d.f94913a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotifHatsSurveyFrag");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(52293)).mo56386p("Error getting current TikTok account.");
        }

        /* renamed from: b */
        public final /* synthetic */ void mo18078b(Object obj) {
            Account account = (Account) obj;
            C58976aa aaVar = C58975e.f156826a;
            C36348i iVar = this.f94923c;
            String str = this.f94922b.f94927b;
            Activity activity = this.f94921a;
            ArrayList arrayList = new ArrayList();
            if (!this.f94922b.f94928c.isEmpty()) {
                arrayList.add(new C1970e("opa-notification-grouping-key", this.f94922b.f94928c));
            }
            if (!this.f94922b.f94929d.isEmpty()) {
                arrayList.add(new C1970e("opa-notification-ved", this.f94922b.f94929d));
            }
            C36345f fVar = this.f94922b;
            if ((fVar.f94926a & 8) != 0) {
                ajz ajz = fVar.f94930e;
                if (ajz == null) {
                    ajz = ajz.f158928q;
                }
                arrayList.add(new C1970e("opa-notification-sender", Integer.toString(ajz.f158936e)));
                arrayList.add(new C1970e("opa-notification-interaction-type", Integer.toString(ajz.f158937f)));
                long j = ajz.f158938g;
                if (j != 0) {
                    arrayList.add(new C1970e("opa-notification-3p-project-id", Long.toString(j)));
                }
                if (!ajz.f158943l.isEmpty()) {
                    StringJoiner stringJoiner = new StringJoiner(",");
                    for (Integer intValue : ajz.f158943l) {
                        stringJoiner.add(Integer.toString(intValue.intValue()));
                    }
                    arrayList.add(new C1970e("opa-notification-server-experiment-ids", stringJoiner.toString()));
                }
            }
            iVar.mo40131c(account, str, activity, arrayList);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C36342d(Activity activity, AccountId accountId, C36345f fVar, C46128f fVar2, C36348i iVar, C46801dp dpVar, C46723bg bgVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f94914b = activity;
        this.f94915c = accountId;
        this.f94916d = fVar;
        this.f94917e = fVar2;
        this.f94918f = iVar;
        this.f94919g = dpVar;
        this.f94920h = bgVar;
    }
}
