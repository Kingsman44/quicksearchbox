package com.google.android.apps.gsa.opa.p6447h;

import android.app.Presentation;
import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58869cf;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.opa.h.f */
/* compiled from: PG */
public final class C83700f implements C83695a {

    /* renamed from: b */
    private static final C59071e f228144b = C59071e.m91332i("com.google.android.apps.gsa.opa.h.f");

    /* renamed from: c */
    private static final C58869cf f228145c = C58869cf.m90938d(":");

    /* renamed from: d */
    private static final C58869cf f228146d = C58869cf.m90938d("|");

    /* renamed from: a */
    public final C83707m f228147a;

    /* renamed from: e */
    private final Context f228148e;

    /* renamed from: f */
    private final PackageManager f228149f;

    /* renamed from: g */
    private final C83703i f228150g;

    /* renamed from: h */
    private final C58881cr f228151h = new C83696b(this);

    public C83700f(Context context, C83707m mVar, C83703i iVar) {
        this.f228148e = context;
        this.f228149f = context.getPackageManager();
        this.f228147a = mVar;
        this.f228150g = iVar;
    }

    /* renamed from: c */
    private static int m133267c(String[] strArr) {
        return (strArr.length <= 1 || !"secondary_display_opa_ui_small".equals(strArr[1])) ? R.layout.secondary_display_opa_ui : R.layout.secondary_display_opa_ui_small;
    }

    /* renamed from: a */
    public final Presentation mo75402a() {
        Display display;
        DisplayManager displayManager;
        C83697c b = ((C83696b) this.f228151h).f228138a.mo77023b();
        if (b == null || (displayManager = (DisplayManager) this.f228148e.getSystemService("display")) == null) {
            display = null;
        } else {
            display = displayManager.getDisplay(b.f228139a);
        }
        if (display == null) {
            return null;
        }
        return new C83699e(this, this.f228148e, display, b.f228140b);
    }

    /* renamed from: b */
    public final C83697c mo77023b() {
        DisplayManager displayManager = (DisplayManager) this.f228148e.getSystemService("display");
        if (displayManager == null) {
            return new C83697c(-1, R.layout.secondary_display_opa_ui);
        }
        C58495hd b = this.f228150g.mo75399b();
        try {
            Iterator it = b.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (this.f228149f.hasSystemFeature(str) || this.f228150g.mo75400c()) {
                    String str2 = (String) b.get(str);
                    if (str2 == null) {
                        ((C59052c) ((C59052c) f228144b.mo56225c()).mo56372aa(6804)).mo56386p("Please fix flag map, null encountered.");
                        break;
                    }
                    String[] strArr = (String[]) f228145c.mo56155i(str2).toArray(new String[0]);
                    String[] strArr2 = (String[]) f228146d.mo56155i(strArr[0]).toArray(new String[0]);
                    int c = m133267c(strArr);
                    ArrayList arrayList = new ArrayList();
                    for (String str3 : strArr2) {
                        try {
                            arrayList.add(new C83697c(Integer.parseInt(str3), c));
                        } catch (NumberFormatException e) {
                            ((C59052c) ((C59052c) ((C59052c) f228144b.mo56226d()).mo56382g(e)).mo56372aa(6805)).mo56389s("Wrong format for display ID %s", str3);
                        }
                    }
                    C83697c[] cVarArr = (C83697c[]) arrayList.toArray(new C83697c[0]);
                    if (cVarArr == null) {
                        break;
                    }
                    if (r4 == 0) {
                        break;
                    }
                    for (C83697c cVar : cVarArr) {
                        if (displayManager.getDisplay(cVar.f228139a) != null) {
                            return cVar;
                        }
                    }
                }
            }
            ((C59052c) ((C59052c) f228144b.mo56225c()).mo56372aa(6800)).mo56386p("Please fix flag map, null data returned.");
        } catch (NumberFormatException e2) {
            ((C59052c) ((C59052c) ((C59052c) f228144b.mo56225c()).mo56382g(e2)).mo56372aa(6803)).mo56386p("Please fix flag map");
        }
        C58495hd a = this.f228150g.mo75398a();
        for (String str4 : a.keySet()) {
            Display[] displays = displayManager.getDisplays(str4);
            try {
                String[] strArr3 = (String[]) f228145c.mo56155i((String) a.get(str4)).toArray(new String[0]);
                int parseInt = Integer.parseInt(strArr3[0]);
                if (displays != null && displays.length > parseInt) {
                    return new C83697c(displays[parseInt].getDisplayId(), m133267c(strArr3));
                }
            } catch (NumberFormatException e3) {
                ((C59052c) ((C59052c) ((C59052c) f228144b.mo56225c()).mo56382g(e3)).mo56372aa(6802)).mo56386p("Please fix flag map");
            }
        }
        ((C59052c) ((C59052c) f228144b.mo56224b()).mo56372aa(6801)).mo56386p("No fixed display ID found");
        return new C83697c(-1, R.layout.secondary_display_opa_ui);
    }
}
