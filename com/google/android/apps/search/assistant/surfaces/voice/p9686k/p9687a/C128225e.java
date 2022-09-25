package com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9687a;

import android.content.Context;
import android.provider.Settings;
import com.google.android.apps.search.assistant.surfaces.voice.p9686k.p9688b.C128238c;
import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.Collections;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.k.a.e */
/* compiled from: PG */
final class C128225e implements C47352j {

    /* renamed from: d */
    public static final /* synthetic */ int f352710d = 0;

    /* renamed from: e */
    private static final C58974d f352711e = C58974d.m91135i("InterpreterBCSynclet");

    /* renamed from: a */
    public final Context f352712a;

    /* renamed from: b */
    public final C128235o f352713b;

    /* renamed from: c */
    public final C58495hd f352714c;

    /* renamed from: f */
    private final boolean f352715f;

    /* renamed from: g */
    private final C60887da f352716g;

    public C128225e(Context context, boolean z, C128238c cVar, C60887da daVar, C128235o oVar) {
        this.f352712a = context;
        this.f352715f = z;
        this.f352716g = daVar;
        this.f352713b = oVar;
        this.f352714c = C58495hd.m89898l(Collections.unmodifiableMap(cVar.f352740a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Boolean mo108373a() {
        try {
            boolean z = true;
            if (Settings.Secure.getInt(this.f352712a.getContentResolver(), "ui_translation_enabled") != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Settings.SettingNotFoundException e) {
            ((C58970a) ((C58970a) ((C58970a) f352711e.mo56224b()).mo56382g(e)).mo56372aa(37795)).mo56386p("Live Translate secure setting not found.");
            return false;
        }
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        if (!this.f352715f) {
            return C60856cj.m92900i(false);
        }
        C128222b bVar = new C128222b(this);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(bVar), this.f352716g);
        C128221a aVar = new C128221a(this);
        return C60922j.m93044g(m, C47810es.m84963c(aVar), this.f352716g);
    }
}
