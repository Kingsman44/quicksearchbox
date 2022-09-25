package com.google.android.apps.gsa.staticplugins.p7849dp;

import android.content.ComponentName;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6692dc.C85300a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.dp.b */
/* compiled from: PG */
public final class C99950b extends C86734a implements C85300a {

    /* renamed from: a */
    private final C99949a f279596a;

    public C99950b(C99949a aVar) {
        super(C118575h.WORKER_SOUND_SEARCH, "soundsearch");
        this.f279596a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo78856a() {
        C99949a aVar = this.f279596a;
        aVar.f279594a.getPackageManager().setComponentEnabledSetting(new ComponentName(aVar.f279594a, "com.google.android.apps.gsa.soundsearchwidget.AddShortcutActivity"), true != aVar.f279595b.mo79746e(C90120fr.f250859z) ? 2 : 1, 1);
        return C118826c.f331423b;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
