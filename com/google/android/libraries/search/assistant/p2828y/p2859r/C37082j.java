package com.google.android.libraries.search.assistant.p2828y.p2859r;

import android.app.NotificationManager;
import android.content.Context;
import com.google.assistant.p3897e.p3917i.p3918a.C51298cn;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.r.j */
/* compiled from: PG */
public final class C37082j {

    /* renamed from: a */
    public static final C58495hd f96583a;

    /* renamed from: b */
    public final Context f96584b;

    /* renamed from: c */
    public final NotificationManager f96585c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("android.permission.READ_CONTACTS", C51298cn.READ_CONTACTS);
        gzVar.mo55429h("android.permission.CALL_PHONE", C51298cn.CALL_PHONE);
        gzVar.mo55429h("android.permission.CALL_PRIVILEGED", C51298cn.CALL_PRIVILEGED);
        gzVar.mo55429h("android.permission.READ_CALL_LOG", C51298cn.READ_CALL_LOG);
        gzVar.mo55429h("android.permission.SEND_SMS", C51298cn.SEND_SMS);
        gzVar.mo55429h("android.permission.READ_SMS", C51298cn.READ_SMS);
        f96583a = gzVar.mo55427f(false);
    }

    public C37082j(Context context, NotificationManager notificationManager) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(notificationManager, "notificationManager");
        this.f96584b = context;
        this.f96585c = notificationManager;
    }
}
