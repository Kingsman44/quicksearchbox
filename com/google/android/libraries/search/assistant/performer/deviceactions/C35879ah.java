package com.google.android.libraries.search.assistant.performer.deviceactions;

import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.C35786a;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2743a.p2744a.C35845bg;
import com.google.assistant.p3897e.p3921j.C52098fd;
import com.google.assistant.p3897e.p3921j.C52103fi;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.ah */
/* compiled from: PG */
public final /* synthetic */ class C35879ah implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C35881aj f93994a;

    /* renamed from: b */
    public final /* synthetic */ C52098fd f93995b;

    public /* synthetic */ C35879ah(C35881aj ajVar, C52098fd fdVar) {
        this.f93994a = ajVar;
        this.f93995b = fdVar;
    }

    public final Object apply(Object obj) {
        C52103fi fiVar;
        C35881aj ajVar = this.f93994a;
        C52098fd fdVar = this.f93995b;
        C58480gp e = C58485gu.m89837e();
        for (String str : (C58485gu) obj) {
            if (!ajVar.f94003e.containsKey(str)) {
                ((C59052c) ((C59052c) C35881aj.f93999a.mo56226d()).mo56372aa(51812)).mo56389s("Setting %s not supported by legacy flow.", str);
                e.mo55395g(str);
                fiVar = C35845bg.m64242b();
            } else {
                fiVar = ((C35786a) ajVar.f94003e.get(str)).mo39838a(str);
            }
            fdVar.mo53798b(str, fiVar);
        }
        return e.mo55394f();
    }
}
