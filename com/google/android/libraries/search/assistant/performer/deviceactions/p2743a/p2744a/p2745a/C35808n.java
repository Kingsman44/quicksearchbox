package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import android.content.Context;
import android.provider.Settings;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35870b;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.android.libraries.search.assistant.performer.p2728a.C35473i;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.n */
/* compiled from: PG */
public final class C35808n implements C35870b {

    /* renamed from: a */
    private static final C59071e f93809a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.n");

    /* renamed from: b */
    private final Context f93810b;

    /* renamed from: c */
    private final C35934c f93811c;

    public C35808n(Context context, C35935d dVar) {
        this.f93810b = context;
        this.f93811c = dVar.mo39899a("device.MODIFY_SETTING");
    }

    /* renamed from: a */
    public final C60870cx mo39851a(C52115fu fuVar) {
        String str = fuVar.f136760f;
        C58976aa aaVar = C58975e.f156826a;
        C35932a.m64317b(this.f93811c, str);
        String str2 = (String) C35811q.f93820a.get(str);
        if (str2 == null) {
            this.f93811c.mo39896d(str, C62722b.INVALID_ARGUMENT);
            C59104x d = f93809a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SystemSettings");
            ((C59052c) ((C59052c) d).mo56372aa(52030)).mo56389s("Unsupported setting %s.", str);
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.INVALID_ARGUMENT));
        }
        String string = Settings.System.getString(this.f93810b.getContentResolver(), str2);
        if (string == null) {
            this.f93811c.mo39896d(str, C62722b.NOT_FOUND);
            C59104x d2 = f93809a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "SystemSettings");
            ((C59052c) ((C59052c) d2).mo56372aa(52029)).mo56389s("No value for setting %s.", str);
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.NOT_FOUND));
        }
        String a = C35811q.m64223a(fuVar, string);
        if (a == null) {
            this.f93811c.mo39896d(str, C62722b.FAILED_PRECONDITION);
            C59104x d3 = f93809a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "SystemSettings");
            ((C59052c) ((C59052c) d3).mo56372aa(52028)).mo56389s("Invalid value for setting %s.", str);
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.FAILED_PRECONDITION));
        } else if (!Settings.System.putString(this.f93810b.getContentResolver(), str2, a)) {
            this.f93811c.mo39896d(str, C62722b.INTERNAL);
            C59104x d4 = f93809a.mo56226d();
            d4.mo56378ag(C58975e.f156826a, "SystemSettings");
            ((C59052c) ((C59052c) d4).mo56372aa(52027)).mo56389s("Failed to update value level for %s.", str);
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.INTERNAL));
        } else if (!str.equals(C63490p.BRIGHTNESS_LEVEL.name()) || Settings.System.putInt(this.f93810b.getContentResolver(), "screen_brightness_mode", 0)) {
            this.f93811c.mo39896d(str, C62722b.OK);
            return C60856cj.m92900i(C36180b.f94544a);
        } else {
            this.f93811c.mo39896d(str, C62722b.INTERNAL);
            C59104x d5 = f93809a.mo56226d();
            d5.mo56378ag(C58975e.f156826a, "SystemSettings");
            ((C59052c) ((C59052c) d5).mo56372aa(52026)).mo56389s("Failed to update mode for %s.", str);
            return C60856cj.m92900i(C36180b.m64578b(C52235kf.INTERNAL));
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo39852b(C35473i iVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ boolean mo39853c() {
        return false;
    }
}
