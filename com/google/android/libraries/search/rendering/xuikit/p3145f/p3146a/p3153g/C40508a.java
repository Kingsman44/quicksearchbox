package com.google.android.libraries.search.rendering.xuikit.p3145f.p3146a.p3153g;

import android.content.Context;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.silk.p3205a.p3212af.C41715a;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56850f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.f.a.g.a */
/* compiled from: PG */
public final class C40508a implements C41715a {

    /* renamed from: a */
    public static final C56848d f106282a;

    /* renamed from: b */
    public static final C56848d f106283b;

    /* renamed from: c */
    public static final C56848d f106284c;

    /* renamed from: e */
    private static final String f106285e = "Failed to replace container content: Fragment not attached to a parent activity.";

    /* renamed from: f */
    private static final String f106286f = "Failed to replace container content: Error replacing activity content.";

    /* renamed from: g */
    private static final String f106287g = "Failed to replace container content: Activity's peer doesn't implement the XBlendContainerApi.";

    /* renamed from: d */
    public final Fragment f106288d;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C56850f a = C69664n.m101061g(cVar, "builder");
        a.mo54435c("replace_content_error");
        a.mo54434b(f106285e);
        f106282a = a.mo54433a();
        C56847c cVar2 = (C56847c) C56848d.f151669d.createBuilder();
        C69664n.m101060f(cVar2, "newBuilder()");
        C56850f a2 = C69664n.m101061g(cVar2, "builder");
        a2.mo54435c("replace_content_error");
        a2.mo54434b("Failed to replace container content: Error replacing activity content.");
        f106283b = a2.mo54433a();
        C56847c cVar3 = (C56847c) C56848d.f151669d.createBuilder();
        C69664n.m101060f(cVar3, "newBuilder()");
        C56850f a3 = C69664n.m101061g(cVar3, "builder");
        a3.mo54435c("replace_content_error");
        a3.mo54434b("Failed to replace container content: Activity's peer doesn't implement the XBlendContainerApi.");
        f106284c = a3.mo54433a();
    }

    public C40508a(Context context, Fragment fragment) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(fragment, "fragment");
        this.f106288d = fragment;
    }
}
