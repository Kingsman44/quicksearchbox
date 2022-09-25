package com.google.apps.tiktok.account.data.manager;

import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import java.util.Collection;

/* renamed from: com.google.apps.tiktok.account.data.manager.w */
/* compiled from: PG */
public final /* synthetic */ class C46315w implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Collection f121305a;

    public /* synthetic */ C46315w(Collection collection) {
        this.f121305a = collection;
    }

    public final Object apply(Object obj) {
        C58495hd hdVar = (C58495hd) obj;
        C58838bb.m90884s(hdVar.size() == this.f121305a.size(), "Provider had duplicate accounts.");
        return hdVar;
    }
}
