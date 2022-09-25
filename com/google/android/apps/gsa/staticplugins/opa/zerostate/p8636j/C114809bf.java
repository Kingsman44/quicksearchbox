package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.content.Context;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import dagger.C68214a;
import java.util.Calendar;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.bf */
/* compiled from: PG */
public final class C114809bf {

    /* renamed from: a */
    public final Context f318567a;

    /* renamed from: b */
    public final C21370a f318568b;

    /* renamed from: c */
    public final C68214a f318569c;

    /* renamed from: d */
    public final C68214a f318570d;

    /* renamed from: e */
    public final C22871g f318571e;

    /* renamed from: f */
    public final Random f318572f;

    /* renamed from: g */
    public long f318573g;

    public C114809bf(Context context, C21370a aVar, C68214a aVar2, C68214a aVar3, C22871g gVar, Random random) {
        this.f318567a = context;
        this.f318568b = aVar;
        this.f318569c = aVar2;
        this.f318570d = aVar3;
        this.f318571e = gVar;
        this.f318572f = random;
    }

    /* renamed from: a */
    public final long mo101608a(int i, boolean z) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(this.f318573g);
        if (z) {
            instance.add(5, 1);
        }
        instance.set(instance.get(1), instance.get(2), instance.get(5), i, 0, 0);
        return instance.getTimeInMillis();
    }
}
