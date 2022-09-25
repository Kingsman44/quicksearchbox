package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import android.os.Build;
import com.google.assistant.p3897e.p3917i.p3918a.C51236af;
import com.google.assistant.p3897e.p3917i.p3918a.C51239ai;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.i */
/* compiled from: PG */
public final /* synthetic */ class C103629i implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C103629i f288674a = new C103629i();

    private /* synthetic */ C103629i() {
    }

    public final Object apply(Object obj) {
        C51236af afVar = (C51236af) ((C51239ai) obj).toBuilder();
        if ((((C51239ai) afVar.instance).f133401a & 2) == 0) {
            String str = Build.MODEL;
            afVar.copyOnWrite();
            C51239ai aiVar = (C51239ai) afVar.instance;
            str.getClass();
            aiVar.f133401a |= 2;
            aiVar.f133404d = str;
        }
        return (C51239ai) afVar.build();
    }
}
