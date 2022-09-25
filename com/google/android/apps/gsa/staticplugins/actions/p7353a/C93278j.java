package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.C87489k;
import com.google.android.apps.gsa.search.shared.actions.util.C87494p;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.base.C58893dc;
import com.google.p4152bb.p4153a.C55240la;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.j */
/* compiled from: PG */
public abstract class C93278j implements C93249a {

    /* renamed from: a */
    protected final Context f260113a;

    /* renamed from: b */
    protected final C91097g f260114b;

    public C93278j(Context context, C91097g gVar) {
        this.f260113a = context;
        this.f260114b = gVar;
    }

    /* renamed from: b */
    public final MatchingProviderInfo mo87581b(VoiceAction voiceAction, boolean z) {
        return C87489k.m142016d(this.f260113a, false, z, (String) null, (C55240la) null, mo87585e(voiceAction));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Intent mo87583c(VoiceAction voiceAction);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Intent mo87584d(VoiceAction voiceAction);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract Intent mo87585e(VoiceAction voiceAction);

    /* renamed from: a */
    public C87421i mo87580a(VoiceAction voiceAction, int i) {
        Intent intent;
        if (i == 1) {
            intent = mo87583c(voiceAction);
            intent.getClass();
        } else if (i == 2) {
            intent = mo87584d(voiceAction);
            intent.getClass();
        } else if (i != 3) {
            return C87421i.f236081c;
        } else {
            intent = mo87584d(voiceAction);
            if (intent == null) {
                throw null;
            }
        }
        C58893dc.m90996a(intent);
        MatchingProviderInfo f = voiceAction.mo81065f();
        if (f.f236270h.mo81484i() && !f.mo81436f() && TextUtils.isEmpty(intent.getPackage()) && intent.getSelector() == null) {
            intent.setPackage(C87494p.m142026c(f.mo81433d()));
            if (C87489k.m142015c(this.f260113a, intent).mo81435e()) {
                intent.setPackage((String) null);
            }
        }
        return this.f260114b.mo65089a(intent) ? C87421i.f236079a : C87421i.f236081c;
    }
}
