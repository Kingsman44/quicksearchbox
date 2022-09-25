package com.google.android.apps.search.assistant.verticals.ambient.settings;

import android.content.Intent;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8227n.C106590b;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.p9944o.C131101a;
import com.google.android.apps.search.assistant.verticals.ambient.trigger.C131701c;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.apps.tiktok.p3643g.C47102r;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.l */
/* compiled from: PG */
public final class C131570l implements C47102r {

    /* renamed from: a */
    private final C58974d f359475a;

    /* renamed from: b */
    private final ExecutorService f359476b;

    /* renamed from: c */
    private final C32240a f359477c;

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.l$a */
    /* compiled from: PG */
    public interface C131571a {
        /* renamed from: aM */
        C131101a mo110192aM();
    }

    public C131570l(C130603a aVar, C32240a aVar2, ExecutorService executorService) {
        C58974d b = aVar.mo109740b(this);
        this.f359475a = b;
        this.f359477c = aVar2;
        this.f359476b = executorService;
        ((C58970a) ((C58970a) b.mo56224b()).mo56372aa(39069)).mo56386p("#SmartspaceSettingsChangeReceiver");
    }

    /* renamed from: b */
    public final C60870cx mo20087b(Intent intent, int i) {
        String action = intent.getAction();
        boolean booleanExtra = intent.getBooleanExtra("ss-opt-in-changed", false);
        if (C58837ba.m90859h(action)) {
            ((C58970a) ((C58970a) this.f359475a.mo56224b()).mo56372aa(39068)).mo56386p("Received intent without action.");
            return C60866ct.f164955a;
        }
        ((C58970a) ((C58970a) this.f359475a.mo56224b()).mo56372aa(39066)).mo56359L("#onReceive:%s result code: %d, extras: %s", intent, Integer.valueOf(i), intent.getExtras());
        if (!action.equals("com.google.android.googlequicksearchbox.AA_ACTION_REFRESH") || !booleanExtra) {
            ((C58970a) ((C58970a) this.f359475a.mo56224b()).mo56372aa(39067)).mo56386p("Received intent which is not a smartspace settings change signal.");
            return C60866ct.f164955a;
        }
        return C47633f.m84733g(this.f359477c.f86461a.mo104411a(C131571a.class)).mo51515h(C131569k.f359474a, this.f359476b).mo51516i(new C131568j(C131701c.m214153c(C106590b.f297189a)), this.f359476b);
    }
}
