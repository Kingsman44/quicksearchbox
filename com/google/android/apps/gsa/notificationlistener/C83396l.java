package com.google.android.apps.gsa.notificationlistener;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.collection.C90414u;
import com.google.android.apps.gsa.shared.notificationlistening.collection.NotificationParseConfigs;
import com.google.android.apps.gsa.shared.notificationlistening.common.NotificationWrapper;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.notificationlistener.l */
/* compiled from: PG */
public final class C83396l {

    /* renamed from: a */
    private final Context f227286a;

    /* renamed from: b */
    private final C21370a f227287b;

    /* renamed from: c */
    private final C89656k f227288c;

    public C83396l(Context context, C21370a aVar, C89656k kVar) {
        this.f227287b = aVar;
        this.f227286a = context;
        this.f227288c = kVar;
    }

    /* renamed from: a */
    public final C58485gu mo76695a(List list, NotificationParseConfigs notificationParseConfigs) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new NotificationWrapper((StatusBarNotification) it.next()));
        }
        return C58485gu.m89842j(C90414u.m147052a(this.f227286a, this.f227288c, this.f227287b, arrayList, notificationParseConfigs.mo84050d(), notificationParseConfigs.mo84049c(), notificationParseConfigs.mo84058j(), notificationParseConfigs.mo84048b(), notificationParseConfigs.mo84057i(), notificationParseConfigs.mo84055h(), notificationParseConfigs.mo84054g(), notificationParseConfigs.mo84053f(), notificationParseConfigs.mo84059k(), true, notificationParseConfigs.mo84047a(), notificationParseConfigs.mo84060l(), notificationParseConfigs.mo84051e()));
    }
}
