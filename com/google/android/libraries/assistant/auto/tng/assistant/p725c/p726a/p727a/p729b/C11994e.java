package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p729b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.C11989b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12013c;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.p731d.C12017g;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37400be;
import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.b.e */
/* compiled from: PG */
public final class C11994e implements C37402bg {

    /* renamed from: c */
    private static final C59071e f38504c = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.a.a.b.e");

    /* renamed from: a */
    public final C60870cx f38505a = C2169h.m6027a(new C11992c(this));

    /* renamed from: b */
    public C2164c f38506b;

    /* renamed from: d */
    private final C11989b f38507d;

    /* renamed from: e */
    private final C37400be f38508e;

    /* renamed from: f */
    private final C12013c f38509f;

    /* renamed from: g */
    private final Executor f38510g;

    public C11994e(C11989b bVar, C37561eb ebVar, C58833ax axVar, C12013c cVar, Executor executor) {
        this.f38507d = bVar;
        this.f38509f = cVar;
        this.f38510g = executor;
        C58836b bVar2 = C58836b.f156633a;
        this.f38508e = C37846as.m66798d(axVar, bVar2, ebVar, bVar2);
    }

    /* renamed from: a */
    public final C37401bf mo20354a() {
        C59104x b = f38504c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConcurrentARLSession");
        ((C59052c) ((C59052c) b).mo56372aa(43954)).mo56386p("#stopListening");
        C12013c cVar = this.f38509f;
        C60870cx a = C70876o.m103760a(cVar.f189039a.mo39510a(C12017g.m27910b(), cVar.f189040b), this.f38507d);
        C11993d dVar = new C11993d(this);
        C60856cj.m92911t(a, C47810es.m84974n(dVar), this.f38510g);
        return new C11991b(this);
    }

    /* renamed from: b */
    public final C60870cx mo20355b() {
        return C60856cj.m92900i(C37360ay.f99224l);
    }

    /* renamed from: c */
    public final C60870cx mo20356c() {
        return C60856cj.m92900i(C37454cc.f99428c);
    }

    /* renamed from: d */
    public final C60870cx mo20357d() {
        return C60856cj.m92900i(this.f38508e);
    }

    /* renamed from: e */
    public final /* synthetic */ Object mo20358e() {
        return new C11990a(this);
    }
}
