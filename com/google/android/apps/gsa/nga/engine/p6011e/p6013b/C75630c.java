package com.google.android.apps.gsa.nga.engine.p6011e.p6013b;

import android.content.Context;
import android.media.AudioAttributes;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.e.b.c */
/* compiled from: PG */
public final class C75630c {

    /* renamed from: a */
    public final Context f209950a;

    /* renamed from: b */
    private final C22871g f209951b;

    public C75630c(Context context, C22871g gVar) {
        this.f209950a = context;
        this.f209951b = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo71765a(int i, AudioAttributes audioAttributes) {
        return this.f209951b.mo28201a("[NGA] Create audio track for earcon", new C75383b(this, i, audioAttributes));
    }
}
