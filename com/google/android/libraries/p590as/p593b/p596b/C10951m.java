package com.google.android.libraries.p590as.p593b.p596b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.as.b.b.m */
/* compiled from: PG */
public final /* synthetic */ class C10951m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C10812ap f36068a;

    /* renamed from: b */
    public final /* synthetic */ String f36069b;

    /* renamed from: c */
    public final /* synthetic */ int f36070c;

    public /* synthetic */ C10951m(C10812ap apVar, String str, int i) {
        this.f36068a = apVar;
        this.f36069b = str;
        this.f36070c = i;
    }

    public final C60870cx apply(Object obj) {
        C10812ap apVar = this.f36068a;
        String str = this.f36069b;
        int i = this.f36070c;
        C10809am amVar = (C10809am) obj;
        if (C10812ap.m25842a(str, i, amVar.mo19300b()).mo56113h()) {
            ((C58970a) ((C58970a) C10812ap.f35848a.mo56224b()).mo56372aa(53971)).mo56352E("LanguagePack [%s %d] already installed. Skipping download.", str, i);
            return C60856cj.m92900i(new C10811ao(5, C58836b.f156633a));
        }
        C58833ax a = C10812ap.m25842a(str, i, amVar.mo19299a());
        if (!a.mo56113h()) {
            ((C58970a) ((C58970a) C10812ap.f35848a.mo56224b()).mo56372aa(53970)).mo56352E("LanguagePack [%s %d] not found in downloadable set. Skipping download request.", str, i);
            return C60856cj.m92900i(new C10811ao(4, C58836b.f156633a));
        } else if (C10812ap.m25842a(str, i, amVar.mo19301c()).mo56113h()) {
            ((C58970a) ((C58970a) C10812ap.f35848a.mo56224b()).mo56372aa(53969)).mo56352E("LanguagePack [%s %d] already being installed. Retriggering download request.", str, i);
            return apVar.mo19305g(2, str, (C10882h) a.mo56107c());
        } else {
            ((C58970a) ((C58970a) C10812ap.f35848a.mo56224b()).mo56372aa(53968)).mo56352E("Starting new LanguagePack download [%s %d]", str, i);
            return apVar.mo19305g(3, str, (C10882h) a.mo56107c());
        }
    }
}
