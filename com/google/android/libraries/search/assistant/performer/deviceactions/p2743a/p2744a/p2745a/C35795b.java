package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import android.content.Context;
import android.provider.Settings;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35786a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.b */
/* compiled from: PG */
public final class C35795b implements C35786a {

    /* renamed from: a */
    private static final C59071e f93772a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.b");

    /* renamed from: b */
    private final Context f93773b;

    /* renamed from: c */
    private final C35934c f93774c;

    public C35795b(Context context, C35935d dVar) {
        this.f93773b = context;
        this.f93774c = dVar.mo39899a("device.GET_SETTINGS");
    }

    /* renamed from: a */
    public final C52103fi mo39838a(String str) {
        C58976aa aaVar = C58975e.f156826a;
        C35932a.m64317b(this.f93774c, str);
        String str2 = (String) C35811q.f93820a.get(str);
        if (str2 == null) {
            this.f93774c.mo39896d(str, C62722b.INVALID_ARGUMENT);
            C59104x d = f93772a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SystemSettings");
            ((C59052c) ((C59052c) d).mo56372aa(51985)).mo56389s("Unsupported setting %s.", str);
            return C35845bg.m64242b();
        }
        String string = Settings.System.getString(this.f93773b.getContentResolver(), str2);
        if (string == null) {
            this.f93774c.mo39896d(str, C62722b.NOT_FOUND);
            C59104x d2 = f93772a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SystemSettings");
            ((C59052c) ((C59052c) d2).mo56372aa(51984)).mo56354G("No value for setting %s (%s).", str, str2);
            return C35845bg.m64242b();
        }
        String b = C35811q.m64224b(str, string);
        if (b == null) {
            this.f93774c.mo39896d(str, C62722b.INVALID_ARGUMENT);
            C59104x d3 = f93772a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "SystemSettings");
            ((C59052c) ((C59052c) d3).mo56372aa(51983)).mo56389s("Error converting setting %s.", str);
            return C35845bg.m64242b();
        }
        this.f93774c.mo39896d(str, C62722b.OK);
        return C35845bg.m64241a(b);
    }
}
