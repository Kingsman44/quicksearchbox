package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35870b;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35787a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.android.libraries.search.assistant.performer.p2728a.C35473i;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52112fr;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.m */
/* compiled from: PG */
public final class C35807m implements C35870b {

    /* renamed from: a */
    public static final C59071e f93805a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.m");

    /* renamed from: b */
    public final C35934c f93806b;

    /* renamed from: c */
    private final Context f93807c;

    /* renamed from: d */
    private C35473i f93808d;

    public C35807m(Context context, C35935d dVar) {
        this.f93807c = context;
        this.f93806b = dVar.mo39899a("device.MODIFY_SETTING");
    }

    /* renamed from: a */
    public final C60870cx mo39851a(C52115fu fuVar) {
        String str = fuVar.f136760f;
        C58976aa aaVar = C58975e.f156826a;
        C35932a.m64317b(this.f93806b, str);
        if ((fuVar.f136755a & 2) != 0) {
            int b = C52112fr.m86508b(fuVar.f136757c);
            if (b == 0) {
                b = 1;
            }
            int g = C35799e.m64194g(C35799e.m64192e(this.f93807c), b);
            if (g == 3) {
                this.f93806b.mo39896d(str, C62722b.INTERNAL);
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, String.format("Unable to update setting %s", new Object[]{str})));
            } else if (g == 4) {
                this.f93806b.mo39896d(str, C62722b.OK);
                return C60856cj.m92900i(C36180b.f94544a);
            } else {
                Intent putExtra = new Intent().setAction(C35787a.f93754j).addCategory(C35787a.f93748d).setPackage("com.android.settings").putExtra(C35787a.f93755k, g == 1).putExtra(C35787a.f93747c, "android-app://com.google.android.googlequicksearchbox/https/www.google.com").putExtra("IsVoiceQuery", false).putExtra("NoUiQuery", true);
                C35473i iVar = this.f93808d;
                if (iVar == null) {
                    C59104x c = f93805a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ModifyPowerSaver");
                    ((C59052c) ((C59052c) c).mo56372aa(52022)).mo56389s("%s", "visActivityStarter is null");
                    return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "visActivityStarter is null"));
                }
                return C60922j.m93044g(iVar.mo20099a(putExtra), C47810es.m84963c(new C35806l(this, str)), C60826bg.f164896a);
            }
        } else {
            String format = String.format("Change is not provided for %s.", new Object[]{str});
            C59104x d = f93805a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ModifyPowerSaver");
            ((C59052c) ((C59052c) d).mo56372aa(52024)).mo56389s("%s", format);
            this.f93806b.mo39896d(str, C62722b.INVALID_ARGUMENT);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, format));
        }
    }

    /* renamed from: b */
    public final void mo39852b(C35473i iVar) {
        this.f93808d = iVar;
    }

    /* renamed from: c */
    public final boolean mo39853c() {
        return true;
    }
}
