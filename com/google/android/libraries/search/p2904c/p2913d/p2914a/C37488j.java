package com.google.android.libraries.search.p2904c.p2913d.p2914a;

import androidx.media.C2427e;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2904c.C37325aa;
import com.google.android.libraries.search.p2904c.p2913d.p2915b.C37493b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.d.a.j */
/* compiled from: PG */
public final class C37488j implements C37325aa {

    /* renamed from: a */
    public static final C59071e f99521a = C59071e.m91332i("com.google.android.libraries.search.c.d.a.j");

    /* renamed from: b */
    public final C37493b f99522b;

    /* renamed from: c */
    public final C2427e f99523c;

    /* renamed from: d */
    public final C60870cx f99524d;

    /* renamed from: e */
    public final C60870cx f99525e = C2169h.m6027a(new C37486h(this));

    /* renamed from: f */
    public final C37480b f99526f;

    /* renamed from: g */
    public final Executor f99527g;

    /* renamed from: h */
    public C2164c f99528h;

    /* renamed from: i */
    private final C37490l f99529i;

    public C37488j(C37493b bVar, C2427e eVar, C60870cx cxVar, C37480b bVar2, C37490l lVar, Executor executor) {
        this.f99522b = bVar;
        this.f99523c = eVar;
        this.f99524d = cxVar;
        this.f99526f = bVar2;
        this.f99529i = lVar;
        this.f99527g = executor;
    }

    /* renamed from: a */
    public final C60870cx mo40882a() {
        return this.f99524d;
    }

    /* renamed from: b */
    public final C60870cx mo40883b() {
        C59104x b = f99521a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.AFCSession");
        ((C59052c) ((C59052c) b).mo56372aa(52692)).mo56387q("#audio# release audio focus session(token(%d))", this.f99522b.f99544b);
        return this.f99529i.mo40988b(this.f99522b);
    }
}
