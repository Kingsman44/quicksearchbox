package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import android.content.Context;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35786a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a.p2746a.C35791c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.c */
/* compiled from: PG */
public final class C35797c implements C35786a {

    /* renamed from: a */
    private static final C59071e f93777a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.c");

    /* renamed from: b */
    private final Context f93778b;

    /* renamed from: c */
    private final C35791c f93779c;

    /* renamed from: d */
    private final C35934c f93780d;

    public C35797c(Context context, C35935d dVar, C35791c cVar) {
        this.f93778b = context;
        this.f93780d = dVar.mo39899a("device.GET_SETTINGS");
        this.f93779c = cVar;
    }

    /* renamed from: a */
    public final C52103fi mo39838a(String str) {
        Integer num;
        C35932a.m64317b(this.f93780d, str);
        if (str.equals(C63490p.AIRPLANE_MODE.name())) {
            num = Integer.valueOf(C35799e.m64190c(this.f93778b) ? 1 : 0);
        } else if (str.equals(C63490p.BATTERY_SAVER.name())) {
            num = Integer.valueOf(C35799e.m64192e(this.f93778b) ? 1 : 0);
        } else if (str.equals(C63490p.FLASHLIGHT.name())) {
            num = Integer.valueOf(this.f93779c.mo39846b() ? 1 : 0);
        } else if (str.equals(C63490p.DO_NOT_DISTURB.name())) {
            num = Integer.valueOf(C35799e.m64191d(this.f93778b) ? 1 : 0);
        } else if (str.equals(C63490p.BLUETOOTH.name())) {
            num = Integer.valueOf(C35799e.m64189b(this.f93778b) ? 1 : 0);
        } else if (str.equals(C63490p.WIFI.name())) {
            num = Integer.valueOf(C35799e.m64193f(this.f93778b) ? 1 : 0);
        } else {
            ((C59052c) ((C59052c) f93777a.mo56226d()).mo56372aa(51987)).mo56389s("Unsupported setting id %s, cannot query value, return null.", str);
            num = null;
        }
        if (num != null) {
            this.f93780d.mo39896d(str, C62722b.OK);
            return C35845bg.m64241a(num.toString());
        }
        this.f93780d.mo39896d(str, C62722b.UNAVAILABLE);
        return C35845bg.m64242b();
    }
}
