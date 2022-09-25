package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35870b;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a.p2746a.C35791c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.android.libraries.search.assistant.performer.p2728a.C35473i;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52112fr;
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
import java.util.Locale;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.k */
/* compiled from: PG */
public final class C35805k implements C35870b {

    /* renamed from: a */
    private static final C59071e f93800a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.k");

    /* renamed from: b */
    private final C35791c f93801b;

    /* renamed from: c */
    private final C35934c f93802c;

    public C35805k(C35935d dVar, C35791c cVar) {
        this.f93802c = dVar.mo39899a("device.MODIFY_SETTING");
        this.f93801b = cVar;
        cVar.mo39845a();
    }

    /* renamed from: a */
    public final C60870cx mo39851a(C52115fu fuVar) {
        String str = fuVar.f136760f;
        C58976aa aaVar = C58975e.f156826a;
        C35932a.m64317b(this.f93802c, str);
        if ((fuVar.f136755a & 2) != 0) {
            int b = C52112fr.m86508b(fuVar.f136757c);
            if (b == 0) {
                b = 1;
            }
            int g = C35799e.m64194g(this.f93801b.mo39846b(), b);
            if (g == 3) {
                this.f93802c.mo39896d(str, C62722b.INTERNAL);
                String format = String.format("Unable to update setting %s", new Object[]{str});
                C59104x d = f93800a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ModifyFlashlightSetting");
                ((C59052c) ((C59052c) d).mo56372aa(52018)).mo56389s("%s", format);
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, format));
            } else if (g == 4) {
                this.f93802c.mo39896d(str, C62722b.OK);
                return C60856cj.m92900i(C36180b.f94544a);
            } else {
                C35791c cVar = this.f93801b;
                if ((fuVar.f136755a & 32) != 0) {
                    int i = fuVar.f136761g;
                }
                cVar.mo39848d();
                if (this.f93801b.mo39847c(g == 1)) {
                    this.f93802c.mo39896d(str, C62722b.OK);
                    return C60856cj.m92900i(C36180b.f94544a);
                }
                String format2 = String.format(Locale.US, "Failed to modify flash light setting %s", new Object[]{str});
                C59104x c = f93800a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ModifyFlashlightSetting");
                ((C59052c) ((C59052c) c).mo56372aa(52015)).mo56389s("%s", format2);
                this.f93802c.mo39896d(str, C62722b.INTERNAL);
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, format2));
            }
        } else {
            String format3 = String.format("Change is not provided for %s.", new Object[]{str});
            C59104x d2 = f93800a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ModifyFlashlightSetting");
            ((C59052c) ((C59052c) d2).mo56372aa(52019)).mo56389s("%s", format3);
            this.f93802c.mo39896d(str, C62722b.INVALID_ARGUMENT);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, format3));
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
