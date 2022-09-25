package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3902c.p3907c.C51021dl;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3917i.p3918a.C51401gi;
import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58557jl;
import java.util.HashMap;
import java.util.Set;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C32983ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C32985ag f88364a;

    /* renamed from: b */
    public final /* synthetic */ HashMap f88365b;

    /* renamed from: c */
    public final /* synthetic */ C52623yp f88366c;

    /* renamed from: d */
    public final /* synthetic */ Set f88367d;

    /* renamed from: e */
    public final /* synthetic */ C51021dl f88368e;

    public /* synthetic */ C32983ae(C32985ag agVar, HashMap hashMap, C52623yp ypVar, Set set, C51021dl dlVar) {
        this.f88364a = agVar;
        this.f88365b = hashMap;
        this.f88366c = ypVar;
        this.f88367d = set;
        this.f88368e = dlVar;
    }

    public final Object apply(Object obj) {
        C32985ag agVar = this.f88364a;
        HashMap hashMap = this.f88365b;
        C52623yp ypVar = this.f88366c;
        Set set = this.f88367d;
        C51021dl dlVar = this.f88368e;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            String str = (String) optional.get();
            return agVar.mo38441i(str, (String) Optional.ofNullable((String) hashMap.get(str)).orElse(str));
        }
        boolean isEmpty = set.isEmpty();
        String str2 = BuildConfig.FLAVOR;
        if (isEmpty) {
            return agVar.mo38443k((String) agVar.f88372c.mo38489s().orElse(str2));
        }
        if (set.size() == 1) {
            String str3 = (String) C58557jl.m90133n(set);
            C51027dr a = dlVar.mo53500a(0);
            if (a.f132855b == 2) {
                str2 = (String) a.f132856c;
            }
            return agVar.mo38441i(str3, str2);
        }
        agVar.mo38446n(ypVar, (C51030du) dlVar.build(), 7);
        agVar.mo38445m(C51401gi.CONTACT_ENDPOINT_SELECTION);
        return Optional.m71637of(agVar.mo38434a(false));
    }
}
