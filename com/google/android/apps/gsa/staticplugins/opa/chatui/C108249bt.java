package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90102f;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.bt */
/* compiled from: PG */
public final class C108249bt extends C108430ik {

    /* renamed from: B */
    private final int f301135B;

    /* renamed from: a */
    public final C108248bs f301136a;

    /* renamed from: b */
    public final Drawable f301137b;

    /* renamed from: c */
    public C108247br f301138c;

    public C108249bt(C86124t tVar, Context context, C73841bf bfVar, C108248bs bsVar, Object... objArr) {
        super(bsVar.f301132x, BuildConfig.FLAVOR);
        this.f301136a = bsVar;
        if ((bsVar == C108248bs.CHAT_HISTORY || bsVar == C108248bs.CHAT_HISTORY_AT_LAST) && tVar.mo79746e(C90014bt.f247205ck)) {
            this.f301598e = BuildConfig.FLAVOR;
        } else {
            this.f301598e = bfVar.mo65322a().getString(bsVar.f301130v, objArr);
        }
        int i = bsVar.f301131w;
        if (i != 0) {
            this.f301137b = context.getDrawable(i);
        } else {
            this.f301137b = null;
        }
        C90102f fVar = bsVar.f301134z;
        this.f301135B = fVar != null ? (int) tVar.mo79743a(fVar) : bsVar.f301133y;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo96698c() {
        return this.f301135B;
    }
}
