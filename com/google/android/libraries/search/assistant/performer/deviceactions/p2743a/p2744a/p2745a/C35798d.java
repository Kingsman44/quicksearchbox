package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35786a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35864u;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.d */
/* compiled from: PG */
public final class C35798d implements C35786a {

    /* renamed from: a */
    private static final C59071e f93781a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.d");

    /* renamed from: b */
    private final Context f93782b;

    /* renamed from: c */
    private final C35934c f93783c;

    public C35798d(Context context, C35935d dVar) {
        this.f93782b = context;
        this.f93783c = dVar.mo39899a("device.GET_SETTINGS");
    }

    /* renamed from: a */
    public final C52103fi mo39838a(String str) {
        C35932a.m64317b(this.f93783c, str);
        int a = C35864u.m64259a(str);
        if (a == -1) {
            this.f93783c.mo39896d(str, C62722b.INVALID_ARGUMENT);
            return C35845bg.m64242b();
        }
        AudioManager audioManager = (AudioManager) this.f93782b.getSystemService("audio");
        if (audioManager == null) {
            ((C59052c) ((C59052c) f93781a.mo56226d()).mo56372aa(51989)).mo56386p("No audioManager provided.");
            this.f93783c.mo39896d(str, C62722b.FAILED_PRECONDITION);
            return C35845bg.m64242b();
        }
        Integer d = C35864u.m64262d(0, audioManager.getStreamMaxVolume(a), audioManager.getStreamVolume(a));
        this.f93783c.mo39896d(str, C62722b.OK);
        return C35845bg.m64241a(String.valueOf(d));
    }
}
