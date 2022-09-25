package com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9678b.p9679a.p9682c;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60888db;
import p3186j$.time.Duration;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.j.b.a.c.l */
/* compiled from: PG */
public final class C128164l {

    /* renamed from: a */
    public final boolean f352572a;

    /* renamed from: b */
    public final Duration f352573b;

    /* renamed from: c */
    public final long f352574c;

    /* renamed from: d */
    public final long f352575d;

    /* renamed from: e */
    public final long f352576e;

    /* renamed from: f */
    public final C42876ab f352577f;

    /* renamed from: g */
    public final C42876ab f352578g;

    /* renamed from: h */
    public final C128158f f352579h;

    /* renamed from: i */
    public final C60950i f352580i;

    /* renamed from: j */
    public final C60888db f352581j;

    /* renamed from: k */
    public final KeyguardManager f352582k;

    public C128164l(boolean z, long j, long j2, long j3, long j4, C42876ab abVar, C42876ab abVar2, C128158f fVar, C60950i iVar, C60888db dbVar, Context context) {
        this.f352572a = z;
        this.f352573b = Duration.ofSeconds(j);
        this.f352574c = j2;
        this.f352575d = j3;
        this.f352576e = j4;
        this.f352577f = abVar;
        this.f352578g = abVar2;
        this.f352579h = fVar;
        this.f352580i = iVar;
        this.f352581j = dbVar;
        this.f352582k = (KeyguardManager) Objects.requireNonNull((KeyguardManager) context.getSystemService(KeyguardManager.class));
    }
}
