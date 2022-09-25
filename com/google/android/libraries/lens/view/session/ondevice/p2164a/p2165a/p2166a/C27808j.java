package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.p2166a;

import com.google.android.libraries.lens.view.filters.translation.p2106a.C26034j;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27830m;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.lens.p4709l.p4710a.C62614b;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.a.j */
/* compiled from: PG */
public final class C27808j implements C27806h {

    /* renamed from: a */
    public final C26034j f75867a;

    /* renamed from: b */
    public final boolean f75868b;

    public C27808j(C26034j jVar, boolean z) {
        this.f75867a = jVar;
        this.f75868b = z;
    }

    /* renamed from: a */
    public final C58833ax mo33316a(C27830m mVar, C58833ax axVar, C58833ax axVar2) {
        if (!axVar.mo56113h() || !axVar2.mo56113h()) {
            return C58836b.f156633a;
        }
        return mVar.mo33321a(C62614b.LOTS_FEATURE_OFFLINE_TRANSLATE).mo56106b(new C27807i(this, axVar, mVar, axVar2));
    }

    /* renamed from: b */
    public final boolean mo33317b(C27830m mVar, C58833ax axVar, C58833ax axVar2) {
        return axVar.mo56113h() && axVar2.mo56113h() && mVar.mo33323c((String) axVar.mo56107c());
    }
}
