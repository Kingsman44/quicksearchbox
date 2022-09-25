package com.google.android.libraries.onegoogle.owners.mdi;

import android.accounts.Account;
import com.google.android.libraries.onegoogle.owners.C30974i;
import com.google.android.libraries.onegoogle.owners.C30976k;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.onegoogle.owners.mdi.w */
/* compiled from: PG */
public final /* synthetic */ class C31008w implements Callable {

    /* renamed from: a */
    public final /* synthetic */ MdiOwnersLoader f83508a;

    /* renamed from: b */
    public final /* synthetic */ List f83509b;

    /* renamed from: c */
    public final /* synthetic */ List f83510c;

    public /* synthetic */ C31008w(MdiOwnersLoader mdiOwnersLoader, List list, List list2) {
        this.f83508a = mdiOwnersLoader;
        this.f83509b = list;
        this.f83510c = list2;
    }

    public final Object call() {
        MdiOwnersLoader mdiOwnersLoader = this.f83508a;
        List list = this.f83509b;
        List list2 = this.f83510c;
        int size = list.size();
        C58480gp f = C58485gu.m89838f(size);
        for (int i = 0; i < size; i++) {
            C30974i m = C30976k.m57823m();
            m.mo36618b(((Account) list.get(i)).name);
            mdiOwnersLoader.mo36673b(m, (C60870cx) list2.get(i));
            f.mo55395g(m.mo36617a());
        }
        return f.mo55394f();
    }
}
