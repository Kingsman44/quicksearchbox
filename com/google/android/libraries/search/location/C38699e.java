package com.google.android.libraries.search.location;

import android.app.PendingIntent;
import com.google.android.gms.awareness.C142930e;
import com.google.android.gms.awareness.fence.AwarenessFence;
import com.google.android.gms.awareness.fence.C142935d;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.location.p3029a.p3032c.C38636a;
import com.google.android.libraries.search.location.p3029a.p3032c.p3033a.C38638b;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4189b.C55892i;
import com.google.p4184bj.p4189b.C55893j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.location.e */
/* compiled from: PG */
public final class C38699e implements C38697c {

    /* renamed from: a */
    private static final C59071e f102184a = C59071e.m91332i("com.google.android.libraries.search.location.e");

    /* renamed from: b */
    private final Optional f102185b;

    /* renamed from: c */
    private final C38683aa f102186c;

    /* renamed from: d */
    private final C38636a f102187d;

    public C38699e(C38636a aVar, Optional optional, C38683aa aaVar) {
        this.f102187d = aVar;
        this.f102185b = optional;
        this.f102186c = aaVar;
    }

    /* renamed from: d */
    private static boolean m67976d(C55893j jVar) {
        int a = C55892i.m87799a(jVar.f148731b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1 && i != 2 && i != 3) {
            return i == 5 || i == 6;
        }
        for (C55893j d : jVar.f148732c) {
            if (m67976d(d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C60870cx mo41558a(String str, String str2, AwarenessFence awarenessFence, PendingIntent pendingIntent, C39226b bVar) {
        try {
            if (!m67976d((C55893j) C62942bv.parseFrom((C62942bv) C55893j.f148728h, ((ContextFenceStub) awarenessFence).mo119546a(), C62921ba.m95368a()))) {
                return mo41560c(str, str2, awarenessFence, pendingIntent, bVar);
            }
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f102184a.mo56225c()).mo56382g(e)).mo56372aa(53135)).mo56386p("Could not parse the ContextFence proto, checking locationOracle.");
        }
        if (!this.f102185b.isPresent() || ((C38638b) this.f102185b.get()).mo41535a(str)) {
            return C47633f.m84733g(this.f102186c.mo41547a()).mo51516i(new C38698d(this, str, str2, awarenessFence, pendingIntent, bVar), C60826bg.f164896a);
        }
        ((C59052c) ((C59052c) f102184a.mo56225c()).mo56372aa(53136)).mo56386p("Unknown fence moduleId.");
        return C60856cj.m92899h(new IllegalArgumentException("Unknown fence moduleId"));
    }

    /* renamed from: b */
    public final C60870cx mo41559b(String str, String str2, C39226b bVar) {
        C142930e a = this.f102187d.mo41527a(str, bVar);
        C142935d dVar = new C142935d();
        dVar.mo117829d(str2);
        return C43205e.m76192b(a.mo117823a(dVar.mo117826a()));
    }

    /* renamed from: c */
    public final C60870cx mo41560c(String str, String str2, AwarenessFence awarenessFence, PendingIntent pendingIntent, C39226b bVar) {
        C142930e a = this.f102187d.mo41527a(str, bVar);
        C142935d dVar = new C142935d();
        dVar.mo117827b(str2, awarenessFence, pendingIntent);
        return C43205e.m76192b(a.mo117823a(dVar.mo117826a()));
    }
}
