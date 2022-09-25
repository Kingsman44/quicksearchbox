package com.google.android.apps.gsa.staticplugins.actions.p7353a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.telephony.SmsManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.util.C90739aw;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.a.al */
/* compiled from: PG */
public final class C93264al {

    /* renamed from: a */
    public static final C59071e f260043a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actions.a.al");

    /* renamed from: b */
    public final Context f260044b;

    /* renamed from: c */
    public final C86124t f260045c;

    /* renamed from: d */
    public final C93266an f260046d;

    /* renamed from: e */
    public final C68214a f260047e;

    /* renamed from: f */
    public final C58833ax f260048f;

    /* renamed from: g */
    public final C58833ax f260049g;

    /* renamed from: h */
    private final C90739aw f260050h;

    /* renamed from: i */
    private final C22871g f260051i;

    /* renamed from: j */
    private final int f260052j;

    public C93264al(Context context, C90739aw awVar, C58833ax axVar, C86124t tVar, C22871g gVar, C68214a aVar, C58833ax axVar2) {
        C93266an anVar = new C93266an();
        this.f260044b = context;
        this.f260050h = awVar;
        this.f260049g = axVar;
        this.f260045c = tVar;
        this.f260052j = (int) tVar.mo79743a(C90120fr.f250794aG);
        this.f260051i = gVar;
        this.f260047e = aVar;
        this.f260048f = axVar2;
        this.f260046d = anVar;
    }

    /* renamed from: c */
    public static ArrayList m153351c(Context context, int i) {
        Intent intent = new Intent("com.google.android.voicesearch.action.SMS_STATUS").setPackage(context.getPackageName());
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(PendingIntent.getBroadcast(context, i2 + 55, intent, 1140850688));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C93263ak mo87594a(long j, int i, C93262aj ajVar) {
        SettableFuture settableFuture = new SettableFuture();
        C93269aq aqVar = new C93269aq(this.f260052j, Executors.newSingleThreadScheduledExecutor(), new C93258af(this, ajVar, settableFuture));
        ajVar.mo87590a(new C93259ag(aqVar));
        aqVar.mo87598a();
        aqVar.mo87599b();
        IntentFilter intentFilter = new IntentFilter("com.google.android.voicesearch.action.SMS_STATUS");
        C93263ak akVar = new C93263ak(aqVar, settableFuture, i, new C93260ah(this, j, ajVar));
        ajVar.mo87590a(new C93261ai(this, akVar));
        this.f260044b.registerReceiver(akVar, intentFilter);
        return akVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo87595b(String str, String str2) {
        int i;
        C93262aj ajVar = new C93262aj();
        int i2 = this.f260052j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) this.f260044b.getSystemService("power")).newWakeLock(1, "SmsSender");
        ajVar.mo87590a(new C93257ae(newWakeLock));
        newWakeLock.acquire((long) i2);
        try {
            ArrayList<String> divideMessage = this.f260050h.f253815a.divideMessage(str2);
            int size = divideMessage.size();
            try {
                C93263ak a = mo87594a(C93266an.m153357c(this.f260044b, str2, str), size, ajVar);
                if (((SubscriptionManager) this.f260044b.getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoCountMax() > 1) {
                    try {
                        if (C93266an.m153356b() != -1) {
                            int b = C93266an.m153356b();
                            SmsManager.getSmsManagerForSubscriptionId(b).sendMultipartTextMessage(str, (String) null, divideMessage, m153351c(this.f260044b, size), (ArrayList) null);
                        } else {
                            List activeSubscriptionInfoList = ((SubscriptionManager) C39239a.m68666a(this.f260044b, C39226b.TAG_CLASSIC_SERVICES).getSystemService("telephony_subscription_service")).getActiveSubscriptionInfoList();
                            if (activeSubscriptionInfoList == null) {
                                activeSubscriptionInfoList = new ArrayList();
                            }
                            if (activeSubscriptionInfoList.isEmpty()) {
                                i = -1;
                            } else {
                                i = ((SubscriptionInfo) activeSubscriptionInfoList.get(0)).getSubscriptionId();
                            }
                            if (i == -1) {
                                ((C59052c) ((C59052c) f260043a.mo56225c()).mo56372aa(13549)).mo56386p("No active subscription Ids found while trying to get first active subscription Id.");
                                ajVar.mo87591b();
                                return C60856cj.m92900i(C87421i.m141588a(27));
                            }
                            SmsManager.getSmsManagerForSubscriptionId(i).sendMultipartTextMessage(str, (String) null, divideMessage, m153351c(this.f260044b, size), (ArrayList) null);
                        }
                    } catch (IllegalArgumentException unused) {
                        a.mo87592a(19);
                    } catch (UnsupportedOperationException unused2) {
                        a.mo87592a(28);
                    } catch (RuntimeException unused3) {
                        a.mo87592a(20);
                    }
                } else {
                    try {
                        C90739aw awVar = this.f260050h;
                        awVar.f253815a.sendMultipartTextMessage(str, (String) null, divideMessage, m153351c(this.f260044b, size), (ArrayList) null);
                    } catch (IllegalArgumentException unused4) {
                        a.mo87592a(19);
                    } catch (RuntimeException unused5) {
                        a.mo87592a(20);
                    }
                }
                return a.f260039a;
            } catch (C93265am e) {
                ((C59052c) ((C59052c) ((C59052c) f260043a.mo56225c()).mo56382g(e)).mo56372aa(13551)).mo56386p("Exception inserting queued SMS into database.");
                ajVar.mo87591b();
                return C60856cj.m92900i(C87421i.m141588a(18));
            }
        } catch (Exception e2) {
            ((C59052c) ((C59052c) ((C59052c) f260043a.mo56225c()).mo56382g(e2)).mo56372aa(13552)).mo56386p("Exception while dividing sms.");
            ajVar.mo87591b();
            return C60856cj.m92900i(C87421i.m141588a(21));
        }
    }

    /* renamed from: d */
    public final void mo87596d(long j, int i) {
        this.f260051i.mo28212l("Sms database update", new C93256ad(this, j, i));
    }
}
