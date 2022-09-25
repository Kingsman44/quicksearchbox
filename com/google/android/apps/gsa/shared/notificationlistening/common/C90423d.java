package com.google.android.apps.gsa.shared.notificationlistening.common;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.common.d */
/* compiled from: PG */
public final class C90423d {

    /* renamed from: a */
    public List f252598a;

    /* renamed from: a */
    public final boolean mo84149a() {
        List list = this.f252598a;
        return list == null || list.isEmpty();
    }

    /* renamed from: b */
    public final void mo84150b(MessageNotification messageNotification) {
        if (this.f252598a == null) {
            this.f252598a = new ArrayList();
        }
        this.f252598a.add(messageNotification);
    }
}
