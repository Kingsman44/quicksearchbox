package com.google.android.apps.search.googleapp.search.voicesearch;

import com.google.android.apps.search.googleapp.p10516t.p10522f.C139708c;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.apps.tiktok.account.AccountId;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.aq */
/* compiled from: PG */
public final class C138713aq {

    /* renamed from: a */
    public final AccountId f377279a;

    /* renamed from: b */
    public final C28306ab f377280b;

    /* renamed from: c */
    public final C139708c f377281c;

    /* renamed from: d */
    public final C138711ao f377282d;

    /* renamed from: e */
    public final boolean f377283e;

    public C138713aq(boolean z, AccountId accountId, C28306ab abVar, C139708c cVar, C138711ao aoVar) {
        this.f377279a = accountId;
        this.f377283e = z;
        this.f377280b = abVar;
        this.f377281c = cVar;
        this.f377282d = aoVar;
    }

    /* renamed from: a */
    public final C138789d mo114494a() {
        return (C138789d) this.f377282d.getChildFragmentManager().f634a.mo671c("RecordAudioFragmentPeer");
    }

    /* renamed from: b */
    public final C138916x mo114495b() {
        return (C138916x) this.f377282d.getChildFragmentManager().f634a.mo671c("SEARCH_BOX_TRANSCRIPTION_FRAGMENT");
    }
}
