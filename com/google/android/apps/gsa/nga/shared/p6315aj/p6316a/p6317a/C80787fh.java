package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.fh */
/* compiled from: PG */
public abstract class C80787fh {
    /* renamed from: e */
    public static C80780fa m128662e() {
        C80686bo boVar = new C80686bo();
        boVar.f221531a = BuildConfig.FLAVOR;
        return boVar;
    }

    /* renamed from: f */
    public static C80787fh m128663f(Bundle bundle) {
        Collection parcelableArrayList = bundle.getParcelableArrayList("chips");
        if (parcelableArrayList == null) {
            parcelableArrayList = C58485gu.m89845m();
        }
        C80780fa e = m128662e();
        e.mo74591b((C58485gu) Collection.EL.stream(parcelableArrayList).map(C80776ex.f221688a).collect(C58370cn.f155946a));
        ((C80686bo) e).f221532b = bundle.getString("chips_ve_parent_id");
        e.mo74592c(bundle.getString("chips_header_text", BuildConfig.FLAVOR));
        return e.mo74590a();
    }

    /* renamed from: a */
    public abstract C58485gu mo74593a();

    /* renamed from: b */
    public abstract String mo74594b();

    /* renamed from: c */
    public abstract String mo74595c();

    /* renamed from: d */
    public final Bundle mo74655d() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("chips", (ArrayList) Collection.EL.stream(mo74593a()).map(C80777ey.f221689a).collect(Collectors.toCollection(C80778ez.f221690a)));
        if (mo74595c() != null) {
            bundle.putString("chips_ve_parent_id", mo74595c());
        }
        bundle.putString("chips_header_text", mo74594b());
        return bundle;
    }
}
