package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b;

import android.os.Bundle;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4575r.C60757n;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.DesugarArrays;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.b.bd */
/* compiled from: PG */
public abstract class C80852bd {

    /* renamed from: c */
    public static final C80852bd f221794c = new C80834am(C80851bc.DEFAULT, C58733pz.f156496a);

    /* renamed from: c */
    public static C80852bd m128731c(Bundle bundle) {
        C80851bc bcVar = (C80851bc) DesugarArrays.stream((T[]) C80851bc.values()).filter(new C80850bb(C60757n.m92742c(bundle.getInt("version", 0), C80851bc.f221791e.f221793f, C80851bc.f221790d.f221793f))).findFirst().get();
        Collection charSequenceArrayList = bundle.getCharSequenceArrayList("flags");
        if (charSequenceArrayList == null) {
            charSequenceArrayList = C58485gu.m89845m();
        }
        return new C80834am(bcVar, (C58528ij) Collection.EL.stream(charSequenceArrayList).map(C80841at.f221773a).filter(C80842au.f221774a).map(C80843av.f221775a).collect(C58370cn.f155947b));
    }

    /* renamed from: a */
    public abstract C80851bc mo74695a();

    /* renamed from: b */
    public abstract C58528ij mo74696b();
}
