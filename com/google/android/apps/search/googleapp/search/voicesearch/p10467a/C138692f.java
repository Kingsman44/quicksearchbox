package com.google.android.apps.search.googleapp.search.voicesearch.p10467a;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.common.p4526f.C59071e;
import com.google.p4152bb.p4153a.C55421x;
import java.util.EnumSet;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.a.f */
/* compiled from: PG */
public final class C138692f {

    /* renamed from: a */
    public static final EnumSet f377218a = EnumSet.of(C55421x.SET_TIMER, C55421x.OPEN_APP, C55421x.PLAY_MUSIC, C55421x.SMS);

    /* renamed from: b */
    public static final C59071e f377219b = C59071e.m91331h();

    /* renamed from: c */
    public final Context f377220c;

    /* renamed from: d */
    public final C71422aw f377221d;

    /* renamed from: e */
    public final C138693g f377222e;

    public C138692f(Context context, C71422aw awVar, C138693g gVar) {
        C69664n.m101061g(context, "applicationContext");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f377220c = context;
        this.f377221d = awVar;
        this.f377222e = gVar;
    }

    /* renamed from: a */
    public final void mo114467a(Intent intent) {
        intent.addFlags(1).addFlags(268435456).addFlags(C89885b.NOW_VALUE).addFlags(1);
        this.f377220c.startActivity(intent);
    }
}
