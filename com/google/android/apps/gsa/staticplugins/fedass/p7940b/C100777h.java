package com.google.android.apps.gsa.staticplugins.fedass.p7940b;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7180q.C91081a;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.libraries.assistant.trainingcache.agsa.C19424b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.b.h */
/* compiled from: PG */
public final class C100777h {

    /* renamed from: a */
    public static final C59071e f281682a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.b.h");

    /* renamed from: b */
    public final C69464a f281683b;

    /* renamed from: c */
    public final C69464a f281684c;

    /* renamed from: d */
    public final C69464a f281685d;

    /* renamed from: e */
    private final Context f281686e;

    public C100777h(Context context, C69464a aVar, C69464a aVar2, C69464a aVar3) {
        this.f281686e = context;
        this.f281683b = aVar;
        this.f281684c = aVar2;
        this.f281685d = aVar3;
    }

    /* renamed from: a */
    public final Optional mo92045a(C132800h hVar) {
        return Optional.ofNullable(((C19424b) this.f281684c.mo17428b()).mo24614a(((C100784o) this.f281683b.mo17428b()).mo92050d(hVar, false)));
    }

    /* renamed from: b */
    public final boolean mo92046b() {
        C91084c a = C91081a.m148802a();
        if (a != C91084c.TRAIN) {
            C59104x c = f281682a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "EkhoMaintenance");
            ((C59052c) ((C59052c) c).mo56372aa(19532)).mo56354G("EchoTraining cannot be initialized in %s process, only %s", a, C91084c.TRAIN);
            return false;
        }
        C100761a.m166954a(this.f281686e);
        return true;
    }
}
