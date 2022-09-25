package com.google.android.apps.gsa.search.core.p6841s;

import android.accounts.Account;
import com.google.android.apps.gsa.search.core.p6805i.C86130z;
import com.google.android.googlequicksearchbox.R;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;

/* renamed from: com.google.android.apps.gsa.search.core.s.h */
/* compiled from: PG */
public enum C86589h {
    WEB("web_history_enabled_", C56116b.WEB_AND_APP, C55912b.WEB_AND_APP_ACTIVITY),
    AUDIO("audio_history_enabled_", C56116b.VOICE_AND_AUDIO, C55912b.VOICE_AND_AUDIO_ACTIVITY),
    DEVICE("device_history_enabled_", C56116b.DEVICE_INFO, C55912b.DEVICE_INFORMATION);
    

    /* renamed from: d */
    public final C56116b f233920d;

    /* renamed from: e */
    public final C55912b f233921e;

    /* renamed from: g */
    private final String f233922g;

    private C86589h(String str, C56116b bVar, C55912b bVar2) {
        this.f233922g = str;
        this.f233920d = bVar;
        this.f233921e = bVar2;
    }

    /* renamed from: a */
    public final String mo80203a(C86130z zVar) {
        if (this == AUDIO) {
            return zVar.mo79764c(R.string.audio_history_api_client_param);
        }
        if (this == DEVICE) {
            return zVar.mo79764c(R.string.device_history_api_client_param);
        }
        return zVar.mo79764c(R.string.history_api_client_param);
    }

    /* renamed from: b */
    public final String mo80204b(Account account) {
        return String.valueOf(this.f233922g).concat(String.valueOf(account.name));
    }
}
