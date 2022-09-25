package com.google.android.apps.gsa.notificationlistener;

import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.notificationlistener.u */
/* compiled from: PG */
public abstract class C83405u {

    /* renamed from: a */
    public static final C83405u f227299a = new C83379a().mo76678a();

    /* renamed from: b */
    public static C83400p m132748b() {
        return new C83379a();
    }

    /* renamed from: a */
    public abstract C58485gu mo76685a();

    /* renamed from: c */
    public final List mo76699c(List list) {
        if (mo76685a() == null) {
            return list;
        }
        list.size();
        C58485gu a = mo76685a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            list = ((C83402r) a.get(i)).mo76698a(list);
            list.size();
        }
        return list;
    }
}
