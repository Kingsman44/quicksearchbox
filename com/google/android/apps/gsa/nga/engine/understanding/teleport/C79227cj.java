package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4526f.p4527a.C58970a;
import p001a.p014d.p015a.p016a.C0063h;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.cj */
/* compiled from: PG */
public final /* synthetic */ class C79227cj implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C79227cj f217698a = new C79227cj();

    private /* synthetic */ C79227cj() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C0063h hVar = (C0063h) obj;
        if (hVar.f170a == 2 && !((String) hVar.f171b).isEmpty()) {
            ((C58970a) ((C58970a) TeleportQueryCleaner.f217615a.mo56225c()).mo56372aa(5506)).mo56389s("Could not cleanup query: %s", hVar.f170a == 2 ? (String) hVar.f171b : BuildConfig.FLAVOR);
            return BuildConfig.FLAVOR;
        } else if (hVar.f170a == 1) {
            return (String) hVar.f171b;
        } else {
            return BuildConfig.FLAVOR;
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
