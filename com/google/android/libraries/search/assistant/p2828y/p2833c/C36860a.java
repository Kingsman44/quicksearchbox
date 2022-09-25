package com.google.android.libraries.search.assistant.p2828y.p2833c;

import android.os.Build;
import com.google.assistant.p3897e.p3917i.p3918a.C51236af;
import com.google.assistant.p3897e.p3917i.p3918a.C51239ai;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.c.a */
/* compiled from: PG */
public final class C36860a {
    /* renamed from: a */
    public static final C51239ai m65550a() {
        C51236af afVar = (C51236af) C51239ai.f133399g.createBuilder();
        C69664n.m101060f(afVar, "newBuilder()");
        C69664n.m101061g(afVar, "builder");
        String str = Build.MODEL;
        C69664n.m101060f(str, "MODEL");
        C69664n.m101061g(str, "value");
        afVar.copyOnWrite();
        C51239ai aiVar = (C51239ai) afVar.instance;
        str.getClass();
        aiVar.f133401a |= 2;
        aiVar.f133404d = str;
        C62942bv build = afVar.build();
        C69664n.m101060f(build, "_builder.build()");
        return (C51239ai) build;
    }
}
