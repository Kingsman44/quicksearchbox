package com.google.android.libraries.search.assistant.fluidactions.p2540c.p2541a;

import android.content.Context;
import android.provider.Settings;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32971d;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32973f;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32975h;
import com.google.apps.tiktok.dataservice.C46783d;
import com.google.apps.tiktok.dataservice.C46877q;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.util.concurrent.C60887da;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.c.a.b */
/* compiled from: PG */
final class C32956b {

    /* renamed from: a */
    public final C46877q f88290a;

    /* renamed from: b */
    public final C46783d f88291b;

    /* renamed from: c */
    public C32971d f88292c;

    /* renamed from: d */
    private final Context f88293d;

    /* renamed from: e */
    private final C60887da f88294e;

    /* renamed from: f */
    private final C47770dh f88295f;

    /* renamed from: g */
    private final C32975h f88296g;

    public C32956b(Context context, C46877q qVar, C47770dh dhVar, C60887da daVar, C32975h hVar) {
        this.f88293d = context;
        this.f88290a = qVar;
        this.f88295f = dhVar;
        this.f88294e = daVar;
        this.f88296g = hVar;
        this.f88291b = new C32955a(this, dhVar, daVar);
    }

    /* renamed from: a */
    public final void mo38403a() {
        if (this.f88292c != null) {
            this.f88296g.mo38406b(this.f88292c.toString(), C32973f.m61046g(this.f88292c, 0, PrivateKeyType.INVALID, Settings.System.getInt(this.f88293d.getContentResolver(), "screen_brightness", 0)));
        }
    }
}
