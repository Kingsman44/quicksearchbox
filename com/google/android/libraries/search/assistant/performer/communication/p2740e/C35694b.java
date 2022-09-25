package com.google.android.libraries.search.assistant.performer.communication.p2740e;

import android.content.Context;
import android.telephony.SmsManager;
import android.telephony.SubscriptionManager;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.e.b */
/* compiled from: PG */
public final class C35694b implements C35697e {

    /* renamed from: a */
    public static final C59071e f93589a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.communication.e.b");

    /* renamed from: b */
    public final Context f93590b;

    /* renamed from: c */
    public final C60888db f93591c;

    public C35694b(Context context, C60888db dbVar) {
        this.f93590b = context;
        this.f93591c = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo39803a(String str, String str2) {
        Optional optional;
        Collection collection;
        Context context = this.f93590b;
        int defaultSmsSubscriptionId = SmsManager.getDefaultSmsSubscriptionId();
        if (defaultSmsSubscriptionId < 0) {
            defaultSmsSubscriptionId = -1;
        }
        if (defaultSmsSubscriptionId == -1) {
            SubscriptionManager subscriptionManager = (SubscriptionManager) C39239a.m68666a(context, C39226b.TAG_ASSISTANT_ACCL).getSystemService("telephony_subscription_service");
            if (subscriptionManager == null) {
                ((C59052c) ((C59052c) C35704l.f93606a.mo56225c()).mo56372aa(51779)).mo56386p("can not get system service TELEPHONY_SUBSCRIPTION_SERVICE");
                collection = C58485gu.m89845m();
            } else {
                collection = subscriptionManager.getActiveSubscriptionInfoList();
                if (collection == null) {
                    collection = C58485gu.m89845m();
                }
            }
            defaultSmsSubscriptionId = ((Integer) Collection.EL.stream(collection).map(C35702j.f93604a).filter(C35703k.f93605a).findFirst().orElse(-1)).intValue();
        }
        if (defaultSmsSubscriptionId == -1) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(SmsManager.getSmsManagerForSubscriptionId(defaultSmsSubscriptionId));
        }
        if (optional.isEmpty()) {
            ((C59052c) ((C59052c) f93589a.mo56225c()).mo56372aa(51769)).mo56386p("Failed to send SMS, Error: No active subscription ids was found");
            return C60856cj.m92899h(new C35695c("Failed to send SMS, Error: No active subscription ids was found"));
        }
        try {
            return C2169h.m6027a(new C35693a(this, optional, str, ((SmsManager) optional.get()).divideMessage(str2)));
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f93589a.mo56225c()).mo56382g(e)).mo56372aa(51768)).mo56386p("Exception while dividing sms");
            return C60856cj.m92899h(new RuntimeException("Exception while dividing SMS", e));
        }
    }
}
