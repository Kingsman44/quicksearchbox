package com.google.android.apps.gsa.nga.shared.p6328ap;

import android.content.ComponentName;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.p2593c.C33510d;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.b */
/* compiled from: PG */
public final /* synthetic */ class C80976b implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80976b f221978a = new C80976b();

    private /* synthetic */ C80976b() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        ComponentName componentName = (ComponentName) obj;
        C58974d dVar = C33510d.f89661a;
        C69664n.m101061g(componentName, "componentName");
        return Boolean.valueOf(C33510d.f89663c.contains(componentName.getClassName()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
