package com.google.android.apps.gsa.p8867w.p8879i;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.p7066m.C90078ec;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p417d.p418a.C8590q;

/* renamed from: com.google.android.apps.gsa.w.i.r */
/* compiled from: PG */
public final class C118817r {

    /* renamed from: a */
    public final SharedPreferences f331391a;

    /* renamed from: b */
    private final C86124t f331392b;

    public C118817r(C86338r rVar, C86124t tVar) {
        this.f331391a = rVar;
        this.f331392b = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo103997a() {
        C8590q qVar;
        C8590q b = C8590q.m23277b(this.f331391a.getInt("search_video_preview_autoplay", C8590q.AUTOPLAY_UNSPECIFIED.f29729e));
        if (b == null) {
            b = C8590q.AUTOPLAY_UNSPECIFIED;
        }
        if (b != C8590q.AUTOPLAY_UNSPECIFIED) {
            return C60856cj.m92900i(b);
        }
        if (this.f331392b.mo79746e(C90078ec.f249799c)) {
            qVar = C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA;
        } else {
            qVar = C8590q.AUTOPLAY_ON_WIFI_ONLY;
        }
        return C60856cj.m92900i(qVar);
    }
}
