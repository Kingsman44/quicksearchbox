package com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14938e;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.C14653a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1081b.C14727a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14272db;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14419in;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14421ip;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14422iq;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.an */
/* compiled from: PG */
public final class C14674an implements C14653a {

    /* renamed from: a */
    public static final C59071e f44320a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.an");

    /* renamed from: b */
    public C14421ip f44321b = C14421ip.f43615d;

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo21502b() {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo21503c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo21504d() {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final boolean mo21623h(C14492lf lfVar, C14324f fVar, C14938e eVar, C14749d dVar) {
        C14422iq iqVar;
        C14421ip ipVar;
        if (lfVar.f43800c == 20) {
            iqVar = (C14422iq) lfVar.f43801d;
        } else {
            iqVar = C14422iq.f43621c;
        }
        C14419in inVar = C14419in.OPEN_MEDIA_PIVOT_PAGE;
        int ordinal = C14419in.m30618a(iqVar.f43623a).ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return false;
            }
            C59104x d = f44320a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MedPivotCtrl");
            ((C59052c) ((C59052c) d).mo56372aa(45383)).mo56389s("Unknown event type: %s", C14419in.m30618a(iqVar.f43623a));
            return false;
        } else if (!C14983a.m31499a(fVar)) {
            C59104x d2 = f44320a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "Morris.MedPivotCtrl");
            ((C59052c) ((C59052c) d2).mo56372aa(45384)).mo56386p("Cannot open media pivot page: current Mode is not fullscreen media.");
            return false;
        } else {
            if (iqVar.f43623a == 1) {
                ipVar = (C14421ip) iqVar.f43624b;
            } else {
                ipVar = C14421ip.f43615d;
            }
            this.f44321b = ipVar;
            eVar.mo21860b(16);
            return false;
        }
    }

    /* renamed from: i */
    public final void mo21632i(C14324f fVar, C14727a aVar, C14272db dbVar, C14749d dVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo21633j(C14496lj ljVar, Optional optional, C14749d dVar) {
    }
}
