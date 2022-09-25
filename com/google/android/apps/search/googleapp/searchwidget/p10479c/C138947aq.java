package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.android.apps.search.googleapp.searchwidget.C139031i;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63042fg;
import java.util.ArrayList;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.aq */
/* compiled from: PG */
public final /* synthetic */ class C138947aq implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138963bf f377897a;

    /* renamed from: b */
    public final /* synthetic */ List f377898b;

    /* renamed from: c */
    public final /* synthetic */ C63042fg f377899c;

    public /* synthetic */ C138947aq(C138963bf bfVar, List list, C63042fg fgVar) {
        this.f377897a = bfVar;
        this.f377898b = list;
        this.f377899c = fgVar;
    }

    public final C60870cx apply(Object obj) {
        C138963bf bfVar = this.f377897a;
        List list = this.f377898b;
        C63042fg fgVar = this.f377899c;
        return bfVar.f377924f.mo46039a(new C138962be((C58485gu) Stream.CC.concat(Collection.EL.stream(new ArrayList(((C139031i) obj).f378101b)), Collection.EL.stream(new ArrayList(list))).distinct().filter(new C138961bd(fgVar)).collect(C58370cn.f155946a)), bfVar.f377925g);
    }
}
