package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import android.content.res.Resources;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e;
import com.google.android.apps.gsa.search.shared.actions.util.C87486h;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.e */
/* compiled from: PG */
final class C93338e implements C93358y {

    /* renamed from: a */
    final /* synthetic */ List f260319a;

    /* renamed from: b */
    final /* synthetic */ C86124t f260320b;

    /* renamed from: c */
    final /* synthetic */ C93339f f260321c;

    public C93338e(C93339f fVar, List list, C86124t tVar) {
        this.f260321c = fVar;
        this.f260319a = list;
        this.f260320b = tVar;
    }

    /* renamed from: a */
    public final int mo87641a() {
        return this.f260319a.size();
    }

    /* renamed from: b */
    public final C93333aa mo87642b() {
        return this.f260321c.f260322a;
    }

    /* renamed from: c */
    public final C93333aa mo87643c() {
        return this.f260321c.f260323b;
    }

    /* renamed from: d */
    public final Object[] mo87644d(Resources resources) {
        return new Object[]{resources.getString(R.string.spoken_cancel_command_tts), resources.getString(R.string.spoken_select_first_phone_number_command_tts), C87431e.m141674e(C87486h.m142002a(resources), C93348o.m153551a(resources, C93348o.m153552b(this.f260319a, this.f260320b))), resources.getString(R.string.action_call_canceling_tts)};
    }
}
