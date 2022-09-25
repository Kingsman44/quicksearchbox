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

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.a.a.ai */
/* compiled from: PG */
public final /* synthetic */ class C35820ai implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35823al f93850a;

    /* renamed from: b */
    public final /* synthetic */ C35835ax f93851b;

    /* renamed from: c */
    public final /* synthetic */ String f93852c;

    /* renamed from: d */
    public final /* synthetic */ int f93853d;

    public /* synthetic */ C35820ai(C35823al alVar, C35835ax axVar, String str, int i) {
        this.f93850a = alVar;
        this.f93851b = axVar;
        this.f93852c = str;
        this.f93853d = i;
    }

    public final C60870cx apply(Object obj) {
        int i;
        C35823al alVar = this.f93850a;
        C35835ax axVar = this.f93851b;
        String str = this.f93852c;
        int i2 = this.f93853d;
        Boolean bool = (Boolean) obj;
        Optional map = Optional.ofNullable(axVar.f93909f).map(new C35832au(axVar));
        if (!bool.booleanValue() || !map.isPresent() || !((C4110i) map.get()).mo8620i()) {
            Slice slice = axVar.f93909f;
            if (slice == null) {
                i = -1;
            } else {
                i = new C4110i(axVar.f93905b, slice).mo8612a();
            }
            if (!bool.booleanValue() || i != 2) {
                alVar.f93867d.put(str, Integer.valueOf(i2 + 1));
                axVar.mo39860a();
                C35822ak akVar = new C35822ak(alVar, axVar, str);
                return C60856cj.m92902k(C47810es.m84965e(akVar), 200, TimeUnit.MILLISECONDS, alVar.f93866c);
            }
            alVar.f93867d.remove(str);
            return C60856cj.m92900i(true);
        }
        ((C59052c) ((C59052c) C35823al.f93863a.mo56226d()).mo56372aa(51936)).mo56386p("Slice reader failed to load the slice, Error Slice.");
        return C60856cj.m92900i(false);
    }
}
