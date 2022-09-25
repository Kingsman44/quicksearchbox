package com.google.android.apps.gsa.search.core.preferences;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90078ec;
import com.google.p395al.p417d.p418a.C8590q;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.ai */
/* compiled from: PG */
public final class C86293ai {

    /* renamed from: a */
    public final C68214a f233332a;

    /* renamed from: b */
    private final C68214a f233333b;

    public C86293ai(C68214a aVar, C68214a aVar2) {
        this.f233332a = aVar;
        this.f233333b = aVar2;
    }

    /* renamed from: a */
    public final C8590q mo79997a() {
        C8590q b = C8590q.m23277b(((SharedPreferences) this.f233332a.mo27525b()).getInt("search_video_preview_autoplay", C8590q.AUTOPLAY_UNSPECIFIED.f29729e));
        if (b == null) {
            b = C8590q.AUTOPLAY_UNSPECIFIED;
        }
        if (b == C8590q.AUTOPLAY_UNSPECIFIED) {
            return ((C86124t) this.f233333b.mo27525b()).mo79746e(C90078ec.f249799c) ? C8590q.AUTOPLAY_ON_WIFI_AND_MOBILE_DATA : C8590q.AUTOPLAY_ON_WIFI_ONLY;
        }
        return b;
    }

    /* renamed from: b */
    public final void mo79998b(C8590q qVar) {
        ((SharedPreferences) this.f233332a.mo27525b()).edit().putInt("search_video_preview_autoplay", qVar.f29729e).apply();
    }
}
