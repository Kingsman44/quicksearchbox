package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.search.shared.actions.SearchError;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.ab */
/* compiled from: PG */
public final class C93254ab extends C93278j {
    public C93254ab(Context context, C91097g gVar) {
        super(context, gVar);
    }

    /* renamed from: f */
    protected static final Intent m153340f(SearchError searchError) {
        if (!searchError.mo81138R(4)) {
            return null;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:com.google.android.googlequicksearchbox"));
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Intent mo87583c(VoiceAction voiceAction) {
        return m153340f((SearchError) voiceAction);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Intent mo87584d(VoiceAction voiceAction) {
        return m153340f((SearchError) voiceAction);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ Intent mo87585e(VoiceAction voiceAction) {
        return m153340f((SearchError) voiceAction);
    }
}
