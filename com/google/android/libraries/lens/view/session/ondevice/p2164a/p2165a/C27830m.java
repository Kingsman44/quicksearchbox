package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.common.text.C24129e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58723pp;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4709l.p4710a.C62614b;
import com.google.lens.p4709l.p4710a.C62616d;
import com.google.lens.p4709l.p4710a.C62621i;
import com.google.protobuf.C62971cq;
import java.util.Collections;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.m */
/* compiled from: PG */
public final class C27830m {

    /* renamed from: a */
    public static final C58974d f75893a = C58974d.m91135i("LotsModel");

    /* renamed from: b */
    public final C62621i f75894b;

    /* renamed from: c */
    public final String f75895c;

    /* renamed from: d */
    public final String f75896d;

    /* renamed from: e */
    public final C58833ax f75897e;

    /* renamed from: f */
    public final C58833ax f75898f;

    public C27830m(C62621i iVar, int i, String str) {
        this.f75894b = iVar;
        this.f75895c = BuildConfig.FLAVOR;
        this.f75896d = str;
        this.f75898f = C58833ax.m90834k(Integer.valueOf(i));
        this.f75897e = C58836b.f156633a;
    }

    public C27830m(C62621i iVar, String str, C58833ax axVar) {
        this.f75894b = iVar;
        this.f75895c = "GddLensText";
        this.f75896d = str;
        this.f75898f = C58836b.f156633a;
        this.f75897e = axVar;
    }

    /* renamed from: d */
    public static C60870cx m51851d(String str, String str2, C58833ax axVar, Executor executor) {
        return C60856cj.m92904m(C47810es.m84978r(new C27828k(str, str2, axVar)), executor);
    }

    /* renamed from: a */
    public final C58833ax mo33321a(C62614b bVar) {
        return C58833ax.m90833j((C62616d) Collection.EL.stream(this.f75894b.f169072b).filter(new C27826i(bVar)).findAny().orElse(null));
    }

    /* renamed from: b */
    public final C58485gu mo33322b() {
        return (C58485gu) Collection.EL.stream(Collections.unmodifiableMap(this.f75894b.f169073c).keySet()).map(new C27829l(this)).collect(C58370cn.f155946a);
    }

    /* renamed from: c */
    public final boolean mo33323c(String str) {
        if ((this.f75894b.f169077g && str.equals("auto")) || this.f75894b.f169076f.contains(str)) {
            return true;
        }
        if (this.f75894b.f169075e.contains(str)) {
            return false;
        }
        C58833ax b = C24129e.m44828b(str);
        if (!b.mo56113h()) {
            return false;
        }
        C58833ax j = C58833ax.m90833j((String) ((C58723pp) C24129e.f65885a).f156468c.get(b.mo56107c()));
        C62971cq cqVar = this.f75894b.f169074d;
        Objects.requireNonNull(cqVar);
        return ((Boolean) j.mo56106b(new C27827j(cqVar)).mo56109e(false)).booleanValue();
    }
}
