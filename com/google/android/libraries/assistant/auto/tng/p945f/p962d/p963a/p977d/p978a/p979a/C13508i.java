package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.p979a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.common.p898b.C13215a;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p1002d.C13612a;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13499a;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13510c;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13512e;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a.C13514g;
import com.google.android.libraries.search.assistant.performer.permissions.C36196a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.a.i */
/* compiled from: PG */
public final class C13508i implements C13514g {

    /* renamed from: a */
    public static final C59071e f41432a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.a.i");

    /* renamed from: g */
    private static final String[] f41433g = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: b */
    public final Executor f41434b;

    /* renamed from: c */
    public final C13612a f41435c;

    /* renamed from: d */
    public final Context f41436d;

    /* renamed from: e */
    public final C60950i f41437e;

    /* renamed from: f */
    public final C15481g f41438f;

    /* renamed from: h */
    private final C13215a f41439h;

    public C13508i(Executor executor, Context context, C13612a aVar, C13215a aVar2, C60950i iVar, C15481g gVar) {
        this.f41434b = executor;
        this.f41436d = context;
        this.f41435c = aVar;
        this.f41439h = aVar2;
        this.f41437e = iVar;
        this.f41438f = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo21138a() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx a = this.f41439h.mo20981a();
        C13503d dVar = new C13503d(this);
        return C60922j.m93045h(a, C47810es.m84966f(dVar), this.f41434b);
    }

    /* renamed from: b */
    public final C60870cx mo21139b() {
        C13510c l = C13512e.m29782l();
        String string = this.f41436d.getString(R.string.share_static_location_button);
        if (string != null) {
            C13499a aVar = (C13499a) l;
            aVar.f41408a = string;
            aVar.f41418k = 8;
            aVar.f41410c = "LOCATION";
            return C60856cj.m92900i(l.mo21131a());
        }
        throw new NullPointerException("Null displayString");
    }

    /* renamed from: c */
    public final C60870cx mo21140c() {
        C58976aa aaVar = C58975e.f156826a;
        String[] strArr = f41433g;
        for (int i = 0; i < 2; i++) {
            if (!C36196a.m64596a(strArr[i], this.f41436d)) {
                return C60856cj.m92900i(false);
            }
        }
        if (!C36196a.m64596a("android.permission.ACCESS_BACKGROUND_LOCATION", this.f41436d)) {
            return C60856cj.m92900i(false);
        }
        return C60856cj.m92900i(true);
    }
}
