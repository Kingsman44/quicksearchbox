package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.C4395as;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: com.google.apps.tiktok.contrib.work.b.s */
/* compiled from: PG */
public final /* synthetic */ class C46561s implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C46561s f121736a = new C46561s();

    private /* synthetic */ C46561s() {
    }

    public final Object apply(Object obj) {
        List<C4395as> list = (List) obj;
        for (C4395as asVar : list) {
            if (asVar != null) {
                C58838bb.m90868c(!asVar.f14028c.contains("tiktok_account_work"));
            } else {
                throw new NoSuchElementException("Work ID not found");
            }
        }
        return list;
    }
}
