package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24442ad;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.v */
/* compiled from: PG */
public final /* synthetic */ class C27839v implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C27842y f75907a;

    /* renamed from: b */
    public final /* synthetic */ String f75908b;

    public /* synthetic */ C27839v(C27842y yVar, String str) {
        this.f75907a = yVar;
        this.f75908b = str;
    }

    public final C60870cx apply(Object obj) {
        C27842y yVar = this.f75907a;
        String str = this.f75908b;
        C58833ax j = C58833ax.m90833j((C24440ab) Collection.EL.stream((List) obj).filter(new C27840w(str)).findFirst().orElse(null));
        if (!j.mo56113h()) {
            ((C58970a) ((C58970a) C27842y.f75911a.mo56224b()).mo56372aa(50051)).mo56354G("No model files downloaded for gdd_model:variant='%s:%s'", "GddLensText", str);
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C58833ax j2 = C58833ax.m90833j((C24442ad) Collection.EL.stream(((C24440ab) j.mo56107c()).f66921c).filter(new C27841x(str)).findAny().orElse(null));
        if (j2.mo56113h()) {
            return C27830m.m51851d(String.valueOf(((C24442ad) j2.mo56107c()).f66929c).concat("/lots_config.pb"), str, C58833ax.m90834k(Long.valueOf(((C24440ab) j.mo56107c()).f66923e)), yVar.f75913c);
        }
        ((C58970a) ((C58970a) C27842y.f75911a.mo56225c()).mo56372aa(50050)).mo56354G("Failed to find ModelFile from gdd_model:variant='%s:%s'", "GddLensText", str);
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
