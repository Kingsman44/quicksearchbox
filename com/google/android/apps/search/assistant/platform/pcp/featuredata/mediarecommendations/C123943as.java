package com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.libraries.assistant.pcp.p1573k.C18914ac;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.as */
/* compiled from: PG */
public final class C123943as {

    /* renamed from: a */
    public static final C59071e f342338a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.pcp.featuredata.mediarecommendations.as");

    /* renamed from: b */
    public final PlayMediaActivity f342339b;

    /* renamed from: c */
    public final C18914ac f342340c;

    public C123943as(PlayMediaActivity playMediaActivity, C18914ac acVar) {
        this.f342339b = playMediaActivity;
        this.f342340c = acVar;
    }

    /* renamed from: a */
    public static Intent m203259a(String str) {
        Intent intent = new Intent();
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_INTENT", str);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", C50794cr.MEDIA.f132222T);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_TAP_ACTION_TYPE", C50731p.START_ACTIVITY.f132020d);
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.opa.smartspace.ExportedSmartspaceTrampolineActivity")).addFlags(402653184);
        return intent;
    }
}
