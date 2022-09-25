package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.p2745a;

import android.content.Context;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35870b;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35932a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35934c;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2752c.C35935d;
import com.google.android.libraries.search.assistant.performer.p2728a.C35473i;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3897e.p3921j.C52112fr;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.p */
/* compiled from: PG */
public final class C35810p implements C35870b {

    /* renamed from: a */
    private static final C59071e f93817a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.a.a.a.p");

    /* renamed from: b */
    private final Context f93818b;

    /* renamed from: c */
    private final C35934c f93819c;

    public C35810p(Context context, C35935d dVar) {
        this.f93818b = context;
        this.f93819c = dVar.mo39899a("device.MODIFY_SETTING");
    }

    /* renamed from: a */
    public final C60870cx mo39851a(C52115fu fuVar) {
        String str = fuVar.f136760f;
        C35932a.m64317b(this.f93819c, str);
        if ((fuVar.f136755a & 2) != 0) {
            int b = C52112fr.m86508b(fuVar.f136757c);
            if (b == 0) {
                b = 1;
            }
            int g = C35799e.m64194g(C35799e.m64193f(this.f93818b), b);
            if (g == 3) {
                this.f93819c.mo39896d(str, C62722b.INTERNAL);
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, String.format("Unable to update setting %s", new Object[]{str})));
            } else if (g != 4) {
                try {
                    ((C59052c) ((C59052c) C35799e.f93784a.mo56225c()).mo56372aa(51999)).mo56386p("setWifiEnabled API deprecated in Q and above.");
                    this.f93819c.mo39896d(str, C62722b.INTERNAL);
                    String format = String.format("failed to update wifi for %s.", new Object[]{str});
                    ((C59052c) ((C59052c) f93817a.mo56226d()).mo56372aa(52046)).mo56389s("%s", format);
                    return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, format));
                } catch (RuntimeException e) {
                    this.f93819c.mo39896d(str, C62722b.INTERNAL);
                    throw e;
                }
            } else {
                this.f93819c.mo39896d(str, C62722b.OK);
                return C60856cj.m92900i(C36180b.f94544a);
            }
        } else {
            String format2 = String.format("Change is not provided for %s.", new Object[]{str});
            ((C59052c) ((C59052c) f93817a.mo56226d()).mo56372aa(52048)).mo56389s("%s", format2);
            this.f93819c.mo39896d(str, C62722b.INVALID_ARGUMENT);
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, format2));
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
