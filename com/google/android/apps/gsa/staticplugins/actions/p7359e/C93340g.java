package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import android.content.res.Resources;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.modular.p6922a.C87431e;
import com.google.android.apps.gsa.search.shared.actions.util.C87486h;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.g */
/* compiled from: PG */
final class C93340g implements C93358y {

    /* renamed from: a */
    final /* synthetic */ List f260324a;

    /* renamed from: b */
    final /* synthetic */ C86124t f260325b;

    /* renamed from: c */
    final /* synthetic */ C93341h f260326c;

    public C93340g(C93341h hVar, List list, C86124t tVar) {
        this.f260326c = hVar;
        this.f260324a = list;
        this.f260325b = tVar;
    }

    /* renamed from: a */
    public final int mo87641a() {
        return this.f260324a.size();
    }

    /* renamed from: b */
    public final C93333aa mo87642b() {
        return this.f260326c.f260327a;
    }

    /* renamed from: c */
    public final C93333aa mo87643c() {
        return this.f260326c.f260328b;
    }

    /* renamed from: d */
    public final Object[] mo87644d(Resources resources) {
        return new Object[]{resources.getString(R.string.spoken_cancel_command_tts), C87431e.m141674e(C87486h.m142002a(resources), C93348o.m153552b(this.f260324a, this.f260325b)), resources.getString(R.string.action_call_canceling_tts)};
    }
}
