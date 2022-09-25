package com.google.android.apps.gsa.staticplugins.p7930es;

import android.content.Context;
import android.net.Uri;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.es.u */
/* compiled from: PG */
public final class C100666u {

    /* renamed from: a */
    public static final C59071e f281494a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.es.u");

    /* renamed from: b */
    static final Uri f281495b = Uri.parse("content://sms");

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo92003a(int i, Context context) {
        List activeSubscriptionInfoList = ((SubscriptionManager) C39239a.m68666a(context, C39226b.TAG_CLASSIC_ASSISTANT).getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null) {
            activeSubscriptionInfoList = new ArrayList();
        }
        if (activeSubscriptionInfoList.isEmpty() || activeSubscriptionInfoList.size() >= i) {
            return -1;
        }
        return ((SubscriptionInfo) activeSubscriptionInfoList.get(i)).getSubscriptionId();
    }
}
