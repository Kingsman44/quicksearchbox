package com.google.android.libraries.search.assistant.fluidactions.p2540c.p2541a;

import androidx.slice.C4110i;
import androidx.slice.Slice;
import com.google.android.libraries.search.assistant.fluidactions.p2540c.C32971d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.c.a.g */
/* compiled from: PG */
public final /* synthetic */ class C32961g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C32965k f88315a;

    /* renamed from: b */
    public final /* synthetic */ C32971d f88316b;

    /* renamed from: c */
    public final /* synthetic */ int f88317c;

    public /* synthetic */ C32961g(C32965k kVar, C32971d dVar, int i) {
        this.f88315a = kVar;
        this.f88316b = dVar;
        this.f88317c = i;
    }

    public final C60870cx apply(Object obj) {
        C32965k kVar = this.f88315a;
        C32971d dVar = this.f88316b;
        int i = this.f88317c;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            C4110i iVar = new C4110i(kVar.f88326b, (Slice) optional.get());
            if (iVar.mo8620i()) {
                C59104x d = C32965k.f88325a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "SliceSettingMonitor");
                ((C59052c) ((C59052c) d).mo56372aa(50671)).mo56386p("Failed to load the slice, Error Slice.");
                return C60856cj.m92900i(Optional.empty());
            } else if (iVar.mo8612a() == 2) {
                return C60856cj.m92900i(optional);
            }
        }
        kVar.mo38411c(dVar);
        C32962h hVar = new C32962h(kVar, dVar, i);
        return C60856cj.m92902k(C47810es.m84965e(hVar), 200, TimeUnit.MILLISECONDS, kVar.f88327c);
    }
}
