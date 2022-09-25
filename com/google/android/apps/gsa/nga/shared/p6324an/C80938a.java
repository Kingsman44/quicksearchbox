package com.google.android.apps.gsa.nga.shared.p6324an;

import android.content.Context;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import android.view.View;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.nga.shared.an.a */
/* compiled from: PG */
public final class C80938a extends VoiceInteractionSession {

    /* renamed from: a */
    private static final C59071e f221912a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.an.a");

    /* renamed from: b */
    private final Context f221913b;

    public C80938a(Context context) {
        super(context);
        this.f221913b = context;
    }

    public final void onCreate() {
        super.onCreate();
        ((C59052c) ((C59052c) f221912a.mo56224b()).mo56372aa(6539)).mo56386p("Creating InstantlyFinishingVis to clean Android state.");
        finish();
    }

    public final View onCreateContentView() {
        C89911f.m146435c(161347570);
        return new View(this.f221913b);
    }

    public final void onPrepareShow(Bundle bundle, int i) {
        super.onPrepareShow(bundle, i);
        C89911f.m146435c(176970960);
        setUiEnabled(false);
    }
}
