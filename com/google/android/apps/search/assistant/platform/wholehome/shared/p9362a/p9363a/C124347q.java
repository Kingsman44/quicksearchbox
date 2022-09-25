package com.google.android.apps.search.assistant.platform.wholehome.shared.p9362a.p9363a;

import androidx.p104d.p105a.C2164c;
import com.google.android.gms.common.api.C143843o;
import com.google.android.gms.common.moduleinstall.C143960a;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.shared.a.a.q */
/* compiled from: PG */
final class C124347q implements C143960a {

    /* renamed from: a */
    final /* synthetic */ C124348r f343232a;

    /* renamed from: b */
    private final C2164c f343233b;

    public C124347q(C124348r rVar, C2164c cVar) {
        this.f343232a = rVar;
        this.f343233b = cVar;
    }

    /* renamed from: a */
    public final void mo79440a(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        String str;
        switch (moduleInstallStatusUpdate.f390190b) {
            case 1:
                ((C58970a) ((C58970a) C124348r.f343234a.mo56224b()).mo56372aa(36209)).mo56386p("Usonia module install pending.");
                return;
            case 2:
                ((C58970a) ((C58970a) C124348r.f343234a.mo56224b()).mo56372aa(36210)).mo56386p("Usonia module downloading.");
                return;
            case 3:
                ((C58970a) ((C58970a) C124348r.f343234a.mo56226d()).mo56372aa(36211)).mo56386p("Usonia module download cancelled.");
                this.f343232a.f343236c.mo119495c(this);
                this.f343233b.mo5438c();
                return;
            case 4:
                ((C58970a) ((C58970a) C124348r.f343234a.mo56224b()).mo56372aa(36212)).mo56386p("Usonia module installed successfully.");
                this.f343232a.f343236c.mo119495c(this);
                this.f343233b.mo5437b((Object) null);
                return;
            case 5:
                ((C58970a) ((C58970a) C124348r.f343234a.mo56226d()).mo56372aa(36213)).mo56386p("Usonia module download failed.");
                this.f343232a.f343236c.mo119495c(this);
                C2164c cVar = this.f343233b;
                Object[] objArr = new Object[1];
                int i = moduleInstallStatusUpdate.f390193e;
                switch (i) {
                    case 46000:
                        str = "UNKNOWN_MODULE";
                        break;
                    case 46001:
                        str = "NOT_ALLOWED_MODULE";
                        break;
                    case 46002:
                        str = "MODULE_NOT_FOUND";
                        break;
                    case 46003:
                        str = "INSUFFICIENT_STORAGE";
                        break;
                    default:
                        str = C143843o.m233808a(i);
                        break;
                }
                objArr[0] = str;
                cVar.mo5439d(new IllegalStateException(String.format("Usonia module install download failed because of %s", objArr)));
                return;
            case 6:
                ((C58970a) ((C58970a) C124348r.f343234a.mo56224b()).mo56372aa(36214)).mo56386p("Usonia module installing.");
                return;
            default:
                ((C58970a) ((C58970a) C124348r.f343234a.mo56226d()).mo56372aa(36208)).mo56387q("Usonia module unknown install state: %d", moduleInstallStatusUpdate.f390190b);
                this.f343233b.mo5439d(new IllegalStateException("Usonia module install is in an unknown state"));
                return;
        }
    }
}
