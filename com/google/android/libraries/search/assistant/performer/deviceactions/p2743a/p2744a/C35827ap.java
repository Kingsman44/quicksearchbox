package com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a;

import androidx.slice.C4110i;
import androidx.slice.Slice;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ap */
/* compiled from: PG */
public final /* synthetic */ class C35827ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35830as f93883a;

    /* renamed from: b */
    public final /* synthetic */ C35841bc f93884b;

    /* renamed from: c */
    public final /* synthetic */ int[] f93885c;

    public /* synthetic */ C35827ap(C35830as asVar, C35841bc bcVar, int[] iArr) {
        this.f93883a = asVar;
        this.f93884b = bcVar;
        this.f93885c = iArr;
    }

    public final C60870cx apply(Object obj) {
        Slice slice;
        C35830as asVar = this.f93883a;
        C35841bc bcVar = this.f93884b;
        int[] iArr = this.f93885c;
        Boolean bool = (Boolean) obj;
        Optional map = Optional.ofNullable(bcVar.f93925f).map(new C35839ba(bcVar));
        if (bool.booleanValue() && map.isPresent() && ((C4110i) map.get()).mo8620i()) {
            ((C59052c) ((C59052c) C35830as.f93893a.mo56226d()).mo56372aa(51949)).mo56386p("Slice writer failed to load the slice, Error Slice.");
            return C60856cj.m92900i(false);
        } else if (bool.booleanValue() && (slice = bcVar.f93925f) != null && new C4110i(bcVar.f93921b, slice).mo8612a() == 2) {
            return C60856cj.m92900i(true);
        } else {
            iArr[0] = iArr[0] + 1;
            ((C59052c) ((C59052c) C35830as.f93893a.mo56224b()).mo56372aa(51948)).mo56387q("Slice not fully loaded, try again, numAttempts: %d", iArr[0]);
            bcVar.mo39863a();
            C35826ao aoVar = new C35826ao(asVar, bcVar, iArr);
            return C60856cj.m92902k(C47810es.m84965e(aoVar), 200, TimeUnit.MILLISECONDS, asVar.f93896d);
        }
    }
}
