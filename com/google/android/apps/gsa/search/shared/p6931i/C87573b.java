package com.google.android.apps.gsa.search.shared.p6931i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assist.p501a.C9325m;
import com.google.android.apps.gsa.shared.util.C91070p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.i.b */
/* compiled from: PG */
public final class C87573b {

    /* renamed from: b */
    private static final C59071e f236595b = C59071e.m91332i("com.google.android.apps.gsa.search.shared.i.b");

    /* renamed from: a */
    public final C9325m f236596a;

    /* renamed from: c */
    private final Context f236597c;

    /* renamed from: d */
    private final ComponentName f236598d;

    public C87573b(Context context, ComponentName componentName, C9325m mVar) {
        this.f236597c = context;
        this.f236598d = componentName;
        this.f236596a = mVar;
    }

    /* renamed from: a */
    public static Intent m142357a(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("InteractorSessionFlags", 8);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return intent;
    }

    /* renamed from: f */
    private final Intent m142358f(Intent intent, int i) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f236596a.mo17534a()) {
            C59104x d = f236595b.mo56226d();
            d.mo56378ag(C58975e.f156826a, "VISessionStarter");
            ((C59052c) ((C59052c) d).mo56372aa(9831)).mo56386p("Caller should have checked if we could have started a voice session before calling this method. Noop.");
            return null;
        }
        intent.putExtra("InteractorMode", i);
        Bundle bundle = new Bundle();
        bundle.putParcelable("voice_intent", intent);
        return new Intent("com.google.android.voiceinteraction.START_VOICE_INTERACTION").setComponent(this.f236598d).putExtras(bundle);
    }

    /* renamed from: b */
    public final Intent mo81704b(Bundle bundle) {
        return m142358f(m142357a(bundle), 1);
    }

    /* renamed from: c */
    public final void mo81705c(Bundle bundle) {
        mo81707e(m142357a(bundle), 1);
    }

    /* renamed from: d */
    public final void mo81706d(Bundle bundle) {
        mo81707e(m142357a(bundle), 1);
    }

    /* renamed from: e */
    public final void mo81707e(Intent intent, int i) {
        Intent f = m142358f(intent, i);
        if (f != null) {
            C91070p.m148777b(this.f236597c, f);
        }
    }
}
