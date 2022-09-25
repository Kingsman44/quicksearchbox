package com.google.android.libraries.assistant.pcp.p1573k;

import android.content.ComponentName;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123719am;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123722ap;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123723aq;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58817ah;
import java.util.LinkedHashSet;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.k.r */
/* compiled from: PG */
public final /* synthetic */ class C18938r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C18939s f53237a;

    /* renamed from: b */
    public final /* synthetic */ LinkedHashSet f53238b;

    /* renamed from: c */
    public final /* synthetic */ C53306j f53239c;

    /* renamed from: d */
    public final /* synthetic */ Optional f53240d;

    /* renamed from: e */
    public final /* synthetic */ List f53241e;

    public /* synthetic */ C18938r(C18939s sVar, LinkedHashSet linkedHashSet, C53306j jVar, Optional optional, List list) {
        this.f53237a = sVar;
        this.f53238b = linkedHashSet;
        this.f53239c = jVar;
        this.f53240d = optional;
        this.f53241e = list;
    }

    public final Object apply(Object obj) {
        C18939s sVar = this.f53237a;
        LinkedHashSet linkedHashSet = this.f53238b;
        C53306j jVar = this.f53239c;
        Optional optional = this.f53240d;
        List list = this.f53241e;
        List<ComponentName> b = sVar.f53242a.mo24191b((List) obj, linkedHashSet, jVar, (C123777f) optional.orElse(C123777f.f341922a), list.contains(10), BuildConfig.FLAVOR, true);
        C123719am amVar = (C123719am) C123726at.f341743h.createBuilder();
        for (ComponentName componentName : b) {
            C123722ap apVar = (C123722ap) C123723aq.f341737d.createBuilder();
            String packageName = componentName.getPackageName();
            apVar.copyOnWrite();
            C123723aq aqVar = (C123723aq) apVar.instance;
            packageName.getClass();
            aqVar.f341739a |= 1;
            aqVar.f341740b = packageName;
            String className = componentName.getClassName();
            apVar.copyOnWrite();
            C123723aq aqVar2 = (C123723aq) apVar.instance;
            className.getClass();
            aqVar2.f341739a |= 2;
            aqVar2.f341741c = className;
            amVar.mo106110b(apVar);
        }
        return (C123726at) amVar.build();
    }
}
